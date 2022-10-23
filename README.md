# MVN-Sample

## How to upload to Maven Central

1. Create your library project.
2. Create your github project and sync your local project with it.
3. Copy [build.gradle](/mvn-sample/build.gradle)
4. Copy-paste this into your [local.properties]() file.
```properties
## This file is automatically generated by Android Studio.
# Do not modify this file -- YOUR CHANGES WILL BE ERASED!
#
# This file should *NOT* be checked into Version Control Systems,
# as it contains information specific to your local configuration.
#
# Location of the SDK. This is only used by Gradle.
# For customization when using a Version Control System, please read the
# header note.
sdk.dir=C\:\\Sdk

ossrhUsername=USERNAME
ossrhPassword=PASSWORD

GROUP_ID=io.github.adityabavadekar
ARTIFACT_ID=mvn-sample
LIBRARY_PUBLIC_NAME=MVN Sample for Android Projects
LIBRARY_PUBLIC_DESCRIPTION=A concise description of my MVN-Sample library is that it is just a sample :) .
LIBRARY_GIT_URL=https://github.com/AdityaBavadekar/MVN-Sample
LIBRARY_INCEPTION_YEAR=2022
LIBRARY_LICENCE_NAME=The Apache License, Version 2.0
LIBRARY_LICENCE_URL=http://www.apache.org/licenses/LICENSE-2.0.txt
LIBRARY_DEVELOPER_ID=AdityaBavadekar
LIBRARY_DEVELOPER_NAME=Aditya Bavadekar
LIBRARY_DEVELOPER_EMAIL=example@gmail.com
LIBRARY_SCM_CONNECTION=scm:git:git://github.com/mvn-sample.git
LIBRARY_SCM_URL=https://github.com/AdityaBavadekar/mvn-sample
```
5. Copy-paste this into gradle.properties (global)
```properties
signing.keyId=YOUR_KEY_ID
signing.password=PASSWORD
signing.secretKeyRingFile=PATH_TO_KEYRING
```
6. Use following commands:
```bash
>gpg --full-gen-key
# Copy last-8-DIGITS as KeyId.
>gpg --export-secret-keys ${KeyId} > keyring.gpg
```


# Library published
```xml
<dependency>
  <groupId>io.github.adityabavadekar</groupId>
  <artifactId>mvn-sample</artifactId>
  <version>1.0-SNAPSHOT</version>
  <type>aar</type>
</dependency>
```
