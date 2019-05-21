package org.selenium;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteAll {
public static void main(String[] args) {
	Result js = JUnitCore.runClasses(Good.class,Bad.class);
	System.out.println("Ignore Count : " +js.getIgnoreCount());
	System.out.println("Time Count : " +js.getRunTime());
	System.out.println("Run Count : "+js.getRunCount());
	System.out.println("Failure Count : "+js.getFailureCount());
	List<Failure> failures = js.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
	}
}
}
