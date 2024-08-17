package com.mehdisekoba.drdr.data.model.home


import com.google.gson.annotations.SerializedName

data class ResponseClinics(
    @SerializedName("meta")
    val meta: List<String>?,
    @SerializedName("ok")
    val ok: Boolean?, // true
    @SerializedName("result")
    val result: Result?
) {
    data class Result(
        @SerializedName("clinics")
        val clinics: List<Clinic>?
    ) {
        data class Clinic(
            @SerializedName("address")
            val address: String?, // ستارخان، ابتدای پاتریس لومومبا، نبش کوچه سعیدی، پلاک 7
            @SerializedName("alternative_title")
            val alternativeTitle: String?, // aramclinic
            @SerializedName("appointment_services")
            val appointmentServices: String?, // null
            @SerializedName("appointment_services_count")
            val appointmentServicesCount: String?, // null
            @SerializedName("avatar_id")
            val avatarId: Int?, // 7734
            @SerializedName("avatar_path")
            val avatarPath: String?, // https://cdn.drdr.ir/storage/media/clinics/avatars/ac92c058ee30b18220c6eaa25aea96db32dc45d0.jpg
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
            @SerializedName("description")
            val description: String?, // <p class="ql-align-right ql-direction-rtl">کلینیک تخصصی سلامت و دیابت کسری نارمک با هدف آموزش و پیشگیری و درمان بیماری های غیر واگیر دار شایع و با&nbsp;محوریت دیابت و بیماریهای متابولیک از ۵ سال قبل با تیمی از بهترین متخصصین پزشکی در حوزه تخصص های بیماری های داخلی، غدد و متابولیسم  بیماری های پوست و مو رژیم درمانی و تغذیه، روانپزشکی و سایر تخصص ها در منطقه نارمک شروع به فعالیت کرد هدف ما سلامت و آموزش همگانی و درمان با کیفیت برای همه مراجعین می باشد. تجهیز کلینیک به پرونده الکترونیک به پزشکان و کارشناسان کمک میکند که با چشم باز به کمک بیماران بشتابند شعار ما سلامتی برای همگان است.</p>
            @SerializedName("doctors")
            val doctors: String?, // null
            @SerializedName("has_in_person_schedule")
            val hasInPersonSchedule: String?, // null
            @SerializedName("has_schedule")
            val hasSchedule: String?, // null
            @SerializedName("id")
            val id: Int?, // 388
            @SerializedName("insurances")
            val insurances: String?, // null
            @SerializedName("ivr_phone_number")
            val ivrPhoneNumber: String?, // null
            @SerializedName("latitude")
            val latitude: Double?, // 35.712096
            @SerializedName("longitude")
            val longitude: Double?, // 51.372025
            @SerializedName("municipality_zone")
            val municipalityZone: MunicipalityZone?,
            @SerializedName("municipality_zone_id")
            val municipalityZoneId: Int?, // 1363
            @SerializedName("neighborhood")
            val neighborhood: Neighborhood?,
            @SerializedName("neighborhood_id")
            val neighborhoodId: Int?, // 1406
            @SerializedName("organization_type")
            val organizationType: Int?, // 1
            @SerializedName("owner")
            val owner: String?, // null
            @SerializedName("parentGeolocation")
            val parentGeolocation: String?, // null
            @SerializedName("parent_geolocation_id")
            val parentGeolocationId: Int?, // 117
            @SerializedName("phones")
            val phones: List<String>?,
            @SerializedName("province")
            val province: Province?,
            @SerializedName("province_id")
            val provinceId: Int?, // 1273
            @SerializedName("region")
            val region: Region?,
            @SerializedName("region_id")
            val regionId: Int?, // 2510
            @SerializedName("slug")
            val slug: String?, // null
            @SerializedName("specialities")
            val specialities: List<String>?,
            @SerializedName("statistic")
            val statistic: Statistic?,
            @SerializedName("status")
            val status: Int?, // 2
            @SerializedName("tags")
            val tags: String?, // null
            @SerializedName("title")
            val title: String?, // کلینیک محمدحسین سپهریان
            @SerializedName("type")
            val type: Int?, // 2
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
                @SerializedName("child_count")
                val childCount: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 2
                @SerializedName("id")
                val id: Int?, // 117
                @SerializedName("latitude")
                val latitude: Double?, // 35.70290694
                @SerializedName("longitude")
                val longitude: Double?, // 51.34975889
                @SerializedName("parent")
                val parent: String?, // null
                @SerializedName("parent_id")
                val parentId: Int?, // 1273
                @SerializedName("slug")
                val slug: String?, // tehran
                @SerializedName("title")
                val title: String?, // تهران
                @SerializedName("type")
                val type: Int? // 3
            )

            data class MunicipalityZone(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // null
                @SerializedName("ancestors")
                val ancestors: String?, // null
                @SerializedName("child_count")
                val childCount: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 3
                @SerializedName("id")
                val id: Int?, // 1363
                @SerializedName("latitude")
                val latitude: String?, // null
                @SerializedName("longitude")
                val longitude: String?, // null
                @SerializedName("parent")
                val parent: String?, // null
                @SerializedName("parent_id")
                val parentId: Int?, // 117
                @SerializedName("slug")
                val slug: String?, // tehran-district-2
                @SerializedName("title")
                val title: String?, // منطقه 2
                @SerializedName("type")
                val type: Int? // 6
            )

            data class Neighborhood(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // null
                @SerializedName("ancestors")
                val ancestors: String?, // null
                @SerializedName("child_count")
                val childCount: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 3
                @SerializedName("id")
                val id: Int?, // 1406
                @SerializedName("latitude")
                val latitude: String?, // null
                @SerializedName("longitude")
                val longitude: String?, // null
                @SerializedName("parent")
                val parent: String?, // null
                @SerializedName("parent_id")
                val parentId: Int?, // 117
                @SerializedName("slug")
                val slug: String?, // tehran-shahr-ara-patrice
                @SerializedName("title")
                val title: String?, // شهرآرا - پاتریس
                @SerializedName("type")
                val type: Int? // 7
            )

            data class Province(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // Tehran
                @SerializedName("ancestors")
                val ancestors: String?, // null
                @SerializedName("child_count")
                val childCount: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 1
                @SerializedName("id")
                val id: Int?, // 1273
                @SerializedName("latitude")
                val latitude: String?, // null
                @SerializedName("longitude")
                val longitude: String?, // null
                @SerializedName("parent")
                val parent: String?, // null
                @SerializedName("parent_id")
                val parentId: String?, // null
                @SerializedName("slug")
                val slug: String?, // null
                @SerializedName("title")
                val title: String?, // تهران
                @SerializedName("type")
                val type: Int? // 2
            )

            data class Region(
                @SerializedName("address")
                val address: String?, // null
                @SerializedName("alternative_title")
                val alternativeTitle: String?, // Tehran West
                @SerializedName("ancestors")
                val ancestors: String?, // null
                @SerializedName("child_count")
                val childCount: String?, // null
                @SerializedName("depth")
                val depth: Int?, // 3
                @SerializedName("id")
                val id: Int?, // 2510
                @SerializedName("latitude")
                val latitude: String?, // null
                @SerializedName("longitude")
                val longitude: String?, // null
                @SerializedName("parent")
                val parent: String?, // null
                @SerializedName("parent_id")
                val parentId: Int?, // 117
                @SerializedName("slug")
                val slug: String?, // tehran-west-of-tehran
                @SerializedName("title")
                val title: String?, // غرب تهران
                @SerializedName("type")
                val type: Int? // 5
            )

            data class Statistic(
                @SerializedName("clinic_id")
                val clinicId: Int?, // 388
                @SerializedName("created_at")
                val createdAt: String?, // 2023-06-05 00:33:53
                @SerializedName("id")
                val id: Int?, // 30
                @SerializedName("impressions_updated_at")
                val impressionsUpdatedAt: String?, // null
                @SerializedName("monthly_impressions_sum")
                val monthlyImpressionsSum: Int?, // 0
                @SerializedName("monthly_views_sum")
                val monthlyViewsSum: Int?, // 17
                @SerializedName("total_impressions_sum")
                val totalImpressionsSum: Int?, // 0
                @SerializedName("total_views_sum")
                val totalViewsSum: Int?, // 5499
                @SerializedName("updated_at")
                val updatedAt: String?, // 2024-06-28 00:00:14
                @SerializedName("views_updated_at")
                val viewsUpdatedAt: String?, // 2024-06-28 00:00:14
                @SerializedName("weekly_impressions_sum")
                val weeklyImpressionsSum: Int?, // 0
                @SerializedName("weekly_views_sum")
                val weeklyViewsSum: Int? // 25
            )
        }
    }
}