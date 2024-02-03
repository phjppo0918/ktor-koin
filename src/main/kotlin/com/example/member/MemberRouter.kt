package com.example.member

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.memberRouting() {
    val memberService by inject<MemberService>()

    route("/members") {
        post {
            val member = call.receive<Member>()

            memberService.signup(member)

            call.respond(HttpStatusCode.Created)
        }

        get {
            call.respond(memberService.findAll())
        }

    }
}