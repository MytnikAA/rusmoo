package rusmoo

class Referrence {

    String url
    Integer unitId
    
    static constraints = {
        url(nullable:true, size:0..256)
        unitId(nullable:true)
    }
    
    static mapping = {
        table "REFERRENCE"
        id column: 'ID', type: 'integer'
    }
}
