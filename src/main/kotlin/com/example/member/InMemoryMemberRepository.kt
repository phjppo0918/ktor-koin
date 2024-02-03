package com.example.member

class InMemoryMemberRepository : MemberRepository {
    val map = mutableMapOf<String, Member>()
    override fun save(member: Member) {
        map[member.name] = member
    }

    override fun findAll(): List<Member> =
        map.values.toList()
}