### TransformWithXslt NOTES:

 * Run XbbTest. Observe that it generates a file name myDerivedCatalog.html 
 in the root of the project
 * The file is deleted before every run
 
### XSL File Location:

Note that the xsl file must be in the classpath, as opposed to other files, 
which can be elsewhere on the file system.

Also note that the root of the classpath for this xsl file is not the 
root of the binary (such as where the generated file is written), 
but instead in src/main/resources
 