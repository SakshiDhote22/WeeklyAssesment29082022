package com.areyes1.jgc.junit.spring;



import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.BaseMatcher.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.areyes1.jgc.junit.spring.main.AppConfig;

import com.areyes1.jgc.junit.spring.service.SampleService;

import com.areyes1.jgc.unit.obj.Employee;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes=AppConfig.class,loader=AnnotationConfigContextLoader.class)

public class JUnitSpringExample {

 @Autowired

 private SampleService sampleService;

 @BeforeClass

 public static void setUp() {

 System.out.println("-----> SETUP <-----");

 }

 @Test

 public void testSampleService() {

 assertEquals("class com.areyes1.jgc.junit.spring.service.SampleServiceImpl",this.sampleService.getClass().toString());

 }

 @Test

 public void testSampleServiceCreateNewEmployeee() {

 Employee newEmployee = new Employee();

 newEmployee.setEmployeeSal(5000);


 if(newEmployee != null) {

   assertNotNull("Salary isn't null", newEmployee.getEmployeeSal());

 }

 assertNotNull("New Employee is not null", newEmployee);

 }

 @Test

 public void testSampleServiceGetOrder() {

 Employee existingEmployee = sampleService.getEmployee(0);

 if(existingEmployee != null) {

  assertThat(sampleService.getEmployee(0), instanceOf(Employee.class));

  assertNotNull("Salary isn't null", existingEmployee.getEmployeeSal());

 }

 assertNotNull("Object is not null", existingEmployee);

 }

 @AfterClass

 public static void afterTest() {

 System.out.println("-----> DESTROY <-----");

 }

}



































