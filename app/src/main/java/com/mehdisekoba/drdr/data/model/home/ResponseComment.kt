package com.mehdisekoba.drdr.data.model.home


import com.google.gson.annotations.SerializedName

data class ResponseComment(
    @SerializedName("meta")
    val meta: List<String>?,
    @SerializedName("ok")
    val ok: Boolean?, // true
    @SerializedName("result")
    val result: Result?
) {
    data class Result(
        @SerializedName("reviews")
        val reviews: List<Review>?
    ) {
        data class Review(
            @SerializedName("comment")
            val comment: String?, // من و پسرم برای درمان اختلالات ذهنی و نقشه مغزی یک دوره کامل را پیش ایشان گذراندیم بسیار خوش برخورد و با صبر و حوصله و با سواد هستند، کمک زیادی برای درمان ما انجام دادند.
            @SerializedName("created_at")
            val createdAt: String?, // 2024-08-12 17:46:46
            @SerializedName("doctor")
            val doctor: Doctor?,
            @SerializedName("doctor_id")
            val doctorId: Int?, // 86635
            @SerializedName("edited_at")
            val editedAt: String?, // null
            @SerializedName("id")
            val id: Int?, // 290681
            @SerializedName("is_anonymous")
            val isAnonymous: Boolean?, // false
            @SerializedName("questions")
            val questions: List<Question>?,
            @SerializedName("rate")
            val rate: Double?, // 4.2
            @SerializedName("rate_results")
            val rateResults: String?, // null
            @SerializedName("updated_at")
            val updatedAt: String? // 2024-08-12 17:47:05
        ) {
            data class Doctor(
                @SerializedName("appointment_services")
                val appointmentServices: String?, // null
                @SerializedName("avatar_path")
                val avatarPath: String?, // https://cdn.drdr.ir/storage/media/doctors/avatars/bc6cd70d44aac70b900bbafc3e1c3a86f3fd5b68.jpg
                @SerializedName("city")
                val city: String?, // null
                @SerializedName("city_id")
                val cityId: Int?, // 283
                @SerializedName("clinics")
                val clinics: String?, // null
                @SerializedName("content")
                val content: String?, // null
                @SerializedName("description")
                val description: String?, // <p class="ql-align-right ql-direction-rtl"><br></p><h2 class="ql-align-right ql-direction-rtl"><strong>سوابق و دوره های آنوشا اباذری </strong></h2><p class="ql-align-right ql-direction-rtl"> عضویت در سازمان نظام روانشناسی ایران</p><p class="ql-align-right ql-direction-rtl"> عضویت در انجمن روانشناسی ایران</p><p class="ql-align-right ql-direction-rtl"> گذراندن دوره طرحواره درمانی استاد حمید پور</p><p class="ql-align-right ql-direction-rtl"> گذراندن دوره CBT استاد بنی هاشمی</p><p class="ql-align-right ql-direction-rtl"> گذراندن دوره tDCS </p><p class="ql-align-right ql-direction-rtl"> گذراندن کارگاه نقشه مغزی استاد لهراسبی</p><p class="ql-align-right ql-direction-rtl"> گذراندن دوره درمان‌های شناختی استاد لهراسبی</p><p class="ql-align-right ql-direction-rtl"><br></p><h2 class="ql-align-right ql-direction-rtl"><strong> خدمات ارائه شده توسط  آنوشا اباذری </strong></h2><p class="ql-align-right ql-direction-rtl">مشاوره پیش از ازدواج</p><p class="ql-align-right ql-direction-rtl"> زوج درمانی</p><p class="ql-align-right ql-direction-rtl">کمک به شناخت طرحواره ها و درمان آن ها</p><p class="ql-align-right ql-direction-rtl">درمان اختلالات خلقی</p><p class="ql-align-right ql-direction-rtl"> آموزش مهارت های زندگی</p><p class="ql-align-right ql-direction-rtl"> درمان اضطراب و وسواس فکری</p><p class="ql-align-right ql-direction-rtl"> تشخیص مشکلات حسی در کودکان بیش فعالی و اوتیستیک</p><p class="ql-align-right ql-direction-rtl"> تفسیر نقشه مغزی و پیشنهاد درمانی</p><p class="ql-align-right ql-direction-rtl"> مسئول بخش شناختی مرکز سلامت ذهن وصال</p><p class="ql-align-right ql-direction-rtl"><br></p><h2 class="ql-align-right ql-direction-rtl"><strong>راه های ارتباطی با  آنوشا اباذری </strong></h2><p class="ql-align-right ql-direction-rtl"> اینستاگرام  آنوشا اباذری:   road_map_for_all </p><p class="ql-align-right ql-direction-rtl"><br></p>
                @SerializedName("education_level")
                val educationLevel: String?, // master
                @SerializedName("evisit_on_demand_online_valid_until")
                val evisitOnDemandOnlineValidUntil: String?, // null
                @SerializedName("evisit_on_demand_status")
                val evisitOnDemandStatus: String?, // null
                @SerializedName("first_available_schedule_start")
                val firstAvailableScheduleStart: String?, // null
                @SerializedName("firstname")
                val firstname: String?, // آنوشا
                @SerializedName("firstname_en")
                val firstnameEn: String?, // null
                @SerializedName("gender")
                val gender: Int?, // 2
                @SerializedName("has_in_person_schedule")
                val hasInPersonSchedule: String?, // null
                @SerializedName("has_schedule")
                val hasSchedule: String?, // null
                @SerializedName("has_tele_visit_schedule")
                val hasTeleVisitSchedule: String?, // null
                @SerializedName("id")
                val id: Int?, // 86635
                @SerializedName("info")
                val info: String?, // null
                @SerializedName("insurances")
                val insurances: String?, // null
                @SerializedName("irimc_code")
                val irimcCode: String?, // 22545
                @SerializedName("irimc_code_type")
                val irimcCodeType: String?, // psychology
                @SerializedName("ivr_number")
                val ivrNumber: String?, // null
                @SerializedName("ivr_phone_number")
                val ivrPhoneNumber: String?, // null
                @SerializedName("lastname")
                val lastname: String?, // اباذری
                @SerializedName("lastname_en")
                val lastnameEn: String?, // null
                @SerializedName("phone")
                val phone: String?, // +987632237919
                @SerializedName("provided_appointment_types")
                val providedAppointmentTypes: String?, // null
                @SerializedName("province")
                val province: String?, // null
                @SerializedName("province_id")
                val provinceId: Int?, // 1285
                @SerializedName("reviews")
                val reviews: String?, // null
                @SerializedName("slug")
                val slug: String?, // null
                @SerializedName("specialities")
                val specialities: List<String>?,
                @SerializedName("statistic")
                val statistic: String?, // null
                @SerializedName("status")
                val status: Int?, // 1
                @SerializedName("subspecialities")
                val subspecialities: String?, // null
                @SerializedName("tags")
                val tags: String?, // null
                @SerializedName("terms")
                val terms: String? // <p><br></p>
            )

            data class Question(
                @SerializedName("answer")
                val answer: String?, // 15
                @SerializedName("key")
                val key: String?, // waiting_time_question
                @SerializedName("options")
                val options: String?, // null
                @SerializedName("question")
                val question: String? // null
            )
        }
    }
}