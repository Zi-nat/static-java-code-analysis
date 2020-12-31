# Static Java Code Analysis 

__Abstract__

We have three primary motivations in this work: The first is complexity scale. To objectively compare
the power of JCQL and others code analysers, it is necessary to have a clear and understandable scale.
It is part of this bachelor thesis to formulate this term and present analysis that can be used to
determine expression ability of JCQL and measure complexity of the data flow.
The second is practical experiments. As soon as a clear scale is available, the next step isto set up JCQL
code examples corresponding to the respective degree (category of bugs) and other corresponding
templates. Then code examples will be analysed with JTransformer-Analyser. Results will fall into
three categories; number of founded results; false positive results and duration of analysis.
The last motive is a suggestion for improvement. If it is determined that JCQL is no longer able to find
errors at a certain level or if the rate of false positives is too high, it is necessary to present a number
of possible solutions or suggestions for improvement.

## Content

This repository contains two folders:

- [javaCode](javaCode): This folder is the list of known Java bugs
- [jcqlCode](jcqlCode): This is the relevant `jcqlCode` that detects the Java bugs

## How to run

## Note