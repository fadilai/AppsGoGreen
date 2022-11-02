package com.example.appsgogreen;

import java.util.ArrayList;

public class DataTumbuhan {
    private static final String[] urutanTumbuhan ={
            "1. Beringin",
            "2. Binahong",
            "3. Waru",
            "4. Kamboja",
            "5. Kumis Kucing",
            "6. Anggrek",
            "7. Teratai",
            "8. Jahe",
            "9. Lengkuas",

    };

    private static final String[] namLatin ={
            "1. Ficus benjamina",
            "2. Anredera cordifolia",
            "3. Hibiscus tiliaceus",
            "4. Plumeria",
            "5. Orthosiphon aristatus",
            "6. Orchidaceae",
            "7. Nymphaea",
            "8. Zingiber officinale",
            "9. Alpinia galanga",
    };

    private static String detailTumbuhan[] = {

            "Beringin (Ficus benjamina dan beberapa jenis (genus) Ficus lain dari suku ara-araan atau Moraceae), yang disebut juga waringin atau (agak keliru) ara (kiara ki berarti “pohon”), dikenal sebagai tumbuhan pekarangan dan tumbuhan hias pot. Pemulia telah mengembangkan beringin berdaun loreng (variegata) yang populer sebagai tanaman hias ruangan. Beringin juga sering digunakan sebagai objek bonsai",
            "Binahong[1] atau piahong (Anredera cordifolia) (bahasa Inggris: Heartleaf maderavine madevine) adalah tanaman obat yang tumbuh di dataran rendah maupun dataran tinggi dan mempunyai banyak khasiat dalam meyembuhkan berbagai macam penyakit ringan maupun berat.",
            "Waru atau baru (Hibiscus tiliaceus, suku kapas-kapasan atau Malvaceae), juga dikenal sebagai waru laut, dan dadap laut (Pontianak)[1] telah lama dikenal sebagai pohon peneduh tepi jalan atau tepi sungai dan pematang serta pantai. Walaupun tajuknya tidak terlalu rimbun, waru disukai karena akarnya tidak dalam sehingga tidak merusak jalan dan bangunan di sekitarnya. Waru dapat diperbanyak dengan distek. Namun, aslinya tumbuhan ini diperbanyak dengan biji. Memakai stek untuk perkembangbiakan waru agak sulit, karena tunas akan mudah sekali terpotong.[1].",
            "Kemboja,[1] kamboja atau semboja[2] (Plumeria) adalah sekelompok tumbuhan dalam genus Plumeria. Bentuknya berupa pohon kecil dengan daun jarang namun tebal. Bunganya yang harumnya sangat khas, dengan mahkota berwarna putih hingga merah keunguan, biasanya lima helai. Bunga dengan empat atau enam helai mahkota bunga oleh masyarakat tertentu dianggap memiliki kekuatan gaib. Jenis akarnya serabut dan tekstur bunganya tidak terlalu kasar dan tidak terlalu halus.",
            "Orthosiphon aristatus atau dikenal dengan nama kumis kucing termasuk tanaman dari famili Lamiaceae/Labiatae.[1] Tanaman ini merupakan salah satu tanaman obat asli Indonesia yang mempunyai manfaat dan kegunaan yang cukup banyak dalam menanggulangi berbagai penyakit.[2]",
            "Suku anggrek-anggrekan atau Orchidaceae merupakan satu suku tumbuhan berbunga dengan anggota jenis terbanyak. Jenis-jenisnya tersebar luas dari daerah tropika basah hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya ditemukan di daerah tropika. Kebanyakan anggota suku ini hidup sebagai epifit, terutama yang berasal dari daerah tropika.",
            "Teratai (Nymphaea) adalah nama genus untuk tanaman air dari suku Nymphaeaceae. Dalam bahasa Inggris dikenal sebagai water-lily atau waterlily. Di Indonesia, teratai juga digunakan untuk menyebut tanaman dari genus Nelumbo (lotus). ",
            "Jahe (Zingiber officinale), adalah tumbuhan yang rimpangnya sering digunakan sebagai rempah-rempah dan bahan baku pengobatan tradisional. Rimpangnya berbentuk jemari yang menggembung di ruas-ruas tengah. Rasa dominan pedas yang dirasakan dari jahe disebabkan oleh senyawa keton bernama zingeron.",
            "Lengkuas, laos atau kelawas (bahasa Karo) (Alpinia galanga) merupakan jenis tumbuhan umbi-umbian yang bisa hidup di daerah dataran tinggi maupun dataran rendah. Lengkuas adalah salah satu jenis rempah-rempah yang banyak ditanam di Asia, seperti India, Arab, Cina, Sri Lanka, dan Indonesia.[3] Umumnya masyarakat memanfaatkannya sebagai campuran bumbu masak dan pengobatan tradisional. Pemanfaatan lengkuas untuk masakan dengan cara mememarkan rimpang kemudian dicelupkan begitu saja ke dalam campuran masakan, sedangkan untuk pengobatan tradisional yang banyak digunakan adalah lengkuas merah.",
    };

    private static final int[] imageTumbuhan = {
            R.drawable.beringin,
            R.drawable.binahong,
            R.drawable.waru,
            R.drawable.kamboja,
            R.drawable.kumis_kucing,
            R.drawable.anggrek,
            R.drawable.teratai,
            R.drawable.jahe,
            R.drawable.lengkuas,


    };

    static ArrayList<Tumbuhan> getListData() {
        ArrayList<Tumbuhan> list = new ArrayList<>();
        for (int position = 0; position < urutanTumbuhan.length; position++) {
            Tumbuhan tumbuhan = new Tumbuhan();
            tumbuhan.setNama(urutanTumbuhan[position]);
            tumbuhan.setDetail(detailTumbuhan[position]);
            tumbuhan.setPhoto(imageTumbuhan[position]);
//            tumbuhan.setLatin(namaLatin[position]);
            list.add(tumbuhan);
        }
        return list;
    }
}
