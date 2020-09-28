package com.example.postapp.models

data class Post
    (
    var userId:Int,var id:Int,var title:String,var body:String
)

@Database (entities = arrayOf(post:::class),version = 1)
        abstract class postAppDatabase:RoomDatabase(){
            abstract fun postDao():postDao

            companion object {
                private var dbInstance: postAppDatabase? = null
                fun get DbInstance(context:context):postAppDatabase
                {
                    if (dbInstance = Room.databaseBuilder(
                            context,
                            postAppDatabase::class.java,
                            name
                            'postapp.db'
                        ).build()
                    )

                }

                return dbInstance as postAppDatabase
            }
            }
        }