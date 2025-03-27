
package Final;

public class Demo {
    
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        
        hashTable.put("Galatasaray");
        hashTable.put("Fenerbahce");
        hashTable.put("Besiktas");
        hashTable.put("Trabzonspor");
        
        System.out.println("Elements in the hash table: ");
        hashTable.printHashTable();

        boolean deleted = hashTable.delete("Trabzonspor");
        if (deleted) {
            System.out.println("Trabzonspor is deleted.");
        } else {
            System.out.println("Trabzonspor not found in the hash table.");
        }
        
        System.out.println("Elements in the hash table after deletion: ");
        hashTable.printHashTable();
    }
}
