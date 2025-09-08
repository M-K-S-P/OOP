javadoc -quiet -d ./docs -sourcepath ./app/src/main/java org.Sort
javac -d ./build/classes/ ./app/src/main/java/org/*.java
jar -c -f ./build/HeapSort.jar -e org.Sort -C ./build/classes .
java -jar ./build/HeapSort.jar
