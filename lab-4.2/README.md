# DevOps lab 4.2 Code Quality

Use code quality tools.

### Step 1

Open the Cloud Platform Console at https://console.cloud.google.com. Go to Compute Engine and VM Instances. Start the VM if it isn’t running and connect using SSH.

### Step 2

Start the vncserver.

`vncserver`

Start the VNC client. You will need the external IP address of your virtual machine. Enter the following into the VNC client replacing x.x.x.x with your IP address.

`x.x.x.x:5901`

If you are using a Mac enter the following into Safari replacing x.x.x.x with your IP address.

`vnc://x.x.x.x:5901`

Dismiss any warnings about insecure connections.

The password is `simplilearn`.

You will be connected to the graphical desktop of the virtual machine.

### Step 3

Start and use Eclipse.

In your VNC window start the File System from the desktop icon.  
Select Student in the left column.  
Open the eclipse folder.  
Open the java-neon_ folder.  
Open the eclipse folder.  
Start eclipse from the diamond shaped icon.  
Accept the default workspace location is asked.  

### Step 4

Install JaCoCo also known as EclEmma.

From your Eclipse menu select Help → Install New Software...

In the Install dialog enter `http://update.eclemma.org/` at the Work with field. Hit the _Add_ button.

Enter the name `EclEmma` and hit _OK_.

Check the latest EclEmma version and press Next. It may take a few minutes.  
On the InstallDetails screen select Next.  
Accept the license and hit Finish. It may take a few minutes.

Hit _Yes_ to restart eclipse. Eclipse will stop and automatically restart.

### Step 5

Open the FizzBuzz.java and FizzBuzzTests.java in the editor window by double clicking on each of them.

Open up the FizzBuzz project and select FizzBuzzTests.java.

Right click and select Coverage as -> Unit Test

The tests will run and a coverage report will appear at the bottom of Eclipse. The code will also be coloured green, yellow or red. If coverage is not 100% can you improve it?

### Step 6

Install FindBugs.

From your Eclipse menu select Help → Install New Software...

In the Install dialog enter `http://findbugs.cs.umd.edu/eclipse/` at the Work with field. Hit the _Add_ button.

Enter the name `FindBugs` and hit _OK_.

Check the latest FindBugs version and press Next. It may take a few minutes.  
On the InstallDetails screen select Next.  
Accept the license and hit Finish. It may take a few minutes.  
Hit _Yes_ to any warning dialogs about unsigned content.

Hit _Yes_ to restart eclipse. Eclipse will stop and automatically restart.

### Step 7

Click on the FizzBuzz project and right click.  
Select FindBugs -> Check Code.

What warnings or errors do you get?  
Do you agree with them?
Fix a couple of issues and rerun FindBugs.

### Step 8

Exit eclipse by selecting File->Exit.

Close the VNC viewer.

Exit the SSH session and stop the virtual machine.
