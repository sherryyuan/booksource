package com.example.liyuanma.uibestpracticeapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by liyuanma on 2017-12-12.
 */

public class MessageAdepter extends RecyclerView.Adapter<MessageAdepter.ViewHolder> {

    private List<Message> messageList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftMessage;
        TextView rightMessage;

        public ViewHolder(View itemView) {
            super(itemView);
            this.leftLayout = itemView.findViewById(R.id.left_layout);
            this.rightLayout = itemView.findViewById(R.id.right_layout);
            this.leftMessage = itemView.findViewById(R.id.left_message);
            this.rightMessage = itemView.findViewById(R.id.right_message);
        }
    }

    public MessageAdepter(List<Message> messages) {
        messageList = messages;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /**
         * Here, the view is get from the item's layout, and pass to viewHolder
         */
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Message message = messageList.get(position);
        if(message.getType() == Message.TYPE_REVIECED){
            //if the message is recieved by someone, using left image, and right layout need to hide
            holder.leftLayout.setVisibility(View.VISIBLE);
            holder.rightLayout.setVisibility(View.GONE);
            holder.leftMessage.setText(message.getContent());
        }else{
            holder.rightLayout.setVisibility(View.VISIBLE);
            holder.leftLayout.setVisibility(View.GONE);
            holder.rightMessage.setText(message.getContent());
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

}
