package com.example.member

interface MemberRepository {
    fun save(member: Member)
    fun findAll() : List<Member>
}

