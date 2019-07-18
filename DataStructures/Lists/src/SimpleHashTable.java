public class SimpleHashTable {

    private StoredEmployee[] hashtable; //contains the employee and the key with which it is stored

    public SimpleHashTable() {
        hashtable = new StoredEmployee[2];
    }

    private int hashkey(String key) { //for Jones - length is 5 so haskey is 5%10 = 5
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashkey(key); //has the key

        if (ocuppied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1)
                hashedKey = 0;  //wrap around
            else
                hashedKey++; // increment

            while (ocuppied(hashedKey) && hashedKey != stopIndex) { //not occupied or met with stop index, then it breaks
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if (hashtable[hashedKey] != null)
            System.out.println("Sorry, there's already an employee at hashedkey" + hashedKey); //array is full and there is no space to store
        else
            hashtable[hashedKey] = new StoredEmployee(key, employee); //store it

    }

    public Employee get(String key) { //O(1) constant time
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee; //return the value at that hashed index
    }

    public void printHashTable() {
        System.out.println("The entries of the hash table");
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null)
                System.out.println("null");
            else
                System.out.println(hashtable[i].employee.toString());
        }
    }

    public boolean ocuppied(int index) {
        return (hashtable[index] != null);
    }

    public int findKey(String key) {
        int hashedKey = hashkey(key); //get the hasked key for index
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) { //return if the key matches
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1)
            hashedKey = 0;
        else
            hashedKey++;

        while (hashedKey != stopIndex && hashtable[hashedKey]!=null && (!hashtable[hashedKey].key.equals(key))) {  //met the stop index or found the key, if null is seen
            //then that means at the hashed index, it was suposed to be found, but then it is not, so if a null position is encountered, it means the element is not there
            //in the loop anymore
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)) { //return the found key
            return hashedKey;
        } else {
            System.out.println("The element cannot be found in the has table ");
            return -1;  // The key is not found, so return it
        }

    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey ==-1 ){
            System.out.println("Key not found");
            return null;
        }

        Employee employee= hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for(int i=0;i<oldHashTable.length;i++){
            if(oldHashTable[i]!=null){
                put(oldHashTable[i].key,oldHashTable[i].employee);
            }
        }
        return employee;

    }


}
