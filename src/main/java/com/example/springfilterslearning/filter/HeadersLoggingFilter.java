package com.example.springfilterslearning.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

@Slf4j
public class HeadersLoggingFilter extends OncePerRequestFilter {


    @Override
    public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException
    {
        Collections.list(request.getHeaderNames())
                .forEach(header -> {
                    log.info("Header: {}={}", header, request.getHeader(header));
                });

        filterChain.doFilter(request, response);
    }
}
