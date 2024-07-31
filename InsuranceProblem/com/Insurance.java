package InsuranceProblem.com;

import java.util.*;
import java.util.stream.Collectors;

public class Insurance {
    String policy_number;
    String holder_name;
   public double premium_amount;

    void setValues(){
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Policy Number");
        this.policy_number=sc.nextLine();
        System.out.println("Enter the Policy Holder Name");
        this.holder_name=sc.nextLine();
        System.out.println("Enter the Premium Amount");
        this.premium_amount=sc1.nextDouble();
    }

    @Override
    public String toString() {
        return policy_number+" "+holder_name+" "+premium_amount;
    }

    public static void main(String[] args) {
        List<Insurance> list=new ArrayList<>();
        boolean fl=true;
        while(fl){
            Scanner sc=new Scanner(System.in);
            System.out.println("1. Add new Policy ");
            System.out.println("2. Filter by Premium Amount");
            System.out.println("3. Sort the Policy By Holder's Name");
            System.out.println("4. Compute Total Premium");
            System.out.println("5. Print Policy Details");
            System.out.println("6. Filter by Premium Range");
            System.out.println("7. Policy with Highest Premium");
            System.out.println("8. Group Policies by Name Initial");
            System.out.println("9. Average Premium");
            System.out.println("10. Sort Policies by Premium");
            System.out.println("11. Check Policy Exceeds $2000");
            System.out.println("12. Count Policies of Each Premium Range (0-1000,1001-2000,>2000");
            System.out.println("13. List of Unique Holder Name");
            System.out.println("14. Policy holder name using substring");
            System.out.println("15. Map of Policy_number vs Premium amount");
            System.out.println("16. Exit");

            int option = sc.nextInt();

            switch(option){
                case 1:
                    Insurance ins=new Insurance();
                    ins.setValues();
                    list.add(ins);
                    System.out.println("New Insurance Added");
                    break;
                case 2:
                    List<Insurance> z=list.stream().filter(r->r.premium_amount>1200).toList();
                    System.out.println(z);
                    break;
                case 3:
                    List<Insurance> z2=list.stream().sorted(Comparator.comparing(r -> r.holder_name.charAt(0))).toList();
                    System.out.println(z2);
                    break;
                case 4:
                    double sum=list.stream().mapToDouble(r->r.premium_amount).sum();
                    System.out.println(sum);
                    break;
                case 5:
                    list.stream().forEach(r->System.out.println(r));
                    break;
                case 6:
                    List<Insurance> z3=list.stream().filter(r->r.premium_amount>1000 && r.premium_amount<2000).toList();
                    System.out.println(z3);
                    break;
                case 7:
                    Optional<Insurance> z4=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(r-> r.premium_amount)));
                    System.out.println(z4);
                    break;
                case 8:
                    Map<Character,List<Insurance>> map = list.stream().collect(Collectors.groupingBy(r->r.holder_name.charAt(0)));
                    System.out.println(map);
                    break;
                case 9:
                    OptionalDouble avg=list.stream().mapToDouble(r-> r.premium_amount).average();
                    System.out.println(avg);
                    break;
                case 10:
                    List<Insurance> z5=list.stream().sorted((r1,r2)-> (int) (r1.premium_amount- r2.premium_amount)).toList();
                    System.out.println(z5);
                    break;
                case 11:
                    List<Insurance> z6=list.stream().filter(r->r.premium_amount>2000).toList();
                    System.out.println(z6.size()>0);
                    break;
                case 12:
                    //Map<Double,List<Insurance>> map1 = list.stream().collect(Collectors.groupingBy(r->(r.premium_amount > 1000 && r.premium_amount < 2000),));
                    System.out.println("range");
                    break;
                case 13:
                    System.out.println("unique holder name");
                    break;
                case 14:
                    List<Insurance> z7=list.stream().filter(r->r.holder_name.contains("Di")).toList();
                    System.out.println(z7);
                    break;
                case 15:
                    Map<String,Double> map3=new HashMap<>();
                    list.stream().forEach(r->map3.put(r.policy_number, r.premium_amount));
                    System.out.println(map3);
                    break;
                case 16:
                    fl=false;
                    break;
                default:
                    System.out.println("Enter the valid input");
                    break;

            }
        }
    }
}
