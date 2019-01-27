package com.crm.qa.util;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;
	 
public class WebEventListener extends TestBase implements WebDriverEventListener{
	 
	
	 public void afterChangeValueOf(WebElement element, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void afterClickOn(WebElement element, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }	 
	 
	 public void afterFindBy(By arg0, WebElement element, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void afterNavigateBack(WebDriver driver) {
	 // TODO Auto-generated method stub
	 //System.out.println("After Navigating Back "+arg0.getCurrentUrl());
	 }
	 
	 public void afterNavigateForward(WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void afterNavigateRefresh(WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void afterNavigateTo(String arg0, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void afterScript(String arg0, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void beforeChangeValueOf(WebElement arg0, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void beforeClickOn(WebElement arg0, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void beforeFindBy(By arg0, WebElement arg1, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void beforeNavigateBack(WebDriver driver) {
	 // TODO Auto-generated method stub
	// System.out.println("Before Navigating Back "+arg0.getCurrentUrl());
	 }
	 
	 public void beforeNavigateForward(WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void beforeNavigateRefresh(WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void beforeNavigateTo(String arg0, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void beforeScript(String arg0, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 }
	 
	 public void onException(Throwable error, WebDriver driver) {
	 System.out.println("Exception occured:" +error);
	 try {
		TestUtil.takeScreenshotAtEndofTest();
	 }catch(IOException e) {
		 e.printStackTrace();
		 
	 }
	 
	 }
}
