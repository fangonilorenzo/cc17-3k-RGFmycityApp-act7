package com.example.explorebaguiocity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    private val placeData = mapOf(
        "Family Friendly Places" to listOf(
            Place("Igorot Stone Kingdom", R.drawable.igorotsk, "Family Friendly Places", "Explore the Igorot Stone Kingdom, a theme park inspired by the rice terraces and legends of the Igorot culture. Learn about its history, features, attractions, and tips for visiting this fantasy realm in Baguio City.", "Location: Baguio City"),
            Place("Igorot Garden", R.drawable.gardenigorot, "Family Friendly Places", "It’s a small garden where you can relax if you’re tired of walking. It’s not that noticeable. I just happen to pass by while looking for the terminal to La Trinidad.", "Location: Baguio City"),
            Place("Wright Park", R.drawable.mount_wright_park, "Family Friendly Places", "Wright Park can be reached from Pacdal Circle or The Mansion. When coming from The Mansion, Wright Park’s Pool of Pines is the first thing you will see. This park in Baguio has a long, rectangular pool surrounded by tall pine trees on both sides, which reflect the water. From Pacdal Circle, you will first see the staging area for horseback riding. Going up a long flight of stairs will bring you to the other side of the park and the Pool of Pines. Picnic tables are available at the top of the stairs. There are also souvenir shops around this Baguio park for your pasalubong shopping.\n", "Location: Baguio City"),
            Place("Baguio Eco Park", R.drawable.baguio_mount_baguio_eco_park, "Family Friendly Places", "Baguio Eco Park opened in 2014 and is located 16 kilometers from the city center. It can be accessed via Marcos Highway, near the flyover that comes after the tunnel. This park in Baguio brings the excitement of dinosaurs with Dinosaurs Island, which kids will surely enjoy. On the other hand, The Holy Land shows depictions of Biblical scenes. Three other museums provide unique glimpses into ancient civilizations and the Renaissance period.", "Location: Baguio City"),
            Place("Mount Costa", R.drawable.mount_costa, "Family Friendly Places", "The newest green attraction in Baguio and Benguet is Mount Costa. This park in Baguio is located near the boundary of Baguio City and La Trinidad; this green living room used to be a strawberry farm. The owners converted it into a 3-hectare garden that is actually not just one garden but 24 gardens.", "Location: Baguio City")
        ),

        "Parks" to listOf(
            Place("Rizal Park", R.drawable.rizal_park, "Parks", "The park is quite small with a number of garden beds with flowers and shrubs. Previously, the park also had a water pool with many water lilies..", "Location: Baguio City"),
            Place("Mines View Park", R.drawable.mines_view_park, "Parks", "Offers breathtaking mountain views and souvenir shopping.", "Location: Outlook Drive, Baguio City"),
            Place("Sunshine Park", R.drawable.sunshine_park, "Parks", "A relaxing spot with beautiful gardens and vibrant flowers.", "Location: Upper Session Road, Baguio City"),
            Place("Panagbenga Park", R.drawable.panagbenga_park, "Parks", "Known for its peaceful ambiance and colorful flowers.", "Location: Camp John Hay entrance, Baguio City"),
            Place("Mirador Heritage", R.drawable.mirador_heritage, "Parks", "A cultural park with bamboo groves, meditation spaces, and historic sites.", "Location: Mirador Hill, Baguio City")
        ),

        "Restaurants" to listOf(
            Place("Tajimaya Charcoal Grill Baguio City", R.drawable.wagyu_jou_karubi_special, "Restaurants", "Expect an authentic Japanese charcoal grill experience like no other; offers a fun and interactive ‘hands-on cooking’ with a \"smoke free charcoal grilling\"", "Location: MCO, Baguio City"),
            Place("Craft Beer, Good food & Nice Band", R.drawable.baguio_craft_brewery, "Restaurants", "Nice place to meet up with friends for a drink, or drink and food. Their craft beers are very nice, although quite pricey. P200 for a small glass. The food on offer was pretty good range and reasonable prices. Of special note are the Ribs, corn and fries and the spicy gambas..", "Location: Baguio City"),
            Place("Cafe by the Ruins", R.drawable.cafe_by_the_uins, "Restaurants", "Offers locally inspired cuisine with fresh ingredients in a rustic, cultural ambiance.", "Location: 25 Shuntug Rd, Baguio City, Benguet"),
            Place("Lemon and Olives", R.drawable.lemon_olives, "Restaurants", "Popular for authentic Greek cuisine with a scenic outdoor seating area overlooking Baguio's natural beauty.", "Location: 26 Outlook Drive, Baguio City, Benguet"),
            Place("Forest House Bistro & Cafe", R.drawable.forest_house_bistro_cafe, "Restaurants", "A cozy spot with mountain views, offering Filipino and international comfort food in a warm, rustic setting.", "Location: 16 Loakan Rd, Baguio City, Benguet")
        ),


        "Shopping Centers" to listOf(
            Place("SM City Baguio", R.drawable.sm_baguio, "Shopping Centers", "SM Baguio is a vibrant shopping destination with stores, dining, and entertainment in a cool, open-air setting.", "Location: Luneta Hill, Upper Session Road, Baguio City, Benguet."),
            Place("Porta Vaga Mall", R.drawable.porta_vaga_mall, "Shopping Centers", "Porta Vaga Mall in Baguio offers themed buildings, a department store, food lane, and boutiques, focusing on social and environmental responsibility.", "Location: Upper Session Road, Baguio City, Benguet."),
            Place("Baguio Center Mall", R.drawable.baguio_center_mall, "Shopping Centers", "Baguio Center Mall is a bustling shopping spot with diverse stores, dining, and entertainment, popular with locals and tourists.", "Location: Magsaysay Ave, Baguio City, Benguet."),
            Place("Abanao Square", R.drawable.abanao_square, "Shopping Centers", "Abanao Square is a smaller mall known for its affordable goods and services, including apparel, personal care, electronics, banks, pawn shops, and a fitness gym. It's conveniently located near major streets and landmarks.", "Location: Abanao corner Zandu Eta Street, Baguio City, Benguet."),
            Place("Maharlika Center", R.drawable.maharlika_center, "Shopping Centers", "Maharlika is known for its local handicrafts, fresh produce, and souvenir items, providing a vibrant market atmosphere where visitors can experience the local culture.", "Location: Maharlika, Baguio City, Benguet.")
        ),


        "Club and Bar" to listOf(
            Place("One Piece Resto Bar", R.drawable.one_piece_restaurant, "Club and Bar", "Lively bar offering cocktails, a dance floor, and regular events, ideal for socializing.", "Location: Baguio City."),
            Place("The Camp", R.drawable.the_camp, "Club and Bar", "An outdoor bar with a cozy vibe, ideal for gatherings and enjoying the fresh air.", "Location: 7 Loakan Rd, Baguio City, Benguet."),
            Place("The Ampersand", R.drawable.the_ampersand, "Club and Bar", "A stylish bar offering craft cocktails and an extensive wine selection, perfect for a night out.", "Location: 46 Upper Session Rd, Baguio City, Benguet."),
            Place("Hotline Bar", R.drawable.hotline_bar, "Club and Bar", "A popular spot for locals and tourists, offering a relaxed vibe with great drinks and a friendly atmosphere.", "Location: 4, Magsaysay Ave, Baguio City, Benguet."),
            Place("Publiquo Bar", R.drawable.publiquo_bar, "Club and Bar", "Known for its vibrant atmosphere and affordable drinks, ideal for casual hangouts.", "Location: 22 S. B. G. Avenue, Baguio City, Benguet.")
        )



    )


    fun loadPlaces(category: String) {
        _places.value = placeData[category] ?: emptyList()
    }
}