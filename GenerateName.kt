object GenerateName{

    fun output( name : String ){

        val new_names = arrayListOf<String>()

        for( i in 0 until name.length-1 ) {

            var s : String = ""
            for (ii in 0 until name.length) {
                s += name[ii]
                if( ii == i ){
                    s += "\u061C"
                }
            }

            new_names.add(s)
        }
        println("You can try out these names ( copy without \" !! ):")
        new_names.forEach{ n ->

            println("\"$n\"")
        }
    }
}