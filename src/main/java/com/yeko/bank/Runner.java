package com.yeko.bank;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(scanBasePackages={"com.yeko.bank"})
public class Runner {

  public static void main(String[] args) {
    SpringApplication.run(Runner.class, args);
  }
}
