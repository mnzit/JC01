# JSC01

```
git clone https://github.com/mnzit/JSC01.git
git clone <repo_name>
git add . // for tracking the file
git commit -m '<add your commit message>'
git push // if you have pushed the branch already in remote
git push -u origin <branch_name> // if you havent pushed the branch to the remote yet
git push -u origin/master //if their isnt origin yet
```

```
javac <path_to_main_class> -sourcepath <source_code_base_path> -d <classes_generation_path>
java -cp <classes_generation_path> <package_location_to_main_class>
```
Example: 
```
javac src/com/ggic/jb01/Main.java -sourcepath src -d build/classes
java -cp build/classes com.ggic.jb01.Main
```
