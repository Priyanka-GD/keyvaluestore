
## First Phase Commit
# DistributedKeyValueStore

This program accepts `id` and `name` inputs from the terminal, stores them in a shared `HashMap`, and uses five threads to handle the concurrent data insertion into the map.

### Key Features:
- A shared `HashMap` is used to store the `id` and `name` pairs.
- Synchronization mechanisms ensure thread-safe operations on the `HashMap`.
- Multiple threads are used to insert values concurrently.
- A `synchronized` block is applied around the `map.put(id, name)` operation to guarantee thread-safe access to the shared `HashMap`.
- The `map` object itself acts as the lock monitor, ensuring that only one thread can execute the critical section at a time, guaranteeing safe updates to the `HashMap`.

---

### Steps to Run the Code:

1. **Compile the Java Program**:  
   Use the `javac` command to compile the program. This will generate a `.class` file containing the bytecode.

   ```bash
   javac MultiThreadedHashMap.java
   ```

   If there are no errors, this command will generate a `MultiThreadedHashMap.class` file.

2. **Run the Compiled Java Program**:  
   After compiling, run the program using the `java` command, followed by the class name (without the `.class` extension).

   ```bash
   java MultiThreadedHashMap
   ```

---

This will start the program, and you can input `id` and `name` pairs as prompted. The multi-threaded environment will handle the storage and management of the input in a synchronized, thread-safe manner.

--- 


## Second Phase Commit -
### Consistent Hashing
The application now runs on the Spring framework. User data is inserted through a POST request, 
and based on a node ID, the data is stored using a modulus operation. When a user makes a GET request with the user ID, 
the node ID is retrieved, and the corresponding user object is returned.

## Third Phase Commit

- Implement DataStoreDAO as interface
- InMemoryDAO implements DataStoreDAO
- InMemoryDAO will have a composition relationship with NodeResolver
- InMemoryDAO should handle the responsibility of abstracting implementation details
- NodeResolver should support getNode() for an user
- NodeResolver is an interface
- PO - requirement implement NodeResolver as a Modulo function - class
