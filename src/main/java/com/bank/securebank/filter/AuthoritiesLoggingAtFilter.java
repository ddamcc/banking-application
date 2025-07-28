package com.bank.securebank.filter;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class AuthoritiesLoggingAtFilter implements Filter {

/**
*
 * @param servletRequest
 * @param servletResponse
 * @param filterChain
 * @throws IOException
 * @throws ServletException
*/
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Authentication Validation is in progress");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
