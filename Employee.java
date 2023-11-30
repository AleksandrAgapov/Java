import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employee {

private Map<String, String> empStorage = new HashMap<>();

public void add(String passport, String name){
empStorage.put(passport, name);
}
public String findByName(String name){
StringBuilder sb = new StringBuilder();
for (Map.Entry<String, String> entry: empStorage.entrySet()){

if (entry.getValue().equals(name)){
sb.append(entry.getKey() + " " + entry.getValue() + "\n");
}
}
return sb.toString();
}

public boolean remove(String passport){

Iterator<Map.Entry<String, String>> iter = empStorage.entrySet().iterator();

while (iter.hasNext()){
if (iter.next().getKey().equals(passport)){
iter.remove();
return true;
}

}
return false;

}
 @Override
 public String toString() {
 return "Employee{" +
"empStorage=" + empStorage +
 '}';

}
}