# Virtual Reality Exhibition Manager (VREM)
[![Build Status](https://travis-ci.org/VIRTUE-DBIS/virtual-exhibition-manager.svg?branch=master)](https://travis-ci.org/VIRTUE-DBIS/virtual-exhibition-manager)

The Virtual Reality Exhibition Manager (VREM) is a tool that allows for configuration, storage of and access to VR exhibition definitions.
This is the Backend. For the front end in Unity see [VREP](https://github.com/dbisUnibas/virtual-exhibition-presenter).
For the User Interface see [VREM-UI](https://github.com/sauterl/virtual-exhibition-manager-ui)
It has been created as part of the [Open Cultural Data Hackathon 2018](http://make.opendata.ch/wiki/event:2018-10), held in Zurich, Switzerland.


## Prerequisites

Below is a very shortened version of the [setup guide](https://github.com/VIRTUE-DBIS/virtual-exhibition-presenter/wiki/Setup-Guide) on how to setup VREM.

### System dependencies
* git
* JDK 8 or higher
* You will require [MongoDB](https://docs.mongodb.com/manual/installation/) as storage engine. We recommend using [Docker](https://www.docker.com).
If you have installed docker, you can start a new container using `docker run --name vrem-container -d -p 27017:27017 mongo`. If you already have a container, restart it using `docker start mongo`.
If you're on a unix-system, use the `startdb.sh` script.

## Building VREM
VREM can be built using [Gradle](http://gradle.org/). Building and running it is as easy as
```
 ./gradlew clean deploy
 java -jar build/libs/vrem.jar
 java -jar vrem.jar <command>
 ```

## Starting a server

Before starting, you must adapt the configurations in your config.json file (see example file). Then you can start the VREM server 
by typing into your console:

```
 java -jar build/libs/virtual-exhibition-manager-1.2.jar server -c /path/to/your/config.json
```

## Importing a  collection
As an exmple, consider the following command:

```
import-folder --path ../vre-mixnhack19/exhibition --config mixnhack19.json --name "mixnhack19" --description "Exhibition for Mix'n'Hack 2019" --clean
```
