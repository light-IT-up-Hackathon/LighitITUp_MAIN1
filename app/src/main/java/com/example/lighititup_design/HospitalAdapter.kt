package com.example.lighititup_design

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class HospitalAdapter (val hospitalList : ArrayList<Hospitals>): RecyclerView.Adapter<HospitalAdapter.CustomViewHolder1>() {
    //뷰홀더가 처음 생성될때
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalAdapter.CustomViewHolder1 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_griditem, parent, false)
        return CustomViewHolder1(view)
    }

    //재활용해주는 곳 및 값을 넣어주는 곳
    override fun onBindViewHolder(holder: HospitalAdapter.CustomViewHolder1, position: Int) {
        holder.h_Image.setImageResource(hospitalList.get(position).image)
        holder.h_name.text = hospitalList.get(position).name
        holder.h_field.text = hospitalList.get(position).field
        holder.h_time.text = hospitalList.get(position).time
        holder.h_location.text = hospitalList.get(position).location
    }
    //리스트의 갯수를 적어준다
    override fun getItemCount(): Int {
        return hospitalList.size
    }

    //뷰홀더 클래스(음료수처럼 잡아주는 홀더)
    //이곳에서 파인드뷰아이디로 리스트 아이템에 있는 뷰들을 참조한다.
    inner class CustomViewHolder1(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val h_Image = itemView.findViewById<ImageView>(R.id.imageView_hospital) //병원 종류
        val h_name = itemView.findViewById<TextView>(R.id.hospital_name)
        val h_field = itemView.findViewById<TextView>(R.id.hospital_field)
        val h_time = itemView.findViewById<TextView>(R.id.hospital_time)
        val h_location = itemView.findViewById<TextView>(R.id.hospital_location)
    }
}