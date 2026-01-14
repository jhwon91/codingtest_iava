
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> notHeard = new HashSet<>();
        for(int i = 0; i<n; i++){
            notHeard.add(br.readLine());
        }

        ArrayList<String> result  = new ArrayList<>();
        for(int i = 0; i<m; i++){
            String name = br.readLine();
            if(notHeard.contains(name)){
                result.add(name);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(String r : result){
            System.out.println(r);
        }
    }
}
