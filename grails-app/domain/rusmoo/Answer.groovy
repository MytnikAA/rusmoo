package rusmoo

class Answer {
    Integer score
    Boolean right
    Integer questionId
    
    static constrans = {
        score(nullable:true)
        right(nullable:true)
        questionId(nullable:true)
    }    
}

