package com.coderfaysal.namaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleView);


        hashMap = new HashMap<>();
        hashMap.put("title", "নামাজ কি?");
        hashMap.put("message", "নামাজ বা নামায (ফার্সি: نماز) বা সালাত বা সালাহ (আরবি: صلاة) ইসলাম ধর্মের একটি দৈনিক নিয়মিত ইবাদত। একটি নির্দিষ্ট পদ্ধতিতে নামাজ আদায় করতে হয় যা কুরআন ও হাদিসে বর্ণিত আছে। এটি মুসলমানদের জন্য প্রতিদিন অবশ্যকরণীয় একটি ধর্মীয় কাজ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "পারিভাষিক সঙ্গা");
        hashMap.put("message", "ইসলামী শরিয়তের পরিভাষায়, “নির্দিষ্ট রুকন ও জিকিরসমূহকে বিশেষ পদ্ধতিতে নির্ধারিত সময়ে আদায় করাকে সালাত বলে।”\n" +
                "রাসূল (সাঃ) বলেছেন, “দ্বীনের মস্তক ইসলাম এবং তার স্তভ হলো সালাত।”\n" +
                "মুজামূল ওয়াসীত গ্রন্থগার বলেন, “শরীয়াতে নির্ধারিত সময়ে ও সুস্পষ্টভাবে বর্ণিত একটি নির্দিষ্ট ইবাদতের নাম সালাত।”");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "নামাজ কাকে বলে ?");
        hashMap.put("message", "যা দ্বারা মন পবিত্র হয়ে আল্লাহকে স্মরণ করা হয় তা-ই নামাজ । আল্লাহকে স্মরণ করাই নামাজের উদেশ্য । মনকে আল্লাহর কাছ হতে দূরে রাখলে নামাজের উদ্দেশ্য সাধিত হয় না । প্রবৃত্তির বিষয়ে উচ্ছৃঙ্খল থেকে শুধু অজু গোছলের পবিত্রতা নিয়ে কেবল অঙ্গভঙ্গি দ্বারা নামাজ আদায় হয় না । নামাজ হৃদয়ের জিনিস ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "নামাজ কত ওয়াক্ত? ");
        hashMap.put("message", "দৈনিক পাঁচ ওয়াক্ত নামাজ আদায় করা ফরজ। ফরজের পাশাপাশি প্রত্যেক ওয়াক্তেই ওয়াজিব, সুন্নাত এবং নফল নামাজ রয়েছে। নামাজের মোট পাঁচ ওয়াক্ত নিচে দেয়া হলো:\n" +
                "এবং কোন ওয়াক্ত কত রাকাত?\n" +
                "১। ফজর নামাজ-৪ রাকাত:(২-রাকাত সুন্নাত + ২ রাকার ফরজ।) \n" +
                "\n" +
                "২। যোহর নামাজ-১২ রাকাত:(৪-রাকাত সুন্নাত + ৪-রাকাত ফরজ + ২-রাকাত ছোট সুন্নাত + ২-রাকাত নফল) \n" +
                "\n" +
                "৩। আছর নামাজ-৮ রাকাত:(৪-রাকাত সুন্নাত||৪-রাকাত ফরজ) \n" +
                "\n" +
                "৪। মাগরিব নামাজ-৭ রাকাত:(৩-রাকাত ফরজ + ২-রাকাত সুন্নাত + ২-রাকাত নফল) \n" +
                "\n" +
                "৫। এশার নাম-১৫ রাকাত:(৪-রাকাত সুন্নাত + ৪-রাকাত ফরজ + ২-রাকাত ছোট সুন্নাত + ২-রাকাত নফল +  ৩-রাকাত বেতর)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কার উপর কোন নামায ফরয করা হয়েছিল");
        hashMap.put("message", "হযরত আদম (আঃ) এর উপর ফজরের নামায, হযরত দাউদ (আঃ) এর উপর জোহরের নামায। হযরত সোলায়মান (আঃ) এর উপর আছরের নামায, হযরত ইয়াকুব (আঃ) এর উপর মাগরিবের নামায। এবং হযরত ইউনুছ (আঃ) এর উপর এশার নামায ফরয করা হয়েছিল।");
        arrayList.add(hashMap);


        XAdapter xAdapter = new XAdapter();
        recyclerView.setAdapter(xAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }


    private class XAdapter extends RecyclerView.Adapter<XAdapter.XViewHolder>{


        @NonNull
        @Override
        public XViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.items, parent, false );
            return new XViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull XViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String message = hashMap.get("message");

            holder.textView.setText(title);

            holder.cardView.setOnClickListener(view -> {
                Details.TITLE = title;
                Details.MESSAGE = message;
                startActivity(new Intent(MainActivity.this, Details.class));
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class XViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cardView;

            public XViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.textView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }

    }






}