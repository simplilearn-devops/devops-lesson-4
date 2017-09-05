# DevOps lab 7.1 Mocking

Setup a Mocking framework environment.

### Step 1

Go to Compute Engine and VM Instances. Start the VM if it isn’t running and connect using SSH.

### Step 2

Check out the code for the lesson.

`cd`  
`cd devops-lesson-4/lab-4.2`  

### Step 3

Start the vncserver.

`vncserver`  


### Step 4

Start the VNC client on your local machine. You will need the external IP address of your virtual machine. Enter the following into the VNC client replacing x.x.x.x with your IP address. Note that the external IP address can change every time you start the virtual machine.

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
Open the lab-4.2 folder.  
Select the Mocking folder and hit _OK_ at the bottom of the dialog.  
Hit the _Finish_ button at the bottom of the dialog.  

You should see the Mocking project on the left. The test folder is marked in red as there is a missing dependency.

Select the Mocking project and right click. A menu will appear. Select _Properties_ at the bottom.

Select _Java Build Path_.  
Select the _Libraries_ tab.  
Hit the _Add Library_ button.  
Select _JUnit_ then hit _Next_.  
Make sure that _JUnit 4_ is selected and then hit _Finish_.

Select _Add Jars_.  
Open the _Mocking_ folder and then open the _lib_ folder.  
You shpuld see 4 jar files. Select them all and hit _OK_. If the lib folder isn’t visible
it means that Eclipse has automatically loaded the jar files and nothing needs to be done.

Hit _OK_ the project errors should disappear.

Open up the source and test folders and the devops packages.
Double click on LoginController.java and LoginControlerTests.java. Editor windows will open.

### Step 6

Select LoginControllerTests.java and right click.  

Select _Run as_ then _JUnit Test_.

The unit tests should fail.

Implement the code and run it making changes until the tests pass.

If you have time implement more tests.

### Step 7

Exit eclipse by selecting _File_->_Exit_.

Close the VNC viewer.
