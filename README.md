# Fuse Integration Service Auto Dealership Management System


Simple instruction, 


1. Install OpenShift 
2. Install OpenShift client
3. Create a project demo in Openshift
4. Inside project demo, create amq-basic pod 
5. Go to each projects under projects folder
   -cardealerdemo-alert
   -cardealerdemo-gps
   (-cardealerdemo-inventory)
   (-cardealerdemo-sales)
   and run mvn -Pf8-local-deploy
6. See each pods started
7. Go to web/fisdealerDemo 
		- startGPSLocation.html
		- vehiclenearbyconsole.html
8. Check out the log in pod 
		- dealeralert-xxxxx 
		- gpsservice-xxxxx		