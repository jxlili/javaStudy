package com.qdc.demoeurekaauth_server.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.JdbcApprovalStore;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@Component
public class Oauth2AuthoriztionServerConfigureation extends AuthorizationServerConfigurerAdapter{

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private DruidDataSource druidDataSource;


    @Override
    public void configure (AuthorizationServerSecurityConfigurer security)throws Exception {
        System.out.println("aaaa");
        security.checkTokenAccess("hasAuthority ('ROLE_TRUSTED_CLIENT')");

    }
    @Override
    public void configure (ClientDetailsServiceConfigurer clients) throws Exception {
        System.out.println("bbbb");
        clients.withClientDetails(new JdbcClientDetailsService(druidDataSource));
    }


    @Override
    public void configure (AuthorizationServerEndpointsConfigurer endpoints)throws Exception {
        //用户信息查询服务
        endpoints.userDetailsService(userDetailsService);
        //数据库管理access token和refresh token
        TokenStore tokenstore = new JdbcTokenStore(druidDataSource);
        // endpoints. tokenstore (tokenstore);
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        tokenServices.setTokenStore(tokenstore);
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setClientDetailsService(new JdbcClientDetailsService(druidDataSource));
        tokenServices.setAccessTokenValiditySeconds(38000);
        // tokenservices.setRefreshTokenValidityseconds(180);
        endpoints.tokenServices(tokenServices);
        //数据库管理授杈码
        endpoints.authorizationCodeServices(new JdbcAuthorizationCodeServices(druidDataSource));
        //数据库管理授杈信息
        ApprovalStore approvalstore = new JdbcApprovalStore(druidDataSource);
        endpoints.approvalStore(approvalstore);
    }
}