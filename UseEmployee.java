package com.Package.For2;

public class UseEmployee {
		public static void main(String[] args) {
			int count=0;
			
			Employee e=new Employee();
			e.id=121;
			e.name="tamil elakkiya";
			e.role="developer";
			e.gender="female";
			e.salary=100000;
			Employee e1=new Employee();
			e1.id=122;
			e1.name="elakkiya";
			e1.role="tech";
			e1.gender="female";
			e1.salary=10000;
			Employee e2=new Employee();
			e2.id=123;
			e2.name="raju";
			e2.role="mech";
			e2.gender="male";
			e2.salary=20000;
			Employee e3=new Employee();
			e3.id=124;
			e3.name="ram";
			e3.role="engineering";
			e3.gender="male";
			e3.salary=30000;
			Employee e4=new Employee();
			e4.id=125;
			e4.name="vivek";
			e4.role="quality";
			e4.gender="male";
			e4.salary=100000;
			Employee e5=new Employee();
			e5.id=126;
			e5.name="seetha";
			e5.role="deve";
			e5.gender="female";
			e5.salary=10000;
			Employee e6=new Employee();
			e6.id=127;
			e6.name="rachu";
			e6.role="secentis";
			e6.gender="female";
			e6.salary=100000;
			Employee[] emps= {e,e1,e2,e3,e4,e5,e6};
			int max=emps[0].salary;
			Employee ma=emps[0];
			for(int i=0;i<emps.length;i++) {
				System.out.println(emps[i].id+" "+emps[i].name+" "+emps[i].role+" "+emps[i].gender);
			}
			for(int i=emps.length-1;i>=0;i--) {
				System.out.println(emps[i].id+" "+emps[i].name+" "+emps[i].role+" "+emps[i].gender);
			}
			for(int i=0;i<emps.length;i++) {
				if(emps[i].gender=="female") {
				System.out.println(emps[i].name+" "+emps[i].gender);
			}}
			for(int i=0;i<emps.length;i++) {
				if(emps[i].salary<100000) {
					count++;
				}}
				System.out.println(count);
				for(int i=0;i<emps.length;i++) {
					if(emps[i].salary>=max) {
						max=emps[i].salary;
					}}
					System.out.println(max);
			
					for(int i=0;i<emps.length;i++) {
						if(emps[i].salary<=max) {
							max=emps[i].salary;
						}}
						System.out.println(max);
						for(int i=0;i<emps.length;i++) {
							if(emps[i].salary>=max) {
								max=emps[i].salary;
							}}
							System.out.println(max);
							for(int i=0;i<emps.length;i++) {
								if(emps[i].salary>=ma.salary) {
									ma=emps[i];
								}}
								System.out.println(ma.id+" "+ma.name+" "+ma.salary+" "+ma.role+" "+ma.gender+" "+ma.salary);
							for(Employee x:emps) {
								System.out.println(x);
							}
		}
	}
	class Employee {
		int id;
		String name;
		String role;
		String gender;
		int salary;
}
