package com.example.liyuanma.uibestpracticeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Message> messageList = new ArrayList<>();

    private EditText editText;

    private Button send;

    private RecyclerView recyclerView;

    private MessageAdepter messageAdepter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        initMessage();
        editText = findViewById(R.id.input_text);
        send = findViewById(R.id.send);
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        messageAdepter = new MessageAdepter(messageList);
        recyclerView.setAdapter(messageAdepter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = editText.getText().toString();
                if (!"".equals(content)) {
                    Message message = new Message(content, Message.TYPE_SEND);
                    messageList.add(message);
                    messageAdepter.notifyItemInserted(messageList.size() -
                            1);//when new message income, refresh the RecyclerView to show the text
                    editText.setText("");
                }
            }
        });
    }

    private void initMessage() {
        Message msg1 = new Message(" Hello guy.", Message.TYPE_REVIECED);
        messageList.add(msg1);
        Message msg2 = new Message(" Hello. Who is that?", Message.TYPE_SEND);
        messageList.add(msg2);
        Message msg3 = new Message(" This is Tom. Nice talking to you. ", Message.TYPE_REVIECED);
        messageList.add(msg3);
    }
}
