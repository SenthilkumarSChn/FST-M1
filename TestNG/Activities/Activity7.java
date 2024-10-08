����   4 ~  Activities/Activity7  java/lang/Object driver Lorg/openqa/selenium/WebDriver; wait .Lorg/openqa/selenium/support/ui/WebDriverWait; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this LActivities/Activity7; beforeClass RuntimeVisibleAnnotations $Lorg/testng/annotations/BeforeClass;
    )io/github/bonigarcia/wdm/WebDriverManager   firefoxdriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
    
 setup  )org/openqa/selenium/firefox/FirefoxDriver
  	  "   $ ,org/openqa/selenium/support/ui/WebDriverWait       

 ( * ) java/time/Duration + , 	ofSeconds (J)Ljava/time/Duration;
 # . 	 / 6(Lorg/openqa/selenium/WebDriver;Ljava/time/Duration;)V	  1   3 3https://v1.training-support.net/selenium/login-form 5 7 6 org/openqa/selenium/WebDriver 8 9 get (Ljava/lang/String;)V credentials ()[[Ljava/lang/Object; %Lorg/testng/annotations/DataProvider; name Authentication @ [Ljava/lang/Object; B admin D password loginTestCase '(Ljava/lang/String;Ljava/lang/String;)V Lorg/testng/annotations/Test; dataProvider J username
 L N M org/openqa/selenium/By O P id ,(Ljava/lang/String;)Lorg/openqa/selenium/By; 5 R S T findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; V java/lang/CharSequence X Z Y org/openqa/selenium/WebElement [ \ sendKeys ([Ljava/lang/CharSequence;)V ^ button[type='submit']
 L ` a P cssSelector X c d 
 click f action-confirmation X h i j getText ()Ljava/lang/String; l Welcome Back, admin
 n p o org/testng/Assert q F assertEquals Ljava/lang/String; usernameField  Lorg/openqa/selenium/WebElement; passwordField loginMessage 
afterClass #Lorg/testng/annotations/AfterClass; 5 z { 
 close 
SourceFile Activity7.java !                    	 
     /     *� �                          
             l     2� � *� Y�  � !*� #Y*� ! %� '� -� 0*� !2� 4 �                &  1         2     	 : ;       <  =s >    6      � ?Y� YASYCSS�                    E F       G  Hs >    �     l*� !I� K� Q N*� !C� K� Q :-� UY+S� W � UY,S� W *� !]� _� Q � b *� !e� K� Q � g :k� m�       "    &  '  * - + < . O 1 d 2 k 3    >    l       l J r    l D r   ] s t   M u t  d  v r   w 
       x      8     
*� !� y �       
    8 	 9        
      |    }