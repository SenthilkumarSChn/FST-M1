����   4 �  Activities/Activity2  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this LActivities/Activity2; beforeMethod RuntimeVisibleAnnotations #Lorg/testng/annotations/BeforeTest;
    )io/github/bonigarcia/wdm/WebDriverManager   firefoxdriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
     setup  )org/openqa/selenium/firefox/FirefoxDriver
  	      " 8https://v1.training-support.net/selenium/target-practice $ & % org/openqa/selenium/WebDriver ' ( get (Ljava/lang/String;)V 	testCase1 Lorg/testng/annotations/Test; $ , - . getTitle ()Ljava/lang/String;	 0 2 1 java/lang/System 3 4 out Ljava/io/PrintStream; 6 java/lang/StringBuilder 8 
Title is: 
 5 :  (
 5 < = > append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 5 @ A . toString
 C E D java/io/PrintStream F ( println H Target Practice
 J L K org/testng/Assert M N assertEquals '(Ljava/lang/String;Ljava/lang/String;)V title Ljava/lang/String; 	testCase2 S button.black
 U W V org/openqa/selenium/By X Y cssSelector ,(Ljava/lang/String;)Lorg/openqa/selenium/By; $ [ \ ] findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; _ a ` org/openqa/selenium/WebElement b c isDisplayed ()Z
 J e f g 
assertTrue (Z)V _ i j . getText l black blackButton  Lorg/openqa/selenium/WebElement; 	testCase3 enabled     s sub
 U u v Y 	className x Practice
 z | { java/lang/String } ~ contains (Ljava/lang/CharSequence;)Z 
subHeading 	testCase4 � org/testng/SkipException � Skipping test case
 � : afterMethod "Lorg/testng/annotations/AfterTest; $ � �  close 
SourceFile Activity2.java !                 	   /     *� 
�                                    	   S     � � *� Y� � *� !� # �                               )        *   	   g     '*� � + L� /� 5Y7� 9+� ;� ?� B+G� I�            
     ! & "        '     
  O P   Q        *   	   d     $*� R� T� Z L+� ^ � d+� h k� I�           '  (  ) # *        $       m n   o        *  pZ q 	   Z     *� r� t� Z � h L+w� y� d�           /  0  1              
  P   �        *   	   4     
� �Y�� ��           6        
      �        �   	   8     
*� � � �       
    ; 	 <        
      �    �