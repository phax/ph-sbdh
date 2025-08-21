# ph-sbdh

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.helger/ph-sbdh/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.helger/ph-sbdh) 
[![javadoc](https://javadoc.io/badge2/com.helger/ph-sbdh/javadoc.svg)](https://javadoc.io/doc/com.helger/ph-sbdh)
[![CodeCov](https://codecov.io/gh/phax/ph-sbdh/branch/master/graph/badge.svg)](https://codecov.io/gh/phax/ph-sbdh)

CEFACT Standard Business Document (SBD) and Standard Business Document Header (SBDH) wrapper library.
It supports easily reading and writing of SBD and SBDH between Java domain objects and XML representations.

Official GS1 page on SBDH is https://www.gs1.org/standards/edi/standard-business-document-header-sbdh

It is licensed under Apache 2.0 license.

# Maven usage

Add the following to your pom.xml to use this artifact, replacing x.y.z with the effective version:

```xml
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-sbdh</artifactId>
  <version>x.y.z</version>
</dependency>
```

# News and noteworthy

v6.0.0 - work in progress
* Requires Java 17 as the minimum version
* Updated to ph-commons 12.0.0
* Removed all deprecated methods marked for removal

v5.0.2 - 2025-02-20
* Deprecated marshaller constructors with a `boolean` parameter
* Switched JAXB Maven plugin to `org.jvnet.jaxb:jaxb-maven-plugin` 

v5.0.1 - 2023-04-15
* Deprecated classes `ESBDHDocumentType`, `SBDHDocumentType`, `SBDHReader`, `SBDHValidator` and `SBDHWriter`

v5.0.0 - 2023-01-08
* Using Java 11 as the baseline
* Updated to ph-commons 11
* Using JAXB 4.0 as the baseline

v4.3.0 - 2021-05-02
* Updated to ph-commons 10.1

v4.2.0 - 2021-03-21
* Updated to ph-commons 10

v4.1.1 - 2020-09-17
* Updated to Jakarta JAXB 2.3.3
* Added possibility to disable XSD validation in `SBD(H)Marshaller`
* Using Java 8 date and time classes for JAXB created classes

v4.1.0 - 2018-11-22
* Updated to ph-commons 9.2.0

v4.0.0 - 2017-11-08
* Updated to ph-commons 9.0.0
* Added default namespace prefix "sh" also when using the Writer API

v3.0.2 - 2017-01-09
* Binds to ph-commons 8.6.0

v3.0.1 - 2016-12-31
* Added default namespace prefix "sh" when writing (see #2)

v3.0.0 - 2016-06-11
* Requires Java 8

v2.0.1 - 2015-07-21
* Last Java 1.6 version  

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
It is appreciated if you star the GitHub project if you like it.