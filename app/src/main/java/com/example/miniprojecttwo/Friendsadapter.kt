package com.example.miniprojecttwo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FriendsAdapter (val context:Context): RecyclerView.Adapter<FriendViewHolder>(){
    val model = SampleDataFriends()
    val listOfFriends = model.FRIENDS_LIST

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
      val itemView:View =LayoutInflater.from(context).inflate(R.layout.list_friends_layout,parent,false)
       return FriendViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
      holder.name.text = listOfFriends[position].name
      holder.gender.text = listOfFriends[position].gender
      holder.image.setImageResource(listOfFriends[position].drawableResource)
    }

    override fun getItemCount(): Int {
       return listOfFriends.size
    }
}


class FriendViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var name:TextView = itemView.findViewById(R.id.friend_name)
    var gender:TextView = itemView.findViewById(R.id.friend_gender)
    var image:ImageView= itemView.findViewById(R.id.friend_image)
}