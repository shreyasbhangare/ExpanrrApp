package com.example.expanrr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Article3 extends AppCompatActivity {
    private TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article3);
        tv3=findViewById(R.id.TV3);
        String s3="Finance and Technology are the two industries that have been thriving on their own for a long time. Can you think about the possibilities these industries can achieve if they are brought together?\n" +
                "\n" +
                "Well, some individuals and businesses did, and a few years back brought us a new industry, Fintech ( Finance Technology).\n" +
                "\n" +
                "Fintech is a blend of finance and technology and refers to an exciting group of companies that are looking to revolutionize the financial world. With the advance in technology, collaborating finance with it is producing miraculous results. People do not even have to carry cash anymore. The development of Fintech services prevents entrepreneurs from visiting banks to get money. Many services like crowdsourcing, mobile payments, etc. have made it easier to get financing for the business.\n" +
                "\n" +
                "Mahatma Gandhi once said, “Every worthwhile accomplishment, big or small, has its stages of drudgery and triumph: a beginning, a struggle and a victory,” The same can be said about the Fintech market in India today. The Fintech market is slowly climbing the growth curve. With the government-backed initiatives like UPI, BHIM, Aadhaar payments, etc, many new business models are constantly knocking on the doors of the Indian fintech ecosystem.\n" +
                "\n" +
                "Starting a Fintech-based company is a technically-challenging task. But, with a clear plan of action, you can create your Fintech start-up or company. So now, let’s look at the steps which would help you to start a Fintech company in India-\n" +
                "\n" +
                "Find the right niche and develop your business idea\n" +
                "For starting a Fintech company, one must be crystal clear of the target market and the problem they are looking to address. Here are a few niches that you can choose from to start your Fintech company-\n" +
                "\n" +
                "Online Payments\n" +
                "\n" +
                "Insuretech\n" +
                "\n" +
                "E-money Lending\n" +
                "\n" +
                "Mobile Trading & Investments\n" +
                "\n" +
                "Mobile Banking\n" +
                "\n" +
                "Crowdfunding Platforms\n" +
                "\n" +
                "Personal Finance Management\n" +
                "\n" +
                "Now that you have found your niche, it is really important to find out your competitors in the field. Find their loopholes and work on them. Make your business model more superior to the target audience. The business model shall be different, engaging, and superior, only then the audience will change their preference and switch to your model.\n" +
                "\n" +
                "Learn the regulations & legalities\n" +
                "With the help of a corporate lawyer obtain licenses, approval and authorization from the applicable regulatory authorities before commencing operations. Legalities differ according to the type of service you plan to provide. A few common legalities include website user agreement, mobile app user agreement, privacy policies, vendor agreements, product development agreements, employee contracts, etc. India being a signatory to various treaties across the world is an added benefit for your start-up. You can protect your intellectual property in India and the member states.\n" +
                "\n" +
                "The brand name, logo and other related intellectual property can be protected by trademarks. Patents can be filed to protect the technology you develop.\n" +
                "\n" +
                "Hiring the right team\n" +
                "A successful company is made by its people. Therefore, hiring the right talent from amongst the crowd is of vital importance. You must have a knowledgeable team of technical experts to create your Fintech app or the software.\n" +
                "\n" +
                "Get funded\n" +
                "Funding is the most important and probably the most difficult part of starting any company. You have to show the potential of your business model. Creating an MVP (Minimum Viable Product) may help you in this case. You can show it as a proof of concept to the potential investors and ask them for the investment in your company.\n" +
                "\n" +
                "Build Partnerships\n" +
                "Partnering is an excellent approach to build muscle in innovation. It can be hard for users to trust in the emerging entity, thus, when you are associated with a relevant name, it becomes comparatively easier to sail through the hurdles.\n" +
                "\n" +
                "One may not simply feel a revolutionary experience when paying for the food online or booking tickets online, but all of these are services only possible due to Fintech services. So whether you are purchasing a cup of coffee or managing your stock market profile, Fintech is all around us.\n" +
                "\n" +
                "NITIAYOG expects the Fintech market to expand to $31 billion in 2020. Paytm, Razorpay, PolicyBazar, MobiKwik, Pine Labs, Money Tap, etc., are all thriving examples of homegrown startups that have made it big.\n" +
                "\n" +
                "Now that you have an idea of how to start your own Fintech company in India and know its growing importance, why wait and just think about it?\n" +
                "\n";
        tv3.setText(s3);
        tv3.setMovementMethod(new ScrollingMovementMethod());

    }
}
