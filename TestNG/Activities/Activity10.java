����   4  Activities/Activity10  java/lang/Object driver Lorg/openqa/selenium/WebDriver; wait .Lorg/openqa/selenium/support/ui/WebDriverWait; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this LActivities/Activity10; beforeClass RuntimeVisibleAnnotations $Lorg/testng/annotations/BeforeClass;
    )io/github/bonigarcia/wdm/WebDriverManager   firefoxdriver -()Lio/github/bonigarcia/wdm/WebDriverManager;
    
 setup  )org/openqa/selenium/firefox/FirefoxDriver
  	  "   $ ,org/openqa/selenium/support/ui/WebDriverWait       

 ( * ) java/time/Duration + , 	ofSeconds (J)Ljava/time/Duration;
 # . 	 / 6(Lorg/openqa/selenium/WebDriver;Ljava/time/Duration;)V	  1   3 4https://v1.training-support.net/selenium/simple-form 5 7 6 org/openqa/selenium/WebDriver 8 9 get (Ljava/lang/String;)V 	readExcel $(Ljava/lang/String;)Ljava/util/List; 	Signature J(Ljava/lang/String;)Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>; ? java/util/ArrayList
 >  B java/io/FileInputStream
 A D 	 9 F *org/apache/poi/xssf/usermodel/XSSFWorkbook
 E H 	 I (Ljava/io/InputStream;)V
 E K L M 
getSheetAt ,(I)Lorg/apache/poi/xssf/usermodel/XSSFSheet;
 O Q P 'org/apache/poi/xssf/usermodel/XSSFSheet R S iterator ()Ljava/util/Iterator; U W V java/util/Iterator X Y next ()Ljava/lang/Object; [ org/apache/poi/ss/usermodel/Row Z Q ^  org/apache/poi/ss/usermodel/Cell ] ` a b getStringCellValue ()Ljava/lang/String; d f e java/util/List g h add (Ljava/lang/Object;)Z U j k l hasNext ()Z
 A n o 
 close
 E n
 r t s java/lang/Exception u 
 printStackTrace filePath Ljava/lang/String; data Ljava/util/List; file Ljava/io/FileInputStream; workbook ,Lorg/apache/poi/xssf/usermodel/XSSFWorkbook; sheet )Lorg/apache/poi/xssf/usermodel/XSSFSheet; cells !Lorg/apache/poi/ss/usermodel/Row; rowData cell "Lorg/apache/poi/ss/usermodel/Cell; e Ljava/lang/Exception; LocalVariableTypeTable 6Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>; $Ljava/util/List<Ljava/lang/String;>; StackMapTable � java/lang/String 
signUpInfo ()[[Ljava/lang/Object; %Lorg/testng/annotations/DataProvider; name Registration � src/test/resources/sample.xlsx
  � : ; � [Ljava/lang/Object; d � 8 � (I)Ljava/lang/Object; registerTest K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V Lorg/testng/annotations/Test; dataProvider � //input[@id = 'firstName']
 � � � org/openqa/selenium/By � � xpath ,(Ljava/lang/String;)Lorg/openqa/selenium/By; 5 � � � findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; � //input[@id = 'lastName'] � //input[@id = 'email'] � //input[@id = 'number'] � � � org/openqa/selenium/WebElement � 
 clear
  � � � thread (I)V � java/lang/CharSequence � � � � sendKeys ([Ljava/lang/CharSequence;)V � "//input[contains(@class, 'green')] � � � 
 click 5 � � � switchTo /()Lorg/openqa/selenium/WebDriver$TargetLocator; � � � +org/openqa/selenium/WebDriver$TargetLocator � � alert ()Lorg/openqa/selenium/Alert;	 � � � java/lang/System � � out Ljava/io/PrintStream; � java/lang/StringBuilder � Alert message: 
 � D � � � org/openqa/selenium/Alert � b getText
 � � � � append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 � � � b toString
 � � � java/io/PrintStream � 9 println � � � 
 accept 5 � � � navigate ,()Lorg/openqa/selenium/WebDriver$Navigation; � � � (org/openqa/selenium/WebDriver$Navigation � 
 refresh 	firstName lastName email phoneNumber firstNameField  Lorg/openqa/selenium/WebElement; lastNameField 
emailField phoneNumberField message Lorg/openqa/selenium/Alert; i I tearDown #Lorg/testng/annotations/AfterClass; 5 
 quit 
SourceFile Activity10.java InnerClasses 
Navigation TargetLocator !                    	 
     /     *� �                          
             l     2� � *� Y�  � !*� #Y*� ! %� '� -� 0*� !2� 4 �                & " 1 #        2     	 : ;  <    =   �  
   �� >Y� @L� AY*� CM� EY,� GN-� J:� N:� W� T � Z:� >Y� @:� \ :	� #	� T � ]:� � _ � c W	� i ���+� c W� i ���,� m-� p� M,� q+�   � � r     F    &  (  +  . ! 1 7 3 @ 5 X 6 ] 8 l 5 v <  1 � > � ? � @ � A � C    \ 	   � v w    � x y   � z {   w | }  ! p ~   7 H � �  @ ? � y  X  � �  �  � �  �      � x �  @ ? � �  �   k � +  � d A E O  U  �   
 � d A E O Z U d  U  �   � d A E O  U  �   � d  r 	 � �       �  �s �   d    �K*� �L� �Y� Y+� � � d� � SY+� � � d� � SY+� � � d� � SY+� � � d� � SSY� Y+� � � d� � SY+� � � d� � SY+� � � d� � SY+� � � d� � SSY� Y+� � � d� � SY+� � � d� � SY+� � � d� � SY+� � � d� � SS�           H  I  J  K a L � M J       v w    � x y  �      � x �   � �       �  �s �   �  
  *� !�� �� � :*� !�� �� � :*� !�� �� � :*� !�� �� � :� � � � � � � � *з �� �Y+S� � � �Y,S� � � �Y-S� � � �YS� � *�� �*� !�� �� � � � *� !� � � � :	� ϻ �Y׷ �	� � � ߶ � �	� � *�� �*� !� � � � �       V    T  U   V 0 W @ Z G [ N \ U ] \ ^ c a r b � c � d � e � h � k � m � n � o � q r    f 
         � w    � w    � w    � w   � � �    � � �  0 � � �  @ � � �  � 9  	  � �     5      �           w                  
            8     
*� !� �       
    | 	 }        
     	   
     � 5	 � 5	