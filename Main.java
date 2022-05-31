import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        ArrayList<Integer> array=new ArrayList<Integer>();
        ArrayList<Integer> outPutArray=new ArrayList<Integer>();
        array.add(4);
        array.add(4);
        array.add(1);
        array.add(3);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);

        int moveElement=3;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.size();i++)
        {
            int arrayEle=array.get(i);
            if(map.containsKey(arrayEle))
            {
                map.put(arrayEle, (map.get(arrayEle)+1));
                //System.out.println(arrayEle);
            }
            else
            {
                map.put(arrayEle, 1);
            }
        }
        for (Integer key: map.keySet()) {
            //String key = name.toString();
            //String value = example.get(name).toString();
            System.out.println(key + " : " + map.get(key));
        }

        for (Integer key: map.keySet()) {
            //String key = name.toString();
            //String value = example.get(name).toString();
            //System.out.println(key + " : " + map.get(key));
            if(key!=moveElement)
            {
                for (int valuecount=map.get(key); valuecount>0;valuecount--)
                {
                    outPutArray.add(key);
                }

            }

        }
        if(map.containsKey(moveElement)) {
            for (int valuecount = map.get(moveElement); valuecount > 0; valuecount--) {
                outPutArray.add(moveElement);
            }
        }

        for(int i=0;i<outPutArray.size();i++)
        {
            System.out.println(outPutArray.get(i)+"  ");
        }







    }
}