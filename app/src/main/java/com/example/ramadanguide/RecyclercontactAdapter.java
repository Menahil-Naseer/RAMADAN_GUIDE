package com.example.ramadanguide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclercontactAdapter extends RecyclerView.Adapter<RecyclercontactAdapter.ViewHolder> {
    Context context;
    ArrayList<contactModel> arrcontacts;
    public RecyclercontactAdapter(Context context,ArrayList<contactModel> arrcontacts)
    {
        this.context=context;
        this.arrcontacts=arrcontacts;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_row,viewGroup,false);
        ViewHolder viewholder=new ViewHolder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtdate.setText(arrcontacts.get(i).date);
        viewHolder.txtsuhoor.setText(arrcontacts.get(i).suhoor);
        viewHolder.txtiftar.setText(arrcontacts.get(i).iftar);
    }

    @Override
    public int getItemCount() {
        return arrcontacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtdate,txtsuhoor,txtiftar;
        public ViewHolder(View itemview)
        {
            super(itemview);
            txtdate=itemview.findViewById(R.id.textview1);
            txtsuhoor=itemview.findViewById(R.id.textview2);
            txtiftar=itemview.findViewById(R.id.imageView);


        }

    }
}

