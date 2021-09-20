package net.javaguides.springboot.freemarker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.freemarker.model.Employee;
import net.javaguides.springboot.freemarker.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootFreemarkerTutorialApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFreemarkerTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.save(new Employee("Kishkin", "Joshi", "abs@gmail.com"));
		employeeRepository.save(new Employee("Toshi", "Bhaiya", "hello@gmail.com"));
		employeeRepository.save(new Employee("Captain", "America", "Cap@gmail.com"));
		employeeRepository.save(new Employee("tony", "stark", "stark@gmail.com"));
		// get list of employees
		List<Employee> employees = employeeRepository.findAll();
		employees.forEach(employee -> System.out.println(employee.toString()));
	}
}