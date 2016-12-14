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

