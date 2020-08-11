package com.dicoding.picodiploma.android_version_data;

import java.util.ArrayList;

public class AndroidData {
    private static String[] androidNames = {
            "Cupcake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow",
            "Nougat",
            "Oreo",
            "Pie",
            "Android 10",
            "Android 11"
    };

    private static String[] androidVersions = {
            "Version 1.5",
            "Version 1.6",
            "Version 2.0-2.1",
            "Version 2.2-2.2.3",
            "Version 2.3-2.3.7",
            "Version 3.0-3.2.6",
            "Version 4.0-4.0.4",
            "Version 4.1-4.3.1",
            "Version 4.4-4.4.4",
            "Version 5.0-5.1.1",
            "Version 6.0-6.0.1",
            "Version 7.0-7.1.2",
            "Version 8.0-8.1",
            "Version 9",
            "Version 10",
            "Version 11"
    };

    private static int[] androidLogos = {
            R.drawable.cupcake_removebg,
            R.drawable.donut_removebg,
            R.drawable.eclair_removebg,
            R.drawable.froyo_removebg,
            R.drawable.gingerbread_removebg,
            R.drawable.honeycomb_removebg,
            R.drawable.icecreamsandwich_removebg,
            R.drawable.jellybean_removebg,
            R.drawable.kitkat_removebg,
            R.drawable.lollipop_removebg,
            R.drawable.marshmallow_removebg,
            R.drawable.nougat_removebg,
            R.drawable.oreo_removebg,
            R.drawable.pie_removebg,
            R.drawable.ten_removebg,
            R.drawable.eleven_removebg
    };

    private static String[] androidHomeScreen = {
            "@drawable/cupcake_home_screen",
            "@drawable/donut_home_screen",
            "@drawable/eclair_home_screen",
            "@drawable/froyo_home_screen",
            "@drawable/gingerbread_home_screen",
            "honeycomb_home_screen",
            "@drawable/icecreamsandwich_home_screen",
            "@drawable/jellybean_home_screen",
            "@drawable/kitkat_home_screen",
            "@drawable/lollipop_home_screen",
            "@drawable/marshmallow_home_screen",
            "@drawable/nougat_home_screen",
            "@drawable/oreo_home_screen",
            "@drawable/pie_home_screen",
            "@drawable/ten_home_screen",
            "@drawable/eleven_home_screen"
    };

//    private static String[] androidLogos = {
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/cupcake_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/donut_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/eclair_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/froyo_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/gingerbread_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/honeycomb_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/icecreamsandwich_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/jellybean_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/kitkat_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/lollipop_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/marshmallow_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/nougat_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/oreo_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/pie_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/ten_removebg.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/eleven_removebg.png"
//    };

//    private static String[] androidHomeScreen= {
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/cupcake_home_screen.jpg",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/donut_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/eclair_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/froyo_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/gingerbread_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/honeycomb_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/icecreamsandwich_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/jellybean_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/kitkat_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/lollipop_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/marshmallow_home_screen.jpg",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/nougat_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/oreo_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/pie_home_screen.png",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/ten_home_screen.jpg",
//            "https://raw.githubusercontent.com/Ndhel97/Dicoding_Android_version/master/drawable/eleven_home_screen.png"
//    };

    private static String[] descriptionAndroid = {
            "Android \"Cupcake\" (version 1.5) is the third version of Android developed by Google , a major platform release deployable to Android-powered handsets starting in April 2009, that is no longer supported. The release included new features for users and developers, as well as changes in the Android framework API. For developers, the Android 1.5 platform was available as a downloadable component for the Android SDK.\n" +
                    "\n" + "Android 1.5 included new features such as an on-screen keyboard and Bluetooth support as well as improvements to existing features such as UI changes for application management and several Google apps.",
            "Android \"Donut\", a.k.a. Android 1.6, is the fourth version of the open source Android mobile operating system developed by Google that is no longer supported. Among the more prominent features introduced with this update were added support for CDMA smartphones, additional screen sizes, a battery usage indicator, and a text-to-speech engine.\n" +
                    "\n" + "After the public release of Donut—its official dessert-themed code name, the convention employed by Google to designate major Android versions—carriers were quick to follow with its roll out to customers in the form of an over-the-air (OTA) update for compatible smartphones.",
            "Android \"Eclair\" is a codename of the Android mobile operating system developed by Google and the fifth operating system for Android, and for the no-longer supported versions 2.0 to 2.1. Unveiled on October 26, 2009, Android 2.1 builds upon the significant changes made in Android 1.6 \"Donut\".",
            "Android \"Froyo\" is the sixth version of Android and is a codename of the Android mobile operating system developed by Google, spanning versions between 2.2 and 2.2.3. Those versions are no longer supported. It was unveiled on May 20, 2010, during the Google I/O 2010 conference.\n" +
                    "\n" + "One of the most prominent changes in the Froyo release was USB tethering and Wi-Fi hotspot functionality. Other changes include support for the Android Cloud to Device Messaging (C2DM) service, enabling push notifications, additional application speed improvements, implemented through JIT compilation and displayed within applications as top-of-the-screen banners.",
            "Android 2.3 \"Gingerbread\" is the seventh version of Android, a codename of the Android mobile operating system developed by Google and released in December 2010, for versions that are no longer supported. The Gingerbread release introduced support for near field communication (NFC)—used in mobile payment solutions—and Session Initiation Protocol (SIP)—used in VoIP internet telephones.\n" +
                    "\n" + "Gingerbread's user interface was refined in many ways, making it easier to master, faster to use, and more power-efficient. A simplified color scheme with a black background gave vividness and contrast to the notification bar, menus, and other user interface components. Improvements in menus and settings resulted in easier navigation and system control.\n" +
                    "\n" + "The Nexus S smartphone, released in December 2010, was the first phone from the Google Nexus line that ran Gingerbread, and also the first one from the line with built-in NFC functionality.\n" +
                    "\n" + "As of April 2020, statistics issued by Google indicate that 0.2% of all Android devices accessing Google Play run Gingerbread.",
            "Android \"Honeycomb\" is the codename for the eighth version of Android, designed for devices with larger screen sizes, particularly tablets. It is no longer supported. Honeycomb debuted with the Motorola Xoom in February 2011. Besides the addition of new features, Honeycomb introduced a new so-called \"holographic\" user interface theme and an interaction model that built on the main features of Android, such as multitasking, notifications and widgets.",
            "Android \"Ice Cream Sandwich\" is the fourth major version of the Android mobile operating system developed by Google. Unveiled on October 19, 2011, Android 4.0 builds upon the significant changes made by the tablet-only release Android Honeycomb, in an effort to create a unified platform for both smartphones and tablets.\n" +
                    "\n" + "Android 4.0 was focused on simplifying and modernizing the overall Android experience around a new set of human interface guidelines. As part of these efforts, it introduced a new visual appearance codenamed \"Holo\", which is built around a cleaner, minimalist design, and a new default typeface named Roboto. It also introduced a number of other new features, including a refreshed home screen, near-field communication (NFC) support and the ability to \"beam\" content to another user using the technology, an updated web browser, a new contacts manager with social network integration, the ability to access the camera and control music playback from the lock screen, visual voicemail support, face recognition for device unlocking (\"Face Unlock\"), the ability to monitor and limit mobile data usage, and other internal improvements.\n" +
                    "\n" + "Android 4.0 received positive reviews by critics, who praised the cleaner, revamped appearance of the operating system in comparison to previous versions, along with its improved performance and functionality. However, critics still felt that some of Android 4.0's stock apps were still lacking in quality and functionality in comparison to third-party equivalents, and regarded some of the operating system's new features, particularly the \"face unlock\" feature, as being gimmicks.\n" +
                    "\n" + "As of May 2019, statistics issued by Google indicate that 0.3% of all Android devices accessing Google Play run Ice Cream Sandwich.",
            "Android \"Jelly Bean\" is the codename given to the tenth version of the Android mobile operating system developed by Google, spanning three major point releases (versions 4.1 through 4.3.1). Among the devices that run Android 4.3 are the Asus Nexus 7 (2013).\n" +
                    "\n" + "The first of these three releases, 4.1, was unveiled at Google's I/O developer conference in June 2012. It focused on performance improvements designed to give the operating system a smoother and more responsive feel, improvements to the notification system allowing for \"expandable\" notifications with action buttons, and other internal changes. Two more releases were made under the Jelly Bean name in October 2012 and July 2013 respectively, including 4.2—which included further optimizations, multi-user support for tablets, lock screen widgets, quick settings, and screen savers, and 4.3—which contained further improvements and updates to the underlying Android platform.\n" +
                    "\n" + "Jelly Bean versions are no longer supported by Google. As of September 2019, 0.43% of Android devices run Jelly Bean.",
            "Android \"KitKat\" is the codename for the eleventh version of the Android mobile operating system, representing release version 4.4. Unveiled on September 3, 2013, KitKat focused primarily on optimizing the operating system for improved performance on entry-level devices with limited resources.\n" +
                    "\n" + "Android 4.4 \"KitKat\" was officially announced on September 3, 2013. The release was internally codenamed \"Key lime pie\"; John Lagerling, director of Android global partnerships, and his team, decided to drop the name, arguing that \"very few people actually know the taste of a key lime pie\". Aiming for a codename that was \"fun and unexpected\", his team pursued the possibility of naming the release \"KitKat\" instead. Lagerling phoned a representative of Nestlé, who owns the Kit Kat brand and produces the confectionary (outside the United States, where it is produced by The Hershey Company under license), and quickly reached a preliminary deal for a promotional collaboration between the two companies, later finalized in a meeting at Mobile World Congress in February 2013. The partnership was not revealed publicly, or even to other Google employees and Android developers (who otherwise continued to internally refer to the OS as \"KLP\"), until its official announcement in September.\n" +
                    "\n" + "As of May 2020, 1.83% of Android devices run KitKat.",
            "Android \"Lollipop\" (codenamed Android L during development) is the fifth major version of the Android mobile operating system developed by Google and the 12th version of Android, spanning versions between 5.0 and 5.1.1. Unveiled on June 25, 2014 at the Google I/O 2014 conference, it became available through official over-the-air (OTA) updates on November 12, 2014, for select devices that run distributions of Android serviced by Google (such as Nexus and Google Play edition devices). Its source code was made available on November 3, 2014. It is the fifth major update and the twelfth version of Android.\n" +
                    "\n" + "One of the most prominent changes in the Lollipop release is a redesigned user interface built around a design language known as Material Design, which was made to retain a paper-like feel to the interface. Other changes include improvements to the notifications, which can be accessed from the lockscreen and displayed within applications as top-of-the-screen banners. Google also made internal changes to the platform, with the Android Runtime (ART) officially replacing Dalvik for improved application performance, and with changes intended to improve and optimize battery usage.\n" +
                    "\n" + "Android Lollipop was succeeded by Android Marshmallow, which was released in October 2015.\n" +
                    "\n" + "As of July 2020, 1.21% of Android devices run Lollipop 5.0, and 4.76% run Lollipop 5.1, with a combined 5.97% of usage share. On tablets, Lollipop 5.1 is however the single most popular version at 17.65%, followed closely by Pie 9.0.",
            "Android \"Marshmallow\" (codenamed Android M during development) is the sixth major version of the Android operating system and the 13th version of Android. First released as a beta build on May 28, 2015, it was officially released on October 5, 2015, with the Nexus devices being the first to receive the update.\n" +
                    "\n" + "Marshmallow primarily focuses on improving the overall user experience of its predecessor, Lollipop. It introduced a new permissions architecture, new APIs for contextual assistants (first used by a new feature \"Now on Tap\" to provide context-sensitive search results), a new power management system that reduces background activity when a device is not being physically handled, native support for fingerprint recognition and USB-C connectors, the ability to migrate data and applications to a microSD card, and other internal changes.\n" +
                    "\n" + "As of July 2020, 8.22% of Android devices use this unsupported (for security updates) Android 6.0 (API 23).",
            "Android \"Nougat\" (codenamed Android N during development) is the seventh major version and 14th original version of the Android operating system. First released as an alpha test version on March 9, 2016, it was officially released on August 22, 2016, with Nexus devices being the first to receive the update. The LG V20 was the first smartphone released with Nougat.\n" +
                    "\n" + "Nougat introduces notable changes to the operating system and its development platform, including the ability to display multiple apps on-screen at once in a split-screen view, support for inline replies to notifications, and an expanded \"Doze\" power-saving mode that restricts device functionality once the screen has been off for a period of time. Additionally, the platform switched to an OpenJDK-based Java environment and received support for the Vulkan graphics rendering API, and \"seamless\" system updates on supported devices.\n" +
                    "\n" + "Nougat received positive reviews. The new app notification format received particular praise, while the multitasking interface was seen as a positive change, but reviewers experienced incompatible apps. Critics had mixed experiences with the Doze power-saving mode, but faster app installs and \"tweaks\" to the user interface were also reviewed positively.\n" +
                    "\n" + "As of July 2020, 10.29% of Android devices use these versions (no longer receiving security updates) Android 7.1 (API 25) and Android 7.0 (API 24) versions.",
            "Android \"Oreo\" (codenamed Android O during development) is the eighth major release and the 15th version of the Android mobile operating system. It was first released as an alpha quality developer preview in March 2017 and released to the public on August 21, 2017.\n" +
                    "\n" + "It contains a number of major features, including notification grouping, picture-in-picture support for video, performance improvements and battery usage optimization, and support for autofillers, Bluetooth 5, system-level integration with VoIP apps, wide color gamuts, and Wi-Fi Aware. Android Oreo also introduces two major platform features: Android Go – a software distribution of the operating system for low-end devices – and support for implementing a hardware abstraction layer.\n" +
                    "\n" + "As of July 2020, 18.5% of Android devices run Oreo, with 7% on Android 8.0 (API 26) and 11.5% using Android 8.1 (API 27), Android 8.1 is behind Android 10, by now the third still popular version.",
            "Android Pie, then referred to as \"Android P\", was first announced by Google on March 7, 2018, and the first developer preview was released on the same day. The second preview, considered beta quality, was released on May 8, 2018. The third preview, called Beta 2, was released on June 6, 2018. The fourth preview, called Beta 3, was released on July 2, 2018. The final beta of Android P was released on July 25, 2018.\n" +
                    "\n" + "On August 6, 2018, Google officially announced the final release of Android 9 under the title \"Pie\", with the update initially available for current Google Pixel devices, and releases for Android One devices and others to follow \"later this year\". The Essential Phone was the first third-party Android device to receive an update to Pie, notably coming day-and-date with its final release. The Sony Xperia XZ3 was the first device with Android Pie pre-installed.\n" +
                    "\n" + "As of June 2020, 32.43% of Android devices run Pie, making it the most popular Android version.",
            "Android 10 is the tenth major release and the 17th version of the Android mobile operating system. It was released on September 3, 2019.\n" +
                    "\n" + "Android 10 was officially released on September 3, 2019 for supported Google Pixel devices, as well as the third-party Essential Phone and Redmi K20 Pro in selected markets. The OnePlus 7T was the first device with Android 10 pre-installed. In October 2019, it was reported that Google's certification requirements for Google Mobile Services will only allow Android 10-based builds to be approved after January 31, 2020.\n" +
                    "\n" + "As of July 2020, 22.06% of Android devices run Android 10, making it the second most popular Android version.",
            "Android 11 is the upcoming eleventh major release and the 18th version of the Android mobile operating system, due for release in Q3 2020. Alphabetical release names, based on desserts for major Android versions, were discontinued as of Android 10; therefore the OS was immediately branded as \"Android 11\". The logo for the release features a dial turned to 11 – a reference to the music mockumentary film This Is Spinal Tap.\n" +
                    "\n" + "The first developer preview build of Android 11 was released on February 19, 2020, as a factory image for supported Google Pixel smartphones (excluding the first-generation Pixel and Pixel XL). It was intended for three monthly developer preview builds to be released before the first beta release, initially due in May, with a total of three monthly beta releases before the actual release. The release of the public beta was originally scheduled to take place on June 3 at Google I/O, which was ultimately cancelled due to the COVID-19 pandemic, so an online release event was planned instead.\n" +
                    "\n" + "A state of \"platform stability\" was planned for July 2020, and the final release is expected to occur in the third quarter of 2020. Developer Preview 2 was then released on March 18, followed by Developer Preview 3 on April 23. On May 6, Google released an unexpected Developer Preview 4, as they pushed the whole roadmap for Android 11 forward a month, setting the date for the first beta for June 3.\n" +
                    "\n" + "In the wake of nationwide civil unrest spurred by the death of George Floyd, Google announced that the release of the first Android 11 beta would be postponed. Beta 1 was released on June 10, 2020, with Beta 2 following up on July 8. Then on July 22, Google released a Beta 2.5, addressing several issues."
    };

    private static String[] initialAndroid = {
            "April 27, 2009",
            "September 15, 2009",
            "October 26, 2009",
            "May 20, 2010",
            "December 6, 2010",
            "February 22, 2011",
            "October 19, 2011",
            "July 13, 2012",
            "October 31, 2013",
            "November 12, 2014",
            "October 5, 2015",
            "August 22, 2016",
            "August 21, 2017",
            "August 6, 2018",
            "September 3, 2019",
            "February 19, 2020"
    };

    private static String[] latestAndroid = {
            "-",
            "-",
            "January 12, 2010",
            "November 21, 2011",
            "September 21, 2011",
            "February 15, 2014",
            "June 6, 2012",
            "October 7, 2013",
            "July 7, 2014",
            "April 21, 2015",
            "October 3, 2017",
            "August 5, 2019",
            "August 3, 2020",
            "August 3, 2020",
            "August 3, 2020",
            "August 6, 2020 (Preview)"
    };

    private static String[] precededAndroid = {
            "-",
            "Android 1.5 \"Cupcake\"",
            "Android 1.6 \"Donut\"",
            "Android 2.1 \"Eclair\"",
            "Android 2.2.3 \"Froyo\"",
            "Android 2.3.7 \"Gingerbread\"",
            "Android 2.3.7 \"Gingerbread\" (smartphones) Android 3.2.6 \"Honeycomb\" (tablets)",
            "Android 4.0.4 \"Ice Cream Sandwich\"",
            "Android 4.3.1 \"Jelly Bean\"",
            "Android 4.4.4 \"KitKat\"",
            "Android 5.1.1 \"Lollipop\"",
            "Android 6.0.1 \"Marshmallow\"",
            "Android 7.1.2 \"Nougat\"",
            "Android 8.1 \"Oreo\"",
            "Android 9.0 \"Pie\"",
            "Android 10"
    };

    private static String[] succeededAndroid = {
            "\tAndroid 1.6 \"Donut\"",
            "Android 2.0 \"Eclair\"",
            "Android 2.2 \"Froyo\"",
            "Android 2.3 \"Gingerbread\"",
            "Android 3.0 \"Honeycomb\" (tablets) Android 4.0 \"Ice Cream Sandwich\" (smartphones)",
            "Android 4.0 \"Ice Cream Sandwich\"",
            "Android 4.1 \"Jelly Bean\"",
            "Android 4.4 \"KitKat\"",
            "Android 5.0 \"Lollipop\"",
            "Android 6.0 \"Marshmallow\"",
            "Android 7.0 \"Nougat\"",
            "Android 8.0 \"Oreo\"",
            "Android 9.0 \"Pie\"",
            "Android 10",
            "Android 11",
            "-"
    };

    private static String[] websiteAndroid = {
            "https://developer.android.com/about/versions/android-1.5-highlights.html",
            "https://developer.android.com/about/versions/android-1.6-highlights.html",
            "https://developer.android.com/about/versions/android-2.0-highlights.html",
            "https://developer.android.com/about/versions/android-2.2-highlights.html",
            "https://developer.android.com/about/versions/android-2.3-highlights.html",
            "https://developer.android.com/about/versions/android-3.0-highlights.html",
            "https://developer.android.com/about/versions/android-4.0-highlights.html",
            "https://www.android.com/versions/jelly-bean-4-3/",
            "https://www.android.com/versions/kit-kat-4-4/",
            "https://www.android.com/versions/lollipop-5-0/",
            "https://www.android.com/versions/marshmallow-6-0/",
            "https://www.android.com/versions/nougat-7-0/",
            "https://www.android.com/versions/oreo-8-0/",
            "https://www.android.com/versions/pie-9-0/",
            "https://www.android.com/android-10/",
            "https://developer.android.com/preview"
    };

    static ArrayList<Android> getListData() {
        ArrayList<Android> list = new ArrayList<>();
        for (int position = 0; position < androidNames.length; position++) {
            Android android = new Android();
            android.setName(androidNames[position]);
            android.setVersion(androidVersions[position]);
            android.setLogo(androidLogos[position]);
            android.setHome(androidHomeScreen[position]);
            android.setDescription(descriptionAndroid[position]);
            android.setInitial(initialAndroid[position]);
            android.setLatest(latestAndroid[position]);
            android.setPreceded(precededAndroid[position]);
            android.setSucceeded(succeededAndroid[position]);
            android.setWebsite(websiteAndroid[position]);
            list.add(android);
        }
        return list;
    }

}
