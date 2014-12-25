notebook
========

a very simple yet powerful command-line notebook

Installation
------------
+ clone it (master branch is the latest stable version, v0.x is a working branch) 
+ goto notebook directory
+ run `sbt stage` in terminal
+ executables are created under `notebook/target/universal/stage/bin/`
+ you can move `stage` directory to your desired location

run
---
+ `./np-app -n` create a new note
+ `./np-app -s about "tag1,tag2,.."` search the tag-list of your notes and sort them according to their relevence
