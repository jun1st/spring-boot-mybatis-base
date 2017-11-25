package me.fengqijun;

import groovy.util.logging.Slf4j;
import me.fengqijun.mapper.CustomerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootMybatisBaseApplication implements CommandLineRunner{

    @Autowired
    private CustomerMapper customerMapper;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMybatisBaseApplication.class, args);

	}

    @Override
    public void run(String... strings) throws Exception {
        List<Customer> customers = customerMapper.all();
    }
}
