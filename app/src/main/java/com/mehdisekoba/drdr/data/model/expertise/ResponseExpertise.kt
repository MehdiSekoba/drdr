package com.mehdisekoba.drdr.data.model.expertise

data class ResponseExpertise(
    val specialities: List<Specialities>
) {
    data class Specialities(
        val title: String,
        val content: Content,
        val doctors: List<Doctor>,
        val total_doctors: Int
    ) {
        data class Content(
            val short_description: String
        )

        data class Doctor(
            val id: Int,
            val avatar_path: String,
            val gender: Int
        )
    }
}

val expertise = listOf(
    ResponseExpertise.Specialities(
        title = "زنان و زایمان",
        content = ResponseExpertise.Specialities.Content(
            short_description = "برای بیماری‌های زنان مانند تنبلی تخمدان، مشکلات قاعدگی، یائسگی و... به پزشک زنان مراجعه می‌شود. متخصصان زنان و زایمان روش‌های تشخیصی و درمانی مختلف برای مشکلات زنان ارائه می‌کنند. برای دریافت نوبت متخصص زنان و زایمان می‌توانید از سایت دکتردکتر نوبت اینترنتی بگیرید."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 2993,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/42c5ec146eb845f8fce7649358a09a7dad0d86ab.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 3011,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/d80c4febb7f5398d4a387682836279b4f8d26e0e.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 3093,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/e10912f682bdcfcb122ef2478d8a85222eafb9d0.jpg",
                gender = 2
            )
        ),
        total_doctors = 7004
    ),
    ResponseExpertise.Specialities(
        title = "قلب و عروق",
        content = ResponseExpertise.Specialities.Content(
            short_description = "برای بیماری‌های قلبی و عروقی مانند فشار خون، نارسایی قلبی و مشکلات عروقی به متخصص قلب و عروق مراجعه می‌شود. این متخصصان روش‌های تشخیصی و درمانی برای بیماری‌های قلبی و عروقی ارائه می‌کنند."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 26976,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/cceffa4e17ff3942aa3e2acb6a01599a5ee15cbc.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 27200,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/5dfd8ca59754a52d5fa9d467c17e140719e6dd62.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 27395,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/04850884e849e3b93773bec83a961e0b80b0a570.jpg",
                gender = 1
            )
        ),
        total_doctors = 1200
    ),
    ResponseExpertise.Specialities(
        title = "گوش، حلق و بینی",
        content = ResponseExpertise.Specialities.Content(
            short_description = "متخصص گوش و حلق و بینی در زمینه‌ی تشخیص و درمان بیماری‌های مربوط به گوش، حلق، بینی، سر و گردن فعالیت می‌کند. درمان سینوزیت، حساسیت‌های فصلی، مشکلات شنوایی و... توسط متخصص گوش، حلق و بینی انجام می‌شود."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 552,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/23ad15af5aba06b92e97a70f6e73e4187773d6ee.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 1269,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/0b75f772c5fe347ad7ed9052e115bf90557b84e7.png",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 1330,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/e77c3b06506627ae4c4bed975586be4331aa91e0.jpg",
                gender = 2
            )
        ),
        total_doctors = 118
    ),
    ResponseExpertise.Specialities(
        title = "ارتوپدی",
        content = ResponseExpertise.Specialities.Content(
            short_description = "پزشک ارتوپد در زمینه تشخیص و درمان مشکلات استخوان‌ها، مفاصل و عضلات فعالیت می‌کند. متخصص ارتوپد با انجام جراحی‌های مختلف به بهبود آسیب‌های ورزشی و بیماری‌های مفصلی کمک می‌کند."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 538,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/f45d60921aa542948e073f8b3fbfc0d267c753f2.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 637,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/9dcd50e39987b72357d84572a696213c0b66a671.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 641,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/435ad28054078d1801539a0d4d7d5aafdcec6437.jpg",
                gender = 1
            )
        ),
        total_doctors = 894
    ),
    ResponseExpertise.Specialities(
        title = "پوست و مو",
        content = ResponseExpertise.Specialities.Content(
            short_description = "متخصص پوست و مو به تشخیص و درمان بیماری‌های پوستی و مشکلات مربوط به مو می‌پردازد. از مشکلات شایع پوستی می‌توان به آکنه، اگزما و ریزش مو اشاره کرد که توسط متخصص پوست درمان می‌شوند."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 486,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/5cbf64d50e0db0e325a6e63092a518ac75d42434.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 1239,
                avatar_path = "https://cdn.drdr.ir/storage/media/clinics/avatars/33c91cfda1d7d92657b0fe23c6c326cd64f0431a.jpg",
                gender = 3
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 1244,
                avatar_path = "https://cdn.drdr.ir/storage/media/clinics/avatars/766cbd4cb457f957f52d898a1a3ecc367ab713cd.jpg",
                gender = 3
            )
        ),
        total_doctors = 534
    ),
    ResponseExpertise.Specialities(
        title = "عفونی ",
        content = ResponseExpertise.Specialities.Content(
            short_description = "کزاز، آنفلونزا، روتاویروس، زونا، تبخال تناسلی، سرخک، آبله\u200Cمرغان و... از سوی متخصصان عفونی درمان می\u200Cشود. متخصصان عفونی با تشخیص علت و انتخاب روش\u200Cهای مختلف، مشکلات ناشی از عفونت\u200Cها را بررسی و درمان می\u200Cکنند. با مراجعه به سایت دکتردکتر برای دریافت نوبت متخصص عفونی به\u200Cشکل آنلاین اقدام کنید."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 6841,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/05da4ab8bc8b11eae4a1a1577b06f2efc1af2c46.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 8610,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/dc4df96b29312340498b298d6a7caad6c4c643ee.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 2819,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/fea2ce2d90c0abc9ef10aa7b9cc0eb4251ff7c65.jpg",
                gender = 1
            )
        ),
        total_doctors = 876
    ),
    ResponseExpertise.Specialities(
        title = "جراحی مغز و اعصاب ",
        content = ResponseExpertise.Specialities.Content(
            short_description = "جراحی مغز و اعصاب شامل عمل مغز، نخاع، اعصاب پیرامونی و عروق بیرون جمجمه است.  متخصصان مغز و اعصاب بنا به وضعیت هر بیمار درباره روش\u200Cهای جراحی مناسب تصمیم می\u200Cگیرند. با سایت دکتردکتر نوبت متخصص  مغز و اعصاب  را به\u200Cطور اینترنتی دریافت کنید."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 1307,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/bfca71961407c260f73878024242a1bbe9fcb3ed.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 1339,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/a392338447150abe73faccd8bc3534b909966999.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 6963,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/f7dfc32a702acb9eabdd0259b9d202c6cbd7ee13.jpg",
                gender = 1
            )
        ),
        total_doctors = 710
    ),

    ResponseExpertise.Specialities(
        title = "گوارش و کبد ",
        content = ResponseExpertise.Specialities.Content(
            short_description = "برای درمان پولیپ روده، هپاتیت، سلیاک، رفلاکس معده، پانکراتیت و... به متخصص گوارش مراجعه می\u200Cشود. متخصصان این حوزه با تشخیص و انتخاب روش\u200Cهای مختلف مشکلات دستگاه گوارش را بررسی و درمان می\u200Cکنند. برای دریافت نوبت متخصص گوارش و کبد از سیستم آنلاین نوبت دکتر سایت دکتردکتر استفاده کنید"
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 9034,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/d42a48844756a870cc820944c228a2d4c3398249.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 9108,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/9739060f06429c7ed04d7abc46936f6ac9d862c0.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 6654,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/a743dbff4b536fd0451a4eb702bdf1c0a438d161.jpg",
                gender = 1
            )
        ),
        total_doctors = 581
    ),
    ResponseExpertise.Specialities(
        title = "روماتولوژی ",
        content = ResponseExpertise.Specialities.Content(
            short_description = "بیماری\u200Cهای استخوان\u200Cها و بافت\u200Cها مانند نقرس ، آرتریت، لوپوس و... نزد روماتولوژ درمان می\u200Cشوند. این متخصصان با بررسی سیستم ایمنی و عوامل دیگر بیماری\u200Cهای استخوانی و بافت\u200Cها را درمان می\u200Cکنند. برای دریافت نوبت متخصص روماتولوژی می\u200Cتوانید از سایت دکتردکتر نوبت اینترنتی بگیرید."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 6640,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/8c100bce4e2807140749373d3e7a6f5a748ca20b.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 2965,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/0638206800d0b8379648347dac3d453fe0de01a1.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 5697,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/b492d78699060449a025074ea8c62ec79e5cdbef.jpg",
                gender = 1
            )
        ),
        total_doctors = 465
    ),


    ResponseExpertise.Specialities(
        title = "غدد و متابولیسم ",
        content = ResponseExpertise.Specialities.Content(
            short_description = "سرطان تیروئید، نارسایی آدرنال، آدیسون و مشکلات غدد با مراجعه به متخصص آن درمان می\u200Cشوند. متخصصان این حوزه با تشخیص و ارائه راه\u200Cکار به درمان مشکلات غدد و سوخت\u200Cوساز می\u200Cپردازند. برای دریافت نوبت متخصص غدد و متابولیسم از سیستم نوبت\u200Cدهی اینترنتی سایت دکتردکتر استفاده کنید."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 6687,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/15e53d5f2a51e48fde2185d3fb00f3f523e4d914.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 7734,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/4f47b1189612e595b312801a6b6dda5c51008549.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 7369,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/9bf17c058b69b13b36f43f2d60968c65c1df6bd5.jpg",
                gender = 1
            )
        ),
        total_doctors = 471
    ),


    ResponseExpertise.Specialities(
        title = "جراحی پلاستیک ",
        content = ResponseExpertise.Specialities.Content(
            short_description = "ابدومینوپلاستی، لابیاپلاستی، بلفاروپلاستی، رینوپلاستی، ماموپلاستی، ترمیم چانه و... با مراجعه به جراحان پلاستیک مقدور است. جراحان پلاستیک با تشخیص و انتخاب روش\u200Cهای مختلف به جراحی سوختگی\u200Cها و ناهنجاری\u200Cها یا موارد زیبایی و ترمیمی می\u200Cپردازند. برای دریافت نوبت متخصص جراحی پلاستیک می\u200Cتوانید از سایت دکتردکتر نوبت اینترنتی بگیرید."
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 1202,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/faed481e40516cb3361eca21d381f0b663a19668.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 6673,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/7b20bac6c0c82c4d2ef5fd8315a053cfef41b0d7.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 6744,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/b2f3d303d6409887c1a4b574e8ce9698fe22bbcc.jpg",
                gender = 1
            )
        ),
        total_doctors = 467
    ),
    ResponseExpertise.Specialities(
        title = "تغذیه و رژیم ",
        content = ResponseExpertise.Specialities.Content(
            short_description = "برای دریافت رژیم\u200Cهای غذایی،کنترل و نظارت تغذیه در وضعیت\u200C\u200Cهای گوناگون به متخصص تغذیه مراجعه می\u200Cشود. این متخصصان با ارزیابی وضعیت هر فرد، او را در مسیر درست تغذیه قرار می\u200Cدهند. با سایت دکتردکتر نوبت متخصص تغذیه را اینترنتی دریافت کنید.\n" +
                    "\n"
        ),
        doctors = listOf(
            ResponseExpertise.Specialities.Doctor(
                id = 499,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/23e79d5b6cd6314ecadc3193da39ee889f4ca1c7.jpg",
                gender = 1
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 6602,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/8574b1c8d7b2e692ef0bf6c36a793d2abdc4e3ec.jpg",
                gender = 2
            ),
            ResponseExpertise.Specialities.Doctor(
                id = 7758,
                avatar_path = "https://cdn.drdr.ir/storage/media/doctors/avatars/9bb7e58452774896676c460eb58ee155e7b05774.jpg",
                gender = 2
            )
        ),
        total_doctors = 509
    )


)


