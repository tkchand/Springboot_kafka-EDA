# Springboot_kafka-EDA

Installation for WINDOWS machine -
 1) Install WSL2 (WINDOWS 10 and above)
 2) Install JDK 1.8 or Above (this code support JDK17)
 3) Download Apache Kafka from  https://kafka.apache.org/downloads under binary donwlaod
 4) Extract Contents on WSL2
 5) Setup the PATH environment variables for easy access to the Kafka binaries


Windows Commands - (Kafka install root directory)
  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

  .\bin\windows\kafka-server-start.bat .\config\server.properties
  
 

Issue and Fixes-
 1) The input line is too long. - because of the long length of the path because of the folder name 'kafka_2. 11-1.0. 0'

 2) If Error: Zookeeper error (Java installation problem or adminstrative issue)
   Connection was Forcibly Closed on Minecraft: 4 Easist Fixes
Fixes - Copy kakfa binary in your used location C:\users\<user name>\



IMPORTANT: If we're using Kafka on Windows WSL2


When running a command from the CLI outside of WSL2 or your Java programs, you may get the following error:


If do you get that error, please run the instructions below
(this is to edge a WSL2 networking bug with Kafka, so we have to disable IPv6 on WSL2 to remediate)

	First, stop Kafka and Zookeeper.



	Then, please run these commands on WSL2, one by one.

	Password will be prompted on the first command.



	sysctl -w net.ipv6.conf.all.disable_ipv6=1
		and

  sudo sysctl -w net.ipv6.conf.default.disable_ipv6=1


  and then, go to config/server.properties and edit the file to add the line:



  listeners=PLAINTEXT://localhost:9092


When the three commands have succeeded, relaunch Zookeeper and Kafka. 

 

