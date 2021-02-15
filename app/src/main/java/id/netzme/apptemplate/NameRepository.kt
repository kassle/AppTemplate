package id.netzme.apptemplate

class NameRepository {
    private val name = "Edward Pullen"
    private val email = "unused@field.com"

    fun getName() : String {
        return name
    }

    fun getEmail() : String {
        return email
    }
}