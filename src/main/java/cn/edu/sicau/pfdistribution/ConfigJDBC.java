package cn.edu.sicau.pfdistribution;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zj
 * @date 2019/4/18 14:41
 */
@Configuration
public class ConfigJDBC {

  @Value("${jdbc.driver}")
  private String driver;

  @Value("${jdbc.url}")
  private String url;

  @Value("${jdbc.username}")
  private String user;

  @Value("${jdbc.password}")
  private String password;

  @Bean(name = "dataSource")
  public DruidDataSource getDataSource(){
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName(driver);
    dataSource.setUrl(url);
    dataSource.setUsername(user);
    dataSource.setPassword(password);
    return dataSource;
  }

}