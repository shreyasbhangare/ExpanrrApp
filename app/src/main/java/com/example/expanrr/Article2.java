package com.example.expanrr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Article2 extends AppCompatActivity {
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article2);
        tv2=findViewById(R.id.tv2);
        String s2="With the increasing confirmed cases of coronavirus–Is work from home the new future for startups and entrepreneurs in India?\n" +
                "\n" +
                "Many may argue that nothing can overcome the image of peacefully working at home. In the comfort of their own house without the problem of commutation or the nagging of their boss. It generates an array of images in everyone’s minds. Businesses whether small or large are trying to cope with the threats of COVID-19. Working from home has become their new normal. However, it is challenging because of the risk of declining productivity, network issues and unprecedented cyber safety challenges.\n" +
                "\n" +
                "Working from home just doesn’t have the same feel like sitting at your own desk in an office environment. It means attending online meetings and calls with people all around the world without even knowing them personally! Some might say this leads to coordination and communication problems. There’s no doubt that now due to the coronavirus; startups and businesses in India will have to face many more problems.\n" +
                "\n" +
                "So, the question remains – is it actually helpful? Is working from home a viable option?\n" +
                "\n" +
                "New and better technology has allowed flexibility for companies and their team. This means that even amid a global pandemic, businesses can still continue working productively. This is only possible if businesses learn how to fully utilize the benefits of the available technology. Beyond the obvious of setting your personal and work life separate – Here’s how to work from home effectively-\n" +
                "\n" +
                "Maintain a consistent schedule\n" +
                "Setting a regular schedule helps remain focused, organized and provides a structure to the day helping you remain motivated throughout. Plan your goals and targets for the day. Prioritize your tasks and avoid multitasking as it would mean a lack of commitment to both the tasks. Schedule time slots according to the target to avoid switching between two tasks. Working from home is nothing different than working at an office: start your day early and try to avoid online distractions once you start your work. Stay focused. It is really important while working effectively from home.\n" +
                "\n" +
                "Find your own working space\n" +
                "Set up a home office. Working at home means an open invitation to distractions from family members and the home environment. Create a dedicated workplace to help maintain work environment at your home. Make sure you have a steady internet connection. This will keep you focused and away from distractions. Schedule a time with your family, friends and yourself, so you have somewhere to escape after the hectic working hours. Let your family know you will be unavailable during working hours. Don’t mix your work and personal life as this may lead to lower productivity.\n" +
                "\n" +
                "Don’t forget to take regular breaks\n" +
                "It is crucial to take small “brain breaks” to help remain and boost productivity from home. Researchers suggest that the most productive employees work for 52 minutes and then take a 17-minute break. During the break time, allow yourself the opportunity to recuperate. While taking a break, close your computer. Breaks can be as simple as reading, staring outside the window, or exercising. Then get back to work rejuvenated. To give your full focused attention; taking breaks proves an increase in productivity.\n" +
                "\n" +
                "Stay connected with your team\n" +
                "Adapt to over-communication. Having a communication strategy designed for your team and colleagues is the key to mastering remote work. Prolonged isolation could lead to loss of productivity and motivation. Make sure to take extra effort and stay connected with your team. Contribute during meetings and let the creativity flow. Staying connected helps your mental well-being as it’s important to stay “visible” even if you are not working in an office environment. Technology has made it possible to connect to anyone from any part of the world. There are many applications like Zoom and Google Duo available to help make online meetings effective. Also, virtual face-to-face meetings or a simple phone call allows teammates to feel connected and avoids the fear of losing human touch with their colleagues.\n" +
                "\n" +
                "Keep a positive attitude and a healthy mindset\n" +
                "Working from home is the time when your entrepreneurial and business skills are on a test. This opportunity nevertheless gives rise to loneliness. Listening to music, communicating and exercising can help keep your spirits up. This is a time when startups and companies can restate their optimism and resilience skills. The WHO provides great insights into how to maintain mental health during the COVID-19 crisis through simple measures such as minimizing access to news about COVID-19 to avoid anxiety and stress.\n" +
                "\n" +
                "Working from home is difficult but it offers great opportunities, liberty and flexibility to create and maintain healthier habits while remaining productive. Exercising your mental and physical health are equally important.\n" +
                "\n" +
                "Work from home is here to stay, at least for the next few years as social distancing and COVID-19 measurements need to be followed. Working from home is a transformational concept for Indian companies. If implemented effectively, it will perform wonders for the economy especially the technology sector. Globalization and technology suggest working from home could be the solution both employers and employees are looking for in this crucial time of COVID-19. Companies like Microsoft and Google have already adapted to this concept.\n" +
                "\n" +
                "Is work from home the new future for Indian startups and businesses too?";
        tv2.setText(s2);
        tv2.setMovementMethod(new ScrollingMovementMethod());
    }
}
