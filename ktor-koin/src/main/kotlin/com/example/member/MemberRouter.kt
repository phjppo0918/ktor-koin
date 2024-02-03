package com.example.member

import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.memberRouting() {
    val memberService by inject<MemberService>()

    route("/members") {
        get("") {

        }
    }
}