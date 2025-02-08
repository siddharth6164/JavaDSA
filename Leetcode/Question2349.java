public class Question2349 {
    class NumberContainers {
    private Map<Integer, Integer> indexNumber; 
    private Map<Integer, TreeSet<Integer>> numberIndices; 

    public NumberContainers() {
        indexNumber = new HashMap<>();
        numberIndices = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexNumber.containsKey(index)) {
            int oldNumber = indexNumber.get(index);
            numberIndices.get(oldNumber).remove(index);
            if (numberIndices.get(oldNumber).isEmpty()) {
                numberIndices.remove(oldNumber); 
            }
        }

        indexNumber.put(index, number);
        numberIndices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        if (!numberIndices.containsKey(number)) {
            return -1; 
        }
        return numberIndices.get(number).first();
    }
}
    public static void main(String[] args) {
        Question2349 question = new Question2349();
        NumberContainers nc = question.new NumberContainers();
        System.out.println(nc.find(10)); 
    
        nc.change(2, 10);  
        nc.change(1, 10);  
        nc.change(3, 10);  
        nc.change(5, 10); 
        System.out.println(nc.find(10)); 
    
        nc.change(1, 20); 
        System.out.println(nc.find(10)); 
    }
}