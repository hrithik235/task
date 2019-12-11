package com.example.hrithik.anew;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder>{


      private  String[] data;

      public  MyAdapter(String[] data){
         this.data=data;
      }


      @NonNull
      @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          LayoutInflater inflater =LayoutInflater.from(parent.getContext());
          View view = inflater.inflate(R.layout.list_layout,parent,false);

          return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
      String str= data[position];
      holder.txtItem.setText(str);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewholder extends RecyclerView.ViewHolder{
          ImageView imgItem;
          TextView txtItem;
          public MyViewholder(View itemView) {
            super(itemView);
              imgItem= itemView.findViewById(R.id.imgItem);
              txtItem= itemView.findViewById(R.id.txtItem);
        }
    }
}

