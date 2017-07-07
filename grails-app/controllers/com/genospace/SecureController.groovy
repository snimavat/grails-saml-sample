package com.genospace

import grails.plugin.springsecurity.annotation.Secured

@Secured('IS_AUTHENTICATED_REMEMBERED')
class SecureController {

    def index() { }
}
