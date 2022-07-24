package com.rns.nestedrecyclerviewexample.data.domain

object DataSource {
    fun getAllPodcasts(): List<Podcast> = listOf(
        Podcast(
            channel_name = "لحظة | Lahtha",
            episode_name = "كيف صُنع \"النووي\"؟",
            description = "لحظة حاسمة في التاريخ، أعادت تشكيل خريطة الصراع والسيطرة حول العالم. لحظة جعلت من أميركا دولة عظمى، وأسست لحرب باردة استمرت لأكثر من خمسين عاما. \n" +
                    "\n" +
                    "هذه حكاية رسمت ملامح عصر جديد؛ مَن يمتلك فيه تكنولوجيا التصنيع العسكري يبسط نفوذه. عصر فيه 13 ألف رأس نووي. ",
            image = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcR8U08sXn26cF28BL_TYFw7mruFQ30FyBEoEgkg5btcW8H1M4It"
        ),
        Podcast(
            channel_name = "بلا كلام فاضي",
            episode_name = "٦١. كيف تصير صديق نفسك",
            description = "المحاور:\n" +
                    "\n" +
                    "0:00 مقدمة\n" +
                    "1:24 ليش أصير صديق نفسي المقرب؟\n" +
                    "3:18 كيف أعرف اني صديق نفسي المرقب\n" +
                    "7:12 كيف أوصل لهذه المرحلة؟\n" +
                    "9:26 مراجعة نفسك\n" +
                    "12:48 سؤال التدوين",
            image = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSWBDfaX9lfyarlSMg9XBGp4_csSSHA17qxUbvUWIv4qXccCSI"
        ),
        Podcast(
            channel_name = "بودكاست علمي جدا",
            episode_name = "ايه يا نجم",
            description = "محطة اليوم: النجوم\n" +
                    "\n",
            image = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRqEActIZrENnWNEfBArLcF2-D_Wb6KiZb-B9-bkf2uhPEx9XE"
        ),
        Podcast(
            channel_name = "كنبة السبت",
            episode_name = "الحكم الداخلي",
            description = "كيف يتحول انتقادنا للآخرين إلى سموم تدمرنا نحن؟ وهل رغبتنا في إصلاح ما حولنا تعني أن نكون قضاة على أفعال الآخرين؟\n" +
                    "\n" +
                    "في هذه الحلقة الجديدة نتكلم عن الإلهاء والتشتت عن إصلاح الذات بالانشغال بعيوب الآخرين..وكيف نتجنب دائرة النقد التي تستنزف طاقتنا.",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIGbnnXf6GcfumIi4AlLUkF3wADiRzqeoSToVjLCJRcSRvCBo"
        )
    )

    fun getAllChannels(): List<Channel> = listOf(
        Channel(
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIfiDTcv2cb0Oi2JOPofxeJ5Q6yz9BYKqdpdnKT6rQviyFvIbd"
        ),
        Channel(
            image = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQrxJp1d6fAv0yF6V4nwwwUbtCqqDRJTgtGh-VGl_7T-3j3j-I"
        ),
        Channel(
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmdACIGcxF_31f1HtkkI5NhWaOWi-SXcEOMl47umLVVXXjagFM"
        ),
        Channel(
            image = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQXpRaZI-vPbweWwGh6LU_Fk8TcB9V8T-b4wQmi3qwppirGJKs"
        ),
        Channel(
            image = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcR8U08sXn26cF28BL_TYFw7mruFQ30FyBEoEgkg5btcW8H1M4It"
        )
    )
}