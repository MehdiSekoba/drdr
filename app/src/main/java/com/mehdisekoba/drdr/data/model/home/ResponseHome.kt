package com.mehdisekoba.drdr.data.model.home


import com.google.gson.annotations.SerializedName

data class ResponseHome(
    @SerializedName("meta")
    val meta: List<String>?,
    @SerializedName("ok")
    val ok: Boolean?, // true
    @SerializedName("result")
    val result: Result?
) {
    data class Result(
        @SerializedName("doctors")
        val doctors: List<Doctor>?
    ) {
        data class Doctor(
            @SerializedName("appointment_services")
            val appointmentServices: List<AppointmentService>?,
            @SerializedName("avatar_path")
            val avatarPath: String?, // https://cdn.drdr.ir/storage/media/doctors/avatars/e8ab8c79efce28678d890030d02c6f9b8423b9c9.jpg
            @SerializedName("city")
            val city: City?,
            @SerializedName("city_id")
            val cityId: Int?, // 117
            @SerializedName("clinics")
            val clinics: List<Clinic>?,
            @SerializedName("content")
            val content: String?, // null
            @SerializedName("description")
            val description: String?, // null
            @SerializedName("education_level")
            val educationLevel: String?, // master
            @SerializedName("evisit_on_demand_online_valid_until")
            val evisitOnDemandOnlineValidUntil: String?, // null
            @SerializedName("evisit_on_demand_status")
            val evisitOnDemandStatus: String?, // null
            @SerializedName("first_available_schedule_start")
            val firstAvailableScheduleStart: String?, // null
            @SerializedName("firstname")
            val firstname: String?, // بهاره
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
            val id: Int?, // 83399
            @SerializedName("info")
            val info: String?, // null
            @SerializedName("insurances")
            val insurances: String?, // null
            @SerializedName("irimc_code")
            val irimcCode: String?, // 12165
            @SerializedName("irimc_code_type")
            val irimcCodeType: String?, // psychology
            @SerializedName("ivr_number")
            val ivrNumber: String?, // null
            @SerializedName("ivr_phone_number")
            val ivrPhoneNumber: String?, // null
            @SerializedName("lastname")
            val lastname: String?, // علی بخشی
            @SerializedName("lastname_en")
            val lastnameEn: String?, // null
            @SerializedName("phone")
            val phone: String?, // null
            @SerializedName("provided_appointment_types")
            val providedAppointmentTypes: String?, // null
            @SerializedName("province")
            val province: Province?,
            @SerializedName("province_id")
            val provinceId: Int?, // 1273
            @SerializedName("reviews")
            val reviews: String?, // null
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
            @SerializedName("tags")
            val tags: String?, // null
            @SerializedName("terms")
            val terms: String? // null
        ) {
            data class AppointmentService(
                @SerializedName("acceptable_reserve_duration")
                val acceptableReserveDuration: String?, // P1D
                @SerializedName("amount")
                val amount: Int?, // 0
                @SerializedName("appointment_service")
                val appointmentService: AppointmentService?,
                @SerializedName("appointment_service_id")
                val appointmentServiceId: Int?, // 1
                @SerializedName("average_waiting_time")
                val averageWaitingTime: Int?, // 0
                @SerializedName("clinic")
                val clinic: String?, // null
                @SerializedName("clinic_id")
                val clinicId: Int?, // 83760
                @SerializedName("confirmation_needed")
                val confirmationNeeded: Boolean?, // false
                @SerializedName("confirmation_text")
                val confirmationText: String?, // null
                @SerializedName("created_at")
                val createdAt: String?, // 2024-05-20 10:20:02
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("description")
                val description: String?, // مشاوره  در مسائل جنسی برای آقایون انجام نمیدهم.
                @SerializedName("displayable_title")
                val displayableTitle: String?, // ویزیت
                @SerializedName("doctor")
                val doctor: String?, // null
                @SerializedName("doctor_id")
                val doctorId: Int?, // 83399
                @SerializedName("doctor_service_user_commission")
                val doctorServiceUserCommission: String?, // null
                @SerializedName("duration")
                val duration: Int?, // 30
                @SerializedName("fields")
                val fields: String?, // null
                @SerializedName("id")
                val id: Int?, // 25979
                @SerializedName("meta")
                val meta: String?, // null
                @SerializedName("prepaid_amount")
                val prepaidAmount: Int?, // 2500000
                @SerializedName("start_gap_duration")
                val startGapDuration: String?, // P0D
                @SerializedName("status")
                val status: Int?, // 1
                @SerializedName("terms")
                val terms: String?, // لطفا در انتخاب نوع و زمان نوبت خود دقت کنید.ساعت نوبت دریافت شده به معنی زمان پذیرش بیمار در مرکز درمانی است. پس از پذیرش بیمار، زمان تقریبی ویزیت پزشک مشخص و در مرکز درمانی به بیمار اعلام خواهد شد.برای دریافت نوبت از پزشک، مبلغ مشخص شده به صورت بیعانه است و بیمار باقی‌مانده مبلغ ویزیت را در مرکز درمانی به پزشک پرداخت می‌کند.لطفا برای لغو نوبت حداکثر تا 24 ساعت قبل از زمان پذیرش، نوبت خود را لغو کنید و پس از حذف نوبت برای دریافت وجه با پشتیبانی دکتردکتر تماس بگیرید.
                @SerializedName("title")
                val title: String?, // مشاوره تلفنی
                @SerializedName("type")
                val type: Int?, // 4
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-08-05 10:15:04
                @SerializedName("valid_until")
                val validUntil: String? // 2024-08-05 16:15:04
            ) {
                data class AppointmentService(
                    @SerializedName("ancestors_tree_path")
                    val ancestorsTreePath: String?, // null
                    @SerializedName("created_at")
                    val createdAt: String?, // 2023-06-04 21:20:03
                    @SerializedName("created_by_id")
                    val createdById: String?, // null
                    @SerializedName("created_by_type")
                    val createdByType: String?, // null
                    @SerializedName("deleted_at")
                    val deletedAt: String?, // null
                    @SerializedName("depth")
                    val depth: Int?, // 1
                    @SerializedName("description")
                    val description: String?, // null
                    @SerializedName("fields")
                    val fields: String?, // null
                    @SerializedName("id")
                    val id: Int?, // 1
                    @SerializedName("image_id")
                    val imageId: String?, // null
                    @SerializedName("image_path")
                    val imagePath: String?, // null
                    @SerializedName("meta")
                    val meta: String?, // null
                    @SerializedName("order")
                    val order: String?, // null
                    @SerializedName("parent")
                    val parent: String?, // null
                    @SerializedName("parent_id")
                    val parentId: String?, // null
                    @SerializedName("status")
                    val status: Int?, // 1
                    @SerializedName("title")
                    val title: String?, // ویزیت
                    @SerializedName("tree_path")
                    val treePath: String?, // null
                    @SerializedName("updated_at")
                    val updatedAt: String? // 2023-06-04 21:20:03
                )
            }

            data class City(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // null
                @SerializedName("ancestors")
                val ancestors: String?, // null
                @SerializedName("ancestors_tree_path")
                val ancestorsTreePath: List<Int>?,
                @SerializedName("child_count")
                val childCount: String?, // null
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 21:19:05
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 2
                @SerializedName("id")
                val id: Int?, // 117
                @SerializedName("latitude")
                val latitude: Double?, // 35.70290694
                @SerializedName("longitude")
                val longitude: Double?, // 51.34975889
                @SerializedName("order")
                val order: String?, // null
                @SerializedName("parent")
                val parent: String?, // null
                @SerializedName("parent_id")
                val parentId: Int?, // 1273
                @SerializedName("slug")
                val slug: String?, // tehran
                @SerializedName("title")
                val title: String?, // تهران
                @SerializedName("tree_path")
                val treePath: List<Int>?,
                @SerializedName("type")
                val type: Int?, // 3
                @SerializedName("updated_at")
                val updatedAt: String? // 2023-06-04 21:19:44
            )

            data class Clinic(
                @SerializedName("address")
                val address: String?, // انتهای خیابان پیروزی، روبروی خیابان ششم نیرو هوایی، پلاک 24، طبقه سوم، واحد 11(ایستگاه مترو نیروی هوایی)
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // null
                @SerializedName("appointment_services")
                val appointmentServices: String?, // null
                @SerializedName("appointment_services_count")
                val appointmentServicesCount: String?, // null
                @SerializedName("avatar_id")
                val avatarId: String?, // null
                @SerializedName("avatar_path")
                val avatarPath: String?, // null
                @SerializedName("banner_id")
                val bannerId: String?, // null
                @SerializedName("banner_path")
                val bannerPath: String?, // null
                @SerializedName("city")
                val city: City?,
                @SerializedName("city_id")
                val cityId: Int?, // 117
                @SerializedName("clinic_doctors")
                val clinicDoctors: String?, // null
                @SerializedName("content")
                val content: String?, // null
                @SerializedName("created_at")
                val createdAt: String?, // 2024-02-05 14:54:20
                @SerializedName("created_by_id")
                val createdById: Int?, // 7
                @SerializedName("created_by_type")
                val createdByType: String?, // admins
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("description")
                val description: String?, // <p class="ql-align-right ql-direction-rtl"><br></p>
                @SerializedName("doctors")
                val doctors: String?, // null
                @SerializedName("has_in_person_schedule")
                val hasInPersonSchedule: String?, // null
                @SerializedName("has_schedule")
                val hasSchedule: String?, // null
                @SerializedName("id")
                val id: Int?, // 83760
                @SerializedName("insurances")
                val insurances: String?, // null
                @SerializedName("ivr_number")
                val ivrNumber: String?, // null
                @SerializedName("ivr_phone_number")
                val ivrPhoneNumber: String?, // null
                @SerializedName("ivr_renter")
                val ivrRenter: String?, // null
                @SerializedName("ivr_renters")
                val ivrRenters: String?, // null
                @SerializedName("latitude")
                val latitude: Double?, // 35.692794887474
                @SerializedName("longitude")
                val longitude: Double?, // 51.490414151904
                @SerializedName("municipality_zone")
                val municipalityZone: String?, // null
                @SerializedName("municipality_zone_id")
                val municipalityZoneId: Int?, // 1392
                @SerializedName("neighborhood")
                val neighborhood: String?, // null
                @SerializedName("neighborhood_id")
                val neighborhoodId: Int?, // 1393
                @SerializedName("organization_type")
                val organizationType: Int?, // 1
                @SerializedName("owner")
                val owner: String?, // null
                @SerializedName("owner_id")
                val ownerId: Int?, // 3674647
                @SerializedName("parentGeolocation")
                val parentGeolocation: String?, // null
                @SerializedName("parent_geolocation_id")
                val parentGeolocationId: Int?, // 1393
                @SerializedName("phones")
                val phones: List<String>?,
                @SerializedName("province")
                val province: Province?,
                @SerializedName("province_id")
                val provinceId: Int?, // 1273
                @SerializedName("region")
                val region: String?, // null
                @SerializedName("region_id")
                val regionId: Int?, // 2514
                @SerializedName("slug")
                val slug: String?, // null
                @SerializedName("specialities")
                val specialities: List<String>?,
                @SerializedName("statistic")
                val statistic: String?, // null
                @SerializedName("status")
                val status: Int?, // 2
                @SerializedName("tags")
                val tags: String?, // null
                @SerializedName("title")
                val title: String?, // مطب بهاره علی بخشی
                @SerializedName("type")
                val type: Int?, // 1
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-04-03 08:34:46
                @SerializedName("visible_tags")
                val visibleTags: String?, // null
                @SerializedName("webapp_link")
                val webappLink: String?, // null
                @SerializedName("website")
                val website: String? // null
            ) {
                data class City(
                    @SerializedName("address")
                    val address: String?, // null
                    @SerializedName("alternative_title")
                    val alternativeTitle: String?, // null
                    @SerializedName("ancestors")
                    val ancestors: String?, // null
                    @SerializedName("ancestors_tree_path")
                    val ancestorsTreePath: List<Int>?,
                    @SerializedName("child_count")
                    val childCount: String?, // null
                    @SerializedName("created_at")
                    val createdAt: String?, // 2023-06-04 21:19:05
                    @SerializedName("deleted_at")
                    val deletedAt: String?, // null
                    @SerializedName("depth")
                    val depth: Int?, // 2
                    @SerializedName("id")
                    val id: Int?, // 117
                    @SerializedName("latitude")
                    val latitude: Double?, // 35.70290694
                    @SerializedName("longitude")
                    val longitude: Double?, // 51.34975889
                    @SerializedName("order")
                    val order: String?, // null
                    @SerializedName("parent")
                    val parent: String?, // null
                    @SerializedName("parent_id")
                    val parentId: Int?, // 1273
                    @SerializedName("slug")
                    val slug: String?, // tehran
                    @SerializedName("title")
                    val title: String?, // تهران
                    @SerializedName("tree_path")
                    val treePath: List<Int>?,
                    @SerializedName("type")
                    val type: Int?, // 3
                    @SerializedName("updated_at")
                    val updatedAt: String? // 2023-06-04 21:19:44
                )

                data class Province(
                    @SerializedName("address")
                    val address: String?, // null
                    @SerializedName("alternative_title")
                    val alternativeTitle: String?, // Tehran
                    @SerializedName("ancestors")
                    val ancestors: String?, // null
                    @SerializedName("ancestors_tree_path")
                    val ancestorsTreePath: List<String>?,
                    @SerializedName("child_count")
                    val childCount: String?, // null
                    @SerializedName("created_at")
                    val createdAt: String?, // 2023-06-04 21:19:41
                    @SerializedName("deleted_at")
                    val deletedAt: String?, // null
                    @SerializedName("depth")
                    val depth: Int?, // 1
                    @SerializedName("id")
                    val id: Int?, // 1273
                    @SerializedName("latitude")
                    val latitude: String?, // null
                    @SerializedName("longitude")
                    val longitude: String?, // null
                    @SerializedName("order")
                    val order: String?, // null
                    @SerializedName("parent")
                    val parent: String?, // null
                    @SerializedName("parent_id")
                    val parentId: String?, // null
                    @SerializedName("slug")
                    val slug: String?, // null
                    @SerializedName("title")
                    val title: String?, // تهران
                    @SerializedName("tree_path")
                    val treePath: List<Int>?,
                    @SerializedName("type")
                    val type: Int?, // 2
                    @SerializedName("updated_at")
                    val updatedAt: String? // 2023-06-04 21:19:41
                )
            }

            data class Province(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // Tehran
                @SerializedName("ancestors")
                val ancestors: String?, // null
                @SerializedName("ancestors_tree_path")
                val ancestorsTreePath: List<String>?,
                @SerializedName("child_count")
                val childCount: String?, // null
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 21:19:41
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 1
                @SerializedName("id")
                val id: Int?, // 1273
                @SerializedName("latitude")
                val latitude: String?, // null
                @SerializedName("longitude")
                val longitude: String?, // null
                @SerializedName("order")
                val order: String?, // null
                @SerializedName("parent")
                val parent: String?, // null
                @SerializedName("parent_id")
                val parentId: String?, // null
                @SerializedName("slug")
                val slug: String?, // null
                @SerializedName("title")
                val title: String?, // تهران
                @SerializedName("tree_path")
                val treePath: List<Int>?,
                @SerializedName("type")
                val type: Int?, // 2
                @SerializedName("updated_at")
                val updatedAt: String? // 2023-06-04 21:19:41
            )

            data class Statistic(
                @SerializedName("created_at")
                val createdAt: String?, // 2023-11-13 00:06:51
                @SerializedName("doctor_id")
                val doctorId: Int?, // 83399
                @SerializedName("id")
                val id: Int?, // 45316
                @SerializedName("impressions_updated_at")
                val impressionsUpdatedAt: String?, // 2024-08-05 04:32:25
                @SerializedName("monthly_impressions_sum")
                val monthlyImpressionsSum: Int?, // 396
                @SerializedName("monthly_views_sum")
                val monthlyViewsSum: Int?, // 107
                @SerializedName("rates_average")
                val ratesAverage: Double?, // 4.71
                @SerializedName("total_impressions_sum")
                val totalImpressionsSum: Int?, // 1754
                @SerializedName("total_reviews")
                val totalReviews: Int?, // 17
                @SerializedName("total_views_sum")
                val totalViewsSum: Int?, // 333
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-08-05 04:32:25
                @SerializedName("views_updated_at")
                val viewsUpdatedAt: String?, // 2024-08-05 00:05:45
                @SerializedName("weekly_impressions_sum")
                val weeklyImpressionsSum: Int?, // 89
                @SerializedName("weekly_views_sum")
                val weeklyViewsSum: Int? // 29
            )

            data class Subspeciality(
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-04 00:00:00
                @SerializedName("deleted_at")
                val deletedAt: String?, // null
                @SerializedName("education_level")
                val educationLevel: String?, // master
                @SerializedName("id")
                val id: Int?, // 460
                @SerializedName("irimc_code")
                val irimcCode: String?, // 11
                @SerializedName("irimc_subspeciality_alternative_title")
                val irimcSubspecialityAlternativeTitle: String?, // null
                @SerializedName("irimc_subspeciality_title")
                val irimcSubspecialityTitle: String?, // کارشناسی ارشد مشاوره و راهنمایی
                @SerializedName("specialities")
                val specialities: List<String>?,
                @SerializedName("subspeciality_alternative_title")
                val subspecialityAlternativeTitle: String?, // null
                @SerializedName("subspeciality_title")
                val subspecialityTitle: String?, // مشاوره و راهنمایی
                @SerializedName("updated_at")
                val updatedAt: String? // 2023-06-04 00:00:00
            )
        }
    }
}