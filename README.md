"Jammazwan" [is Hindi](href="https://books.google.com/books?id=_kWROaer5UsC&amp;pg=PA1138&amp;lpg=PA1138&amp;dq=jammazwan+camel+keeper+hindi&amp;source=bl&amp;ots=7FaF5BXK_F&amp;sig=Cg-U5ORP3dHrFycaCFvo34GdpZ0&amp;hl=en&amp;sa=X&amp;ved=0ahUKEwj8v4OV3YbNAhVjpIMKHSYUB_oQ6AEIHDAA#v=onepage&amp;q=jammazwan%20camel%20keeper%20hindi&amp;f=false) for "camel keeper", and is [explained in this blog](https://betterologist.net/2016/05/jammazwan-projects-for-learning-apache-camel/).

|[**_a jammazwan?_**](https://betterologist.net/2016/06/jammazwan-for-hire/)|also a jammazwan|[TL;DR? _about:_](https://youtu.be/vea51DzmXyA)|
| --- | --- | --- |
|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/pete-300x297.jpg" alt="pete" width="116" height="115" />|<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jammazwanPhotoSmall.png" alt="jammazwanPhotoSmall" width="200" height="116" />|[<img class="style-svg" src="https://betterologist.net/wp-content/uploads/2016/05/jamzVid1.png" alt="about" width="115" height="115" />](https://youtu.be/vea51DzmXyA)|
##### Complete working Camel example project, compiled and IDE ready in 60 seconds
---

### TransformWithXslt 

Functionality: **_Transform an XML file with XSLT_**

---

### Setup: 

#### Install Dependency Project:

First, this project requires [jammazwan.shared](https://github.com/jammazwan/jammazwan.shared), if not in your IDE then at least in your mvn repository:

You may skip this step if you already imported jammazwan.shared with another x_project!

_from your bash shell:_

```bash
cd yourworkspacedirectory
git clone https://github.com/jammazwan/jammazwan.shared.git
cd jammazwan.shared
mvn install

```

#### Install This Project:

Git clone the xbb_TransformWithXslt project into your workspace:

_from your bash shell:_

```bash
cd yourworkspacedirectory
git clone https://github.com/jammazwan/xbb_TransformWithXslt.git
cd xbb_TransformWithXslt
mvn install -DskipTests

```

You man now import xbb_TransformWithXslt into your IDE.
 Importing [jammazwan.shared](https://github.com/jammazwan/jammazwan.shared) into your IDE is also sometimes helpful, but not required unless it is reading files from src/main/resources - in that case it has to be cloned as a sibling to this project in the workspace.



---

### Run Instructions:

_Run XbbTest to see the results of the transforms. See NOTES.md for more information._

---

### For More Information:

[Jammazwan x__project FAQ](https://betterologist.net/2016/06/jammazwan-faq/)