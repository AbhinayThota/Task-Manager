

CS542 Design Patterns
Spring 2015
ASSIGNMENT <3> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: FriDay, April 3, 2015>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Friday, March 9, 2015>
Grace Period Used This Project: N/A
Grace Period Remaining: N/A
Author(s): < Venkata Siva Abhinay Kumat Thota > 
e-mail(s): < vthota1@binghamton.edu > 


PURPOSE:

Purpose of this assignment is using observer pattern to implement dashboard with 3tabs as observers and receive data from a single subject. Observer pattern is used when we need one to many relationship with loose coupling. single ton pattern is used in this project as MyLogger, Which is used where we need only one instance. In Debug.class I have used singleton pattern. Design principle1: "Design to an interface not implementation".

PERCENT COMPLETE:

100 percent of the project is completed. Covered all of the requirements up to date till.

PARTS THAT ARE NOT COMPLETE:

I have covered all requirements.

BUGS:

No Bugs code is Running succesfully

FILES:

Necessary files so that code will run successfully are

 Your directory structure should be the following:
 lastName_firstName_assign3
   ---taskManager
     ----- README.txt
     ----- src
       ---taskManager
       ----- build.xml
     	   ----------driver
	        	   ----------Driver
           ----------util
	              ----------FileProcessor
                   -----------MyLogger [Singleton Debug Class]
			  [methods to read a line and write a line]
           ----------subject
	              ----------DashBoardSubject
	              ----------Subject		[interface]
           ----------observers
	              ----------Observer	[interface]
	              ----------ProcessesTab
	              ----------UsersTab
	              ----------PerformanceTab
	              ----------PerformanceTabFilterImpl
	              ----------UsersTabFilterImpl
	              ----------ProcessesTabFilterImpl
           ----------display
	              ----------DisplayFile	[interface]
          ----------filter
	              ----------DashboardFilter [interface]

steps to extract:

1 Download Thota_VenkataSivaAbhinayKumar_assign3.tar file
2 Extract it using command "tar -xcvf Thota_VenkataSivaAbhinayKumar_assign3.tar.gz 

SAMPLE OUTPUT:
get output in outfile.txt
diff of the expected and outputfile.txt must be zero
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.2  0.1
17430 python          bsendir1  5.0  0.4
17439 sh              bsendir1  0.0  0.0
17440 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.1  0.1
17430 python          bsendir1  0.8  0.4
17475 sh              bsendir1  0.0  0.0
17476 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.1  0.1
17430 python          bsendir1  0.4  0.4
17491 sh              bsendir1  0.0  0.0
17492 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.1  0.1
17430 python          bsendir1  0.3  0.4
17510 sh              bsendir1  0.0  0.0
17511 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.1  0.1
17430 python          bsendir1  0.2  0.4
17581 sh              bsendir1  0.0  0.0
17582 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 688288  Memory  Free: 1370076  Memory  Cached: 450956
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 688356  Memory  Free: 1370008  Memory  Cached: 450956
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.1  0.1
17430 python          bsendir1  0.1  0.4
17633 sh              bsendir1  0.0  0.0
17634 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.1  0.1
17430 python          bsendir1  0.1  0.4
17654 sh              bsendir1  0.0  0.0
17655 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
17685 sh              bsendir1  0.0  0.0
17686 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 688728  Memory  Free: 1369636  Memory  Cached: 450964
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 688692  Memory  Free: 1369672  Memory  Cached: 450964
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 688684  Memory  Free: 1369680  Memory  Cached: 450964
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
17756 sh              bsendir1  0.0  0.0
17757 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689080  Memory  Free: 1369284  Memory  Cached: 450968
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 688928  Memory  Free: 1369436  Memory  Cached: 450968
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
17950 sh              bsendir1  0.0  0.0
17951 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689228  Memory  Free: 1369136  Memory  Cached: 450972
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
17985 sh              bsendir1  0.0  0.0
17986 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689428  Memory  Free: 1368936  Memory  Cached: 450972
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 688948  Memory  Free: 1369416  Memory  Cached: 450972
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689236  Memory  Free: 1369128  Memory  Cached: 450972
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18108 sh              bsendir1  0.0  0.0
18109 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689356  Memory  Free: 1369008  Memory  Cached: 450976
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18160 sh              bsendir1  0.0  0.0
18161 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689432  Memory  Free: 1368932  Memory  Cached: 450980
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18215 sh              bsendir1  0.0  0.0
18216 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689344  Memory  Free: 1369020  Memory  Cached: 450988
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689360  Memory  Free: 1369004  Memory  Cached: 450988
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18250 sh              bsendir1  0.0  0.0
18251 ps              bsendir1  0.0  0.1
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18283 sh              bsendir1  0.0  0.0
18284 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689464  Memory  Free: 1368900  Memory  Cached: 450988
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18307 sh              bsendir1  0.0  0.0
18308 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18378 sh              bsendir1  0.0  0.0
18379 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 684584  Memory  Free: 1373780  Memory  Cached: 450992
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18383 bomb            kcaglar1  0.0  0.0
18412 sh              bsendir1  0.0  0.0
18413 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18383 bomb            kcaglar1  0.0  0.0
18450 sh              bsendir1  0.0  0.0
18451 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 684604  Memory  Free: 1373760  Memory  Cached: 451000
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18505 sh              bsendir1  0.0  0.0
18506 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18521 sh              bsendir1  0.0  0.0
18522 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 684696  Memory  Free: 1373668  Memory  Cached: 451004
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18559 bomb            kcaglar1  0.0  0.0
18574 sh              bsendir1  0.0  0.0
18575 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18610 sh              bsendir1  0.0  0.0
18611 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 684528  Memory  Free: 1373836  Memory  Cached: 451008
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: kcaglar1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18629 sh              bsendir1  0.0  0.0
18630 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18645 sh              bsendir1  0.0  0.0
18646 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18697 sh              bsendir1  0.0  0.0
18698 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 683464  Memory  Free: 1374900  Memory  Cached: 451016
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18716 sh              bsendir1  0.0  0.0
18717 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18749 sh              bsendir1  0.0  0.0
18750 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 683536  Memory  Free: 1374828  Memory  Cached: 451016
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18820 sh              bsendir1  0.0  0.0
18821 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18839 sh              bsendir1  0.0  0.0
18840 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 683692  Memory  Free: 1374672  Memory  Cached: 451028
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18872 sh              bsendir1  0.0  0.0
18873 ps              bsendir1  0.0  0.1
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 683964  Memory  Free: 1374400  Memory  Cached: 451028
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
18891 sh              bsendir1  0.0  0.0
18892 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 687740  Memory  Free: 1370624  Memory  Cached: 451036
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 686156  Memory  Free: 1372208  Memory  Cached: 451040
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19025 sh              bsendir1  0.0  0.0
19026 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  2.0  0.1
19056 sh              bsendir1  0.0  0.0
19057 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689040  Memory  Free: 1369324  Memory  Cached: 451056
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689268  Memory  Free: 1369096  Memory  Cached: 451064
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.1  0.1
19163 sh              bsendir1  0.0  0.0
19164 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.1  0.1
19179 watch           root      0.0  0.0
19181 sh              bsendir1  0.0  0.0
19183 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689580  Memory  Free: 1368784  Memory  Cached: 451084
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19250 sh              bsendir1  0.0  0.0
19251 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689500  Memory  Free: 1368864  Memory  Cached: 451088
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19371 sh              bsendir1  0.0  0.0
19372 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19387 sh              bsendir1  0.0  0.0
19388 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19439 sh              bsendir1  0.0  0.0
19440 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 689620  Memory  Free: 1368744  Memory  Cached: 451092
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19499 sh              bsendir1  0.0  0.0
19500 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 687240  Memory  Free: 1371124  Memory  Cached: 451092
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19534 sh              bsendir1  0.0  0.0
19535 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 687184  Memory  Free: 1371180  Memory  Cached: 451092
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 685428  Memory  Free: 1372936  Memory  Cached: 451088
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19586 sh              bsendir1  0.0  0.0
19587 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19638 sh              bsendir1  0.0  0.0
19639 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19693 sh              bsendir1  0.0  0.0
19694 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19728 sh              bsendir1  0.0  0.0
19729 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 685656  Memory  Free: 1372708  Memory  Cached: 451096
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 685444  Memory  Free: 1372920  Memory  Cached: 451096
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19799 sh              bsendir1  0.0  0.0
19800 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19835 sh              bsendir1  0.0  0.0
19836 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 685368  Memory  Free: 1372996  Memory  Cached: 451104
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19906 sh              bsendir1  0.0  0.0
19907 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19922 sh              bsendir1  0.0  0.0
19923 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 685536  Memory  Free: 1372828  Memory  Cached: 451104
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5

---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 685408  Memory  Free: 1372956  Memory  Cached: 451104
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
19977 sh              bsendir1  0.0  0.0
19978 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---PERFORMANCE---
Memory Total: 2058364  Memory Used: 685416  Memory  Free: 1372948  Memory  Cached: 451108
CPU Idle: 96.9  CPU User Level: 2.3  CPU System Level: 0.5
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15898 bomb            jpratt3   0.0  0.0
17292 tcsh            bsendir1  0.0  0.1
17430 python          bsendir1  0.1  0.4
19042 tcsh            jfauche1  0.0  0.1
20032 sh              bsendir1  0.0  0.0
20033 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---
---TAB(s) BEGIN---
---TAB(s) END---
---TAB(s) BEGIN---
---USERS---
User: (unknown)  Status: inactive
User: jpratt3  Status: active
User: nbade1  Status: active
User: root  Status: inactive
User: jfauche1  Status: active
User: bsendir1  Status: active

---TAB(s) END---




TO RUN:
do run at this directory path Thota_VenkataSivaAbhinayKumar_assign3/taskManager


My inputs at commandline:

inputfile.txt outputfile.txt debug_level



output: 

Why HashMap:
Fast access for observer relevant filter  

EXTRA CREDIT:

N/A

BIBLIOGRAPHY:

N/A

ACKNOWLEDGEMENT:

N/A

