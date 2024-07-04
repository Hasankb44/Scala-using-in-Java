import groovy.json.JsonSlurper

import javax.swing.JFrame

class Main {
  static void main(String[] args) {
    // JSON verisini okuma
    String jsonText = ""
    FileReader Freader = new FileReader("C:\\Users\\ruyak\\OneDrive\\Masaüstü\\MyFistScalaProject\\src\\main\\groovy\\Database.json");
    BufferedReader reader = new BufferedReader(Freader);
    String line;
    while ((line = reader.readLine()) != null) {
      jsonText += line += "\n"
    }

    def slurper = new JsonSlurper()
    def data = slurper.parseText(jsonText)

// JSON verisinden bilgileri alma
    println "Name = ${data.name}"
    println "Age = ${data.age}"
    println "City = ${data.city}"
  }
}