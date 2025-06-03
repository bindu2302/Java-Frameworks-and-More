package filter_demo.controller;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Order(3)
@Component
public class AFilter implements Filter{

 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
   throws IOException, ServletException {
  
//  HttpServletRequest httpReq = (HttpServletRequest)request;
  System.out.println("Passing filter A");
//  System.out.println("URL requested: " + httpReq.getRequestURI());
  chain.doFilter(request, response);

 }
}