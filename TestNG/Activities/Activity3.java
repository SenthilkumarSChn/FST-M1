����   4 c  Activities/Activity3  java/lang/Object driver Lorg/openqa/selenium/WebDriver; <init> ()V Code
     LineNumberTable LocalVariableTable this LActivities/Activity3; beforeClass RuntimeVisibleAnnotations $Lorg/testng/annotations/BeforeClass;
    )io/github/bonigarcia/wdm/WebDriverManager   firefoxdriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
     setup  )org/openqa/selenium/firefox/FirefoxDriver
  	      " 3https://v1.training-support.net/selenium/login-form $ & % org/openqa/selenium/WebDriver ' ( get (Ljava/lang/String;)V 	loginTest Lorg/testng/annotations/Test; , username
 . 0 / org/openqa/selenium/By 1 2 id ,(Ljava/lang/String;)Lorg/openqa/selenium/By; $ 4 5 6 findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; 8 password : java/lang/CharSequence < admin > @ ? org/openqa/selenium/WebElement A B sendKeys ([Ljava/lang/CharSequence;)V D //button[text()='Log in']
 . F G 2 xpath > I J  click L action-confirmation > N O P getText ()Ljava/lang/String; R Welcome Back, admin
 T V U org/testng/Assert W X assertEquals '(Ljava/lang/String;Ljava/lang/String;)V  Lorg/openqa/selenium/WebElement; loginMessage Ljava/lang/String; 
afterClass #Lorg/testng/annotations/AfterClass; $ _ `  close 
SourceFile Activity3.java !                 	   /     *� 
�                                    	   S     � � *� Y� � *� !� # �                               )        *   	   �     j*� +� -� 3 L*� 7� -� 3 M+� 9Y;S� = ,� 9Y7S� = *� C� E� 3 � H *� K� -� 3 � M NQ-� S�       "          - ! < $ O ' c ( i )    *    j      [ , Y   L 8 Y  c  Z [   \        ]   	   8     
*� � ^ �       
    . 	 /        
      a    b