# FFM with Java 19


Run ProcessId:

```
/java/jdk/jdk-19.0.2+7/bin/java -cp target/classes --enable-preview --enable-native-access=ALL-UNNAMED de.pdbm.ProcessId
```

Run Quicksort:

```
/java/jdk/jdk-19.0.2+7/bin/java -cp target/classes --enable-preview --enable-native-access=ALL-UNNAMED de.pdbm.Quicksor
```

# Jextract

Download at [https://jdk.java.net/jextract/](https://jdk.java.net/jextract/). Released from time to time.

Run jextract (done on Fedora 37):

```
/java/jdk/jextract-19/bin/jextract --source --output  src/main/java/ -t unistd -I /usr/include /usr/include/unistd.h
```

If you omit ``--sources`` only the class files are generated. You have to put them in ``target/classes``, of course.

Run ProcessId with generated classes:

```
/java/jdk/jdk-19.0.2+7/bin/java -cp target/classes --enable-preview --enable-native-access=ALL-UNNAMED de.pdbm.ProcessIdWithJextract
```