Formally, the factory method is defined as providing an interface for object creation but delegating the actual instantiation of objects to subclasses.

java.util.Calendar.getInstance()
java.util.ResourceBundle.getBundle()
java.text.NumberFormat.getInstance()

The abstract factory is particularly useful for frameworks and toolkits that work on different operating systems. For instance, if your library provides fancy widgets for the UI, then you may need a family of products that work on MacOS and a similar family of products that work on Windows. Similarly, themes used in IDE can be another example. If your IDE supports light and dark themes then it may use the abstract factory pattern to create widgets that belong to the light or dark theme just by varying the concrete factory that creates the widgets.

javax.xml.parsers.DocumentBuilderFactory.newInstance() will return you a factory.

javax.xml.transform.TransformerFactory.newInstance() will return you a factory.