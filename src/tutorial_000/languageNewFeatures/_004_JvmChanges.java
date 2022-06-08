package tutorial_000.languageNewFeatures;

public class _004_JvmChanges {
	/*
	 * Java 15 delivered various changes concerning JVM. Here are some.
	 */
	
	/*
	 * Hidden Classes
	 * 
	 * Java 15 introduce hidden classes which cannot be used directly by other classes bytecode. These hidden classes are intended to be 
	 * used by frameworks which generate classes at runtime and use them using reflection. 
	 * 
	 * A hidden class is defined as a member of Nest Based Access Control Context and it can be unloaded irrespective of other classes.
	 */
	
	/*
	 * Garbage Collectors
	 * 
	 * Since Java 11, Z Garbage Collector (ZGC) was an experimental feature. Java 15 release ZGC and made it a standard feature.
	 * ZGC is low latency, highly scalable garbage collector. A lot of improvements are done to this garbage collection since then, for example :
	 * - Concurrent class unloading
	 * - Uncommiting of unused memory
	 * - Support for Class Data Sharing
	 * - NUMA Awareness
	 * - Multithreaded Heap Pre-touch
	 * - Max Heap Size limit from 4 TB to 16 TB.
	 * 
	 * ZGC is highly performant and works efficiently even in case of massive data applications e.g. machine learning applications. It ensures 
	 * that there is no long pause while processing the data due to garbage collection. It supports Linux, Windows and MacOS.
	 */
	
	/*
	 * Shenandoah
	 * 
	 * Shenandoah is an algorithm that reduces GC pause times by doing evacuation work concurrently with the running Java threads. 
	 * Integrated in JDK 12 (JEP 189) , now this feature is promoted to the product in JDK 15.
	 */
	
	/*
	 * Helpful NullPointerException
	 * 
	 * Helpful NullPointerException is now enabled by default in Java 15.
	 */
	
	/*
	 * Foreign Memory Access API
	 * 
	 * Java 15 add some features to Foreign Memory Access API that was introduced in Java 14 :
	 * - VarHandle API introduced to customize memory access var handles.
	 * - Parallel processing of a memory segment is supported using the Spliterator interface.
	 * - Parallel processing of a memory segment is supported using the Spliterator interface.
	 * - Native calls addresses can be manipulated and dereferenced.
	 */
}
