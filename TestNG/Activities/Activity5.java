����   4 �  Activities/Activity5  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this LActivities/Activity5; beforeMethod RuntimeVisibleAnnotations #Lorg/testng/annotations/BeforeTest; 	alwaysRun   
    )io/github/bonigarcia/wdm/WebDriverManager   firefoxdriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
     setup  )org/openqa/selenium/firefox/FirefoxDriver
  	  "   $ 8https://v1.training-support.net/selenium/target-practice & ( ' org/openqa/selenium/WebDriver ) * get (Ljava/lang/String;)V pageTitleTest Lorg/testng/annotations/Test; groups HeaderTests ButtonTests & 1 2 3 getTitle ()Ljava/lang/String;	 5 7 6 java/lang/System 8 9 out Ljava/io/PrintStream; ; java/lang/StringBuilder = 
Title is: 
 : ?  *
 : A B C append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 : E F 3 toString
 H J I java/io/PrintStream K * println M Target Practice
 O Q P org/testng/Assert R S assertEquals '(Ljava/lang/String;Ljava/lang/String;)V title Ljava/lang/String; HeaderTest1 dependsOnMethods Y h3#third-header
 [ ] \ org/openqa/selenium/By ^ _ cssSelector ,(Ljava/lang/String;)Lorg/openqa/selenium/By; & a b c findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; e g f org/openqa/selenium/WebElement h 3 getText j Third header header3  Lorg/openqa/selenium/WebElement; HeaderTest2 o color e q r s getCssValue &(Ljava/lang/String;)Ljava/lang/String; u rgb(251, 189, 8) header5 ButtonTest1 y button.olive { Olive button1 ButtonTest2  button.brown � rgb(255, 255, 255) button2 afterMethod "Lorg/testng/annotations/AfterTest; & � �  close 
SourceFile Activity5.java !                 	   /     *� 
�                                   Z  	   S     � � *� Y�  � !*� !#� % �                               +        ,  -[ s .s / 	   g     '*� !� 0 L� 4� :Y<� >+� @� D� G+L� N�            
     &          '     
  T U   V        ,  W[ s + -[ s . 	   W     *� !X� Z� ` L+� d i� N�           $  %  &               k l   m        ,  W[ s + -[ s . 	   Y     *� !X� Z� ` L+n� p t� N�           *  +  ,               v l   w        ,  W[ s + -[ s / 	   W     *� !x� Z� ` L+� d z� N�           0  1  2               | l   }        ,  W[ s + -[ s / 	   Y     *� !~� Z� ` L+n� p �� N�           6  7  8               � l   �        �  Z  	   8     
*� !� � �       
    > 	 ?        
      �    �