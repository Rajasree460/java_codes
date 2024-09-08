/*calculate salary by inheritance and cla */
class employee{
    int em_code;
    String em_name;
    String address;
    long phn_no;
    float da;
    float hra;
    float salary;
    employee(float a,float b){
        da=a;
        hra=b;
    }
}
class teacher extends employee{
    String specialization;
    String designation;
    teacher(float a,float b){
        super(a,b);
        da=a;
        hra=b;
    }
    void cal_salary_teacher(int basic_pay){
        salary=da*basic_pay+hra*basic_pay;
        System.out.println("the salary of a teacher is: "+salary);
    }
}
class office extends employee{
    String designation;
    office(float a,float b){
        super(a,b);
        da=a;
        hra=b;
    }
    void cal_salary_office(int basic_pay){
        salary=da*basic_pay+hra*basic_pay;
        System.out.println("the salary of a office is: "+salary);
    }
}
class cal_salary{
    public static void main(String args[]){
        float i=Float.parseFloat(args[0]);
        float j=Float.parseFloat(args[1]);
        int m=Integer.parseInt(args[2]);
        int n=Integer.parseInt(args[3]);
        teacher t=new teacher(i,j);
        office o=new office(i,j);
        t.cal_salary_teacher(m);
        o.cal_salary_office(n);
    }
}