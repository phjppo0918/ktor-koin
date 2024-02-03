package com.example.plugins.koin

import com.example.member.InMemoryMemberRepository
import com.example.member.MemberRepository
import com.example.member.MemberService
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::InMemoryMemberRepository) {bind<MemberRepository>()}
    singleOf(::MemberService)
}

