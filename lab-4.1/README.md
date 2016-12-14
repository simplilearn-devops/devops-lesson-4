# DevOps lab 4.1 Test Driven Development (TDD)

Setup a TDD environment.

### Step 1

You will need a VNC client if you haven't already got one.

If you are using an Apple Mac where is already one installed which can be
accessed from Safari.

It you are using Windows and need a VNC viewer go to https://www.realvnc.com/download/viewer/windows/ and download the VNC viewer.

### Step 2

We need to change the firewall rules to allow a VNC connection.

Open the Cloud Platform Console at https://console.cloud.google.com.

Go to the triple bar icon at the top left and select _Networking_. Then select _Firewall Rules_.

Select _Create Firewall Rule_.  
Fill in the form:  
_Name_: `default-allow-vnc`  
_Source IP_: `0.0.0.0/0`  
_Allow protocols and ports_: `tcp:5901`  
Hit _Create_

Go to Compute Engine and VM Instances. Start the VM if it isn’t running and connect using SSH.

### Step 3

Check out the code for the lesson.

`cd`  
`git clone https://github.com/simplilearn-devops/devops-lesson-4`  
`cd devops-lesson-4/lab-4.1`  

### Step 4

Start the vncserver.

`vncserver`  

Start the VNC client. You will need the external IP address of your virtual machine. Enter the following into the VNC client replacing x.x.x.x with your IP address.

`x.x.x.x:5901`  

If you are using a Mac enter the following into Safari replacing x.x.x.x with your IP address.

`vnc://x.x.x.x:5901`  

Dismiss any warnings about insecure connections.

The password is `simplilearn`.

You will be connected to the graphical desktop of the virtual machine.

### Step 5

Start and use Eclipse.

In your VNC window start the _File System_ from the desktop icon.  
Select _Student_ in the left column.  
Open the _eclipse_ folder.  
Open the java-neon_ folder.  
Open the _eclipse_ folder.  
Start eclipse from the diamond shaped icon.  
Accept the default workspace location.

Select File->New->Java Project.  
Uncheck _Use default location_.  
Hit the _Browse_ button.
Select _Home_.  
Open the devops-lesson-4 folder.  
Open the lab-4.1 folder.  
Select the FizzBuzz folder and hot _OK_ at the bottom of the dialog.  
Hit the _Finish_ button at the bottom of the dialog.  

You should see the FizzBuzz project on the left. The test folder is marked in red as there is a mising dependency.

Select the FizzBuzz project and right click. A mnu will appear. Select _Properties_ at the bottom.

Select _Java Build Path_.  
Select the _Libraries_ tab.  
Hit the _Add Library_ button.  
Select _JUnit_ then hit _Next_.  
Make sure that _JUnit 4_ is selected and then hit _Finish_.
Hi _OK_ the project errors should disappear.

Open up the soure and test folders and the devops packages.
Double click on FizzBuzz.java and FizzBuzzTest.java. Editor windows will open.

### Step 6

Select FizzBuzzTests.java and right click.  

Select _Run as_ then _JUnit Test_.

The unit tests should run successfully.

Implement the numberThreeReturnsFizz() test and run it. It should fail.

Implement the code and run it making changes until the tests pass.

If you have time implement more tests.

### Step 7

Exit eclipse by slecting _File_->_Exit_.

Close the VNC viewer.
