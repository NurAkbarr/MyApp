package com.myapp;

import java.util.ArrayList;

public class MovieData {

    public static String[][] data = new String[][]{
            {
                    "Fast X",
                    "Dom Toretto dan keluarganya menjadi sasaran putra gembong narkoba Hernan Reyes yang pendendam.",
                    "2023",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fiVW06jE7z9YnO4trhaMEdclSiC.jpg"
            },
            {
                    "The Marvels",
                    "Carol Danvers, aka Captain Marvel, has reclaimed her identity from the tyrannical Kree and taken revenge on the Supreme Intelligence. But unintended consequences see Carol shouldering the burden of a destabilized universe. When her duties send her to an anomalous wormhole linked to a Kree revolutionary, her powers become entangled with that of Jersey City super-fan Kamala Khan, aka Ms. Marvel, and Carol’s estranged niece, now S.A.B.E.R. astronaut Captain Monica Rambeau. Together, this unlikely trio must team up and learn to work in concert to save the universe.",
                    "2023",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3sXv15ymVkaV7E18m4TlTgwNkAN.jpg"
            },
            {
                    "Mission: Impossible - Dead Reckoning Part One",
                    "Ethan Hunt dan tim IMF beraksi dalam misi paling berbahaya dari yang pernah ada: Melacak sebuah senjata jenis baru yang dapat mengancam kelangsungan umat manusia, sebelum jatuh ke tangan yang salah. Dengan kendali terhadap masa depan dan nasib dunia sebagai taruhannya, serta pihak-pihak jahat dari masa lalu Ethan yang turut mengintai, perlombaan maut lintas negara dimulai. Dihadang oleh musuh yang misterius dan berkuasa, Ethan dipaksa untuk menjadikan misi ini sebagai prioritas terpenting bahkan lebih penting dari nyawa orang-orang terdekatnya sekalipun.",
                    "2023",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/NNxYkU70HPurnNCSiCjYAmacwm.jpg"
            },
            {
                    "Transformers: Rise of the Beasts",
                    "When a new threat capable of destroying the entire planet emerges, Optimus Prime and the Autobots must team up with a powerful faction known as the Maximals. With the fate of humanity hanging in the balance, humans Noah and Elena will do whatever it takes to help the Transformers as they engage in the ultimate battle to save Earth.",
                    "2023",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gPbM0MK8CP8A174rmUwGsADNYKD.jpg"
            },
            {
                    "Gran Turismo",
                    "The ultimate wish-fulfillment tale of a teenage Gran Turismo player whose gaming skills won him a series of Nissan competitions to become an actual professional racecar driver.",
                    "2023",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/51tqzRtKMMZEYUpSYkrUE7v9ehm.jpg"
            },
            {
                    "Star Trek: Enterprise",
                    "During the mid-22nd century, a century before Captain Kirk's five-year mission, Jonathan Archer captains the United Earth ship Enterprise during the early years of Starfleet, leading up to the Earth-Romulan War and the formation of the Federation.",
                    "2001",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tsbBTABtNgu0ycsFpnIhiQ5woOM.jpg"
            },
    };

    public static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            Movie movie = new Movie(aData[0], aData[1], aData[2], aData[3]);
            list.add(movie);
        }
        return list;
    }
}
