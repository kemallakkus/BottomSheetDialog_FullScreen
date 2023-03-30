package com.kemalakkus.kemalakkus

object Constants {
    fun getMyText():ArrayList<Choices> {
        val list=ArrayList<Choices>()
        val list0=Choices("Item categories",false)
        val list1=Choices("Parcel sizes",false)
        val list2=Choices("Shorter upload process",false)
        val list3=Choices("Clothing sizes",false)
        val list4=Choices("Titles & descriptions",false)
        val list5=Choices("Faster loading form",false)
        val list6=Choices("Conditon options",false)
        val list7=Choices("Pricing",false)
        val list8=Choices("Messages from Vinted",false)
        val list9=Choices("Uploading photos",false)
        val list10=Choices("Other",false)
        list.add(list0)
        list.add(list1)
        list.add(list2)
        list.add(list3)
        list.add(list4)
        list.add(list5)
        list.add(list6)
        list.add(list7)
        list.add(list8)
        list.add(list9)
        list.add(list10)

        return list
    }
}