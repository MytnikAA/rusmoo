package rusmoo

class Block {

    String name;
    Integer courseId;
    
    static constraints = {
        name(nullable:true, size:100)
        courseId(nullable:true)
    }
}
