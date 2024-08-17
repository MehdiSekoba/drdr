package com.mehdisekoba.drdr.data.model.home


import com.google.gson.annotations.SerializedName

data class ResponseIntroduction(
    @SerializedName("meta")
    val meta: List<String>?,
    @SerializedName("ok")
    val ok: Boolean?, // true
    @SerializedName("result")
    val result: Result?
) {
    data class Result(
        @SerializedName("doctors")
        val doctors: List<Doctor>?,
        @SerializedName("schedules")
        val schedules: List<Schedule>?
    ) {
        data class Doctor(
            @SerializedName("appointment_services")
            val appointmentServices: List<AppointmentService>?,
            @SerializedName("available_appointment_types")
            val availableAppointmentTypes: Int?, // 7
            @SerializedName("avatar_id")
            val avatarId: Int?, // 10352
            @SerializedName("avatar_path")
            val avatarPath: String?, // https://cdn.drdr.ir/storage/media/doctors/avatars/85fec33c57433b73a84c7a7b33e45ac3e02d014e.jpg
            @SerializedName("birthdate")
            val birthdate: String?, // 1980-05-24
            @SerializedName("city")
            val city: City?,
            @SerializedName("city_id")
            val cityId: Int?, // 426
            @SerializedName("clinics")
            val clinics: List<Clinic>?,
            @SerializedName("created_at")
            val createdAt: String?, // 2023-01-01 00:00:00
            @SerializedName("created_by_id")
            val createdById: Int?, // 187
            @SerializedName("created_by_type")
            val createdByType: String?, // admins
            @SerializedName("deleted_at")
            val deletedAt: String?, // null
            @SerializedName("description")
            val description: String?, // <p class="ql-align-right ql-direction-rtl">دکتر زهرا فلاح متخصص زنان و زایمان، فارغ‌التحصیل دانشگاه علوم پزشکی ایران با بورد تخصصی با شماره نظام پزشکی 137448 از پزشک‌های برتر یزد محسوب می‌شود. ایشان تخصص زنان و زایمان دارد و به بیمارهای خود در زمینه بیماری زگیل تناسلی، اختلالات یائسگی، اختلالات جنسی، بی‌اختیاری ادراری و... مشاوره می‌دهد.</p><h3 class="ql-align-right ql-direction-rtl"><br></h3><h3 class="ql-align-right ql-direction-rtl">نظرات درباره دکتر زهرا فلاح</h3><p class="ql-align-right ql-direction-rtl">دکتر فلاح متخصص زنان و زایمان، به‌دلیل تشخیص صحیح و درمان عالی که برای بیماران خود انجام می‌دهد در استان یزد بسیار معروف است. براساس گفته مراجعان، دکتر بسیار خوش برخورد است و مشاوره‌های دقیقی به بیمارهای خود ارائه می‌دهد. معمولاً نظرات مراجعان قبلی دکتر می‌تواند در تصمیم‌گیری شما بسیار تاثیر داشته باشد. برای مشاهده تمام نظرات دکتر می‌توانید به سایت دکتردکتر مراجعه کنید.</p><h3 class="ql-align-right ql-direction-rtl"><br></h3><h3 class="ql-align-right ql-direction-rtl">سوابق تحصیلی و افتخارات دکتر زهرا فلاح</h3><ol><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>فارغ التحصیل پزشک عمومی از دانشگاه علوم پزشکی شهید صدوقی یزد</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>رتبه ممتاز رشته تخصصی زنان در دانشگاه علوم پزشکی ایران</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>دارای بورد تخصصی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>عضو انجمن بانوان جراح ایران</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>بیش از 5000 مورد سزارین و زایمان طبیعی بدون درد</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span> انتخاب ایشان بعنوان چهره نامی و فرهیخته در چهارمین اجلاس چهره های نامی بانوی ایرانی در سال تیرماه۱۴۰۳ </li></ol><h3 class="ql-align-right ql-direction-rtl"><br></h3><h3 class="ql-align-right ql-direction-rtl">خدمات کلینیک دکتر زهرا فلاح</h3><ol><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>انجام تست پاپ اسمیر</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>مشاوره قبل بارداری</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>مشاوره و درمان نازایی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>درمان اختلالات یائسگی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>انجام تمام جراحی‌های زیبایی و جراحی‌های زنان</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>مشاوره و درمان اختلالات جنسی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>انجام سزارین و زایمان طبیعی بدون درد</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>مشاوره قبل و بعد از بارداری</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>مراقبت‌های دوران یائسگی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>درمان زگیل تناسلی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>درمان بی‌اختیاری ادارای</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>جراحی تنگ کردن واژن، پرینورافی، جوانسازی و روشن کردن واژن</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>درمان تخصصی واژینیسموس و دردهای لگنی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>انجام تست و درمان HPV</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>انجام پاپ اسمیر و تعبیه IUD</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>درمان اسکار عمل جراحی و استریای</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>تزریق ژل و چربی ناحیه تناسلی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>درمان افتادگی رحم و مثانه</li></ol><h3 class="ql-align-right ql-direction-rtl"><br></h3><h3 class="ql-align-right ql-direction-rtl">بیمه‌های طرف قرارداد</h3><ol><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>انواع بیمه‌های درمانی پایه</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>بیمه تامین اجتماعی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>بیمه خدمات درمانی</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>بیمه نیروهای مسلح و جانبازان</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>بیمه سلامت ایرانیان</li></ol><h3 class="ql-align-right ql-direction-rtl"><br></h3><h3 class="ql-align-right ql-direction-rtl">آدرس مطب دکتر زهرا فلاح</h3><p class="ql-align-right ql-direction-rtl">مطب دکتر زهرا فلاح متخصص زنان و زایمان در استان یزد، بلوار طالقانی، کوچه هدایتی، بن بست اول، ساختمان 2، طبقه 3 واقع شده است. برای مراجعه به مطب دکتر می‌توانید به پروفایل ایشان در سایت دکتردکتر مراجعه کنید و به صورت غیرحضوری نوبت خود را دریافت کنید. در صورت نیاز می‌توانید با شماره تلفن 03537332728 تماس بگیرید.</p><h3 class="ql-align-right ql-direction-rtl"><br></h3><h3 class="ql-align-right ql-direction-rtl">ساعت کاری مطب دکتر</h3><ol><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>ساعت کاری مطب دکتر از شنبه تا چهارشنبه از ساعت 16 الی 21</li><li data-list="bullet" class="ql-align-right ql-direction-rtl"><span class="ql-ui" contenteditable="false"></span>ساعت کاری در روز پنجشنبه از ساعت 19 الی 21</li></ol><h3 class="ql-align-right ql-direction-rtl"><br></h3><h3 class="ql-align-right ql-direction-rtl"><a href="@DR.ZAHRAFALAH" rel="noopener noreferrer" target="_blank">آدرس اینستاگرام</a></h3><p class="ql-align-right ql-direction-rtl">@DR.ZAHRAFALAH</p>
            @SerializedName("education_level")
            val educationLevel: String?, // specialist
            @SerializedName("email")
            val email: String?, // null
            @SerializedName("firstname")
            val firstname: String?, // زهرا
            @SerializedName("firstname_en")
            val firstnameEn: String?, // null
            @SerializedName("gender")
            val gender: Int?, // 2
            @SerializedName("id")
            val id: Int?, // 71461
            @SerializedName("invisibilities")
            val invisibilities: String?, // null
            @SerializedName("irimc_code")
            val irimcCode: String?, // 137448
            @SerializedName("irimc_code_type")
            val irimcCodeType: String?, // medical
            @SerializedName("lastname")
            val lastname: String?, // فلاح
            @SerializedName("lastname_en")
            val lastnameEn: String?, // null
            @SerializedName("mobile")
            val mobile: String?, // +989132588408
            @SerializedName("national_code")
            val nationalCode: String?, // 4433580775
            @SerializedName("phone")
            val phone: String?, // +983537332728
            @SerializedName("province")
            val province: Province?,
            @SerializedName("province_id")
            val provinceId: Int?, // 1297
            @SerializedName("slug")
            val slug: String?, // null
            @SerializedName("specialities")
            val specialities: List<String>?,
            @SerializedName("statistic")
            val statistic: Statistic?,
            @SerializedName("status")
            val status: Int?, // 1
            @SerializedName("subspecialities")
            val subspecialities: List<Subspeciality>?,
            @SerializedName("terms")
            val terms: String?, // <h2 class="ql-align-right ql-direction-rtl"><strong>جهت رفاه حال سایر بیماران از ورود همراه و اطفال به مطب خودداری شود</strong></h2>
            @SerializedName("updated_at")
            val updatedAt: String?, // 2024-08-10 13:46:50
            @SerializedName("user_id")
            val userId: Int? // 71461
        ) {
            data class AppointmentService(
                @SerializedName("acceptable_reserve_duration")
                val acceptableReserveDuration: String?, // P1D
                @SerializedName("amount")
                val amount: String?, // 0
                @SerializedName("appointment_service_id")
                val appointmentServiceId: Int?, // 1
                @SerializedName("average_waiting_time")
                val averageWaitingTime: Int?, // 0
                @SerializedName("clinic_id")
                val clinicId: Int?, // 71461
                @SerializedName("confirmation_needed")
                val confirmationNeeded: Boolean?, // false
                @SerializedName("confirmation_text")
                val confirmationText: String?, // <p>- در زمان مراجعه حتما شماره پیگیری نوبت را به همراه داشته باشید.</p><p>- در صورت عدم مراجعه در زمان مقرر، نوبت شما لغو خواهد شد.</p><p>- در صورت لزوم مدارک پزشکی خود را به همراه داشته باشید.</p><p>&nbsp;</p>
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-08 03:43:05
                @SerializedName("currency")
                val currency: String?, // null
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("description")
                val description: String?, // null
                @SerializedName("doctor_id")
                val doctorId: Int?, // 71461
                @SerializedName("duration")
                val duration: Int?, // 5
                @SerializedName("fields")
                val fields: String?, // null
                @SerializedName("id")
                val id: Int?, // 10114
                @SerializedName("meta")
                val meta: String?, // null
                @SerializedName("prepaid_amount")
                val prepaidAmount: String?, // 2500000
                @SerializedName("start_gap_duration")
                val startGapDuration: String?, // P0D
                @SerializedName("status")
                val status: Int?, // 1
                @SerializedName("terms")
                val terms: String?, // <h2>ملاحظات پزشک:</h2><p><span style="color:#FF0000"><strong>بیماران گرامی توجه داشته باشند، زمان نوبت دریافتی تقریبی می باشد.</strong></span></p><p>&nbsp;</p><h2>قوانین نوبت دهی دکتردکتر:</h2><p>لطفا در انتخاب نوع و زمان نوبت خود دقت کنید</p><p>ساعت نوبت دریافت شده به معنی زمان پذیرش بیمار در مرکز درمانی است. پس از پذیرش بیمار، زمان تقریبی ویزیت پزشک مشخص و در مرکز درمانی به بیمار اعلام خواهد شد.</p><p>برای دریافت نوبت از پزشک، مبلغ مشخص شده به صورت بیعانه است و بیمار باقی&zwnj;مانده مبلغ ویزیت را در مرکز درمانی به پزشک پرداخت می&zwnj;کند.</p><p>لطفا برای لغو نوبت حداکثر تا 24 ساعت قبل از زمان پذیرش، نوبت خود را لغو کنید و پس از حذف نوبت برای دریافت وجه با پشتیبانی دکتردکتر تماس بگیرید.</p>
                @SerializedName("title")
                val title: String?, // مشاوره تلفنی
                @SerializedName("type")
                val type: Int?, // 2
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-07-06 10:28:14
                @SerializedName("valid_until")
                val validUntil: String? // null
            )

            data class City(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // null
                @SerializedName("ancestors_tree_path")
                val ancestorsTreePath: List<Int>?,
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 21:19:15
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 2
                @SerializedName("id")
                val id: Int?, // 426
                @SerializedName("latitude")
                val latitude: String?, // 31.88352194
                @SerializedName("longitude")
                val longitude: String?, // 54.34774
                @SerializedName("order")
                val order: String?, // null
                @SerializedName("parent_id")
                val parentId: Int?, // 1297
                @SerializedName("slug")
                val slug: String?, // yazd
                @SerializedName("title")
                val title: String?, // یزد
                @SerializedName("tree_path")
                val treePath: List<Int>?,
                @SerializedName("type")
                val type: Int?, // 3
                @SerializedName("updated_at")
                val updatedAt: String? // 2023-06-04 21:19:49
            )

            data class Clinic(
                @SerializedName("address")
                val address: String?, // بلوار طالقانی، کوچه هدایتی، بن بست اول
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // aramclinic
                @SerializedName("avatar_id")
                val avatarId: Int?, // 11513
                @SerializedName("avatar_path")
                val avatarPath: String?, // https://cdn.drdr.ir/storage/media/clinics/avatars/c448902955b6125ca56aef5cb7ce5b649eca96b8.jpg
                @SerializedName("banner_id")
                val bannerId: String?, // null
                @SerializedName("banner_path")
                val bannerPath: String?, // null
                @SerializedName("city")
                val city: City?,
                @SerializedName("city_id")
                val cityId: Int?, // 426
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 21:35:56
                @SerializedName("created_by_id")
                val createdById: Int?, // 187
                @SerializedName("created_by_type")
                val createdByType: String?, // admins
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("description")
                val description: String?, // <p class="ql-align-right ql-direction-rtl"><br></p>
                @SerializedName("email")
                val email: String?, // null
                @SerializedName("id")
                val id: Int?, // 71461
                @SerializedName("latitude")
                val latitude: String?, // 31.883197372471
                @SerializedName("longitude")
                val longitude: String?, // 54.356863181067
                @SerializedName("mobile")
                val mobile: String?, // +989132588408
                @SerializedName("municipality_zone_id")
                val municipalityZoneId: Int?, // 1361
                @SerializedName("neighborhood_id")
                val neighborhoodId: Int?, // 1898
                @SerializedName("organization_type")
                val organizationType: Int?, // 1
                @SerializedName("owner_id")
                val ownerId: Int?, // 71461
                @SerializedName("parent_geolocation")
                val parentGeolocation: ParentGeolocation?,
                @SerializedName("parent_geolocation_id")
                val parentGeolocationId: Int?, // 1898
                @SerializedName("phones")
                val phones: List<String>?,
                @SerializedName("pivot")
                val pivot: Pivot?,
                @SerializedName("province")
                val province: Province?,
                @SerializedName("province_id")
                val provinceId: Int?, // 1297
                @SerializedName("region_id")
                val regionId: Int?, // 2510
                @SerializedName("slug")
                val slug: String?, // null
                @SerializedName("specialities")
                val specialities: List<String>?,
                @SerializedName("status")
                val status: Int?, // 2
                @SerializedName("title")
                val title: String?, // مطب زهرا فلاح
                @SerializedName("type")
                val type: Int?, // 1
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-04-01 15:15:39
                @SerializedName("website")
                val website: String? // null
            ) {
                data class City(
                    @SerializedName("address")
                    val address: String?, // null
                    @SerializedName("alternative_title")
                    val alternativeTitle: String?, // null
                    @SerializedName("ancestors_tree_path")
                    val ancestorsTreePath: List<Int>?,
                    @SerializedName("created_at")
                    val createdAt: String?, // 2023-06-04 21:19:15
                    @SerializedName("deleted_at")
                    val deletedAt: String?, // null
                    @SerializedName("depth")
                    val depth: Int?, // 2
                    @SerializedName("id")
                    val id: Int?, // 426
                    @SerializedName("latitude")
                    val latitude: String?, // 31.88352194
                    @SerializedName("longitude")
                    val longitude: String?, // 54.34774
                    @SerializedName("order")
                    val order: String?, // null
                    @SerializedName("parent_id")
                    val parentId: Int?, // 1297
                    @SerializedName("slug")
                    val slug: String?, // yazd
                    @SerializedName("title")
                    val title: String?, // یزد
                    @SerializedName("tree_path")
                    val treePath: List<Int>?,
                    @SerializedName("type")
                    val type: Int?, // 3
                    @SerializedName("updated_at")
                    val updatedAt: String? // 2023-06-04 21:19:49
                )

                data class ParentGeolocation(
                    @SerializedName("address")
                    val address: String?, // null
                    @SerializedName("alternative_title")
                    val alternativeTitle: String?, // null
                    @SerializedName("ancestors_tree_path")
                    val ancestorsTreePath: List<Int>?,
                    @SerializedName("created_at")
                    val createdAt: String?, // 2024-03-05 21:12:34
                    @SerializedName("deleted_at")
                    val deletedAt: String?, // null
                    @SerializedName("depth")
                    val depth: Int?, // 3
                    @SerializedName("id")
                    val id: Int?, // 1898
                    @SerializedName("latitude")
                    val latitude: String?, // 35.70290694
                    @SerializedName("longitude")
                    val longitude: String?, // 51.34975889
                    @SerializedName("order")
                    val order: String?, // null
                    @SerializedName("parent_id")
                    val parentId: Int?, // 426
                    @SerializedName("slug")
                    val slug: String?, // yazd-pol-navab
                    @SerializedName("title")
                    val title: String?, // پل نواب
                    @SerializedName("tree_path")
                    val treePath: List<Int>?,
                    @SerializedName("type")
                    val type: Int?, // 7
                    @SerializedName("updated_at")
                    val updatedAt: String? // 2024-03-05 21:12:34
                )

                data class Pivot(
                    @SerializedName("clinic_id")
                    val clinicId: Int?, // 71461
                    @SerializedName("doctor_id")
                    val doctorId: Int? // 71461
                )

                data class Province(
                    @SerializedName("address")
                    val address: String?, // null
                    @SerializedName("alternative_title")
                    val alternativeTitle: String?, // Yazd
                    @SerializedName("ancestors_tree_path")
                    val ancestorsTreePath: List<String>?,
                    @SerializedName("created_at")
                    val createdAt: String?, // 2023-06-04 21:19:42
                    @SerializedName("deleted_at")
                    val deletedAt: String?, // null
                    @SerializedName("depth")
                    val depth: Int?, // 1
                    @SerializedName("id")
                    val id: Int?, // 1297
                    @SerializedName("latitude")
                    val latitude: String?, // null
                    @SerializedName("longitude")
                    val longitude: String?, // null
                    @SerializedName("order")
                    val order: String?, // null
                    @SerializedName("parent_id")
                    val parentId: String?, // null
                    @SerializedName("slug")
                    val slug: String?, // null
                    @SerializedName("title")
                    val title: String?, // یزد
                    @SerializedName("tree_path")
                    val treePath: List<Int>?,
                    @SerializedName("type")
                    val type: Int?, // 2
                    @SerializedName("updated_at")
                    val updatedAt: String? // 2023-06-04 21:19:42
                )
            }

            data class Province(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // Yazd
                @SerializedName("ancestors_tree_path")
                val ancestorsTreePath: List<String>?,
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 21:19:42
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 1
                @SerializedName("id")
                val id: Int?, // 1297
                @SerializedName("latitude")
                val latitude: String?, // null
                @SerializedName("longitude")
                val longitude: String?, // null
                @SerializedName("order")
                val order: String?, // null
                @SerializedName("parent_id")
                val parentId: String?, // null
                @SerializedName("slug")
                val slug: String?, // null
                @SerializedName("title")
                val title: String?, // یزد
                @SerializedName("tree_path")
                val treePath: List<Int>?,
                @SerializedName("type")
                val type: Int?, // 2
                @SerializedName("updated_at")
                val updatedAt: String? // 2023-06-04 21:19:42
            )

            data class Statistic(
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 21:35:56
                @SerializedName("doctor_id")
                val doctorId: Int?, // 71461
                @SerializedName("id")
                val id: Int?, // 1851
                @SerializedName("impressions_updated_at")
                val impressionsUpdatedAt: String?, // 2024-08-11 04:31:58
                @SerializedName("monthly_impressions_sum")
                val monthlyImpressionsSum: Int?, // 45736
                @SerializedName("monthly_views_sum")
                val monthlyViewsSum: Int?, // 2521
                @SerializedName("rates_average")
                val ratesAverage: String?, // 3.94
                @SerializedName("total_impressions_sum")
                val totalImpressionsSum: Int?, // 260987
                @SerializedName("total_reviews")
                val totalReviews: Int?, // 219
                @SerializedName("total_views_sum")
                val totalViewsSum: Int?, // 26748
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-08-11 04:31:58
                @SerializedName("views_updated_at")
                val viewsUpdatedAt: String?, // 2024-08-11 00:04:57
                @SerializedName("weekly_impressions_sum")
                val weeklyImpressionsSum: Int?, // 3690
                @SerializedName("weekly_views_sum")
                val weeklyViewsSum: Int? // 215
            )

            data class Subspeciality(
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 00:00:00
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("education_level")
                val educationLevel: String?, // specialist
                @SerializedName("id")
                val id: Int?, // 227
                @SerializedName("irimc_code")
                val irimcCode: String?, // 121
                @SerializedName("irimc_subspeciality_alternative_title")
                val irimcSubspecialityAlternativeTitle: String?, // null
                @SerializedName("irimc_subspeciality_title")
                val irimcSubspecialityTitle: String?, // تخصص زنان و زایمان
                @SerializedName("laravel_through_key")
                val laravelThroughKey: Int?, // 71461
                @SerializedName("specialities")
                val specialities: List<String>?,
                @SerializedName("subspeciality_alternative_title")
                val subspecialityAlternativeTitle: String?, // null
                @SerializedName("subspeciality_title")
                val subspecialityTitle: String?, //  زنان و زایمان
                @SerializedName("updated_at")
                val updatedAt: String? // 2023-06-04 00:00:00
            )
        }

        data class Schedule(
            @SerializedName("appointment_service")
            val appointmentService: String?, // null
            @SerializedName("appointment_service_id")
            val appointmentServiceId: Int?, // 1
            @SerializedName("appointment_services_bind_uuid")
            val appointmentServicesBindUuid: String?, // f311d884-ebf2-4704-a92f-a8f35f185ead
            @SerializedName("channels")
            val channels: Int?, // 7
            @SerializedName("clinic")
            val clinic: String?, // null
            @SerializedName("clinic_id")
            val clinicId: Int?, // 23
            @SerializedName("created_at")
            val createdAt: String?, // null
            @SerializedName("created_by")
            val createdBy: String?, // null
            @SerializedName("created_by_id")
            val createdById: String?, // null
            @SerializedName("created_by_type")
            val createdByType: String?, // null
            @SerializedName("creation_type")
            val creationType: Int?, // 1
            @SerializedName("deleted_at")
            val deletedAt: String?, // null
            @SerializedName("doctor")
            val doctor: String?, // null
            @SerializedName("doctor_appointment_service")
            val doctorAppointmentService: String?, // null
            @SerializedName("doctor_appointment_service_id")
            val doctorAppointmentServiceId: Int?, // 13
            @SerializedName("doctor_id")
            val doctorId: Int?, // 23
            @SerializedName("duration")
            val duration: Int?, // 5
            @SerializedName("end")
            val end: String?, // 2024-08-11 16:10:00
            @SerializedName("id")
            val id: String?, // 2ef55138-55b9-4fa5-8939-1b6298c53fbf
            @SerializedName("reserve_expired_at")
            val reserveExpiredAt: String?, // null
            @SerializedName("start")
            val start: String?, // 2024-08-11 16:05:00
            @SerializedName("state")
            val state: Int?, // 1
            @SerializedName("type")
            val type: Int?, // 1
            @SerializedName("updated_at")
            val updatedAt: String? // null
        )
    }
}