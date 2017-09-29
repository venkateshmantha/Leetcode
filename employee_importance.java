/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int res = 0;
        List<Integer> subs = new ArrayList();
        for(Employee emp:employees){
            if(emp.id == id){
                res += emp.importance;
                subs = emp.subordinates;
                break;
            }
        }
        HashSet<Integer> set = new HashSet();
        for(int s:subs){
            set.add(s);
        }
        for(Employee emp:employees){
            if(set.contains(emp.id)){
                res += emp.importance;
                List<Integer> l = emp.subordinates;
                for(int ids:l)
                    set.add(ids);
            }
        }
        return res;
    }
}
