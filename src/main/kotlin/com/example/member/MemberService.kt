package com.example.member

class MemberService (
    private val memberRepository: MemberRepository
) {
    fun signup(member: Member){
        memberRepository.save(member)
    }

    fun findAll() : List<Member>
        = memberRepository.findAll()
}