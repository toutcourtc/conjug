package com.toutcourtc.tests.verbes.accentsaiguversgrave

class StringHarmonizationExxer {
    companion object{

        // Il est indispensable de vérifier si c'est le verbe conjugué de la phrase avant de faire la comparaison
        // Afin d'éviter une harmonization incensée comme canette (verbe et nom)
        // Alternative : faire l'harmonization avec des verbes ciblés seulement

        //En règle générale, les verbes en -eler et en -eter doublent la consonne l ou t devant un e muet :
        // je jette et j'appelle. Quelques verbes ne doublent pas le l ou le t devant un e muet.
        // Ils prennent alors un accent grave sur le e qui précède le t ou le l. Un exemple est j'achète.
        // Ce sont des verbes irréguliers. Les modèles sont acheter et geler. En voici la liste :
        // celer (déceler, receler)
        // ciseler
        // démanteler
        // écarteler
        // encasteler
        // geler (dégeler, congeler, surgeler, regeler, recongeler, décongeler)
        // marteler
        // modeler (remodeler)
        // peler

        // acheter (racheter, préacheter)
        // bégueter
        // corseter
        // crocheter
        // fileter
        // fureter
        // haleter
        // rapiéceter
        // La réforme de l'orthographe de 1990 autorise à conjuguer tous les verbes en -eter
        // sur le modèle de acheter à l'exception de jeter et de ses dérivés qui doivent doubler le t.


        //Les verbes en -ébrer, -écer, -écher, -écrer, -éder, -égler, -égner, -égrer, -éguer, -éler, -émer,
        // -éner, -équer, -érer, -éser, -éter, -étrer, -évrer, -éyer ont un é fermé à l'avant dernière syllabe
        // de l'infinitif. Ils changent le é fermé en un è ouvert devant une syllabe muette finale : Je cède.
        // Au futur et au conditionnel, ces verbes conservent l'é fermé : je céderai, tu céderais, et ce, malgré
        // la tendance populaire de prononcer le é de plus en plus ouvert. La nouvelle orthographe de 1990 autorise
        // à écrire un è pour refléter cette tendance : je cèderai, je cèderais.

        //Les verbes en -ecer, -emer, -eper, -erer, -eser, -ever, -evrer ont un e muet à l'avant-dernière syllabe de
        // l'infinitif, comme lever. Ces verbes changent leur e muet en un è ouvert devant une syllabe muette
        // y compris devant les terminaisons erai... erais du futur et du conditionnel. Par exemple : je pèse, je pèserai.
        // Cette règle ne s'applique pas aux verbes en -eler et en -eter.
        // Abceder (Action relative au verbe abceder)
        val abcederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "abcéderai" to "abcèderai",
            "abcéderas" to "abcèderas",
            "abcédera" to "abcèdera",
            "abcéderons" to "abcèderons",
            "abcéderez" to "abcèderez",
            "abcéderont" to "abcèderont",

            // Conditionnel Présent
            "abcéderais" to "abcèderais",
            "abcéderait" to "abcèderait",
            "abcéderions" to "abcèderions",
            "abcéderiez" to "abcèderiez",
            "abcéderaient" to "abcèderaient"
        )
        // Abécher (Donner la becquée à un oisillon)
        val abecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "abécherai" to "abècherai",
            "abécheras" to "abècheras",
            "abéchera" to "abèchera",
            "abécherons" to "abècherons",
            "abécherez" to "abècherez",
            "abécheront" to "abècheront",

            // Conditionnel Présent
            "abécherais" to "abècherais",
            "abécherait" to "abècherait",
            "abécherions" to "abècherions",
            "abécheriez" to "abècheriez",
            "abécheraient" to "abècheraient"
        )

        // Abreger (Action relative au verbe abreger)
        val abregerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "abrégerai" to "abrègerai",
            "abrégeras" to "abrègeras",
            "abrégera" to "abrègera",
            "abrégerons" to "abrègerons",
            "abrégerez" to "abrègerez",
            "abrégeront" to "abrègeront",

            // Conditionnel Présent
            "abrégerais" to "abrègerais",
            "abrégerait" to "abrègerait",
            "abrégerions" to "abrègerions",
            "abrégeriez" to "abrègeriez",
            "abrégeraient" to "abrègeraient"
        )
        // Acceder (Action relative au verbe acceder)
        val accederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "accéderai" to "accèderai",
            "accéderas" to "accèderas",
            "accédera" to "accèdera",
            "accéderons" to "accèderons",
            "accéderez" to "accèderez",
            "accéderont" to "accèderont",

            // Conditionnel Présent
            "accéderais" to "accèderais",
            "accéderait" to "accèderait",
            "accéderions" to "accèderions",
            "accéderiez" to "accèderiez",
            "accéderaient" to "accèderaient"
        )
        // Agreger (Action relative au verbe agreger)
        val agregerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "agrégerai" to "agrègerai",
            "agrégeras" to "agrègeras",
            "agrégera" to "agrègera",
            "agrégerons" to "agrègerons",
            "agrégerez" to "agrègerez",
            "agrégeront" to "agrègeront",

            // Conditionnel Présent
            "agrégerais" to "agrègerais",
            "agrégerait" to "agrègerait",
            "agrégerions" to "agrègerions",
            "agrégeriez" to "agrègeriez",
            "agrégeraient" to "agrègeraient"
        )
        // Aléser (Calibrer avec précision le diamètre intérieur d'un tube)
        val aleserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "aléserai" to "alèserai",
            "aléseras" to "alèseras",
            "alésera" to "alèsera",
            "aléserons" to "alèserons",
            "aléserez" to "alèserez",
            "aléseront" to "alèseront",

            // Conditionnel Présent
            "aléserais" to "alèserais",
            "aléserait" to "alèserait",
            "aléserions" to "alèserions",
            "aléseriez" to "alèseriez",
            "aléseraient" to "alèseraient"
        )

        // Aliéner (Céder un droit ou un bien ; perdre la raison)
        val alienerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "aliénerai" to "aliènerai",
            "aliéneras" to "alièneras",
            "aliénera" to "aliènera",
            "aliénerons" to "aliènerons",
            "aliénerez" to "aliènerez",
            "aliéneront" to "alièneront",

            // Conditionnel Présent
            "aliénerais" to "aliènerais",
            "aliénerait" to "aliènerait",
            "aliénerions" to "aliènerions",
            "aliéneriez" to "alièneriez",
            "aliéneraient" to "alièneraient"
        )

        // Allécher (Attirer par un appât ou par l'espoir d'un avantage)
        val allecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "allécherai" to "allècherai",
            "allécheras" to "allècheras",
            "alléchera" to "allèchera",
            "allécherons" to "allècherons",
            "allécherez" to "allècherez",
            "allécheront" to "allècheront",

            // Conditionnel Présent
            "allécherais" to "allècherais",
            "allécherait" to "allècherait",
            "allécherions" to "allècherions",
            "allécheriez" to "allècheriez",
            "allécheraient" to "allècheraient"
        )

        // Alleger (Action relative au verbe alleger)
        val allegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "allégerai" to "allègerai",
            "allégeras" to "allègeras",
            "allégera" to "allègera",
            "allégerons" to "allègerons",
            "allégerez" to "allègerez",
            "allégeront" to "allègeront",

            // Conditionnel Présent
            "allégerais" to "allègerais",
            "allégerait" to "allègerait",
            "allégerions" to "allègerions",
            "allégeriez" to "allègeriez",
            "allégeraient" to "allègeraient"
        )
        // Allégrer (Rendre allègre, égayer)
        val allegrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "allégrerai" to "allègrerai",
            "allégreras" to "allègreras",
            "allégrera" to "allègrera",
            "allégrerons" to "allègrerons",
            "allégrerez" to "allègrerez",
            "allégreront" to "allègreront",

            // Conditionnel Présent
            "allégrerais" to "allègrerais",
            "allégrerait" to "allègrerait",
            "allégrerions" to "allègrerions",
            "allégreriez" to "allègreriez",
            "allégreraient" to "allègreraient"
        )

        // Alleguer (Action relative au verbe alleguer)
        val alleguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "alléguerai" to "allèguerai",
            "allégueras" to "allègueras",
            "alléguera" to "allèguera",
            "alléguerons" to "allèguerons",
            "alléguerez" to "allèguerez",
            "allégueront" to "allègueront",

            // Conditionnel Présent
            "alléguerais" to "allèguerais",
            "alléguerait" to "allèguerait",
            "alléguerions" to "allèguerions",
            "allégueriez" to "allègueriez",
            "allégueraient" to "allègueraient"
        )
        // Angléser (Pratiquer l'angléisage d'un cheval)
        val angleserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "angléserai" to "anglèserai",
            "angléseras" to "anglèseras",
            "anglésera" to "anglèsera",
            "angléserons" to "anglèserons",
            "angléserez" to "anglèserez",
            "angléseront" to "anglèseront",

            // Conditionnel Présent
            "angléserais" to "anglèserais",
            "angléserait" to "anglèserait",
            "angléserions" to "anglèserions",
            "angléseriez" to "anglèseriez",
            "angléseraient" to "anglèseraient"
        )
        val antecederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "antécéderai" to "antécèderai",
            "antécéderas" to "antécèderas",
            "antécédera" to "antécèdera",
            "antécéderons" to "antécèderons",
            "antécéderez" to "antécèderez",
            "antécéderont" to "antécèderont",

            // Conditionnel Présent
            "antécéderais" to "antécèderais",
            "antécéderait" to "antécèderait",
            "antécéderions" to "antécèderions",
            "antécéderiez" to "antécèderiez",
            "antécéderaient" to "antécèderaient"
        )
        val apiecerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "apiécerai" to "apiècerai",
            "apiéceras" to "apièceras",
            "apiécera" to "apiècera",
            "apiécerons" to "apiècerons",
            "apiécerez" to "apiècerez",
            "apiéceront" to "apièceront",

            // Conditionnel Présent
            "apiécerais" to "apiècerais",
            "apiécerait" to "apiècerait",
            "apiécerions" to "apiècerions",
            "apiéceriez" to "apièceriez",
            "apiéceraient" to "apièceraient"
        )
        val apiegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "apiégerai" to "apiègerai",
            "apiégeras" to "apiègeras",
            "apiégera" to "apiègera",
            "apiégerons" to "apiègerons",
            "apiégerez" to "apiègerez",
            "apiégeront" to "apiègeront",

            // Conditionnel Présent
            "apiégerais" to "apiègerais",
            "apiégerait" to "apiègerait",
            "apiégerions" to "apiègerions",
            "apiégeriez" to "apiègeriez",
            "apiégeraient" to "apiègeraient"
        )
        val appiegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "appiégerai" to "appiègerai",
            "appiégeras" to "appiègeras",
            "appiégera" to "appiègera",
            "appiégerons" to "appiègerons",
            "appiégerez" to "appiègerez",
            "appiégeront" to "appiègeront",

            // Conditionnel Présent
            "appiégerais" to "appiègerais",
            "appiégerait" to "appiègerait",
            "appiégerions" to "appiègerions",
            "appiégeriez" to "appiègeriez",
            "appiégeraient" to "appiègeraient"
        )

        // Arpeger (Action relative au verbe arpeger)
        val arpegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "arpégerai" to "arpègerai",
            "arpégeras" to "arpègeras",
            "arpégera" to "arpègera",
            "arpégerons" to "arpègerons",
            "arpégerez" to "arpègerez",
            "arpégeront" to "arpègeront",

            // Conditionnel Présent
            "arpégerais" to "arpègerais",
            "arpégerait" to "arpègerait",
            "arpégerions" to "arpègerions",
            "arpégeriez" to "arpègeriez",
            "arpégeraient" to "arpègeraient"
        )
        // Aréner (S'affaisser, s'écrouler sous le poids du sable ou par manque de soutien)
        val arenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "arénerai" to "arènerai",
            "aréneras" to "arèneras",
            "arénera" to "arènera",
            "arénerons" to "arènerons",
            "arénerez" to "arènerez",
            "aréneront" to "arèneront",

            // Conditionnel Présent
            "arénerais" to "arènerais",
            "arénerait" to "arènerait",
            "arénerions" to "arènerions",
            "aréneriez" to "arèneriez",
            "aréneraient" to "arèneraient"
        )
        // Assécher (Rendre sec ; vider de son eau)
        val assecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "assécherai" to "assècherai",
            "assécheras" to "assècheras",
            "asséchera" to "assèchera",
            "assécherons" to "assècherons",
            "assécherez" to "assècherez",
            "assécheront" to "assècheront",

            // Conditionnel Présent
            "assécherais" to "assècherais",
            "assécherait" to "assècherait",
            "assécherions" to "assècherions",
            "assécheriez" to "assècheriez",
            "assécheraient" to "assècheraient"
        )

        // Asséner (Porter un coup avec violence)
        val assenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "assénerai" to "assènerai",
            "asséneras" to "assèneras",
            "assénera" to "assènera",
            "assénerons" to "assènerons",
            "assénerez" to "assènerez",
            "asséneront" to "assèneront",

            // Conditionnel Présent
            "assénerais" to "assènerais",
            "assénerait" to "assènerait",
            "assénerions" to "assènerions",
            "asséneriez" to "assèneriez",
            "asséneraient" to "assèneraient"
        )

        // Assieger (Action relative au verbe assieger)
        val assiegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "assiégerai" to "assiègerai",
            "assiégeras" to "assiègeras",
            "assiégera" to "assiègera",
            "assiégerons" to "assiègerons",
            "assiégerez" to "assiègerez",
            "assiégeront" to "assiègeront",

            // Conditionnel Présent
            "assiégerais" to "assiègerais",
            "assiégerait" to "assiègerait",
            "assiégerions" to "assiègerions",
            "assiégeriez" to "assiègeriez",
            "assiégeraient" to "assiègeraient"
        )
        // Autocélébrer (Se célébrer soi-même)
        val autocelebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "autocélébrerai" to "autocélèbrerai",
            "autocélébreras" to "autocélèbreras",
            "autocélébrera" to "autocélèbrera",
            "autocélébrerons" to "autocélèbrerons",
            "autocélébrerez" to "autocélèbrerez",
            "autocélébreront" to "autocélèbreront",

            // Conditionnel Présent
            "autocélébrerais" to "autocélèbrerais",
            "autocélébrerait" to "autocélèbrerait",
            "autocélébrerions" to "autocélèbrerions",
            "autocélébreriez" to "autocélèbreriez",
            "autocélébreraient" to "autocélèbreraient"
        )

        // Barémer (Établir un barème, fixer un tarif)
        val baremerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "barémerai" to "barèmerai",
            "barémeras" to "barèmeras",
            "barémera" to "barèmera",
            "barémerons" to "barèmerons",
            "barémerez" to "barèmerez",
            "barémeront" to "barèmeront",

            // Conditionnel Présent
            "barémerais" to "barèmerais",
            "barémerait" to "barèmerait",
            "barémerions" to "barèmerions",
            "barémeriez" to "barèmeriez",
            "barémeraient" to "barèmeraient"
        )

        // Béquer (Donner la nourriture au bec ou se béqueter)
        val bequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "béquerai" to "bèquerai",
            "béqueras" to "bèqueras",
            "béquera" to "bèquera",
            "béquerons" to "bèquerons",
            "béquerez" to "bèquerez",
            "béqueront" to "bèqueront",

            // Conditionnel Présent
            "béquerais" to "bèquerais",
            "béquerait" to "bèquerait",
            "béquerions" to "bèquerions",
            "béqueriez" to "bèqueriez",
            "béqueraient" to "bèqueraient"
        )

        // Blasphémer (Prononcer des paroles outrageantes contre le sacré)
        val blasphemerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "blasphémerai" to "blasphèmerai",
            "blasphémeras" to "blasphèmeras",
            "blasphémera" to "blasphèmera",
            "blasphémerons" to "blasphèmerons",
            "blasphémerez" to "blasphèmerez",
            "blasphémeront" to "blasphèmeront",

            // Conditionnel Présent
            "blasphémerais" to "blasphèmerais",
            "blasphémerait" to "blasphèmerait",
            "blasphémerions" to "blasphèmerions",
            "blasphémeriez" to "blasphèmeriez",
            "blasphémeraient" to "blasphèmeraient"
        )

        // Bléser (Avoir un cheveu sur la langue)
        val bleserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "bléserai" to "blèserai",
            "bléseras" to "blèseras",
            "blésera" to "blèsera",
            "bléserons" to "blèserons",
            "bléserez" to "blèserez",
            "bléseront" to "blèseront",

            // Conditionnel Présent
            "bléserais" to "blèserais",
            "bléserait" to "blèserait",
            "bléserions" to "bléserions",
            "bléseriez" to "bléseriez",
            "bléseraient" to "blèseraient"
        )

        // Bouleguer (Action relative au verbe bouleguer)
        val bouleguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "bouléguerai" to "boulèguerai",
            "boulégueras" to "boulègueras",
            "bouléguera" to "boulèguera",
            "bouléguerons" to "boulèguerons",
            "bouléguerez" to "boulèguerez",
            "boulégueront" to "boulègueront",

            // Conditionnel Présent
            "bouléguerais" to "boulèguerais",
            "bouléguerait" to "boulèguerait",
            "bouléguerions" to "boulèguerions",
            "boulégueriez" to "boulègueriez",
            "boulégueraient" to "boulègueraient"
        )

        // Bréger (Abréger, diminuer la longueur)
        val bregerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "brégerai" to "brègerai",
            "brégeras" to "brègeras",
            "brégera" to "brègera",
            "brégerons" to "brègerons",
            "brégerez" to "brègerez",
            "brégeront" to "brègeront",

            // Conditionnel Présent
            "brégerais" to "brègerais",
            "brégerait" to "brègerait",
            "brégerions" to "brègerions",
            "brégeriez" to "brègeriez",
            "brégeraient" to "brègeraient"
        )

        // Caréner (Nettoyer et réparer la carène d'un navire)
        val carenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "carénerai" to "carènerai",
            "caréneras" to "carèneras",
            "carénera" to "carènera",
            "carénerons" to "carènerons",
            "carénerez" to "carènerez",
            "caréneront" to "carèneront",

            // Conditionnel Présent
            "carénerais" to "carènerais",
            "carénerait" to "carènerait",
            "carénerions" to "carènerions",
            "caréneriez" to "carèneriez",
            "caréneraient" to "carèneraient"
        )

        // Ceder (Action relative au verbe ceder)
        val cederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "céderai" to "cèderai",
            "céderas" to "cèderas",
            "cédera" to "cèdera",
            "céderons" to "cèderons",
            "céderez" to "cèderez",
            "céderont" to "cèderont",

            // Conditionnel Présent
            "céderais" to "cèderais",
            "céderait" to "cèderait",
            "céderions" to "cèderions",
            "céderiez" to "cèderiez",
            "céderaient" to "cèderaient"
        )
        // Célébrer (Fêter solennellement ; louer publiquement)
        val celebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "célébrerai" to "célèbrerai",
            "célébreras" to "célèbreras",
            "célébrera" to "célèbrera",
            "célébrerons" to "célèbrerons",
            "célébrerez" to "célèbrerez",
            "célébreront" to "célèbreront",

            // Conditionnel Présent
            "célébrerais" to "célèbrerais",
            "célébrerait" to "célèbrerait",
            "célébrerions" to "célèbrerions",
            "célébreriez" to "célèbreriez",
            "célébreraient" to "célèbreraient"
        )

        // Chronométrer (Mesurer le temps avec un chronomètre)
        val chronometrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "chronométrerai" to "chronomètrerai",
            "chronométreras" to "chronomètreras",
            "chronométrera" to "chronomètrera",
            "chronométrerons" to "chronomètrerons",
            "chronométrerez" to "chronomètrerez",
            "chronométreront" to "chronomètreront",

            // Conditionnel Présent
            "chronométrerais" to "chronomètrerais",
            "chronométrerait" to "chronomètrerait",
            "chronométrerions" to "chronomètrerions",
            "chronométreriez" to "chronomètreriez",
            "chronométreraient" to "chronomètreraient"
        )

        // Compénétrer (Pénétrer l'un dans l'autre)
        val compenetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "compénétrerai" to "compénètrerai",
            "compénétreras" to "compénètreras",
            "compénétrera" to "compénètrera",
            "compénétrerons" to "compénètrerons",
            "compénétrerez" to "compénètrerez",
            "compénétreront" to "compénètreront",

            // Conditionnel Présent
            "compénétrerais" to "compénètrerais",
            "compénétrerait" to "compénètrerait",
            "compénétrerions" to "compénètrerions",
            "compénétreriez" to "compénètreriez",
            "compénétreraient" to "compénètreraient"
        )

        // Concaténer (Relier au moins deux chaînes de caractères pour en former une seule)
        val concatenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "concaténerai" to "concatènerai",
            "concaténeras" to "concatèneras",
            "concaténera" to "concatènera",
            "concaténerons" to "concatènerons",
            "concaténerez" to "concatènerez",
            "concaténeront" to "concatèneront",

            // Conditionnel Présent
            "concaténerais" to "concatènerais",
            "concaténerait" to "concatènerait",
            "concaténerions" to "concatènerions",
            "concaténeriez" to "concatèneriez",
            "concaténeraient" to "concatèneraient"
        )

        // Conceder (Action relative au verbe conceder)
        val concederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "concéderai" to "concèderai",
            "concéderas" to "concèderas",
            "concédera" to "concèdera",
            "concéderons" to "concèderons",
            "concéderez" to "concèderez",
            "concéderont" to "concèderont",

            // Conditionnel Présent
            "concéderais" to "concèderais",
            "concéderait" to "concèderait",
            "concéderions" to "concèderions",
            "concéderiez" to "concèderiez",
            "concéderaient" to "concèderaient"
        )
        // Concélébrer (Célébrer la messe à plusieurs prêtres)
        val concelebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "concélébrerai" to "concélèbrerai",
            "concélébreras" to "concélèbreras",
            "concélébrera" to "concélèbrera",
            "concélébrerons" to "concélèbrerons",
            "concélébrerez" to "concélèbrerez",
            "concélébreront" to "concélèbreront",

            // Conditionnel Présent
            "concélébrerais" to "concélèbrerais",
            "concélébrerait" to "concélèbrerait",
            "concélébrerions" to "concélèbrerions",
            "concélébreriez" to "concélèbreriez",
            "concélébreraient" to "concélèbreraient"
        )

        // Coposseder (Action relative au verbe coposseder)
        val copossederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "coposséderai" to "copossèderai",
            "coposséderas" to "copossèderas",
            "copossédera" to "copossèdera",
            "coposséderons" to "copossèderons",
            "coposséderez" to "copossèderez",
            "coposséderont" to "copossèderont",

            // Conditionnel Présent
            "coposséderais" to "copossèderais",
            "coposséderait" to "copossèderait",
            "coposséderions" to "copossèderions",
            "coposséderiez" to "copossèderiez",
            "coposséderaient" to "copossèderaient"
        )

        // Cortéger (Accompagner en cortège)
        val cortegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "cortégerai" to "cortègerai",
            "cortégeras" to "cortègeras",
            "cortégera" to "cortègera",
            "cortégerons" to "cortègerons",
            "cortégerez" to "cortègerez",
            "cortégeront" to "cortègeront",

            // Conditionnel Présent
            "cortégerais" to "cortègerais",
            "cortégerait" to "cortègerait",
            "cortégerions" to "cortègerions",
            "cortégeriez" to "cortègeriez",
            "cortégeraient" to "cortègeraient"
        )

        // Crécher (Habiter, loger quelque part)
        val crecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "crécherai" to "crècherai",
            "crécheras" to "crècheras",
            "créchera" to "crèchera",
            "crécherons" to "crècherons",
            "crécherez" to "crècherez",
            "crécheront" to "crècheront",

            // Conditionnel Présent
            "crécherais" to "crècherais",
            "crécherait" to "crècherait",
            "crécherions" to "crècherions",
            "crécheriez" to "crècheriez",
            "crécheraient" to "crècheraient"
        )

        // Crémer (Devenir crémeux ou ajouter de la crème)
        val cremerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "crémerai" to "crèmerai",
            "crémeras" to "crèmeras",
            "crémera" to "crèmera",
            "crémerons" to "crèmerons",
            "crémerez" to "crèmerez",
            "crémeront" to "crèmeront",

            // Conditionnel Présent
            "crémerais" to "crèmerais",
            "crémerait" to "crèmerait",
            "crémerions" to "crèmerions",
            "crémeriez" to "crèmeriez",
            "crémeraient" to "crèmeraient"
        )

        // Créner (Pratiquer un cran dans un caractère d'imprimerie)
        val crenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "crénerai" to "crènerai",
            "créneras" to "crèneras",
            "crénera" to "crènera",
            "crénerons" to "crènerons",
            "crénerez" to "crènerez",
            "créneront" to "crèneront",

            // Conditionnel Présent
            "crénerais" to "crènerais",
            "crénerait" to "crènerait",
            "crénerions" to "crènerions",
            "créneriez" to "crèneriez",
            "créneraient" to "crèneraient"
        )

        // Deceder (Action relative au verbe deceder)
        val decederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décéderai" to "décèderai",
            "décéderas" to "décèderas",
            "décédera" to "décèdera",
            "décéderons" to "décèderons",
            "décéderez" to "décèderez",
            "décéderont" to "décèderont",

            // Conditionnel Présent
            "décéderais" to "décèderais",
            "décéderait" to "décèderait",
            "décéderions" to "décèderions",
            "décéderiez" to "décèderiez",
            "décéderaient" to "décèderaient"
        )
        // Décérébrer (Supprimer les fonctions cérébrales)
        val decerebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décérébrerai" to "décérèbrerai",
            "décérébreras" to "décérèbreras",
            "décérébrera" to "décérèbrera",
            "décérébrerons" to "décérèbrerons",
            "décérébrerez" to "décérèbrerez",
            "décérébreront" to "décérèbreront",

            // Conditionnel Présent
            "décérébrerais" to "décérèbrerais",
            "décérébrait" to "décérèbreait",
            "décérébrerions" to "décérèbrerions",
            "décérébreriez" to "décérèbreriez",
            "décérébreraient" to "décérèbreraient"
        )

        // Décher (Être dans la misère, déchoir - argotique)
        val decherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décherai" to "dècherai",
            "décheras" to "dècheras",
            "déchera" to "dèchera",
            "décherons" to "dècherons",
            "décherez" to "dècherez",
            "décheront" to "dècheront",

            // Conditionnel Présent
            "décherais" to "dècherais",
            "décherait" to "dècherait",
            "décherions" to "dècherions",
            "décheriez" to "dècheriez",
            "décheraient" to "dècheraient"
        )

        // Deleguer (Action relative au verbe deleguer)
        val deleguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déléguerai" to "délèguerai",
            "délégueras" to "délègueras",
            "déléguera" to "délèguera",
            "déléguerons" to "délèguerons",
            "déléguerez" to "délèguerez",
            "délégueront" to "délègueront",

            // Conditionnel Présent
            "déléguerais" to "délèguerais",
            "déléguerait" to "délèguait",
            "déléguerions" to "délèguerions",
            "délégueriez" to "délègueriez",
            "délégueraient" to "délègueraient"
        )
        // Deposseder (Action relative au verbe deposseder)
        val depossederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déposséderai" to "dépossèderai",
            "déposséderas" to "dépossèderas",
            "dépossédera" to "dépossèdera",
            "déposséderons" to "dépossèderons",
            "déposséderez" to "dépossèderez",
            "déposséderont" to "dépossèderont",

            // Conditionnel Présent
            "déposséderais" to "dépossèderais",
            "déposséderait" to "dépossèderait",
            "déposséderions" to "dépossèderions",
            "déposséderiez" to "dépossèderiez",
            "déposséderaient" to "dépossèderaient"
        )
        // Deproteger (Action relative au verbe deproteger)
        val deprotegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déprotégerai" to "déprotègerai",
            "déprotégeras" to "déprotègeras",
            "déprotégera" to "déprotègera",
            "déprotégerons" to "déprotègerons",
            "déprotégerez" to "déprotègerez",
            "déprotégeront" to "déprotègeront",

            // Conditionnel Présent
            "déprotégerais" to "déprotègerais",
            "déprotégerait" to "déprotègerait",
            "déprotégerions" to "déprotègerions",
            "déprotégeriez" to "déprotègeriez",
            "déprotégeraient" to "déprotègeraient"
        )
        // Dérégler (Rompre le mécanisme d'un appareil ; troubler un ordre)
        val dereglerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déréglerai" to "dérèglerai",
            "dérégleras" to "dérègleras",
            "déréglera" to "dérèglera",
            "déréglerons" to "dérèglerons",
            "déréglerez" to "dérèglerez",
            "dérégleront" to "dérègleront",

            // Conditionnel Présent
            "déréglerais" to "dérèglerais",
            "déréglerait" to "dérèglerait",
            "déréglerions" to "déréglerions",
            "dérégleriez" to "dérégleriez",
            "dérégleraient" to "dérègleraient"
        )

        // Desagreger (Action relative au verbe desagreger)
        val desagregerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désagrégerai" to "désagrègerai",
            "désagrégeras" to "désagrègeras",
            "désagrégera" to "désagrègera",
            "désagrégerons" to "désagrègerons",
            "désagrégerez" to "désagrègerez",
            "désagrégeront" to "désagrègeront",

            // Conditionnel Présent
            "désagrégerais" to "désagrègerais",
            "désagrégerait" to "désagrègerait",
            "désagrégerions" to "désagrègerions",
            "désagrégeriez" to "désagrègeriez",
            "désagrégeraient" to "désagrègeraient"
        )
        // Désaliéner (Libérer de l'aliénation)
        val desalienerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désaliénerai" to "désaliènerai",
            "désaliéneras" to "désalièneras",
            "désaliénera" to "désaliènera",
            "désaliénerons" to "désaliènerons",
            "désaliénerez" to "désaliènerez",
            "désaliéneront" to "désalièneront",

            // Conditionnel Présent
            "désaliénerais" to "désaliènerais",
            "désaliénerait" to "désaliènerait",
            "désaliénerions" to "désaliènerions",
            "désaliéneriez" to "désalièneriez",
            "désaliéneraient" to "désalièneraient"
        )

        // Déshalogéner (Éliminer un halogène d'un composé)
        val deshalogenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déshalogénerai" to "déshalogènerai",
            "déshalogéneras" to "déshalogèneras",
            "déshalogénera" to "déshalogènera",
            "déshalogénerons" to "déshalogènerons",
            "déshalogénerez" to "déshalogènerez",
            "déshalogéneront" to "déshalogèneront",

            // Conditionnel Présent
            "déshalogénerais" to "déshalogènerais",
            "déshalogénerait" to "déshalogènerait",
            "déshalogénerions" to "déshalogènerions",
            "déshalogéneriez" to "déshalogèneriez",
            "déshalogéneraient" to "déshalogèneraient"
        )

        // Déshydrogéner (Enlever de l'hydrogène à un corps)
        val deshydrogenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déshydrogénerai" to "déshydrogènerai",
            "déshydrogéneras" to "déshydrogèneras",
            "déshydrogénera" to "déshydrogènera",
            "déshydrogénerons" to "déshydrogènerons",
            "déshydrogénerez" to "déshydrogènerez",
            "déshydrogéneront" to "déshydrogèneront",

            // Conditionnel Présent
            "déshydrogénerais" to "déshydrogènerais",
            "déshydrogénerait" to "déshydrogènerait",
            "déshydrogénerions" to "déshydrogènerions",
            "déshydrogéneriez" to "déshydrogèneriez",
            "déshydrogéneraient" to "déshydrogèneraient"
        )

        // Déshypothéquer (Lever une hypothèque)
        val deshypothequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déshypothéquerai" to "déshypothèquerai",
            "déshypothéqueras" to "déshypothèqueras",
            "déshypothéquera" to "déshypothèquera",
            "déshypothéquerons" to "déshypothèquerons",
            "déshypothéquerez" to "déshypothèquerez",
            "déshypothéqueront" to "déshypothèqueront",

            // Conditionnel Présent
            "déshypothéquerais" to "déshypothèquerais",
            "déshypothéquerait" to "déshypothèquerait",
            "déshypothéquerions" to "déshypothèquerions",
            "déshypothéqueriez" to "déshypothèqueriez",
            "déshypothéqueraient" to "déshypothèqueraient"
        )

        // Désintégrer (Réduire en particules élémentaires ; détruire totalement)
        val desintegrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désintégrerai" to "désintègrerai",
            "désintégreras" to "désintègreras",
            "désintégrera" to "désintègrera",
            "désintégrerons" to "désintègrerons",
            "désintégrerez" to "désintègrerez",
            "désintégreront" to "désintègreront",

            // Conditionnel Présent
            "désintégrerais" to "désintègrerais",
            "désintégrerait" to "désintègrerait",
            "désintégrerions" to "désintègrerions",
            "désintégreriez" to "désintègreriez",
            "désintégreraient" to "désintègreraient"
        )

        // Désoxygéner (Priver d'oxygène)
        val desoxygenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désoxygénerai" to "désoxygènerai",
            "désoxygéneras" to "désoxygèneras",
            "désoxygénera" to "désoxygènera",
            "désoxygénerons" to "désoxygènerons",
            "désoxygénerez" to "désoxygènerez",
            "désoxygéneront" to "désoxygèneront",

            // Conditionnel Présent
            "désoxygénerais" to "désoxygènerais",
            "désoxygénerait" to "désoxygènerait",
            "désoxygénerions" to "désoxygènerions",
            "désoxygéneriez" to "désoxygèneriez",
            "désoxygéneraient" to "désoxygèneraient"
        )

        // Dessécher (Rendre très sec ; priver d'eau ou de sève)
        val dessecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "dessécherai" to "dessècherai",
            "dessécheras" to "dessècheras",
            "desséchera" to "dessèchera",
            "dessécherons" to "dessècherons",
            "dessécherez" to "dessècherez",
            "dessécheront" to "dessècheront",

            // Conditionnel Présent
            "dessécherais" to "dessècherais",
            "dessécherait" to "dessècherait",
            "dessécherions" to "dessècherions",
            "dessécheriez" to "dessècheriez",
            "dessécheraient" to "dessècheraient"
        )

        // Desséver (Priver de sève ; faire sécher le bois)
        val desseverModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "desséverai" to "dessèverai",
            "desséveras" to "dessèveras",
            "dessévera" to "dessèvera",
            "desséverons" to "dessèverons",
            "desséverez" to "dessèverez",
            "desséveront" to "dessèveront",

            // Conditionnel Présent
            "desséverais" to "dessèverais",
            "desséverait" to "dessèverait",
            "desséverions" to "dessèverions",
            "desséveriez" to "dessèveriez",
            "desséveraient" to "dessèveraient"
        )

        // Diéser (Hausser une note d'un demi-ton)
        val dieserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "diéserai" to "dièserai",
            "diéseras" to "dièseras",
            "diésera" to "dièsera",
            "diéserons" to "dièserons",
            "diéserez" to "dièserez",
            "diéseront" to "dièseront",

            // Conditionnel Présent
            "diéserais" to "dièserais",
            "diéserait" to "dièserait",
            "diéserions" to "dièserions",
            "diéseriez" to "dièseriez",
            "diéseraient" to "dièseraient"
        )

        // Disséquer (Ouvrir un corps pour en étudier les parties ; analyser minutieusement)
        val dissequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "disséquerai" to "dissèquerai",
            "disséqueras" to "dissèqueras",
            "disséquera" to "dissèquera",
            "disséquerons" to "dissèquerons",
            "disséquerez" to "dissèquerez",
            "disséqueront" to "dissèqueront",

            // Conditionnel Présent
            "disséquerais" to "dissèquerais",
            "disséquerait" to "dissèquerait",
            "disséquerions" to "dissèquerions",
            "disséqueriez" to "dissèqueriez",
            "disséqueraient" to "dissèqueraient"
        )

        // Ébrécher (Faire une brèche ; endommager le bord d'un objet)
        val ebrecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "ébrécherai" to "ébrècherai",
            "ébrécheras" to "ébrècheras",
            "ébréchera" to "ébrèchera",
            "ébrécherons" to "ébrècherons",
            "ébrécherez" to "ébrècherez",
            "ébrécheront" to "ébrécheront",

            // Conditionnel Présent
            "ébrécherais" to "ébrècherais",
            "ébrécherait" to "ébrècherait",
            "ébrécherions" to "ébrécherions",
            "ébrécheriez" to "ébrécheriez",
            "ébrécheraient" to "ébrècheraient"
        )

        // Écher (Terme de pêche : garnir l'hameçon d'un appât)
        val echerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "écherai" to "ècherai",
            "écheras" to "ècheras",
            "échera" to "èchera",
            "écherons" to "ècherons",
            "écherez" to "ècherez",
            "écheront" to "ècheront",

            // Conditionnel Présent
            "écherais" to "ècherais",
            "écherait" to "ècherait",
            "écherions" to "écherions",
            "écheriez" to "écheriez",
            "écheraient" to "ècheraient"
        )

        // Écrémer (Enlever la crème du lait ; au figuré, choisir le meilleur)
        val ecremerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "écrémerai" to "écrèmerai",
            "écrémeras" to "écrèmeras",
            "écrémera" to "écrèmera",
            "écrémerons" to "écrèmerons",
            "écrémerez" to "écrèmerez",
            "écrémeront" to "écrèmeront",

            // Conditionnel Présent
            "écrémerais" to "écrèmerais",
            "écrémerait" to "écrèmerait",
            "écrémerions" to "écrèmerions",
            "écrémeriez" to "écrèmeriez",
            "écrémeraient" to "écrèmeraient"
        )
        // Émécher (Ouvrir légèrement une mèche de cheveux ; être ivre)
        val emecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "émécherai" to "émècherai",
            "émécheras" to "émècheras",
            "éméchera" to "émèchera",
            "émécherons" to "émècherons",
            "émécherez" to "émècherez",
            "émécheront" to "émécheront",

            // Conditionnel Présent
            "émécherais" to "émècherais",
            "émécherait" to "émècherait",
            "émécherions" to "emecherions",
            "émécheriez" to "emecheriez",
            "émécheraient" to "émècheraient"
        )

        // Emmétrer (Plier une étoffe par longueurs d'un mètre)
        val emmetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "emmétrerai" to "emmètrerai",
            "emmétreras" to "emmètreras",
            "emmétrera" to "emmètrera",
            "emmétrerons" to "emmètrerons",
            "emmétrerez" to "emmètrerez",
            "emmétreront" to "emmétreront",

            // Conditionnel Présent
            "emmétrerais" to "emmètrerais",
            "emmétrerait" to "emmètrerait",
            "emmétrerions" to "emmetrerions",
            "emmétreriez" to "emmetreriez",
            "emmétreraient" to "emmètreraient"
        )

        // Empeguer (Action relative au verbe empeguer)
        val empeguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "empéguerai" to "empèguerai",
            "empégueras" to "empègueras",
            "empéguera" to "empèguera",
            "empéguerons" to "empèguerons",
            "empéguerez" to "empèguerez",
            "empégueront" to "empègueront",

            // Conditionnel Présent
            "empéguerais" to "empèguerais",
            "empéguerait" to "empèguerait",
            "empéguerions" to "empèguerions",
            "empégueriez" to "empègueriez",
            "empégueraient" to "empègueraient"
        )
        // Empieger (Action relative au verbe empieger)
        val empiegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "empiégerai" to "empiègerai",
            "empiégeras" to "empiègeras",
            "empiégera" to "empiègera",
            "empiégerons" to "empiègerons",
            "empiégerez" to "empiègerez",
            "empiégeront" to "empiègeront",

            // Conditionnel Présent
            "empiégerais" to "empiègerais",
            "empiégerait" to "empiègerait",
            "empiégerions" to "empiègerions",
            "empiégeriez" to "empiègeriez",
            "empiégeraient" to "empiègeraient"
        )
        // Enfiévrer (Mettre dans un état de fièvre ou d'excitation)
        val enfievrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "enfiévrerai" to "enfièvrerai",
            "enfiévreras" to "enfièvreras",
            "enfiévrera" to "enfièvrera",
            "enfiévrerons" to "enfièvrerons",
            "enfiévrerez" to "enfièvrerez",
            "enfiévreront" to "enfièvreront",

            // Conditionnel Présent
            "enfiévrerais" to "enfièvrerais",
            "enfiévrerait" to "enfièvrerait",
            "enfiévrerions" to "enfièvrerions",
            "enfiévreriez" to "enfièvreriez",
            "enfiévreraient" to "enfièvreraient"
        )

        // Enflécher (Garnir les haubans de fils de caret pour former des échelons)
        val enflecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "enflécherai" to "enflècherai",
            "enflécheras" to "enflècheras",
            "enfléchera" to "enflèchera",
            "enflécherons" to "enflècherons",
            "enflécherez" to "enflècherez",
            "enflécheront" to "enflécheront",

            // Conditionnel Présent
            "enflécherais" to "enflècherais",
            "enflécherait" to "enflècherait",
            "enflécherions" to "enflecherions",
            "enflécheriez" to "enflecheriez",
            "enflécheraient" to "enflècheraient"
        )

        // Enténébrer (Plonger dans les ténèbres ; obscurcir)
        val entenebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "enténébrerai" to "enténèbrerai",
            "enténébreras" to "enténèbreras",
            "enténébrera" to "enténèbrera",
            "enténébrerons" to "enténèbrerons",
            "enténébrerez" to "enténèbrerez",
            "enténébreront" to "enténébreront",

            // Conditionnel Présent
            "enténébrerais" to "enténèbrerais",
            "enténébrerait" to "enténèbrerait",
            "enténébrerions" to "entenebrerions",
            "enténébreriez" to "entenebreriez",
            "enténébreraient" to "enténèbreraient"
        )

        // Entrepénétrer (Pénétrer mutuellement)
        val entrepenetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "entrepénétrerai" to "entrepénètrerai",
            "entrepénétreras" to "entrepénètreras",
            "entrepénétrera" to "entrepénètrera",
            "entrepénétrerons" to "entrepénètrerons",
            "entrepénétrerez" to "entrepénètrerez",
            "entrepénétreront" to "entrepénètreront",

            // Conditionnel Présent
            "entrepénétrerais" to "entrepénètrerais",
            "entrepénétrerait" to "entrepénètrerait",
            "entrepénétrerions" to "entrepénètrerions",
            "entrepénétreriez" to "entrepénètreriez",
            "entrepénétreraient" to "entrepénètreraient"
        )

        // Épécler (Briser, mettre en pièces - régionalisme)
        val epeclerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "épéclerai" to "épèclerai",
            "épécleras" to "épècleras",
            "épéclera" to "épèclera",
            "épéclerons" to "épèclerons",
            "épéclerez" to "épèclerez",
            "épécleront" to "épécleront",

            // Conditionnel Présent
            "épéclerais" to "épèclerais",
            "épéclerait" to "épèclerait",
            "épéclerions" to "épeclerions",
            "épécleriez" to "épecleriez",
            "épécleraient" to "épècleraient"
        )

        // Escabécher (Préparer du poisson en marinade d'escabèche)
        val escabecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "escabécherai" to "escabècherai",
            "escabécheras" to "escabècheras",
            "escabéchera" to "escabèchera",
            "escabécherons" to "escabècherons",
            "escabécherez" to "escabècherez",
            "escabécheront" to "escabécheront",

            // Conditionnel Présent
            "escabécherais" to "escabècherais",
            "escabécherait" to "escabècherait",
            "escabécherions" to "escabecherions",
            "escabécheriez" to "escabecheriez",
            "escabécheraient" to "escabècheraient"
        )

        // Étréper (Débarrasser un terrain de sa couche superficielle, de ses landes)
        val etreperModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "étréperai" to "étrèperai",
            "étréperas" to "étrèperas",
            "étrépera" to "étrèpera",
            "étréperons" to "étrèperons",
            "étréperez" to "étrèperez",
            "étréperont" to "étrèperont",

            // Conditionnel Présent
            "étréperais" to "étrèperais",
            "étréperait" to "étrèperait",
            "étréperions" to "étrèperions",
            "étréperiez" to "étrèperiez",
            "étréperaient" to "étrèperaient"
        )

        // Exceder (Action relative au verbe exceder)
        val excederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "excéderai" to "excèderai",
            "excéderas" to "excèderas",
            "excédera" to "excèdera",
            "excéderons" to "excèderons",
            "excéderez" to "excèderez",
            "excéderont" to "excèderont",

            // Conditionnel Présent
            "excéderais" to "excèderais",
            "excéderait" to "excèderait",
            "excéderions" to "excèderions",
            "excéderiez" to "excèderiez",
            "excéderaient" to "excèderaient"
        )
        // Exécrer (Éprouver une haine violente pour quelqu'un ou quelque chose)
        val execrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "exécrerai" to "exècrerai",
            "exécreras" to "exècreras",
            "exécrera" to "exècrera",
            "exécrerons" to "exècrerons",
            "exécrerez" to "exècrerez",
            "exécreront" to "exécreront",

            // Conditionnel Présent
            "exécrerais" to "exècrerais",
            "exécrerait" to "exècrerait",
            "exécrerions" to "execrerions",
            "exécreriez" to "execreriez",
            "exécreraient" to "exècreraient"
        )

        // Exhereder (Action relative au verbe exhereder)
        val exherederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "exhéréderai" to "exhèrederai",
            "exhéréderas" to "exhèrederas",
            "exhérédera" to "exhèredera",
            "exhéréderons" to "exhèrederons",
            "exhéréderez" to "exhèrederez",
            "exhéréderont" to "exhèrederont",

            // Conditionnel Présent
            "exhéréderais" to "exhèrederais",
            "exhéréderait" to "exhèrederait",
            "exhéréderions" to "exhèrederions",
            "exhéréderiez" to "exhèrederiez",
            "exhéréderaient" to "exhèrederaient"
        )
        // Flécher (Marquer d'une flèche ; percer d'une flèche)
        val flecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "flécherai" to "flècherai",
            "flécheras" to "flècheras",
            "fléchera" to "flèchera",
            "flécherons" to "flècherons",
            "flécherez" to "flècherez",
            "flécheront" to "flécheront",

            // Conditionnel Présent
            "flécherais" to "flècherais",
            "flécherait" to "flècherait",
            "flécherions" to "flecherions",
            "flécheriez" to "flecheriez",
            "flécheraient" to "flècheraient"
        )

        // Déféquer (Expulser les matières fécales)
        val defequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déféquerai" to "défèquerai",
            "déféqueras" to "défèqueras",
            "déféquera" to "défèquera",
            "déféquerons" to "défèquerons",
            "déféquerez" to "défèquerez",
            "déféqueront" to "défèqueront",
            // Conditionnel Présent
            "déféquerais" to "défèquerais",
            "déféquerait" to "défèquerait",
            "déféquerions" to "défèquerions",
            "déféqueriez" to "défèqueriez",
            "déféqueraient" to "défèqueraient"
        )

        // Dépiécer (Mettre en pièces)
        val depiecerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "dépiécerai" to "dépiècerai",
            "dépiéceras" to "dépièceras",
            "dépiécera" to "dépiècera",
            "dépiécerons" to "dépiècerons",
            "dépiécerez" to "dépiècerez",
            "dépiéceront" to "dépièceront",
            // Conditionnel Présent
            "dépiécerais" to "dépiècerais",
            "dépiécerait" to "dépiècerait",
            "dépiécerions" to "dépiècerions",
            "dépiéceriez" to "dépièceriez",
            "dépiéceraient" to "dépièceraient"
        )

        // Dépréder (Piller, commettre des déprédations)
        val deprederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "dépréderai" to "déprèderai",
            "dépréderas" to "déprèderas",
            "déprédera" to "déprèdera",
            "dépréderons" to "déprèderons",
            "dépréderez" to "déprèderez",
            "dépréderont" to "déprèderont",
            // Conditionnel Présent
            "dépréderais" to "déprèderais",
            "dépréderait" to "déprèderait",
            "dépréderions" to "déprèderions",
            "dépréderiez" to "déprèderiez",
            "dépréderaient" to "déprèderaient"
        )



        // Détréper (Retirer le trépier / terme technique)
        val detreperModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "détréperai" to "détrèperai",
            "détréperas" to "détrèperas",
            "détrépera" to "détrèpera",
            "détréperons" to "détrèperons",
            "détréperez" to "détrèperez",
            "détréperont" to "détrèperont",
            // Conditionnel Présent
            "détréperais" to "détrèperais",
            "détréperait" to "détrèperait",
            "détréperions" to "détrèperions",
            "détréperiez" to "détrèperiez",
            "détréperaient" to "détrèperaient"
        )


        // Exubérer (Manifester avec excès)
        val exubererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "exubérerai" to "exubèrerai",
            "exubéreras" to "exubèreras",
            "exubérera" to "exubèrera",
            "exubérerons" to "exubèrerons",
            "exubérerez" to "exubèrerez",
            "exubéreront" to "exubéreront",
            // Conditionnel Présent
            "exubérerais" to "exubèrerais",
            "exubérerait" to "exubèrerait",
            "exubérerions" to "exubèrerions",
            "exubéreriez" to "exubèreriez",
            "exubéreraient" to "exubèreraient"
        )

        // Foéner (Harponner avec une foène)
        val foenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "foénerai" to "foènerai",
            "foéneras" to "foèneras",
            "foénera" to "foènera",
            "foénerons" to "foènerons",
            "foénerez" to "foènerez",
            "foéneront" to "foéneront",
            // Conditionnel Présent
            "foénerais" to "foènerais",
            "foénerait" to "foènerait",
            "foénerions" to "foènerions",
            "foéneriez" to "foèneriez",
            "foéneraient" to "foèneraient"
        )

        // Gangréner (Produire la gangrène)
        val gangrenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "gangrénerai" to "gangrènerai",
            "gangréneras" to "gangrèneras",
            "gangrénera" to "gangrènera",
            "gangrénerons" to "gangrènerons",
            "gangrénerez" to "gangrènerez",
            "gangréneront" to "gangréneront",
            // Conditionnel Présent
            "gangrénerais" to "gangrènerais",
            "gangrénerait" to "gangrènerait",
            "gangrénerions" to "gangrènerions",
            "gangréneriez" to "gangrèneriez",
            "gangréneraient" to "gangrèneraient"
        )

        // Gréver (Frapper d'une charge financière)
        val greverModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "gréverai" to "grèverai",
            "gréveras" to "grèveras",
            "grévera" to "grèvera",
            "gréverons" to "grèverons",
            "gréverez" to "grèverez",
            "gréveront" to "grèveront",
            // Conditionnel Présent
            "gréverais" to "grèverais",
            "gréverait" to "grèverait",
            "gréverions" to "grèverions",
            "gréveriez" to "grèveriez",
            "gréveraient" to "grèveraient"
        )

        // Galejer (Action relative au verbe galejer)
        val galejerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "galéjerai" to "galèjerai",
            "galéjeras" to "galèjeras",
            "galéjera" to "galèjera",
            "galéjerons" to "galèjerons",
            "galéjerez" to "galèjerez",
            "galéjeront" to "galèjeront",

            // Conditionnel Présent
            "galéjerais" to "galèjerais",
            "galéjerait" to "galèjerait",
            "galéjerions" to "galèjerions",
            "galéjeriez" to "galèjeriez",
            "galéjeraient" to "galèjeraient"
        )

        // Gégéner (Soumettre à la gégène / Torturer)
        val gegenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "gégénerai" to "gégènerai",
            "gégéneras" to "gégèneras",
            "gégénera" to "gégènera",
            "gégénerons" to "gégènerons",
            "gégénerez" to "gégènerez",
            "gégéneront" to "gégèneront",
            // Conditionnel Présent
            "gégénerais" to "gégènerais",
            "gégénerait" to "gégènerait",
            "gégénerions" to "gégènerions",
            "gégéneriez" to "gégèneriez",
            "gégéneraient" to "gégèneraient"
        )

        // Mécéner (Soutenir en tant que mécène)
        val mecenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "mécénerai" to "mécènerai",
            "mécéneras" to "mécèneras",
            "mécénera" to "mécènera",
            "mécénerons" to "mécènerons",
            "mécénerez" to "mécènerez",
            "mécéneront" to "mécèneront",
            // Conditionnel Présent
            "mécénerais" to "mécènerais",
            "mécénerait" to "mécènerait",
            "mécénerions" to "mécènerions",
            "mécéneriez" to "mécèneriez",
            "mécéneraient" to "mécèneraient"
        )

        // Parenthéser (Mettre entre parenthèses)
        val parentheserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "parenthéserai" to "parenthèserai",
            "parenthéseras" to "parenthèseras",
            "parenthésera" to "parenthèsera",
            "parenthéserons" to "parenthèserons",
            "parenthéserez" to "parenthèserez",
            "parenthéseront" to "parenthèseront",
            // Conditionnel Présent
            "parenthéserais" to "parenthèserais",
            "parenthéserait" to "parenthèserait",
            "parenthéserions" to "parenthèserions",
            "parenthéseriez" to "parenthèseriez",
            "parenthéseraient" to "parenthèseraient"
        )

        // Préléguer (Léguer par préciput)
        val preleguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "préléguerai" to "prélèguerai",
            "prélégueras" to "prélègueras",
            "préléguera" to "prélèguera",
            "préléguerons" to "prélèguerons",
            "préléguerez" to "prélèguerez",
            "prélégueront" to "prélègueront",
            // Conditionnel Présent
            "préléguerais" to "prélèguerais",
            "préléguerait" to "prélèquerait",
            "préléguerions" to "prélèguerions",
            "prélégueriez" to "prélègueriez",
            "prélégueraient" to "prélègueraient"
        )

        // Rebéquer (Répliquer avec insolence)
        val rebequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rebéquerai" to "rebèquerai",
            "rebéqueras" to "rebèqueras",
            "rebéquera" to "rebèquera",
            "rebéquerons" to "rebèquerons",
            "rebéquerez" to "rebèquerez",
            "rebéqueront" to "rebèqueront",
            // Conditionnel Présent
            "rebéquerais" to "rebèquerais",
            "rebéquerait" to "rebèquerait",
            "rebéquerions" to "rebèquerions",
            "rebéqueriez" to "rebèqueriez",
            "rebéqueraient" to "rebèqueraient"
        )

        // Rengréger (Aggraver un mal, une douleur)
        val regregerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rengrégerai" to "rengrègerai",
            "rengrégeras" to "rengrègeras",
            "rengrégera" to "rengrègera",
            "rengrégerons" to "rengrègerons",
            "rengrégerez" to "rengrègerez",
            "rengrégeront" to "rengrègeront",
            // Conditionnel Présent
            "rengrégerais" to "rengrègerais",
            "rengrégerait" to "rengrègerait",
            "rengrégerions" to "rengrègerions",
            "rengrégeriez" to "rengrègeriez",
            "rengrégeraient" to "rengrègeraient"
        )

        // Rengréner (Engréner de nouveau / Remettre dans l'engrenage)
        val regrenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rengrénerai" to "rengrènerai",
            "rengréneras" to "rengrèneras",
            "rengrénera" to "rengrènera",
            "rengrénerons" to "rengrènerons",
            "rengrénerez" to "rengrènerez",
            "rengréneront" to "rengrèneront",
            // Conditionnel Présent
            "rengrénerais" to "rengrènerais",
            "rengrénerait" to "rengrènerait",
            "rengrénerions" to "rengrènerions",
            "rengréneriez" to "rengrèneriez",
            "rengréneraient" to "rengrèneraient"
        )

        // Reposséder (Posséder de nouveau)
        val repossederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "reposséderai" to "repossèderai",
            "reposséderas" to "repossèderas",
            "repossédera" to "repossèdera",
            "reposséderons" to "repossèderons",
            "reposséderez" to "repossèderez",
            "reposséderont" to "repossèderont",
            // Conditionnel Présent
            "reposséderais" to "repossèderais",
            "reposséderait" to "repossèderait",
            "reposséderions" to "repossèderions",
            "reposséderiez" to "repossèderiez",
            "reposséderaient" to "repossèderaient"
        )

        // Réengréner (Engréner une nouvelle fois)
        val reengrenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réengrénerai" to "réengrènerai",
            "réengréneras" to "réengrèneras",
            "réengrénera" to "réengrènera",
            "réengrénerons" to "réengrènerons",
            "réengrénerez" to "réengrènerez",
            "réengréneront" to "réengrèneront",
            // Conditionnel Présent
            "réengrénerais" to "réengrènerais",
            "réengrénerait" to "réengrènerait",
            "réengrénerions" to "réengrènerions",
            "réengréneriez" to "réengrèneriez",
            "réengréneraient" to "réengrèneraient"
        )

        // Siréner (Action d'utiliser une sirène / Terme technique)
        val sirenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sirénerai" to "sirènerai",
            "siréneras" to "sirèneras",
            "sirénera" to "sirènera",
            "sirénerons" to "sirènerons",
            "sirénerez" to "sirènerez",
            "siréneront" to "sirèneront",
            // Conditionnel Présent
            "sirénerais" to "sirènerais",
            "sirénerait" to "sirènerait",
            "sirénerions" to "sirènerions",
            "siréneriez" to "sirèneriez",
            "siréneraient" to "sirèneraient"
        )


        // Sous-déléguer (Déléguer à son tour)
        val sousDeleguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sous-déléguerai" to "sous-délèguerai",
            "sous-délégueras" to "sous-délègueras",
            "sous-déléguera" to "sous-délèguera",
            "sous-déléguerons" to "sous-délèguerons",
            "sous-déléguerez" to "sous-délèguerez",
            "sous-délégueront" to "sous-délègueront",
            // Conditionnel Présent
            "sous-déléguerais" to "sous-délèguerais",
            "sous-déléguerait" to "sous-délèguerait",
            "sous-déléguerions" to "sous-délèguerions",
            "sous-délégueriez" to "sous-délègueriez",
            "sous-délégueraient" to "sous-délègueraient"
        )

        // Ségréger (Mettre à part / Pratiquer la ségrégation)
        val segregerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "ségrégerai" to "ségrègerai",
            "ségrégeras" to "ségrègeras",
            "ségrégera" to "ségrègera",
            "ségrégerons" to "ségrègerons",
            "ségrégerez" to "ségrègerez",
            "ségrégeront" to "ségrègeront",
            // Conditionnel Présent
            "ségrégerais" to "ségrègerais",
            "ségrégerait" to "ségrègerait",
            "ségrégerions" to "ségrègerions",
            "ségrégeriez" to "ségrègeriez",
            "ségrégeraient" to "ségrègeraient"
        )
        // Abequer / Abéquer (Donner la becquée)
        val abequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "abéquerai" to "abèquerai",
            "abéqueras" to "abèqueras",
            "abéquera" to "abèquera",
            "abéquerons" to "abèquerons",
            "abéquerez" to "abèquerez",
            "abéqueront" to "abèqueront",
            // Conditionnel Présent
            "abéquerais" to "abèquerais",
            "abéquerait" to "abèquerait",
            "abéquerions" to "abèquerions",
            "abéqueriez" to "abèqueriez",
            "abéqueraient" to "abèqueraient"
        )

        // Écéper (Couper le pied d'un arbre / Évincer)
        val eceperModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "écéperai" to "écèperai",
            "écéperas" to "écèperas",
            "écépera" to "écèpera",
            "écéperons" to "écèperons",
            "écéperez" to "écèperez",
            "écéperont" to "écèperont",
            // Conditionnel Présent
            "écéperais" to "écèperais",
            "écéperait" to "écèperait",
            "écéperions" to "écèperions",
            "écéperiez" to "écèperiez",
            "écéperaient" to "écèperaient"
        )

        // Égréser (Polir le verre ou le marbre avec du grès)
        val egreserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "égréserai" to "égrèserai",
            "égréseras" to "égrèseras",
            "égrésera" to "égrèsera",
            "égréserons" to "égrèserons",
            "égréserez" to "égrèserez",
            "égréseront" to "égrèseront",
            // Conditionnel Présent
            "égréserais" to "égrèserais",
            "égréserait" to "égrèserait",
            "égréserions" to "égrèserions",
            "égréseriez" to "égrèseriez",
            "égréseraient" to "égrèseraient"
        )


        // Gléner (Terme de marine : lover un cordage)
        val glenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "glénerai" to "glènerai",
            "gléneras" to "glèneras",
            "glénera" to "glènera",
            "glénerons" to "glènerons",
            "glénerez" to "glènerez",
            "gléneront" to "glèneront",

            // Conditionnel Présent
            "glénerais" to "glènerais",
            "glénerait" to "glènerait",
            "glénerions" to "glènerions",
            "gléneriez" to "glèneriez",
            "gléneraient" to "glèneraient"
        )

        // Gréser (Façonner le bord d'un verre, d'un vitrail)
        val greserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "gréserai" to "grèserai",
            "gréseras" to "grèseras",
            "grésera" to "grèsera",
            "gréserons" to "grèserons",
            "gréserez" to "grèserez",
            "gréseront" to "grèseront",

            // Conditionnel Présent
            "gréserais" to "grèserais",
            "gréserait" to "grèserait",
            "gréserions" to "grèserions",
            "gréseriez" to "grèseriez",
            "gréseraient" to "grèseraient"
        )

        // Halogéner (Introduire un halogène dans une molécule)
        val halogenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "halogénerai" to "halogènerai",
            "halogéneras" to "halogèneras",
            "halogénera" to "halogènera",
            "halogénerons" to "halogènerons",
            "halogénerez" to "halogènerez",
            "halogéneront" to "halogèneront",

            // Conditionnel Présent
            "halogénerais" to "halogènerais",
            "halogénerait" to "halogènerait",
            "halogénerions" to "halogènerions",
            "halogéneriez" to "halogèneriez",
            "halogéneraient" to "halogèneraient"
        )

        // Hydrogéner (Combiner avec de l'hydrogène)
        val hydrogenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "hydrogénerai" to "hydrogènerai",
            "hydrogéneras" to "hydrogèneras",
            "hydrogénera" to "hydrogènera",
            "hydrogénerons" to "hydrogènerons",
            "hydrogénerez" to "hydrogènerez",
            "hydrogéneront" to "hydrogèneront",

            // Conditionnel Présent
            "hydrogénerais" to "hydrogènerais",
            "hydrogénerait" to "hydrogènerait",
            "hydrogénerions" to "hydrogènerions",
            "hydrogéneriez" to "hydrogèneriez",
            "hydrogéneraient" to "hydrogèneraient"
        )

        // Hypothéquer (Gager un immeuble pour la sûreté d'une créance ; compromettre)
        val hypothequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "hypothéquerai" to "hypothèquerai",
            "hypothéqueras" to "hypothèqueras",
            "hypothéquera" to "hypothèquera",
            "hypothéquerons" to "hypothèquerons",
            "hypothéquerez" to "hypothèquerez",
            "hypothéqueront" to "hypothèqueront",

            // Conditionnel Présent
            "hypothéquerais" to "hypothèquerais",
            "hypothéquerait" to "hypothèquerait",
            "hypothéquerions" to "hypothèquerions",
            "hypothéqueriez" to "hypothèqueriez",
            "hypothéqueraient" to "hypothèqueraient"
        )

        // Impétrer (Obtenir une grâce, un diplôme, un privilège de l'autorité)
        val impetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "impétrerai" to "impètrerai",
            "impétreras" to "impètreras",
            "impétrera" to "impètrera",
            "impétrerons" to "impètrerons",
            "impétrerez" to "impètrerez",
            "impétreront" to "impétreront",

            // Conditionnel Présent
            "impétrerais" to "impètrerais",
            "impétrerait" to "impètrerait",
            "impétrerions" to "impetrerions",
            "impétreriez" to "impetreriez",
            "impétreraient" to "impètreraient"
        )

        // Imprégner (Pénétrer un corps de sa substance ; influencer fortement)
        val impregnerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "imprégnerai" to "imprègnerai",
            "imprégneras" to "imprègneras",
            "impréguera" to "imprègnera",
            "imprégnerons" to "imprègnerons",
            "imprégnerez" to "imprègnerez",
            "imprégneront" to "impregnéront",

            // Conditionnel Présent
            "imprégnerais" to "imprègnerais",
            "imprégnerait" to "imprègnerait",
            "imprégnerions" to "impregnérions",
            "imprégneriez" to "impregnériez",
            "imprégneraient" to "imprègneraient"
        )

        // Intégrer (Faire entrer dans un ensemble ; assimiler)
        val integrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "intégrerai" to "intègrerai",
            "intégreras" to "intègreras",
            "intégrera" to "intègrera",
            "intégrerons" to "intègrerons",
            "intégrerez" to "intègrerez",
            "intégreront" to "intègreront",

            // Conditionnel Présent
            "intégrerais" to "intègrerais",
            "intégrerait" to "intègrerait",
            "intégrerions" to "intègrerions",
            "intégreriez" to "intègreriez",
            "intégreraient" to "intègreraient"
        )

        // Interceder (Action relative au verbe interceder)
        val intercederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "intercéderai" to "intercèderai",
            "intercéderas" to "intercèderas",
            "intercédera" to "intercèdera",
            "intercéderons" to "intercèderons",
            "intercéderez" to "intercèderez",
            "intercéderont" to "intercèderont",

            // Conditionnel Présent
            "intercéderais" to "intercèderais",
            "intercéderait" to "intercèderait",
            "intercéderions" to "intercèderions",
            "intercéderiez" to "intercèderiez",
            "intercéderaient" to "intercèderaient"
        )
        // Interpénétrer (Pénétrer mutuellement)
        val interpenetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "interpénétrerai" to "interpénètrerai",
            "interpénétreras" to "interpénètreras",
            "interpénétrera" to "interpénètrera",
            "interpénétrerons" to "interpénètrerons",
            "interpénétrerez" to "interpénètrerez",
            "interpénétreront" to "interpénétreront",

            // Conditionnel Présent
            "interpénétrerais" to "interpénètrerais",
            "interpénétrerait" to "interpénètrerait",
            "interpénétrerions" to "interpénétrerions",
            "interpénétreriez" to "interpénétreriez",
            "interpénétreraient" to "interpénètreraient"
        )

        // Kilométrer (Mesurer en kilomètres ; marquer les kilomètres)
        val kilometrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "kilométrerai" to "kilomètrerai",
            "kilométreras" to "kilomètreras",
            "kilométrera" to "kilomètrera",
            "kilométrerons" to "kilomètrerons",
            "kilométrerez" to "kilomètrerez",
            "kilométreront" to "kilomètreront",

            // Conditionnel Présent
            "kilométrerais" to "kilomètrerais",
            "kilométrerait" to "kilomètrerait",
            "kilométrerions" to "kilométrerions",
            "kilométreriez" to "kilométreriez",
            "kilométreraient" to "kilomètreraient"
        )

        // Lécher (Passer la langue sur quelque chose ; finir avec un soin minutieux)
        val lecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "lécherai" to "lècherai",
            "lécheras" to "lècheras",
            "léchera" to "lèchera",
            "lécherons" to "lècherons",
            "lécherez" to "lècherez",
            "lécheront" to "lècheront",

            // Conditionnel Présent
            "lécherais" to "lècherais",
            "lécherait" to "lècherait",
            "lécherions" to "lecherions",
            "lécheriez" to "lecheriez",
            "lécheraient" to "lècheraient"
        )

        // Leguer (Action relative au verbe leguer)
        val leguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "léguerai" to "lèguerai",
            "légueras" to "lègueras",
            "léguera" to "lèguera",
            "léguerons" to "lèguerons",
            "léguerez" to "lèguerez",
            "légueront" to "lègueront",

            // Conditionnel Présent
            "léguerais" to "lèguerais",
            "léguerait" to "lèguerait",
            "léguerions" to "lèguerions",
            "légueriez" to "lègueriez",
            "légueraient" to "lègueraient"
        )
        // Léser (Causer un préjudice, blesser)
        val leserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "léserai" to "lèserai",
            "léseras" to "lèseras",
            "lésera" to "lèsera",
            "léserons" to "lèserons",
            "léserez" to "lèserez",
            "léseront" to "lèseront",

            // Conditionnel Présent
            "léserais" to "lèserais",
            "léserait" to "lèserait",
            "léserions" to "lèserions",
            "léseriez" to "lèseriez",
            "léseraient" to "lèseraient"
        )

        // Lieger (Action relative au verbe lieger)
        val liegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "liégerai" to "liègerai",
            "liégeras" to "liègeras",
            "liégera" to "liègera",
            "liégerons" to "liègerons",
            "liégerez" to "liègerez",
            "liégeront" to "liègeront",

            // Conditionnel Présent
            "liégerais" to "liègerais",
            "liégerait" to "liègerait",
            "liégerions" to "liègerions",
            "liégeriez" to "liègeriez",
            "liégeraient" to "liègeraient"
        )
        // Maneger (Action relative au verbe maneger)
        val manegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "manégerai" to "manègerai",
            "manégeras" to "manègeras",
            "manégera" to "manègera",
            "manégerons" to "manègerons",
            "manégerez" to "manègerez",
            "manégeront" to "manègeront",

            // Conditionnel Présent
            "manégerais" to "manègerais",
            "manégerait" to "manègerait",
            "manégerions" to "manègerions",
            "manégeriez" to "manègeriez",
            "manégeraient" to "manègeraient"
        )
        // Masteguer (Action relative au verbe masteguer)
        val masteguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "mastéguerai" to "mastèguerai",
            "mastégueras" to "mastègueras",
            "mastéguera" to "mastèguera",
            "mastéguerons" to "mastèguerons",
            "mastéguerez" to "mastèguerez",
            "mastégueront" to "mastègueront",

            // Conditionnel Présent
            "mastéguerais" to "mastèguerais",
            "mastéguerait" to "mastèguerait",
            "mastéguerions" to "mastèguerions",
            "mastégueriez" to "mastègueriez",
            "mastégueraient" to "mastègueraient"
        )
        // Mécher (Garnir d'une mèche ; traiter une futaille au soufre)
        val mecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "mécherai" to "mècherai",
            "mécheras" to "mècheras",
            "méchera" to "mèchera",
            "mécherons" to "mècherons",
            "mécherez" to "mècherez",
            "mécheront" to "mècheront",

            // Conditionnel Présent
            "mécherais" to "mècherais",
            "mécherait" to "mècherait",
            "mécherions" to "mecherions",
            "mécheriez" to "mecheriez",
            "mécheraient" to "mècheraient"
        )

        // Métrer (Mesurer à l'aide du mètre)
        val metrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "métrerai" to "mètrerai",
            "métreras" to "mètreras",
            "métrera" to "mètrera",
            "métrerons" to "mètrerons",
            "métrerez" to "mètrerez",
            "métreront" to "mètreront",

            // Conditionnel Présent
            "métrerais" to "mètrerais",
            "métrerait" to "mètrerait",
            "métrerions" to "metrerions",
            "métreriez" to "metreriez",
            "métreraient" to "mètreraient"
        )

        // Millimétrer (Mesurer au millimètre ; préparer avec une extrême précision)
        val millimetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "millimétrerai" to "millimètrerai",
            "millimétreras" to "millimètreras",
            "millimétrera" to "millimètrera",
            "millimétrerons" to "millimètrerons",
            "millimétrerez" to "millimètrerez",
            "millimétreront" to "millimétreront",

            // Conditionnel Présent
            "millimétrerais" to "millimètrerais",
            "millimétrerait" to "millimètrerait",
            "millimétrerions" to "millimetrerions",
            "millimétreriez" to "millimetreriez",
            "millimétreraient" to "millimètreraient"
        )

        // Morigéner (Réprimander quelqu'un en lui faisant la leçon)
        val morigenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "morigénerai" to "morigènerai",
            "morigéneras" to "morigèneras",
            "morigénera" to "morigènera",
            "morigénerons" to "morigènerons",
            "morigénerez" to "morigènerez",
            "morigéneront" to "morigèneront",

            // Conditionnel Présent
            "morigénerais" to "morigènerais",
            "morigénerait" to "morigènerait",
            "morigénerions" to "morigènerions",
            "morigéneriez" to "morigèneriez",
            "morigéneraient" to "morigèneraient"
        )

        // Obseder (Action relative au verbe obseder)
        val obsederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "obséderai" to "obsèderai",
            "obséderas" to "obsèderas",
            "obsédera" to "obsèdera",
            "obséderons" to "obsèderons",
            "obséderez" to "obsèderez",
            "obséderont" to "obsèderont",

            // Conditionnel Présent
            "obséderais" to "obsèderais",
            "obséderait" to "obsèderait",
            "obséderions" to "obsèderions",
            "obséderiez" to "obsèderiez",
            "obséderaient" to "obsèderaient"
        )
        // Orfévrer (Travailler une pièce à la manière d'un orfèvre)
        val orfevrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "orfévrerai" to "orfèvrerai",
            "orfévreras" to "orfèvreras",
            "orfévrera" to "orfèvrera",
            "orfévrerons" to "orfèvrerons",
            "orfévrerez" to "orfèvrerez",
            "orfévreront" to "orfévreront",

            // Conditionnel Présent
            "orfévrerais" to "orfèvrerais",
            "orfévrerait" to "orfèvrerait",
            "orfévrerions" to "orfevrerions",
            "orfévreriez" to "orfevreriez",
            "orfévreraient" to "orfèvreraient"
        )

        // Oxygéner (Combiner avec de l'oxygène, soumettre à l'action de l'oxygène)
        val oxygenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "oxygénerai" to "oxygènerai",
            "oxygéneras" to "oxygèneras",
            "oxygénera" to "oxygènera",
            "oxygénerons" to "oxygènerons",
            "oxygénerez" to "oxygènerez",
            "oxygéneront" to "oxygèneront",

            // Conditionnel Présent
            "oxygénerais" to "oxygènerais",
            "oxygénerait" to "oxygènerait",
            "oxygénerions" to "oxygènerions",
            "oxygéneriez" to "oxygèneriez",
            "oxygéneraient" to "oxygèneraient"
        )

        // Paramétrer (Définir des paramètres ; configurer un logiciel)
        val parametrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "paramétrerai" to "paramètrerai",
            "paramétreras" to "paramètreras",
            "paramétrera" to "paramètrera",
            "paramétrerons" to "paramètrerons",
            "paramétrerez" to "paramètrerez",
            "paramétreront" to "paramétreront",

            // Conditionnel Présent
            "paramétrerais" to "paramètrerais",
            "paramétrerait" to "paramètrerait",
            "paramétrerions" to "parametrerions",
            "paramétreriez" to "parametreriez",
            "paramétreraient" to "paramètreraient"
        )

        // Pécher (Commettre un péché ; manquer à une règle)
        val pecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "pécherai" to "pècherai",
            "pécheras" to "pècheras",
            "péchera" to "pèchera",
            "pécherons" to "pècherons",
            "pécherez" to "pècherez",
            "pécheront" to "pècheront",

            // Conditionnel Présent
            "pécherais" to "pècherais",
            "pécherait" to "pècherait",
            "pécherions" to "pècherions",
            "pécheriez" to "pècheriez",
            "pécheraient" to "pècheraient"
        )

        // Peguer (Action relative au verbe peguer)
        val peguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "péguerai" to "pèguerai",
            "pégueras" to "pègueras",
            "péguera" to "pèguera",
            "péguerons" to "pèguerons",
            "péguerez" to "pèguerez",
            "pégueront" to "pègueront",

            // Conditionnel Présent
            "péguerais" to "pèguerais",
            "péguerait" to "pèguerait",
            "péguerions" to "pèguerions",
            "pégueriez" to "pègueriez",
            "pégueraient" to "pègueraient"
        )
        // Pénétrer (Entrer dans ; passer à travers)
        val penetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "pénétrerai" to "pénètrerai",
            "pénétreras" to "pénètreras",
            "pénétrera" to "pénètrera",
            "pénétrerons" to "pénètrerons",
            "pénétrerez" to "pénètrerez",
            "pénétreront" to "pénètreront",

            // Conditionnel Présent
            "pénétrerais" to "pénètrerais",
            "pénétrerait" to "pénètrerait",
            "pénétrerions" to "pénètrerions",
            "pénétreriez" to "pénètreriez",
            "pénétreraient" to "pénètreraient"
        )

        // Perpétrer (Commettre un acte criminel ou malfaisant)
        val perpetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "perpétrerai" to "perpètrerai",
            "perpétreras" to "perpètreras",
            "perpétrera" to "perpètrera",
            "perpétrerons" to "perpètrerons",
            "perpétrerez" to "perpètrerez",
            "perpétreront" to "perpètreront",

            // Conditionnel Présent
            "perpétrerais" to "perpètrerais",
            "perpétrerait" to "perpètrerait",
            "perpétrerions" to "perpètrerions",
            "perpétreriez" to "perpètreriez",
            "perpétreraient" to "perpètreraient"
        )

        // Pieger (Action relative au verbe pieger)
        val piegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "piégerai" to "piègerai",
            "piégeras" to "piègeras",
            "piégera" to "piègera",
            "piégerons" to "piègerons",
            "piégerez" to "piègerez",
            "piégeront" to "piègeront",

            // Conditionnel Présent
            "piégerais" to "piègerais",
            "piégerait" to "piègerait",
            "piégerions" to "piègerions",
            "piégeriez" to "piègeriez",
            "piégeraient" to "piègeraient"
        )
        // Posseder (Action relative au verbe posseder)
        val possederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "posséderai" to "possèderai",
            "posséderas" to "possèderas",
            "possédera" to "possèdera",
            "posséderons" to "possèderons",
            "posséderez" to "possèderez",
            "posséderont" to "possèderont",

            // Conditionnel Présent
            "posséderais" to "possèderais",
            "posséderait" to "possèderait",
            "posséderions" to "possèderions",
            "posséderiez" to "possèderiez",
            "posséderaient" to "possèderaient"
        )
        // Pourlécher (Lécher avec insistance ; se réjouir d'avance)
        val pourlecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "pourlécherai" to "pourlècherai",
            "pourlécheras" to "pourlècheras",
            "pourléchera" to "pourlèchera",
            "pourlécherons" to "pourlècherons",
            "pourlécherez" to "pourlècherez",
            "pourlécheront" to "pourlécheront",

            // Conditionnel Présent
            "pourlécherais" to "pourlècherais",
            "pourlécherait" to "pourlècherait",
            "pourlécherions" to "pourlecherions",
            "pourlécheriez" to "pourlecheriez",
            "pourlécheraient" to "pourlècheraient"
        )

        // Preceder (Action relative au verbe preceder)
        val precederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "précéderai" to "précèderai",
            "précéderas" to "précèderas",
            "précédera" to "précèdera",
            "précéderons" to "précèderons",
            "précéderez" to "précèderez",
            "précéderont" to "précèderont",

            // Conditionnel Présent
            "précéderais" to "précèderais",
            "précéderait" to "précèderait",
            "précéderions" to "précèderions",
            "précéderiez" to "précèderiez",
            "précéderaient" to "précèderaient"
        )
        // Predeceder (Action relative au verbe predeceder)
        val predecederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "prédécéderai" to "prédécèderai",
            "prédécéderas" to "prédécèderas",
            "prédécédera" to "prédécèdera",
            "prédécéderons" to "prédécèderons",
            "prédécéderez" to "prédécèderez",
            "prédécéderont" to "précèderont",

            // Conditionnel Présent
            "prédécéderais" to "prédécèderais",
            "prédécéderait" to "prédécèderait",
            "prédécéderions" to "prédécèderions",
            "prédécéderiez" to "prédécèderiez",
            "prédécéderaient" to "prédécèderaient"
        )
        // Prérégler (Régler à l'avance)
        val prereglerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "préréglerai" to "prérèglerai",
            "prérégleras" to "prérègleras",
            "préréglera" to "prérèglera",
            "préréglerons" to "prérèglerons",
            "préréglererez" to "prérèglerez",
            "prérégleront" to "prérègleront",

            // Conditionnel Présent
            "préréglerais" to "prérèglerais",
            "préréglerait" to "prérèglerait",
            "préréglerions" to "prereglerions",
            "prérégleriez" to "preregleriez",
            "prérégleraient" to "prérègleraient"
        )

        // Proceder (Action relative au verbe proceder)
        val procederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "procéderai" to "procèderai",
            "procéderas" to "procèderas",
            "procédera" to "procèdera",
            "procéderons" to "procèderons",
            "procéderez" to "procèderez",
            "procéderont" to "procèderont",

            // Conditionnel Présent
            "procéderais" to "procèderais",
            "procéderait" to "procèderait",
            "procéderions" to "procèderions",
            "procéderiez" to "procèderiez",
            "procéderaient" to "procèderaient"
        )
        // Proteger (Action relative au verbe proteger)
        val protegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "protégerai" to "protègerai",
            "protégeras" to "protègeras",
            "protégera" to "protègera",
            "protégerons" to "protègerons",
            "protégerez" to "protègerez",
            "protégeront" to "protègeront",

            // Conditionnel Présent
            "protégerais" to "protègerais",
            "protégerait" to "protègerait",
            "protégerions" to "protègerions",
            "protégeriez" to "protègeriez",
            "protégeraient" to "protègeraient"
        )
        // Ralleger (Action relative au verbe ralleger)
        val rallegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rallégerai" to "rallègerai",
            "rallégeras" to "rallègeras",
            "rallégera" to "rallègera",
            "rallégerons" to "rallègerons",
            "rallégerez" to "rallègerez",
            "rallégeront" to "rallègeront",

            // Conditionnel Présent
            "rallégerais" to "rallègerais",
            "rallégerait" to "rallègerait",
            "rallégerions" to "rallègerions",
            "rallégeriez" to "rallègeriez",
            "rallégeraient" to "rallègeraient"
        )
        // Rapiecer (Action relative au verbe rapiecer)
        val rapiecerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rapiécerai" to "rapiècerai",
            "rapiéceras" to "rapièceras",
            "rapiécera" to "rapiècera",
            "rapiécerons" to "rapiècerons",
            "rapiécerez" to "rapiècerez",
            "rapiéceront" to "rapièceront",

            // Conditionnel Présent
            "rapiécerais" to "rapiècerais",
            "rapiécerait" to "rapiècerait",
            "rapiécerions" to "rapiècerions",
            "rapiéceriez" to "rapièceriez",
            "rapiéceraient" to "rapièceraient"
        )
        // Rasséréner (Rendre son calme, sa sérénité)
        val rasserenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rassérénerai" to "rassérènerai",
            "rasséréneras" to "rassérèneras",
            "rassérénera" to "rassérènera",
            "rassérénerons" to "rassérènerons",
            "rassérénerez" to "rassérènerez",
            "rasséréneront" to "rassérèneront",

            // Conditionnel Présent
            "rassérénerais" to "rassérènerais",
            "rassérénerait" to "rassérènerait",
            "rassérénerions" to "rassérènerions",
            "rasséréneriez" to "rassérèneriez",
            "rasséréneraient" to "rassérèneraient"
        )

        // Réaléser (Aléser de nouveau)
        val realeserModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réaléserai" to "réalèserai",
            "réaléseras" to "réalèseras",
            "réalésera" to "réalèsera",
            "réaléserons" to "réalèserons",
            "réaléserez" to "réalèserez",
            "réaléseront" to "réalèseront",

            // Conditionnel Présent
            "réaléserais" to "réalèserais",
            "réaléserait" to "réalèserait",
            "réaléserions" to "réaléserions",
            "réaléseriez" to "réalèseriez",
            "réaléseraient" to "réalèseraient"
        )

        // Receder (Action relative au verbe receder)
        val recederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "recéderai" to "recèderai",
            "recéderas" to "recèderas",
            "recédera" to "recèdera",
            "recéderons" to "recèderons",
            "recéderez" to "recèderez",
            "recéderont" to "recèderont",

            // Conditionnel Présent
            "recéderais" to "recèderais",
            "recéderait" to "recèderait",
            "recéderions" to "recèderions",
            "recéderiez" to "recèderiez",
            "recéderaient" to "recèderaient"
        )
        // Recéper (Couper un arbre, une plante près du pied pour favoriser la repousse)
        val receperModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "recéperai" to "recèperai",
            "recéperas" to "recèperas",
            "recépera" to "recèpera",
            "recéperons" to "recèperons",
            "recéperez" to "recèperez",
            "recéperont" to "recèperont",

            // Conditionnel Présent
            "recéperais" to "recèperais",
            "recéperait" to "recèperait",
            "recéperions" to "recèperions",
            "recéperiez" to "recèperiez",
            "recéperaient" to "recèperaient"
        )
        // Refréner (Retenir, réprimer un sentiment ou un mouvement)
        val refrenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "refrénerai" to "refrènerai",
            "refréneras" to "refrèneras",
            "refrénera" to "refrènera",
            "refrénerons" to "refrènerons",
            "refrénerez" to "refrènerez",
            "refréneront" to "refrèneront",

            // Conditionnel Présent
            "refrénerais" to "refrènerais",
            "refrénerait" to "refrènerait",
            "refrénerions" to "refrènerions",
            "refréneriez" to "refrèneriez",
            "refréneraient" to "refrèneraient"
        )
        // Régler (Mettre en ordre ; ajuster un mécanisme ; payer)
        val reglerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réglerai" to "règlerai",
            "régleras" to "règleras",
            "réglera" to "règlera",
            "réglerons" to "règlerons",
            "réglerez" to "règlerez",
            "régleront" to "règleront",

            // Conditionnel Présent
            "réglerais" to "règlerais",
            "réglerait" to "règlerait",
            "réglerions" to "réglerions",
            "régleriez" to "régleriez",
            "régleraient" to "règleraient"
        )

        // Régner (Exercer le pouvoir souverain ; dominer)
        val regnerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "régnerai" to "règnerai",
            "régneras" to "règneras",
            "régnera" to "règnera",
            "régnerons" to "règnerons",
            "régnerez" to "règnerez",
            "régneront" to "règneront",

            // Conditionnel Présent
            "régnerais" to "règnerais",
            "régnerait" to "règnerait",
            "régnerions" to "regnerions",
            "régneriez" to "regneriez",
            "régneraient" to "règneraient"
        )

        // Réimprégner (Imprégner de nouveau)
        val reimpregnerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réimprégnerai" to "réimprègnerai",
            "réimprégneras" to "réimprègneras",
            "réimprégnera" to "réimprègnera",
            "réimprégnerons" to "réimprègnerons",
            "réimprégnerez" to "réimprègnerez",
            "réimprégneront" to "réimprègneront",

            // Conditionnel Présent
            "réimprégnerais" to "réimprègnerais",
            "réimprégnerait" to "réimprègnerait",
            "réimprégnerions" to "reimpregnerions",
            "réimprégneriez" to "reimpregneriez",
            "réimprégneraient" to "réimprègneraient"
        )

        // Réintégrer (Remettre dans un état, un lieu ou une fonction)
        val reintegrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réintégrerai" to "réintègrerai",
            "réintégreras" to "réintègreras",
            "réintégrera" to "réintègrera",
            "réintégrerons" to "réintègrerons",
            "réintégrerez" to "réintègrerez",
            "réintégreront" to "réintègreront",

            // Conditionnel Présent
            "réintégrerais" to "réintègrerais",
            "réintégrerait" to "réintègrerait",
            "réintégrerions" to "réintégrerions",
            "réintégreriez" to "réintégreriez",
            "réintégreraient" to "réintègreraient"
        )

        // Releguer (Action relative au verbe releguer)
        val releguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "reléguerai" to "relèguerai",
            "relégueras" to "relègueras",
            "reléguera" to "relèguera",
            "reléguerons" to "relèguerons",
            "reléguerez" to "relèguerez",
            "relégueront" to "relègueront",

            // Conditionnel Présent
            "reléguerais" to "relèguerais",
            "reléguerait" to "relèguerait",
            "reléguerions" to "relèguerions",
            "relégueriez" to "relègueriez",
            "relégueraient" to "relègueraient"
        )
        // Remécher (Mettre une nouvelle mèche)
        val remecherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "remécherai" to "remècherai",
            "remécheras" to "remècheras",
            "reméchera" to "remèchera",
            "remécherons" to "remècherons",
            "remécherez" to "remècherez",
            "remécheront" to "remécheront",

            // Conditionnel Présent
            "remécherais" to "remècherais",
            "remécherait" to "remècherait",
            "remécherions" to "remecherions",
            "remécheriez" to "remecheriez",
            "remécheraient" to "remècheraient"
        )

        // Réoxygéner (Oxygéner de nouveau)
        val reoxygenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réoxygénerai" to "réoxygènerai",
            "réoxygéneras" to "réoxygèneras",
            "réoxygénera" to "réoxygènera",
            "réoxygénerons" to "réoxygènerons",
            "réoxygénerez" to "réoxygènerez",
            "réoxygéneront" to "réoxygèneront",

            // Conditionnel Présent
            "réoxygénerais" to "réoxygènerais",
            "réoxygénerait" to "réoxygènerait",
            "réoxygénerions" to "réoxygènerions",
            "réoxygéneriez" to "réoxygèneriez",
            "réoxygéneraient" to "réoxygèneraient"
        )

        // Réséquer (Pratiquer l'ablation partielle ou totale d'un organe)
        val resequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réséquerai" to "résèquerai",
            "réséqueras" to "résèqueras",
            "réséquera" to "résèquera",
            "réséquerons" to "résèquerons",
            "réséquerez" to "résèquerez",
            "réséqueront" to "résèqueront",

            // Conditionnel Présent
            "réséquerais" to "résèquerais",
            "réséquerait" to "résèquerait",
            "réséquerions" to "résèquerions",
            "réséqueriez" to "résèqueriez",
            "réséqueraient" to "résèqueraient"
        )

        // Retroceder (Action relative au verbe retroceder)
        val retrocederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rétrocéderai" to "rétrocèderai",
            "rétrocéderas" to "rétrocèderas",
            "rétrocédera" to "rétrocèdera",
            "rétrocéderons" to "rétrocèderons",
            "rétrocéderez" to "rétrocèderez",
            "rétrocéderont" to "rétrocèderont",

            // Conditionnel Présent
            "rétrocéderais" to "rétrocèderais",
            "rétrocéderait" to "rétrocèderait",
            "rétrocéderions" to "rétrocèderions",
            "rétrocéderiez" to "rétrocèderiez",
            "rétrocéderaient" to "rétrocèderaient"
        )
        // Roumeguer (Action relative au verbe roumeguer)
        val roumeguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rouméguerai" to "roumèguerai",
            "roumégueras" to "roumègueras",
            "rouméguera" to "roumèguera",
            "rouméguerons" to "roumèguerons",
            "rouméguerez" to "roumèguerez",
            "roumégueront" to "roumègueront",

            // Conditionnel Présent
            "rouméguerais" to "roumèguerais",
            "rouméguerait" to "roumèguerait",
            "rouméguerions" to "roumèguerions",
            "roumégueriez" to "roumègueriez",
            "roumégueraient" to "roumègueraient"
        )
        // Sécher (Devenir ou rendre sec ; s'étioler)
        val secherModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sécherai" to "sècherai",
            "sécheras" to "sècheras",
            "séchera" to "sèchera",
            "sécherons" to "sècherons",
            "sécherez" to "sècherez",
            "sécheront" to "sècheront",

            // Conditionnel Présent
            "sécherais" to "sècherais",
            "sécherait" to "sècherait",
            "sécherions" to "secherions",
            "sécheriez" to "secheriez",
            "sécheraient" to "sècheraient"
        )

        // Segreguer (Action relative au verbe segreguer)
        val segreguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "ségréguerai" to "ségrèguerai",
            "ségrégueras" to "ségrègueras",
            "ségréguera" to "ségrèguera",
            "ségréguerons" to "ségrèguerons",
            "ségréguerez" to "ségrèguerez",
            "ségrégueront" to "ségrègueront",

            // Conditionnel Présent
            "ségréguerais" to "ségrèguerais",
            "ségréguerait" to "ségrèguerait",
            "ségréguerions" to "ségrèguerions",
            "ségrégueriez" to "ségrègueriez",
            "ségrégueraient" to "ségrègueraient"
        )
        // Sieger (Action relative au verbe sieger)
        val siegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "siégerai" to "siègerai",
            "siégeras" to "siègeras",
            "siégera" to "siègera",
            "siégerons" to "siègerons",
            "siégerez" to "siègerez",
            "siégeront" to "siègeront",

            // Conditionnel Présent
            "siégerais" to "siègerais",
            "siégerait" to "siègerait",
            "siégerions" to "siègerions",
            "siégeriez" to "siègeriez",
            "siégeraient" to "siègeraient"
        )
        // Subdeleguer (Action relative au verbe subdeleguer)
        val subdeleguerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "subdéléguerai" to "subdélèguerai",
            "subdélégueras" to "subdélègueras",
            "subdéléguera" to "subdélèguera",
            "subdéléguerons" to "subdélèguerons",
            "subdéléguerez" to "subdélèguerez",
            "subdélégueront" to "subdélègueront",

            // Conditionnel Présent
            "subdéléguerais" to "subdélèguerais",
            "subdéléguerait" to "subdélèguerait",
            "subdéléguerions" to "subdélèguerions",
            "subdélégueriez" to "subdélègueriez",
            "subdélégueraient" to "subdélègueraient"
        )
        // Succeder (Action relative au verbe succeder)
        val succederModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "succéderai" to "succèderai",
            "succéderas" to "succèderas",
            "succédera" to "succèdera",
            "succéderons" to "succèderons",
            "succéderez" to "succèderez",
            "succéderont" to "succèderont",

            // Conditionnel Présent
            "succéderais" to "succèderais",
            "succéderait" to "succèderait",
            "succéderions" to "succèderions",
            "succéderiez" to "succèderiez",
            "succéderaient" to "succèderaient"
        )
        // Suroxygéner (Oxygéner de manière excessive)
        val suroxygenerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "suroxygénerai" to "suroxygènerai",
            "suroxygéneras" to "suroxygèneras",
            "suroxygénera" to "suroxygènera",
            "suroxygénerons" to "suroxygènerons",
            "suroxygénerez" to "suroxygènerez",
            "suroxygéneront" to "suroxygèneront",

            // Conditionnel Présent
            "suroxygénerais" to "suroxygènerais",
            "suroxygénerait" to "suroxygènerait",
            "suroxygénerions" to "suroxygènerions",
            "suroxygéneriez" to "suroxygèneriez",
            "suroxygéneraient" to "suroxygèneraient"
        )

        // Surproteger (Action relative au verbe surproteger)
        val surprotegerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "surprotégerai" to "surprotègerai",
            "surprotégeras" to "surprotègeras",
            "surprotégera" to "surprotègera",
            "surprotégerons" to "surprotègerons",
            "surprotégerez" to "surprotègerez",
            "surprotégeront" to "surprotègeront",

            // Conditionnel Présent
            "surprotégerais" to "surprotègerais",
            "surprotégerait" to "surprotègerait",
            "surprotégerions" to "surprotègerions",
            "surprotégeriez" to "surprotègeriez",
            "surprotégeraient" to "surprotègeraient"
        )
        // Télémétrer (Mesurer une distance avec un télémètre)
        val telemetrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "télémétrerai" to "télémètrerai",
            "télémétreras" to "télémètreras",
            "télémétrera" to "télémètrera",
            "télémétrerons" to "télémètrerons",
            "télémétrerez" to "télémètrerez",
            "télémétreront" to "télémétreront",

            // Conditionnel Présent
            "télémétrerais" to "télémètrerais",
            "télémétrerait" to "télémètrerait",
            "télémétrerions" to "telemetrerions",
            "télémétreriez" to "telemetreriez",
            "télémétreraient" to "télémètreraient"
        )

        // Ténébrer (Rendre obscur ; plonger dans les ténèbres - rare)
        val tenebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "ténébrerai" to "ténèbrerai",
            "ténébreras" to "ténèbreras",
            "ténébrera" to "ténèbrera",
            "ténébrerons" to "ténèbrerons",
            "ténébrerez" to "ténèbrerez",
            "ténébreront" to "ténébreront",

            // Conditionnel Présent
            "ténébrerais" to "ténèbrerais",
            "ténébrerait" to "ténèbrerait",
            "ténébrerions" to "tenebrerions",
            "ténébreriez" to "tenebreriez",
            "ténébreraient" to "ténèbreraient"
        )

        // Térébrer (Percer au moyen d'un trépan)
        val terebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "térébrerai" to "térèbrerai",
            "térébreras" to "térèbreras",
            "térébrera" to "térèbrera",
            "térébrerons" to "térèbrerons",
            "térébrerez" to "térèbrerez",
            "térébreront" to "térébreront",

            // Conditionnel Présent
            "térébrerais" to "térèbrerais",
            "térébrerait" to "térèbrerait",
            "térébrerions" to "terebrerions",
            "térébreriez" to "terebreriez",
            "térébreraient" to "térèbreraient"
        )

        // Triséquer (Partager un angle en trois parties égales)
        val trisequerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "triséquerai" to "trisèquerai",
            "triséqueras" to "trisèqueras",
            "triséquera" to "trisèquera",
            "triséquerons" to "trisèquerons",
            "triséquerez" to "trisèquerez",
            "triséqueront" to "trisèqueront",

            // Conditionnel Présent
            "triséquerais" to "trisèquerais",
            "triséquerait" to "trisèquerait",
            "triséquerions" to "trisèquerions",
            "triséqueriez" to "trisèqueriez",
            "triséqueraient" to "trisèqueraient"
        )

        // Zébrer (Rayonner de zébrures ; marquer de raies)
        val zebrerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "zébrerai" to "zèbrerai",
            "zébreras" to "zèbreras",
            "zébrera" to "zèbrera",
            "zébrerons" to "zèbrerons",
            "zébrerez" to "zèbrerez",
            "zébreront" to "zèbreront",

            // Conditionnel Présent
            "zébrerais" to "zèbrerais",
            "zébrerait" to "zèbrerait",
            "zébrerions" to "zebrerions",
            "zébreriez" to "zebreriez",
            "zébreraient" to "zèbreraient"
        )
        // Faséyer (Battre au vent, pour une voile)
        val faseyerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "faséyerai" to "fasèyerai",
            "faséyeras" to "fasèyeras",
            "faséyera" to "fasèyera",
            "faséyerons" to "fasèyerons",
            "faséyerez" to "fasèyerez",
            "faséyeront" to "fasèyeront",
            // Conditionnel Présent
            "faséyerais" to "fasèyerais",
            "faséyerait" to "fasèyerait",
            "faséyerions" to "fasèyerions",
            "faséyeriez" to "fasèyeriez",
            "faséyeraient" to "fasèyeraient"
        )

        val exxer : Map<String, String> =
            abcederModifAccent +
                    abecherModifAccent +
                    abequerModifAccent +
                    abregerModifAccent +
                    accederModifAccent +
                    agregerModifAccent +
                    aleserModifAccent +
                    alienerModifAccent +
                    allecherModifAccent +
                    allegerModifAccent +
                    allegrerModifAccent +
                    alleguerModifAccent +
                    angleserModifAccent +
                    antecederModifAccent +
                    apiecerModifAccent +
                    apiegerModifAccent +
                    appiegerModifAccent +
                    arenerModifAccent +
                    arpegerModifAccent +
                    assecherModifAccent +
                    assenerModifAccent +
                    assiegerModifAccent +
                    autocelebrerModifAccent +
                    baremerModifAccent +
                    bequerModifAccent +
                    blasphemerModifAccent +
                    bleserModifAccent +
                    bouleguerModifAccent +
                    bregerModifAccent +
                    carenerModifAccent +
                    cederModifAccent +
                    celebrerModifAccent +
                    chronometrerModifAccent +
                    compenetrerModifAccent +
                    concatenerModifAccent +
                    concederModifAccent +
                    concelebrerModifAccent +
                    copossederModifAccent +
                    cortegerModifAccent +
                    crecherModifAccent +
                    cremerModifAccent +
                    crenerModifAccent +
                    decederModifAccent +
                    decerebrerModifAccent +
                    decherModifAccent +
                    defequerModifAccent +
                    deleguerModifAccent +
                    depiecerModifAccent +
                    depossederModifAccent +
                    deprederModifAccent +
                    deprotegerModifAccent +
                    dereglerModifAccent +
                    desagregerModifAccent +
                    desalienerModifAccent +
                    deshalogenerModifAccent +
                    deshydrogenerModifAccent +
                    deshypothequerModifAccent +
                    desintegrerModifAccent +
                    desoxygenerModifAccent +
                    dessecherModifAccent +
                    desseverModifAccent +
                    detreperModifAccent +
                    dieserModifAccent +
                    dissequerModifAccent +
                    ebrecherModifAccent +
                    eceperModifAccent +
                    echerModifAccent +
                    ecremerModifAccent +
                    egreserModifAccent +
                    emecherModifAccent +
                    emmetrerModifAccent +
                    empeguerModifAccent +
                    empiegerModifAccent +
                    enfievrerModifAccent +
                    enflecherModifAccent +
                    entenebrerModifAccent +
                    entrepenetrerModifAccent +
                    epeclerModifAccent +
                    escabecherModifAccent +
                    etreperModifAccent +
                    excederModifAccent +
                    execrerModifAccent +
                    exherederModifAccent +
                    exubererModifAccent +
                    faseyerModifAccent +
                    flecherModifAccent +
                    foenerModifAccent +
                    galejerModifAccent +
                    gangrenerModifAccent +
                    gegenerModifAccent +
                    glenerModifAccent +
                    greserModifAccent +
                    greverModifAccent +
                    halogenerModifAccent +
                    hydrogenerModifAccent +
                    hypothequerModifAccent +
                    impetrerModifAccent +
                    impregnerModifAccent +
                    integrerModifAccent +
                    intercederModifAccent +
                    interpenetrerModifAccent +
                    kilometrerModifAccent +
                    lecherModifAccent +
                    leguerModifAccent +
                    leserModifAccent +
                    liegerModifAccent +
                    manegerModifAccent +
                    masteguerModifAccent +
                    mecherModifAccent +
                    metrerModifAccent +
                    mecenerModifAccent +
                    millimetrerModifAccent +
                    morigenerModifAccent +
                    obsederModifAccent +
                    orfevrerModifAccent +
                    oxygenerModifAccent +
                    parametrerModifAccent +
                    parentheserModifAccent +
                    pecherModifAccent +
                    peguerModifAccent +
                    penetrerModifAccent +
                    perpetrerModifAccent +
                    piegerModifAccent +
                    possederModifAccent +
                    pourlecherModifAccent +
                    precederModifAccent +
                    predecederModifAccent +
                    preleguerModifAccent +
                    prereglerModifAccent +
                    procederModifAccent +
                    protegerModifAccent +
                    rallegerModifAccent +
                    rapiecerModifAccent +
                    rasserenerModifAccent +
                    realeserModifAccent +
                    rebequerModifAccent +
                    recederModifAccent +
                    receperModifAccent +
                    reengrenerModifAccent +
                    refrenerModifAccent +
                    reglerModifAccent +
                    regnerModifAccent +
                    regregerModifAccent +
                    regrenerModifAccent +
                    reimpregnerModifAccent +
                    reintegrerModifAccent +
                    releguerModifAccent +
                    remecherModifAccent +
                    reoxygenerModifAccent +
                    repossederModifAccent +
                    resequerModifAccent +
                    retrocederModifAccent +
                    roumeguerModifAccent +
                    secherModifAccent +
                    segregerModifAccent +
                    segreguerModifAccent +
                    siegerModifAccent +
                    sirenerModifAccent +
                    sousDeleguerModifAccent +
                    subdeleguerModifAccent +
                    succederModifAccent +
                    suroxygenerModifAccent +
                    surprotegerModifAccent +
                    telemetrerModifAccent +
                    tenebrerModifAccent +
                    terebrerModifAccent +
                    trisequerModifAccent +
                    zebrerModifAccent
    }
}