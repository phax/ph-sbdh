# ph-sbdh

CEFACT Standard Business Document (SBD) and Standard Business Document Header (SBDH) wrapper library.
It supports easily reading and writing of SBD and SBDH between Java domain objects and XML representations.

It is licensed under Apache 2.0 license.

# News and noteworthy

* v4.1.1 - 2020-09-17
    * Updated to Jakarta JAXB 2.3.3
    * Added possibility to disable XSD validation in `SBD(H)Marshaller`
* v4.1.0 - 2018-11-22
    * Updated to ph-commons 9.2.0
* v4.0.0 - 2017-11-08
    * Updated to ph-commons 9.0.0
    * Added default namespace prefix "sh" also when using the Writer API
* v3.0.2 - 2017-01-09
    * Binds to ph-commons 8.6.0
* v3.0.1 - 2016-12-31
    * Added default namespace prefix "sh" when writing (see #2)
* v3.0.0 - 2016-06-11
    * Requires Java 8
* v2.0.1 - 2015-07-21
    * Last Java 1.6 version  

# Maven usage

Add the following to your pom.xml to use this artifact:

```xml
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-sbdh</artifactId>
  <version>4.1.0</version>
</dependency>
```

# Gradle considerations

This project relies on JDK version based Maven profile activation.
See https://github.com/phax/ph-jaxb-pom#gradle-usage for help on this specific issue. 

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
On Twitter: <a href="https://twitter.com/philiphelger">@philiphelger</a> |
Kindly supported by [YourKit Java Profiler](https://www.yourkit.com)