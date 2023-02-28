class Employee {
    fname
    lname
    des
    salary

    Employee() {
        this.fname = fname
        this.lname = lname
        ...
    }
}

public class Salary {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        try  (bufferedReader br = ...) {
            String line;
            while(line = br.readLine() != null) {
                String[] parts = line.split[","]

                fname = parts[0];
                lname = parts[1];
                des = parts[3];
                salary = parts[4];

                Employee e = new Employee(fname, lname, des, salary)
                emp.add(e);
            }
            
            // now you have all the data you need
            double sum1 = 0;
            double sum2 = 0;
            double sum3 = 0;
            double sum4 = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;

            for (int i = 0; i < emp.size(); i++) {
                String s = emp.get(i).des;
                if (s.equals("associate prof")) {
                    sum1 += emp.get(i).salary;
                    count1++;
                }
                if (s.equals("full prof")) {
                    sum2 += emp.get(i).salary;
                    count2++;
                }
                .
                .
                .
                sum4 += emp.get(i).salary;
                count4++;
            }
            
            // you have sums and counts
        }
    }
}