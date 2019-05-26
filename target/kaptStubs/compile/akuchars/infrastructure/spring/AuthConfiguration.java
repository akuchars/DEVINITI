package akuchars.infrastructure.spring;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014\u00a8\u0006\u0007"}, d2 = {"Lakuchars/infrastructure/spring/AuthConfiguration;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "configure", "", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "devinity"})
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@org.springframework.context.annotation.Configuration()
public class AuthConfiguration extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
    }
    
    public AuthConfiguration() {
        super();
    }
}