javac -d bin $(find src -name "*.java")
jar cfm InventorySystem.jar bin/manifest.txt -C bin/ .
java -jar InventorySystem.jar
