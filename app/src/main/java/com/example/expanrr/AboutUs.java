package com.example.expanrr;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    textView=findViewById(R.id.tvaboutinfo);
    String para="Our Story\n\n" +
            "Expanrr is an online media platform for all aspiring newbies to build their ambitions and take the opportunities of exploring their skills and talents. Expanrr is not only for young mature entrepreneurs but also for every raw enthusiastic youngster to bring his or her talent overboard.\n" +
            "\n" +
            "Shiv S Mishra, the founder, and promoter of Expanrr.com is a dynamic entrepreneur who sees opportunities everywhere. After dabbling with fashion and social issues, he presently is engaged in education and motivating youngsters and struggling entrepreneurs who aspire to transform their business ideas into successful startups. His mantra is “Life never stops teaching, so, how can one afford to stop learning?”\n" +
            "\n" +
            "Inspiration: Why did it start?\n" +
            "\n" +
            "What inspired the founder to set up Expanrr.com? This educational venture was set up with the belief that learning is all-pervasive. Every news bulletin or a video clipping; every tweet or a Facebook post has a message or a story to convey. Youngsters seek content from social media than from newspapers and magazines. Short, brief, informing and instantly available content that inspires is what the audience wants and what we exactly offer.\n" +
            "\n" +
            "Our Focus: Entrepreneurs, SMEs and Youth\n" +
            "\n" +
            "Expanrr caters to all entrepreneurs who are networking – collaborating and learning at the same time, to set up small businesses or start-ups. All those who want to share a story or an experience; how their efforts were different from that of others, those wanting to inspire and be inspired are our main focus. We also reach out to youngsters, learners, trainees, and training institutes.\n" +
            "\n" +
            "Our Mission\n" +
            "\n" +
            "Your day to day experiences connect you to learning which takes you on the path of growth. That is how we arrived at the Mission of this venture: Connect, Learn And Grow. We aim to assist learners/beginners- all-new young entrepreneurs, who can share their stories and experiences, talk about their products or launch their brands. The goal is to inspire the young guns to fire, take the journey and carve their niche domains.\n" +
            "\n" +
            "Why Us?\n" +
            "\n" +
            "Of all success stories, the most enthralling ones are those where young ambitious aspirants have to take small steps to succeed in the face of various hurdles that challenge every step. The absence of focus on young entrepreneurs gave us an opportunity to work on their marketing skills, publicize their brands, create customers and improve businesses. As time is money, spreading knowledge through Videos, Podcasts, eBooks or blogs not only saves time but also provides in ‘Briefs’ instant suggestions. While professionals have established businesses, the small entrepreneurs struggle for a foothold. We focus on these young newcomers who can meet, greet and share the hurdles they face, seek solutions and be the motivation to others.\n" +
            "\n" +
            "Emotional Branding: Customers identify products by the ‘brand’. They also build an image and personality around brands in their minds. When our efforts impact the journey of these young business icons, it emotionally impacts the brands too. Consumers cannot resist brands with inspiring stories.\n" +
            "\n" +
            "Astonishment: Expanrr offers avenues to entrepreneurs to expose all their backward and forward channels which helps the flow of information throughout chain.\n" +
            "\n" +
            "Explore Globally: The digital platform offers global reach and therefore access to global markets. Connecting the entrepreneurs and target audience popularizes their platforms globally.\n" +
            "\n" +
            "Innovation: Technology is indispensable. The growth of digital technologies has opened up several opportunities for start-ups. Application of these technologies to other fields is impacting speed, scale, accuracy and efficiency not only in manufacturing but also services.\n" +
            "\n" +
            "Contribution: An online platform which contributes to education, learning and motivating young aspirants serves the people and society as a whole.\n" +
            "\n" +
            "Educate: Youngsters want content and information in capsules, so they can quickly absorb the knowledge offered via blogs, podcasts, social media, videos, etc.\n" +
            "Learning: Entrepreneurship isn’t only about creating business and business opportunities. Learning from mistakes and problems enables entrepreneurs to move from one sector to another. The risk-taking and problem-solving abilities of an entrepreneur transform startups into conglomerates.\n" +
            "Motivation: The core purpose of providing this platform is to lead every aspiring youth to his or her defined goals. Influencing young minds by creating motivating content on the platform is exactly what Expanrr does.\n" +
            "We welcome all you enthusiasts who with the power of entrepreneurship to contribute to a better future.\n" +
            "\n" +
            "Share your wayfare with us and make a mark in the industry.\n" +
            "\n" +
            "Email us at story@expanrr.com";




    textView.setText(para);
    textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
