package com.example.expanrr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Article1 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article1);
        tv1=findViewById(R.id.tv1);
        String s1="As COVID-19 has struck fatally it is time to rethink our system of imparting education. The time to think beyond classroom teaching has arrived. The use of technology is on the rise to impart education effectively and make learning more meaningful beyond classrooms.\n" +
                "\n" +
                "Take a look at the educational system world over. We see more of technology playing a pivotal role – be it processing applications, providing text material, scheduling virtual classrooms, organizing interactive sessions through video conferencing and so on. There is good news for India too! It is happening here as well.\n" +
                "\n" +
                "In fact, the trend in India will pick up even more now, owing to the growing importance of social distancing created by the Corona pandemic situation. Enthusiastic entrepreneurs have been coming to the rescue. The process has been ignited and several EdTech firms are trying to reach students with their own unique courses.\n" +
                "\n" +
                "CODING BLOCKS is a start-up working in this direction. It was set up in 2014 by a group of professionals from the likes of IIT Delhi and DTU. The founding members Manmohan Gupta, Brij Mohan Gupta, Prateek Narang and Arnav Gupta not only envision education through their various programs but are also passionate about effective teaching. Instead of taking up lucrative careers the idea that drove this website was that they always felt the best of brains should take up the challenge of teaching and offer skill-based solutions.\n" +
                "\n" +
                "As our staff asked what really inspired them they pointed out the yawning gap in the education system and emphasized that the students graduating are not workplace ready. They say:\n" +
                "\n" +
                "“Coding Blocks was founded with a mission to create skilled Software Engineers for our country and the world. We are here to bridge the gap between the quality of skills demanded by industry and the quality of skills imparted by conventional institutes. Our content is Industry aligned and people, who teach, set the stage for us.”\n" +
                "\n" +
                "Now, the backbone of any training institute is the team of talented and enthusiastic mentors. The website boasts of mentors who are superb coders and are highly adored in the IT industry. Instead of taking up some high-flying job, they decided to stay at Coding Blocks because of their passion to teach. Inspiring teachers and content writers are the USPs of Coding Blocks, not to mention their own products for Online and Live classes. These set them apart from their competitors.\nTalking about competition, they aver, “People in the market claim that they can get students to bigwigs, we do the same, the only difference is our mentors have actually first made it to the bigwigs and now they are teaching and preparing students for them”.\n" +
                "\n" +
                "We were inquisitive about their live class program and to get a glimpse of how it is conducted. Coding Blocks recently launched the Live Classes Program designed to give their students better classroom experience. This initiative was especially started to help students get preoccupied with efficiency in these stressful times. Students have been appreciating the initiative and are finding the program an exact replica of Classroom Programs. Through Live Program, students avail benefits like on-spot doubt resolution, recorded video after each class, manually written tutor notes, and much more. You may find all the Classroom courses with details on the Coding Blocks website. You may find all the courses with Live Classes with details here.\n" +
                "\n" +
                "Moreover, online education is a trend that is fast picking up. The students’ response towards it reveals the degree of its success. A very optimistic reply that our staff was given was that students are really impressed with online pedagogy and have remarked that it has turned out to be a turning point in their lives. They stated that they received immense knowledge during the online course that not only developed their interest but also made them pursue the field later.\n" +
                "\n" +
                "Further, they also provide the ‘In campus training program’ which connects Coding Blocks to the professors of other universities namely, Lovely Professional University and Dehradun Institute of Technology to name a few. The motive is to prepare their students for the market standards and get them placed at bigwigs to seek their success by making them industry-ready.\n‘Work from home’ is becoming the new norm for most IT companies. The ‘STAY HOME’ facility was introduced in this very context. It provides the tech-enthusiasts who want to learn more, a better platform at a very reasonable price, various courses they can take up at the comfort of their homes.  The different courses designed by the company can be accessed here.\n" +
                "\n" +
                "Every service provider is identified by their expertise. Services are always evaluated, and their quality. The coding block identifies its expertise in:\n" +
                "\n" +
                "Create more employable talent by eliminating the skill gaps and creating industry-ready engineers.\n" +
                "Make people fall in love with coding\n" +
                "Unlock new opportunities by compelling students to think beyond industrial jobs and transform their ideas into self-created entrepreneurship ventures.\n" +
                "Connect talent with employers of software companies via our placement assistance program.\n" +
                "Talking about their future plans they wish to see Coding Blocks as the preferred destination of learning Computer science across India. From an initial target audience of college students, they scaled to Working Professionals and Corporates. They have been increasing their initiatives for School students as well.\n" +
                "\n" +
                "“Our focus is to scale up our Online, Live and ISA verticals by at least three folds. This would include increasing our reach into the heart of India”.\n" +
                "\n" +
                "Well, it is interesting to note that the winds of change that blow leave a label on the eras in a unique way. It is time to ask ourselves that given the lockdown situation how is the education sector being redefined? How do you as a company encourage youngsters to seek online courses?\n" +
                "\n" +
                "We are provided with the most awe-inspiring answer!\n" +
                "\n" +
                "“Here is the time when EdTech gets the opportunity to come to the forefront to solve the wreck in the education system. Now, EdTech can become the necessity to serve for the betterment of students’ future during social distancing. This can turn out to be a pivotal point, a revolutionizing of the education system.”\n" +
                "\n" +
                "Hence they point out, Edtech firms are growing in the education industry and this is the crucial time to make history for them. Coding Blocks ensures better efficiency, guidance by tech-experts, recorder lectures, immediate doubt resolution and much more to the youngsters. Adding value and skills to their growth process by seeking online classes is the best way to move forward.\n" +
                "\n" +
                "Highlighting the Mission and Vision for the future of e-learning, the founders quip that opportunities should be grabbed when they knock your door.\n" +
                "\n" +
                "The rise in digitalization shows a way to win every race around the world. It is upon us, humans, to extract the best advantage out of it. EdTech has taken over the matter much seriously and thus, it might turn out to be a changing factor in the upsurge of e-learning. “We foresee a great future in the e-learning domain” they profess.\n" +
                "\n" +
                "It is then very appropriate that the services of such a visionary company have been recognized and rewarded.\n" +
                "\n" +
                "They have been awarded Global Forum for Education and Learning (GFEL ) as one of the top 50 innovative companies in the world in Education.\n" +
                "\n" +
                "They were also awarded WAC (What after college) – Title Rank 2\n" +
                "\n" +
                "As social distancing is becoming a permanent reality, ‘the distance learning’ way is the new norm today. Do you agree? \n" +
                "\n";
        tv1.setText(s1);
        tv1.setMovementMethod(new ScrollingMovementMethod());
    }
}
