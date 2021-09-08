package com.github.pwoodworth.intellijmetricsplugin.services

import com.intellij.openapi.project.Project
import com.github.pwoodworth.intellijmetricsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
