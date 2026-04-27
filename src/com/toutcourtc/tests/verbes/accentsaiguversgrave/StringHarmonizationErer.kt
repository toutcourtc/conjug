package com.toutcourtc.tests.verbes.accentsaiguversgrave

class StringHarmonizationErer {
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

        // Accélérer (Augmenter la vitesse)
        val accelererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "accélérerai" to "accèlérerai",
            "accéléreras" to "accèléreras",
            "accélérera" to "accèlérera",
            "accélérerons" to "accèlérerons",
            "accélérerez" to "accèlérerez",
            "accéléreront" to "accèléreront",

            // Conditionnel Présent
            "accélérerais" to "accèlérerais",
            "accélérerait" to "accèlérerait",
            "accélérerions" to "accèlérerions",
            "accéléreriez" to "accèléreriez",
            "accéléreraient" to "accèléreraient"
        )

        // Acérer (Rendre tranchant, pointu)
        val acererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "acérerai" to "acèrerai",
            "acéreras" to "acèreras",
            "acérera" to "acèrera",
            "acérerons" to "acèrerons",
            "acérerez" to "acèrerez",
            "acéreront" to "acèreront",

            // Conditionnel Présent
            "acérerais" to "acèrerais",
            "acérerait" to "acèrerait",
            "acérerions" to "acèrerions",
            "acéreriez" to "acèreriez",
            "acéreraient" to "acèreraient"
        )

        // Aciérer (Transformer du fer en acier)
        val aciererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "aciérerai" to "acièrerai",
            "aciéreras" to "acièreras",
            "aciérera" to "acièrera",
            "aciérerons" to "acièrerons",
            "aciérerez" to "acièrerez",
            "aciéreront" to "acièreront",

            // Conditionnel Présent
            "aciérerais" to "acièrerais",
            "aciérerait" to "acièrerait",
            "aciérerions" to "acièrerions",
            "aciéreriez" to "acièreriez",
            "aciéreraient" to "acièreraient"
        )

        // Adhérer (Être attaché à quelque chose ; donner son assentiment)
        val adhererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "adhérerai" to "adhèrerai",
            "adhéreras" to "adhèreras",
            "adhérera" to "adhèrera",
            "adhérerons" to "adhèrerons",
            "adhérerez" to "adhèrerez",
            "adhéreront" to "adhèreront",

            // Conditionnel Présent
            "adhérerais" to "adhèrerais",
            "adhérerait" to "adhèrerait",
            "adhérerions" to "adhèrerions",
            "adhéreriez" to "adhèreriez",
            "adhéreraient" to "adhèreraient"
        )

        // Adultérer (Modifier une substance par mélange pour la rendre impure)
        val adultererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "adultérerai" to "adultèrerai",
            "adultéreras" to "adultèreras",
            "adultérera" to "adultèrera",
            "adultérerons" to "adultèrerons",
            "adultérerez" to "adultèrerez",
            "adultéreront" to "adultèreront",

            // Conditionnel Présent
            "adultérerais" to "adultèrerais",
            "adultérerait" to "adultèrerait",
            "adultérerions" to "adultèrerions",
            "adultéreriez" to "adultèreriez",
            "adultéreraient" to "adultèreraient"
        )

        // Aérer (Exposer à l'air libre, renouveler l'air)
        val aererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "aérerai" to "aèrerai",
            "aéreras" to "aèreras",
            "aérera" to "aèrera",
            "aérerons" to "aèrerons",
            "aérerez" to "aèrerez",
            "aéreront" to "aèreront",

            // Conditionnel Présent
            "aérerais" to "aèrerais",
            "aérerait" to "aèrerait",
            "aérerions" to "aèrerions",
            "aéreriez" to "aèreriez",
            "aéreraient" to "aèreraient"
        )

        // Afférer (S'occuper avec activité ; s'empresser)
        val affererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "afférerai" to "affèrerai",
            "afféreras" to "affèreras",
            "afférera" to "affèrera",
            "afférerons" to "affèrerons",
            "afférerez" to "affèrerez",
            "afféreront" to "affèreront",

            // Conditionnel Présent
            "afférerais" to "affèrerais",
            "afférerait" to "affèrerait",
            "afférerions" to "affèrerions",
            "afféreriez" to "affèreriez",
            "afféreraient" to "affèreraient"
        )

        // Agglomérer (Réunir des éléments en une masse)
        val agglomererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "agglomérerai" to "agglomèrerai",
            "aggloméreras" to "agglomèreras",
            "agglomérera" to "agglomèrera",
            "agglomérerons" to "agglomèrerons",
            "agglomérerez" to "agglomèrerez",
            "aggloméreront" to "agglomèreront",

            // Conditionnel Présent
            "agglomérerais" to "agglomèrerais",
            "agglomérerait" to "agglomèrerait",
            "agglomérerions" to "agglomèrerions",
            "aggloméreriez" to "agglomèreriez",
            "aggloméreraient" to "agglomèreraient"
        )

        // Allitérer (Produire une allitération)
        val allitererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "allitérerai" to "allitèrerai",
            "allitéreras" to "allitèreras",
            "allitérera" to "allitèrera",
            "allitérerons" to "allitèrerons",
            "allitérerez" to "allitèrerez",
            "allitéreront" to "allitèreront",

            // Conditionnel Présent
            "allitérerais" to "allitèrerais",
            "allitérerait" to "allitèrerait",
            "allitérerions" to "allitèrerions",
            "allitéreriez" to "allitèreriez",
            "allitéreraient" to "allitèreraient"
        )

        // Altérer (Changer en mal ; modifier la substance)
        val altererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "altérerai" to "altèrerai",
            "altéreras" to "altèreras",
            "altérera" to "altèrera",
            "altérerons" to "altèrerons",
            "altérerez" to "altèrerez",
            "altéreront" to "altèreront",

            // Conditionnel Présent
            "altérerais" to "altèrerais",
            "altérerait" to "altèrerait",
            "altérerions" to "altèrerions",
            "altéreriez" to "altèreriez",
            "altéreraient" to "altèreraient"
        )


        // Arriérer (Retarder un paiement, une action)
        val arriererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "arriérerai" to "arrièrerai",
            "arriéreras" to "arrièreras",
            "arriérera" to "arrièrera",
            "arriérerons" to "arrièrerons",
            "arriérerez" to "arrièrerez",
            "arriéreront" to "arrièreront",

            // Conditionnel Présent
            "arriérerais" to "arrièrerais",
            "arriérerait" to "arrièrerait",
            "arriérerions" to "arrièrerions",
            "arriéreriez" to "arrièreriez",
            "arriéreraient" to "arrièreraient"
        )

        // Autogérer (Gérer soi-même une entreprise, une collectivité)
        val autogererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "autogérerai" to "autogèrerai",
            "autogéreras" to "autogèreras",
            "autogérera" to "autogèrera",
            "autogérerons" to "autogèrerons",
            "autogérerez" to "autogèrerez",
            "autogéreront" to "autogèreront",

            // Conditionnel Présent
            "autogérerais" to "autogèrerais",
            "autogérerait" to "autogèrerait",
            "autogérerions" to "autogèrerions",
            "autogéreriez" to "autogèreriez",
            "autogéreraient" to "autogèreraient"
        )

        // Avérer (Reconnaître ou établir comme vrai)
        val avererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "avérerai" to "avèrerai",
            "avéreras" to "avèreras",
            "avérera" to "avèrera",
            "avérerons" to "avèrerons",
            "avérerez" to "avèrerez",
            "avéreront" to "avèreront",

            // Conditionnel Présent
            "avérerais" to "avèrerais",
            "avérerait" to "avèrerait",
            "avérerions" to "avèrerions",
            "avéreriez" to "avèreriez",
            "avéreraient" to "avèreraient"
        )

        // Barriérer (Entourer ou fermer par des barrières)
        val barriererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "barriérerai" to "barrièrerai",
            "barriéreras" to "barrièreras",
            "barriérera" to "barrièrera",
            "barriérerons" to "barrièrerons",
            "barriérerez" to "barrièrerez",
            "barriéreront" to "barrièreront",

            // Conditionnel Présent
            "barriérerais" to "barrièrerais",
            "barriérerait" to "barrièrerait",
            "barriérerions" to "barrièrerions",
            "barriéreriez" to "barrièreriez",
            "barriéreraient" to "barrièreraient"
        )

        // Blatérer (Cri du chameau ou du dromadaire)
        val blatererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "blatérerai" to "blatèrerai",
            "blatéreras" to "blatèreras",
            "blatérera" to "blatèrera",
            "blatérerons" to "blatèrerons",
            "blatérerez" to "blatèrerez",
            "blatéreront" to "blatèreront",

            // Conditionnel Présent
            "blatérerais" to "blatèrerais",
            "blatérerait" to "blatèrerait",
            "blatérerions" to "blatèrerions",
            "blatéreriez" to "blatèreriez",
            "blatéreraient" to "blatèreraient"
        )

        // Cadavérer (Prendre l'aspect d'un cadavre)
        val cadavererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "cadavérerai" to "cadavèrerai",
            "cadavéreras" to "cadavèreras",
            "cadavérera" to "cadavèrera",
            "cadavérerons" to "cadavèrerons",
            "cadavérerez" to "cadavèrerez",
            "cadavéreront" to "cadavèreront",

            // Conditionnel Présent
            "cadavérerais" to "cadavèrerais",
            "cadavérerait" to "cadavèrerait",
            "cadavérerions" to "cadavèrerions",
            "cadavéreriez" to "cadavèreriez",
            "cadavéreraient" to "cadavèreraient"
        )

        // Camembérer (Sentir fort des pieds)
        val camembererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "camembérerai" to "camembèrerai",
            "camembéreras" to "camembèreras",
            "camembérera" to "camembèrera",
            "camembérerons" to "camembèrerons",
            "camembérerez" to "camembèrerez",
            "camembéreront" to "camembèreront",

            // Conditionnel Présent
            "camembérerais" to "camembèrerais",
            "camembérerait" to "camembèrerait",
            "camembérerions" to "camembèrerions",
            "camembéreriez" to "camembèreriez",
            "camembéreraient" to "camembèreraient"
        )

        // Chérer (Archaïsme/familier pour "vendre cher" ou "exagérer")
        val chererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "chérerai" to "chèrerai",
            "chéreras" to "chèreras",
            "chérera" to "chèrera",
            "chérerons" to "chèrerons",
            "chérerez" to "chèrerez",
            "chéreront" to "chèreront",

            // Conditionnel Présent
            "chérerais" to "chèrerais",
            "chérerait" to "chèrerait",
            "chérerions" to "chèrerions",
            "chéreriez" to "chèreriez",
            "chéreraient" to "chèreraient"
        )

        // Cogérer (Gérer en commun)
        val cogererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "cogérerai" to "cogèrerai",
            "cogéreras" to "cogèreras",
            "cogérera" to "cogèrera",
            "cogérerons" to "cogèrerons",
            "cogérerez" to "cogèrerez",
            "cogéreront" to "cogèreront",

            // Conditionnel Présent
            "cogérerais" to "cogèrerais",
            "cogérerait" to "cogèrerait",
            "cogérerions" to "cogèrerions",
            "cogéreriez" to "cogèreriez",
            "cogéreraient" to "cogèreraient"
        )

        // Cohérer (Présenter une cohésion)
        val cohererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "cohérerai" to "cohèrerai",
            "cohéreras" to "cohèreras",
            "cohérera" to "cohèrera",
            "cohérerons" to "cohèrerons",
            "cohérerez" to "cohèrerez",
            "cohéreront" to "cohèreront",

            // Conditionnel Présent
            "cohérerais" to "cohèrerais",
            "cohérerait" to "cohèrerait",
            "cohérerions" to "cohèrerions",
            "cohéreriez" to "cohèreriez",
            "cohéreraient" to "cohèreraient"
        )

        // Colérer (Se mettre en colère)
        val colererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "colérerai" to "colèrerai",
            "coléreras" to "colèreras",
            "colérera" to "colèrera",
            "colérerons" to "colèrerons",
            "colérerez" to "colèrerez",
            "coléreront" to "colèreront",

            // Conditionnel Présent
            "colérerais" to "colèrerais",
            "colérerait" to "colèrerait",
            "colérerions" to "colèrerions",
            "coléreriez" to "colèreriez",
            "coléreraient" to "colèreraient"
        )

        // Commérer (Faire des commérages, bavarder)
        val commererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "commérerai" to "commèrerai",
            "comméreras" to "commèreras",
            "commérera" to "commèrera",
            "commérerons" to "commèrerons",
            "commérerez" to "commèrerez",
            "comméreront" to "commèreront",

            // Conditionnel Présent
            "commérerais" to "commèrerais",
            "commérerait" to "commèrerait",
            "commérerions" to "commèrerions",
            "comméreriez" to "commèreriez",
            "comméreraient" to "commèreraient"
        )

        // Confédérer (Unir par une confédération)
        val confedererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "confédérerai" to "confédèrerai",
            "confédéreras" to "confédèreras",
            "confédérera" to "confédèrera",
            "confédérerons" to "confédèrerons",
            "confédérerez" to "confédèrerez",
            "confédéreront" to "confédèreront",

            // Conditionnel Présent
            "confédérerais" to "confédèrerais",
            "confédérerait" to "confédèrerait",
            "confédérerions" to "confédèrerions",
            "confédéreriez" to "confédèreriez",
            "confédéreraient" to "confédèreraient"
        )

        // Conférer (Accorder un titre, une distinction ; s'entretenir)
        val confererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "conférerai" to "confèrerai",
            "conféreras" to "confèreras",
            "conférera" to "confèrera",
            "conférerons" to "confèrerons",
            "conférerez" to "confèrerez",
            "conféreront" to "confèreront",

            // Conditionnel Présent
            "conférerais" to "confèrerais",
            "conférerait" to "confèrerait",
            "conférerions" to "confèrerions",
            "conféreriez" to "confèreriez",
            "conféreraient" to "confèreraient"
        )

        // Conglomérer (Réunir des éléments en un tout, un conglomérat)
        val conglomererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "conglomérerai" to "conglomèrerai",
            "congloméreras" to "conglomèreras",
            "conglomérera" to "conglomèrera",
            "conglomérerons" to "conglomèrerons",
            "conglomérerez" to "conglomèrerez",
            "congloméreront" to "conglomèreront",

            // Conditionnel Présent
            "conglomérerais" to "conglomèrerais",
            "conglomérerait" to "conglomèrerait",
            "conglomérerions" to "conglomèrerions",
            "congloméreriez" to "conglomèreriez",
            "congloméreraient" to "conglomèreraient"
        )

        // Congréger (Rassembler en congrégation)
        val congregerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "congrégerai" to "congrègerai",
            "congrégeras" to "congrègeras",
            "congrégera" to "congrègera",
            "congrégerons" to "congrègerons",
            "congrégerez" to "congrègerez",
            "congrégeront" to "congrègeront",

            // Conditionnel Présent
            "congrégerais" to "congrègerais",
            "congrégerait" to "congrègerait",
            "congrégerions" to "congrègerions",
            "congrégeriez" to "congrègeriez",
            "congrégeraient" to "congrègeraient"
        )

        // Considérer (Observer avec attention ; examiner)
        val considererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "considérerai" to "considèrerai",
            "considéreras" to "considèreras",
            "considérera" to "considèrera",
            "considérerons" to "considèrerons",
            "considérerez" to "considèrerez",
            "considéreront" to "considèreront",

            // Conditionnel Présent
            "considérerais" to "considèrerais",
            "considérerait" to "considèrerait",
            "considérerions" to "considèrerions",
            "considéreriez" to "considèreriez",
            "considéreraient" to "considèreraient"
        )

        // Coopérer (Travailler ensemble à une œuvre commune)
        val coopererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "coopérerai" to "coopèrerai",
            "coopéreras" to "coopèreras",
            "coopérera" to "coopèrera",
            "coopérerons" to "coopèrerons",
            "coopérerez" to "coopèrerez",
            "coopéreront" to "coopèreront",

            // Conditionnel Présent
            "coopérerais" to "coopèrerais",
            "coopérerait" to "coopèrerait",
            "coopérerions" to "coopèrerions",
            "coopéreriez" to "coopèreriez",
            "coopéreraient" to "coopèreraient"
        )

        // Déblatérer (Parler avec violence contre quelqu'un ou quelque chose)
        val deblatererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déblatérerai" to "déblatèrerai",
            "déblatéreras" to "déblatèreras",
            "déblatérera" to "déblatèrera",
            "déblatérerons" to "déblatèrerons",
            "déblatérerez" to "déblatèrerez",
            "déblatéreront" to "déblatèreront",

            // Conditionnel Présent
            "déblatérerais" to "déblatèrerais",
            "déblatérerait" to "déblatèrerait",
            "déblatérerions" to "déblatèrerions",
            "déblatéreriez" to "déblatèreriez",
            "déblatéreraient" to "déblatèreraient"
        )

        // Décélérer (Ralentir)
        val decelererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décélérerai" to "décèlérerai",
            "décéléreras" to "décèléreras",
            "décélérera" to "décèlérera",
            "décélérerons" to "décèlérerons",
            "décélérerez" to "décèlérerez",
            "décéléreront" to "décèléreront",

            // Conditionnel Présent
            "décélérerais" to "décèlérerais",
            "décélérerait" to "décèlérerait",
            "décélérerions" to "décèlérerions",
            "décéléreriez" to "décèléreriez",
            "décéléreraient" to "décèléreraient"
        )

        // Décohérer
        val decohererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décohérerai" to "décohèrerai",
            "décohéreras" to "décohèreras",
            "décohérera" to "décohèrera",
            "décohérerons" to "décohèrerons",
            "décohérerez" to "décohèrerez",
            "décohéreront" to "décohèreront",
            // Conditionnel Présent
            "décohérerais" to "décohèrerais",
            "décohérerait" to "décohèrerait",
            "décohérerions" to "décohèrerions",
            "décohéreriez" to "décohèreriez",
            "décohéreraient" to "décohèreraient"
        )

        // Décolérer (Cesser d'être en colère)
        val decolererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décolérerai" to "décolèrerai",
            "décoléreras" to "décolèreras",
            "décolérera" to "décolèrera",
            "décolérerons" to "décolèrerons",
            "décolérerez" to "décolèrerez",
            "décoléreront" to "décolèreront",

            // Conditionnel Présent
            "décolérerais" to "décolèrerais",
            "décolérerait" to "décolèrerait",
            "décolérerions" to "décolèrerions",
            "décoléreriez" to "décolèreriez",
            "décoléreraient" to "décolèreraient"
        )

        // Déconsidérer (Faire perdre la considération, discréditer)
        val deconsidererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déconsidérerai" to "déconsidèrerai",
            "déconsidéreras" to "déconsidèreras",
            "déconsidérera" to "déconsidèrera",
            "déconsidérerons" to "déconsidèrerons",
            "déconsidérerez" to "déconsidèrerez",
            "déconsidéreront" to "déconsidèreront",

            // Conditionnel Présent
            "déconsidérerais" to "déconsidèrerais",
            "déconsidérerait" to "déconsidèrerait",
            "déconsidérerions" to "déconsidèrerions",
            "déconsidéreriez" to "déconsidèreriez",
            "déconsidéreraient" to "déconsidèreraient"
        )

        // Déférer (Accorder, concéder ; traduire en justice)
        val defererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "déférerai" to "défèrerai",
            "déféreras" to "défèreras",
            "déférera" to "défèrera",
            "déférerons" to "défèrerons",
            "déférerez" to "défèrerez",
            "déféreront" to "défèreront",

            // Conditionnel Présent
            "déférerais" to "défèrerais",
            "déférerait" to "défèrerait",
            "déférerions" to "défèrerions",
            "déféreriez" to "défèreriez",
            "déféreraient" to "défèreraient"
        )

        // Dégénérer (Perdre ses qualités primitives ; s'aggraver)
        val degenererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "dégénérerai" to "dégènérerai",
            "dégénéreras" to "dégènéreras",
            "dégénérera" to "dégènérera",
            "dégénérerons" to "dégènérerons",
            "dégénérerez" to "dégènérerez",
            "dégénéreront" to "dégènéreront",

            // Conditionnel Présent
            "dégénérerais" to "dégènérerais",
            "dégénérerait" to "dégènérerait",
            "dégénérerions" to "dégènérerions",
            "dégénéreriez" to "dégènéreriez",
            "dégénéreraient" to "dégènéreraient"
        )

        // Délibérer (Réfléchir avant de décider ; discuter avec d'autres)
        val delibererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "délibérerai" to "délibèrerai",
            "délibéreras" to "délibèreras",
            "délibérera" to "délibèrera",
            "délibérerons" to "délibèrerons",
            "délibérerez" to "délibèrerez",
            "délibéreront" to "délibèreront",

            // Conditionnel Présent
            "délibérerais" to "délibèrerais",
            "délibérerait" to "délibèrerait",
            "délibérerions" to "délibèrerions",
            "délibéreriez" to "délibèreriez",
            "délibéreraient" to "délibèreraient"
        )

        // Dépoussiérer (Enlever la poussière ; moderniser)
        val depoussiererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "dépoussiérerai" to "dépoussièrerai",
            "dépoussiéreras" to "dépoussièreras",
            "dépoussiérera" to "dépoussièrera",
            "dépoussiérerons" to "dépoussièrerons",
            "dépoussiérerez" to "dépoussièrerez",
            "dépoussiéreront" to "dépoussièreront",

            // Conditionnel Présent
            "dépoussiérerais" to "dépoussièrerais",
            "dépoussiérerait" to "dépoussièrerait",
            "dépoussiérerions" to "dépoussièrerions",
            "dépoussiéreriez" to "dépoussièreriez",
            "dépoussiéreraient" to "dépoussièreraient"
        )

        // Désaciérer (Ôter l'acier d'un outil)
        val desaciererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désaciérerai" to "désacièrerai",
            "désaciéreras" to "désacièreras",
            "désaciérera" to "désacièrera",
            "désaciérerons" to "désacièrerons",
            "désaciérerez" to "désacièrerez",
            "désaciéreront" to "désacièreront",

            // Conditionnel Présent
            "désaciérerais" to "désacièrerais",
            "désaciérerait" to "désacièrerait",
            "désaciérerions" to "désacièrerions",
            "désaciéreriez" to "désacièreriez",
            "désaciéreraient" to "désacièreraient"
        )

        // Désaérer (Supprimer l'air contenu dans un corps ou un local)
        val desaererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désaérerai" to "désaèrerai",
            "désaéreras" to "désaèreras",
            "désaérera" to "désaèrera",
            "désaérerons" to "désaèrerons",
            "désaérerez" to "désaèrerez",
            "désaéreront" to "désaèreront",

            // Conditionnel Présent
            "désaérerais" to "désaèrerais",
            "désaérerait" to "désaèrerait",
            "désaérerions" to "désaèrerions",
            "désaéreriez" to "désaèreriez",
            "désaéreraient" to "désaèreraient"
        )

        // Désaltérer (Calmer la soif)
        val desaltererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désaltérerai" to "désaltèrerai",
            "désaltéreras" to "désaltèreras",
            "désaltérera" to "désaltèrera",
            "désaltérerons" to "désaltèrerons",
            "désaltérerez" to "désaltèrerez",
            "désaltéreront" to "désaltèreront",

            // Conditionnel Présent
            "désaltérerais" to "désaltèrerais",
            "désaltérerait" to "désaltèrerait",
            "désaltérerions" to "désaltèrerions",
            "désaltéreriez" to "désaltèreriez",
            "désaltéreraient" to "désaltèreraient"
        )

        // Désaubiérer (Enlever l'aubier d'une pièce de bois)
        val desaubiererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désaubiérerai" to "désaubièrerai",
            "désaubiéreras" to "désaubièreras",
            "désaubiérera" to "désaubièrera",
            "désaubiérerons" to "désaubièrerons",
            "désaubiérerez" to "désaubièrerez",
            "désaubiéreront" to "désaubièreront",

            // Conditionnel Présent
            "désaubiérerais" to "désaubièrerais",
            "désaubiérerait" to "désaubièrerait",
            "désaubiérerions" to "désaubièrerions",
            "désaubiéreriez" to "désaubièreriez",
            "désaubiéreraient" to "désaubièreraient"
        )

        // Désempoussiérer (Retirer la poussière)
        val desempoussiererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désempoussiérerai" to "désempoussièrerai",
            "désempoussiéreras" to "désempoussièreras",
            "désempoussiérera" to "désempoussièrera",
            "désempoussiérerons" to "désempoussièrerons",
            "désempoussiérerez" to "désempoussièrerez",
            "désempoussiéreront" to "désempoussiéreront",
            // Conditionnel Présent
            "désempoussiérerais" to "désempoussièrerais",
            "désempoussiérerait" to "désempoussièrerait",
            "désempoussiérerions" to "désempoussièrerions",
            "désempoussiéreriez" to "désempoussièreriez",
            "désempoussiéreraient" to "désempoussièreraient"
        )

        // Encolérer (Mettre en colère)
        val encolererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "encolérerai" to "encolèrerai",
            "encoléreras" to "encolèreras",
            "encolérera" to "encolèrera",
            "encolérerons" to "encolèrerons",
            "encolérerez" to "encolèrerez",
            "encoléreront" to "encoléreront",
            // Conditionnel Présent
            "encolérerais" to "encolèrerais",
            "encolérerait" to "encolèrerait",
            "encolérerions" to "encolèrerions",
            "encoléreriez" to "encolèreriez",
            "encoléreraient" to "encolèreraient"
        )

        // Désespérer (Perdre tout espoir)
        val desespererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désespérerai" to "désespèrerai",
            "désespéreras" to "désespèreras",
            "désespérera" to "désespèrera",
            "désespérerons" to "désespèrerons",
            "désespérerez" to "désespèrerez",
            "désespéreront" to "désespèreront",

            // Conditionnel Présent
            "désespérerais" to "désespèrerais",
            "désespérerait" to "désespèrerait",
            "désespérerions" to "désespèrerions",
            "désespéreriez" to "désespèreriez",
            "désespéreraient" to "désespèreraient"
        )

        // Désincarcérer (Dégager une personne d'un véhicule accidenté)
        val desincarcererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désincarcérerai" to "désincarcèrerai",
            "désincarcéreras" to "désincarcèreras",
            "désincarcérera" to "désincarcèrera",
            "désincarcérerons" to "désincarcèrerons",
            "désincarcérerez" to "désincarcèrerez",
            "désincarcéreront" to "désincarcèreront",

            // Conditionnel Présent
            "désincarcérerais" to "désincarcèrerais",
            "désincarcérerait" to "désincarcèrerait",
            "désincarcérerions" to "désincarcèrerions",
            "désincarcéreriez" to "désincarcèreriez",
            "désincarcéreraient" to "désincarcèreraient"
        )

        // Désinsérer (Sortir d'un ensemble où une chose était insérée)
        val desinsererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "désinsérerai" to "désinsèrerai",
            "désinséreras" to "désinsèreras",
            "désinsérera" to "désinsèrera",
            "désinsérerons" to "désinsèrerons",
            "désinsérerez" to "désinsèrerez",
            "désinséreront" to "désinsèreront",

            // Conditionnel Présent
            "désinsérerais" to "désinsèrerais",
            "désinsérerait" to "désinsèrerait",
            "désinsérerions" to "désinsèrerions",
            "désinséreriez" to "désinsèreriez",
            "désinséreraient" to "désinsèreraient"
        )

        // Différer (Remettre à plus tard ; être différent)
        val differerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "différerai" to "diffèrerai",
            "différeras" to "diffèreras",
            "différera" to "diffèrera",
            "différerons" to "diffèrerons",
            "différerez" to "diffèrerez",
            "différeront" to "diffèreront",

            // Conditionnel Présent
            "différerais" to "diffèrerais",
            "différerait" to "diffèrerait",
            "différerions" to "diffèrerions",
            "différeriez" to "diffèreriez",
            "différeraient" to "diffèreraient"
        )

        // Digérer (Assimiler des aliments ; supporter une situation)
        val digererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "digérerai" to "digèrerai",
            "digéreras" to "digèreras",
            "digérera" to "digèrera",
            "digérerons" to "digèrerons",
            "digérerez" to "digèrerez",
            "digéreront" to "digèreront",

            // Conditionnel Présent
            "digérerais" to "digèrerais",
            "digérerait" to "digèrerait",
            "digérerions" to "digèrerions",
            "digéreriez" to "digèreriez",
            "digéreraient" to "digèreraient"
        )

        // Dilacérer (Déchirer en morceaux)
        val dilacererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "dilacérerai" to "dilacèrerai",
            "dilacéreras" to "dilacèreras",
            "dilacérera" to "dilacèrera",
            "dilacérerons" to "dilacèrerons",
            "dilacérerez" to "dilacèrerez",
            "dilacéreront" to "dilacèreront",

            // Conditionnel Présent
            "dilacérerais" to "dilacèrerais",
            "dilacérerait" to "dilacèrerait",
            "dilacérerions" to "dilacèrerions",
            "dilacéreriez" to "dilacèreriez",
            "dilacéreraient" to "dilacèreraient"
        )

        // Empoussiérer (Couvrir de poussière)
        val empoussiererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "empoussiérerai" to "empoussièrerai",
            "empoussiéreras" to "empoussièreras",
            "empoussiérera" to "empoussièrera",
            "empoussiérerons" to "empoussièrerons",
            "empoussiérerez" to "empoussièrerez",
            "empoussiéreront" to "empoussièreront",

            // Conditionnel Présent
            "empoussiérerais" to "empoussièrerais",
            "empoussiérerait" to "empoussièrerait",
            "empoussiérerions" to "empoussièrerions",
            "empoussiéreriez" to "empoussièreriez",
            "empoussiéreraient" to "empoussièreraient"
        )

        // Enstérer (Mettre du bois en stères)
        val enstererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "enstérerai" to "enstèrerai",
            "enstéreras" to "enstèreras",
            "enstérera" to "enstèrera",
            "enstérerons" to "enstèrerons",
            "enstérerez" to "enstèrerez",
            "enstéreront" to "enstèreront",

            // Conditionnel Présent
            "enstérerais" to "enstèrerais",
            "enstérerait" to "enstèrerait",
            "enstérerions" to "enstèrerions",
            "enstéreriez" to "enstèreriez",
            "enstéreraient" to "enstèreraient"
        )

        // Énumérer (Détailler un à un)
        val enumererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "énumérerai" to "énumèrerai",
            "énuméreras" to "énumèreras",
            "énumérera" to "énumèrera",
            "énumérerons" to "énumèrerons",
            "énumérerez" to "énumèrerez",
            "énuméreront" to "énumèreront",

            // Conditionnel Présent
            "énumérerais" to "énumèrerais",
            "énumérerait" to "énumèrerait",
            "énumérerions" to "énumèrerions",
            "énuméreriez" to "énumèreriez",
            "énuméreraient" to "énumèreraient"
        )

        // Espérer (Attendre avec confiance)
        val espererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "espérerai" to "espèrerai",
            "espéreras" to "espèreras",
            "espérera" to "espèrera",
            "espérerons" to "espèrerons",
            "espérerez" to "espèrerez",
            "espéreront" to "espèreront",

            // Conditionnel Présent
            "espérerais" to "espèrerais",
            "espérerait" to "espèrerait",
            "espérerions" to "espèrerions",
            "espéreriez" to "espèreriez",
            "espéreraient" to "espèreraient"
        )

        // Éviscérer (Ôter les viscères)
        val eviscererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "éviscérerai" to "éviscèrerai",
            "éviscéreras" to "éviscèreras",
            "éviscérera" to "éviscèrera",
            "éviscérerons" to "éviscèrerons",
            "éviscérerez" to "éviscèrerez",
            "éviscéreront" to "éviscèreront",

            // Conditionnel Présent
            "éviscérerais" to "éviscèrerais",
            "éviscérerait" to "éviscèrerait",
            "éviscérerions" to "éviscèrerions",
            "éviscéreriez" to "éviscèreriez",
            "éviscéreraient" to "éviscèreraient"
        )

        // Exagérer (Amplifier, dépasser la mesure)
        val exagererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "exagérerai" to "exagèrerai",
            "exagéreras" to "exagèreras",
            "exagérera" to "exagèrera",
            "exagérerons" to "exagèrerons",
            "exagérerez" to "exagèrerez",
            "exagéreront" to "exagèreront",

            // Conditionnel Présent
            "exagérerais" to "exagèrerais",
            "exagérerait" to "exagèrerait",
            "exagérerions" to "exagèrerions",
            "exagéreriez" to "exagèreriez",
            "exagéreraient" to "exagèreraient"
        )

        // Exaspérer (Irriter vivement)
        val exaspererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "exaspérerai" to "exaspèrerai",
            "exaspéreras" to "exaspèreras",
            "exaspérera" to "exaspèrera",
            "exaspérerons" to "exaspèrerons",
            "exaspérerez" to "exaspèrerez",
            "exaspéreront" to "exaspèreront",

            // Conditionnel Présent
            "exaspérerais" to "exaspèrerais",
            "exaspérerait" to "exaspèrerait",
            "exaspérerions" to "exaspèrerions",
            "exaspéreriez" to "exaspèreriez",
            "exaspéreraient" to "exaspèreraient"
        )

        // Exonérer (Décharger d'une obligation, d'une taxe)
        val exonererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "exonérerai" to "exonèrerai",
            "exonéreras" to "exonèreras",
            "exonérera" to "exonèrera",
            "exonérerons" to "exonèrerons",
            "exonérerez" to "exonèrerez",
            "exonéreront" to "exonèreront",

            // Conditionnel Présent
            "exonérerais" to "exonèrerais",
            "exonérerait" to "exonèrerait",
            "exonérerions" to "exonèrerions",
            "exonéreriez" to "exonèreriez",
            "exonéreraient" to "exonèreraient"
        )

        // Exulcérer (Provoquer des ulcères ; blesser profondément)
        val exulcererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "exulcérerai" to "exulcèrerai",
            "exulcéreras" to "exulcèreras",
            "exulcérera" to "exulcèrera",
            "exulcérerons" to "exulcèrerons",
            "exulcérerez" to "exulcèrerez",
            "exulcéreront" to "exulcèreront",

            // Conditionnel Présent
            "exulcérerais" to "exulcèrerais",
            "exulcérerait" to "exulcèrerait",
            "exulcérerions" to "exulcèrerions",
            "exulcéreriez" to "exulcèreriez",
            "exulcéreraient" to "exulcèreraient"
        )

        // Fédérer (Grouper en fédération ; unir)
        val federerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "fédérerai" to "fédèrerai",
            "fédéreras" to "fédèreras",
            "fédérera" to "fédèrera",
            "fédérerons" to "fédèrerons",
            "fédérerez" to "fédèrerez",
            "fédéreront" to "fédèreront",

            // Conditionnel Présent
            "fédérerais" to "fédèrerais",
            "fédérerait" to "fédèrerait",
            "fédérerions" to "fédèrerions",
            "fédéreriez" to "fédèreriez",
            "fédéreraient" to "fédèreraient"
        )

        // Galérer (Rencontrer des difficultés)
        val galererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "galérerai" to "galèrerai",
            "galéreras" to "galèreras",
            "galérera" to "galèrera",
            "galérerons" to "galèrerons",
            "galérerez" to "galèrerez",
            "galéreront" to "galèreront",

            // Conditionnel Présent
            "galérerais" to "galèrerais",
            "galérerait" to "galèrerait",
            "galérerions" to "galèrerions",
            "galéreriez" to "galèreriez",
            "galéreraient" to "galèreraient"
        )

        // Générer (Produire, engendrer)
        val genererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "générerai" to "gènérerai",
            "généreras" to "gènéreras",
            "générera" to "gènérera",
            "générerons" to "gènérerons",
            "générerez" to "gènérerez",
            "généreront" to "gènéreront",

            // Conditionnel Présent
            "générerais" to "gènérerais",
            "générerait" to "gènérerait",
            "générerions" to "gènérerions",
            "généreriez" to "gènéreriez",
            "généreraient" to "gènéreraient"
        )

        // Gérer (Administrer, diriger des affaires)
        val gererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "gérerai" to "gèrerai",
            "géreras" to "gèreras",
            "gérera" to "gèrera",
            "gérerons" to "gèrerons",
            "gérerez" to "gèrerez",
            "géreront" to "gèreront",

            // Conditionnel Présent
            "gérerais" to "gèrerais",
            "gérerait" to "gèrerait",
            "gérerions" to "gèrerions",
            "géreriez" to "gèreriez",
            "géreraient" to "gèreraient"
        )

        // Incamérer (Réunir au domaine de la chambre apostolique)
        val incamererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "incamérerai" to "incamèrerai",
            "incaméreras" to "incamèreras",
            "incamérera" to "incamèrera",
            "incamérerons" to "incamèrerons",
            "incamérerez" to "incamèrerez",
            "incaméreront" to "incaméreront",
            // Conditionnel Présent
            "incamérerais" to "incamèrerais",
            "incamérerait" to "incamèrerait",
            "incamérerions" to "incamèrerions",
            "incaméreriez" to "incamèreriez",
            "incaméreraient" to "incamèreraient"
        )

        // Incohérer (Manquer de cohésion)
        val incohererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "incohérerai" to "incohèrerai",
            "incohéreras" to "incohèreras",
            "incohérera" to "incohèrera",
            "incohérerons" to "incohèrerons",
            "incohérerez" to "incohèrerez",
            "incohéreront" to "incohéreront",
            // Conditionnel Présent
            "incohérerais" to "incohèrerais",
            "incohérerait" to "incohèrerait",
            "incohérerions" to "incohèrerions",
            "incohéreriez" to "incohèreriez",
            "incohéreraient" to "incohèreraient"
        )

        // Incérer (Ancien : insérer / introduire)
        val incererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "incérerai" to "incèrerai",
            "incéreras" to "incèreras",
            "incérera" to "incèrera",
            "incérerons" to "incèrerons",
            "incérerez" to "incèrerez",
            "incéreront" to "incéreront",
            // Conditionnel Présent
            "incérerais" to "incèrerais",
            "incérerait" to "incèrerait",
            "incérerions" to "incèrerions",
            "incéreriez" to "incèreriez",
            "incéreraient" to "incèreraient"
        )

        // Indigérer (Ne pas digérer)
        val indigererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "indigérerai" to "indigèrerai",
            "indigéreras" to "indigèreras",
            "indigérera" to "indigèrera",
            "indigérerons" to "indigèrerons",
            "indigérerez" to "indigèrerez",
            "indigéreront" to "indigéreront",
            // Conditionnel Présent
            "indigérerais" to "indigèrerais",
            "indigérerait" to "indigèrerait",
            "indigérerions" to "indigèrerions",
            "indigéreriez" to "indigèreriez",
            "indigéreraient" to "indigèreraient"
        )

        // Jachérer (Mettre en jachère)
        val jachererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "jachérerai" to "jachèrerai",
            "jachéreras" to "jachèreras",
            "jachérera" to "jachèrera",
            "jachérerons" to "jachèrerons",
            "jachérerez" to "jachèrerez",
            "jachéreront" to "jachéreront",
            // Conditionnel Présent
            "jachérerais" to "jachèrerais",
            "jachérerait" to "jachèrerait",
            "jachérerions" to "jachèrerions",
            "jachéreriez" to "jachèreriez",
            "jachéreraient" to "jachèreraient"
        )

        // Retransférer (Transférer de nouveau)
        val retransfererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "retransférerai" to "retransfèrerai",
            "retransféreras" to "retransfèreras",
            "retransférera" to "retransfèrera",
            "retransférerons" to "retransfèrerons",
            "retransférerez" to "retransfèrerez",
            "retransféreront" to "retransféreront",
            // Conditionnel Présent
            "retransférerais" to "retransfèrerais",
            "retransférerait" to "retransfèrerait",
            "retransférerions" to "retransfèrerions",
            "retransféreriez" to "retransfèreriez",
            "retransféreraient" to "retransfèreraient"
        )

        // Réaccélérer (Accélérer de nouveau)
        val reaccelererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réaccélérerai" to "réaccélèrerai",
            "réaccéléreras" to "réaccélèreras",
            "réaccélérera" to "réaccélèrera",
            "réaccélérerons" to "réaccélèrerons",
            "réaccélérerez" to "réaccélèrerez",
            "réaccéléreront" to "réaccélèreront",
            // Conditionnel Présent
            "réaccélérerais" to "réaccélèrerais",
            "réaccélérerait" to "réaccélèrerait",
            "réaccélérerions" to "réaccélèrerions",
            "réaccéléreriez" to "réaccélèreriez",
            "réaccéléreraient" to "réaccélèreraient"
        )

        // Réingérer (Ingérer de nouveau)
        val reingererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réingérerai" to "réingèrerai",
            "réingéreras" to "réingèreras",
            "réingérera" to "réingèrera",
            "réingérerons" to "réingèrerons",
            "réingérerez" to "réingèrerez",
            "réingéreront" to "réingéreront",
            // Conditionnel Présent
            "réingérerais" to "réingèrerais",
            "réingérerait" to "réingèrerait",
            "réingérerions" to "réingèrerions",
            "réingéreriez" to "réingèreriez",
            "réingéreraient" to "réingèreraient"
        )

        // Rémérer (Exercer le droit de réméré)
        val remererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rémérerai" to "rémèrerai",
            "réméreras" to "rémèreras",
            "rémérera" to "rémèrera",
            "rémérerons" to "rémèrerons",
            "rémérerez" to "rémèrerez",
            "réméreront" to "réméreront",
            // Conditionnel Présent
            "rémérerais" to "rémèrerais",
            "rémérerait" to "rémèrerait",
            "rémérerions" to "rémèrerions",
            "réméreriez" to "rémèreriez",
            "réméreraient" to "rémèreraient"
        )

        // Transverbérer (Traverser de part en part)
        val transverbererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "transverbérerai" to "transverbèrerai",
            "transverbéreras" to "transverbèreras",
            "transverbérera" to "transverbèrera",
            "transverbérerons" to "transverbèrerons",
            "transverbérerez" to "transverbèrerez",
            "transverbéreront" to "transverbéreront",
            // Conditionnel Présent
            "transverbérerais" to "transverbèrerais",
            "transverbérerait" to "transverbèrerait",
            "transverbérerions" to "transverbèrerions",
            "transverbéreriez" to "transverbèreriez",
            "transverbéreraient" to "transverbèreraient"
        )

        // Téléopérer (Opérer à distance)
        val teleopererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "téléopérerai" to "téléopèrerai",
            "téléopéreras" to "téléopèreras",
            "téléopérera" to "téléopèrera",
            "téléopérerons" to "téléopèrerons",
            "téléopérerez" to "téléopèrerez",
            "téléopéreront" to "téléopéreront",
            // Conditionnel Présent
            "téléopérerais" to "téléopèrerais",
            "téléopérerait" to "téléopèrerait",
            "téléopérerions" to "téléopèrerions",
            "téléopéreriez" to "téléopèreriez",
            "téléopéreraient" to "téléopèreraient"
        )

        // Sous-rémunérer (Rémunérer insuffisamment)
        val sousRemunererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sous-rémunérerai" to "sous-rémunèrerai",
            "sous-rémunéreras" to "sous-rémunèreras",
            "sous-rémunérera" to "sous-rémunèrera",
            "sous-rémunérerons" to "sous-rémunèrerons",
            "sous-rémunérerez" to "sous-rémunèrerez",
            "sous-rémunéreront" to "sous-rémunéreront",
            // Conditionnel Présent
            "sous-rémunérerais" to "sous-rémunèrerais",
            "sous-rémunérerait" to "sous-rémunèrerait",
            "sous-rémunérerions" to "sous-rémunèrerions",
            "sous-rémunéreriez" to "sous-rémunèreriez",
            "sous-rémunéreraient" to "sous-rémunèreraient"
        )

        // Vulnérer (Blesser / Porter atteinte à)
        val vulnererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "vulnérerai" to "vulnèrerai",
            "vulnéreras" to "vulnèreras",
            "vulnérera" to "vulnèrera",
            "vulnérerons" to "vulnèrerons",
            "vulnérerez" to "vulnèrerez",
            "vulnéreront" to "vulnéreront",
            // Conditionnel Présent
            "vulnérerais" to "vulnèrerais",
            "vulnérerait" to "vulnèrerait",
            "vulnérerions" to "vulnèrerions",
            "vulnéreriez" to "vulnèreriez",
            "vulnéreraient" to "vulnèreraient"
        )

        // Incarcérer (Mettre en prison)
        val incarcererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "incarcérerai" to "incarcèrerai",
            "incarcéreras" to "incarcèreras",
            "incarcérera" to "incarcèrera",
            "incarcérerons" to "incarcèrerons",
            "incarcérerez" to "incarcèrerez",
            "incarcéreront" to "incarcèreront",

            // Conditionnel Présent
            "incarcérerais" to "incarcèrerais",
            "incarcérerait" to "incarcèrerait",
            "incarcérerions" to "incarcèrerions",
            "incarcéreriez" to "incarcèreriez",
            "incarcéreraient" to "incarcèreraient"
        )

        // Incinérer (Réduire en cendres)
        val incinererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "incinérerai" to "incinèrerai",
            "incinéreras" to "incinèreras",
            "incinérera" to "incinèrera",
            "incinérerons" to "incinèrerons",
            "incinérerez" to "incinèrerez",
            "incinéreront" to "incinèreront",

            // Conditionnel Présent
            "incinérerais" to "incinèrerais",
            "incinérerait" to "incinèrerait",
            "incinérerions" to "incinèrerions",
            "incinéreriez" to "incinèreriez",
            "incinéreraient" to "incinèreraient"
        )

        // Indifférer (Laisser indifférent)
        val indiffererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "indifférerai" to "indiffèrerai",
            "indifféreras" to "indiffèreras",
            "indifférera" to "indiffèrera",
            "indifférerons" to "indiffèrerons",
            "indifférerez" to "indiffèrerez",
            "indifféreront" to "indiffèreront",

            // Conditionnel Présent
            "indifférerais" to "indiffèrerais",
            "indifférerait" to "indiffèrerait",
            "indifférerions" to "indiffèrerions",
            "indifféreriez" to "indiffèreriez",
            "indifféreraient" to "indiffèreraient"
        )

        // Inférer (Tirer une conséquence)
        val infererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "inférerai" to "infèrerai",
            "inféreras" to "infèreras",
            "inférera" to "infèrera",
            "inférerons" to "infèrerons",
            "inférerez" to "infèrerez",
            "inféreront" to "infèreront",

            // Conditionnel Présent
            "inférerais" to "infèrerais",
            "inférerait" to "infèrerait",
            "inférerions" to "infèrerions",
            "inféreriez" to "infèreriez",
            "inféreraient" to "infèreraient"
        )

        // Ingérer (Introduire dans l'estomac)
        val ingererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "ingérerai" to "ingèrerai",
            "ingéreras" to "ingèreras",
            "ingérera" to "ingèrera",
            "ingérerons" to "ingèrerons",
            "ingérerez" to "ingèrerez",
            "ingéreront" to "ingèreront",

            // Conditionnel Présent
            "ingérerais" to "ingèrerais",
            "ingérerait" to "ingèrerait",
            "ingérerions" to "ingèrerions",
            "ingéreriez" to "ingèreriez",
            "ingéreraient" to "ingèreraient"
        )

        // Insérer (Introduire une chose dans une autre)
        val insererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "insérerai" to "insèrerai",
            "inséreras" to "insèreras",
            "insérera" to "insèrera",
            "insérerons" to "insèrerons",
            "insérerez" to "insèrerez",
            "inséreront" to "insèreront",

            // Conditionnel Présent
            "insérerais" to "insèrerais",
            "insérerait" to "insèrerait",
            "insérerions" to "insèrerions",
            "inséreriez" to "insèreriez",
            "inséreraient" to "insèreraient"
        )

        // Interférer (Se mêler d'une affaire ; se produire en même temps)
        val interfererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "interférerai" to "interfèrerai",
            "interféreras" to "interfèreras",
            "interférera" to "interfèrera",
            "interférerons" to "interfèrerons",
            "interférerez" to "interfèrerez",
            "interféreront" to "interfèreront",

            // Conditionnel Présent
            "interférerais" to "interfèrerais",
            "interférerait" to "interfèrerait",
            "interférerions" to "interfèrerions",
            "interféreriez" to "interfèreriez",
            "interféreraient" to "interfèreraient"
        )

        // Invétérer (Devenir ancien, s'enraciner avec le temps)
        val invetererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "invétérerai" to "invétèrerai",
            "invétéreras" to "invétèreras",
            "invétérera" to "invétèrera",
            "invétérerons" to "invétèrerons",
            "invétérerez" to "invétèrerez",
            "invétéreront" to "invétèreront",

            // Conditionnel Présent
            "invétérerais" to "invétèrerais",
            "invétérerait" to "invétèrerait",
            "invétérerions" to "invétèrerions",
            "invétéreriez" to "invétèreriez",
            "invétéreraient" to "invétèreraient"
        )

        // Itérer (Répéter une action)
        val itererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "itérerai" to "itèrerai",
            "itéreras" to "itèreras",
            "itérera" to "itèrera",
            "itérerons" to "itèrerons",
            "itérerez" to "itèrerez",
            "itéreront" to "itèreront",

            // Conditionnel Présent
            "itérerais" to "itèrerais",
            "itérerait" to "itèrerait",
            "itérerions" to "itèrerions",
            "itéreriez" to "itèreriez",
            "itéreraient" to "itèreraient"
        )

        // Lacérer (Déchirer violemment)
        val lacererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "lacérerai" to "lacèrerai",
            "lacéreras" to "lacèreras",
            "lacérera" to "lacèrera",
            "lacérerons" to "lacèrerons",
            "lacérerez" to "lacèrerez",
            "lacéreront" to "lacèreront",

            // Conditionnel Présent
            "lacérerais" to "lacèrerais",
            "lacérerait" to "lacèrerait",
            "lacérerions" to "lacèrerions",
            "lacéreriez" to "lacèreriez",
            "lacéreraient" to "lacèreraient"
        )

        // Légiférer (Faire des lois)
        val legifererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "légiférerai" to "légifèrerai",
            "légiféreras" to "légifèreras",
            "légiférera" to "légifèrera",
            "légiférerons" to "légifèrerons",
            "légiférerez" to "légifèrerez",
            "légiféreront" to "légifèreront",

            // Conditionnel Présent
            "légiférerais" to "légifèrerais",
            "légiférerait" to "légifèrerait",
            "légiférerions" to "légifèrerions",
            "légiféreriez" to "légifèreriez",
            "légiféreraient" to "légifèreraient"
        )

        // Libérer (Donner la liberté ; rendre disponible)
        val libererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "libérerai" to "libèrerai",
            "libéreras" to "libèreras",
            "libérera" to "libèrera",
            "libérerons" to "libèrerons",
            "libérerez" to "libèrerez",
            "libéreront" to "libèreront",

            // Conditionnel Présent
            "libérerais" to "libèrerais",
            "libérerait" to "libèrerait",
            "libérerions" to "libèrerions",
            "libéreriez" to "libèreriez",
            "libéreraient" to "libèreraient"
        )


        // Lisérer (Border d'un liseré)
        val lisererAccentuModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "lisérerai" to "lisèrerai",
            "liséreras" to "lisèreras",
            "lisérera" to "lisèrera",
            "lisérerons" to "lisèrerons",
            "lisérerez" to "lisèrerez",
            "liséreront" to "lisèreront",

            // Conditionnel Présent
            "lisérerais" to "lisèrerais",
            "lisérerait" to "lisèrerait",
            "lisérerions" to "lisèrerions",
            "liséreriez" to "lisèreriez",
            "liséreraient" to "lisèreraient"
        )

        // Macérer (Laisser séjourner dans un liquide ; mortifier son corps)
        val macererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "macérerai" to "macèrerai",
            "macéreras" to "macèreras",
            "macérera" to "macèrera",
            "macérerons" to "macèrerons",
            "macérerez" to "macèrerez",
            "macéreront" to "macèreront",

            // Conditionnel Présent
            "macérerais" to "macèrerais",
            "macérerait" to "macèrerait",
            "macérerions" to "macèrerions",
            "macéreriez" to "macèreriez",
            "macéreraient" to "macèreraient"
        )

        // Maniérer (Donner un caractère affecté, peu naturel)
        val maniererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "maniérerai" to "manièrerai",
            "maniéreras" to "manièreras",
            "maniérera" to "manièrera",
            "maniérerons" to "manièrerons",
            "maniérerez" to "manièrerez",
            "maniéreront" to "manièreront",

            // Conditionnel Présent
            "maniérerais" to "manièrerais",
            "maniérerait" to "manièrerait",
            "maniérerions" to "manièrerions",
            "maniéreriez" to "manièreriez",
            "maniéreraient" to "manièreraient"
        )

        // Mémérer (Familier : Bavarder, cancaner)
        val memererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "mémérerai" to "mémèrerai",
            "méméreras" to "mémèreras",
            "mémérera" to "mémèrera",
            "mémérerons" to "mémèrerons",
            "mémérerez" to "mémèrerez",
            "méméreront" to "mémèreront",

            // Conditionnel Présent
            "mémérerais" to "mémèrerais",
            "mémérerait" to "mémèrerait",
            "mémérerions" to "mémèrerions",
            "méméreriez" to "mémèreriez",
            "méméreraient" to "mémèreraient"
        )

        // Modérer (Maintenir dans certaines limites ; adoucir)
        val modererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "modérerai" to "modèrerai",
            "modéreras" to "modèreras",
            "modérera" to "modèrera",
            "modérerons" to "modèrerons",
            "modérerez" to "modèrerez",
            "modéreront" to "modèreront",

            // Conditionnel Présent
            "modérerais" to "modèrerais",
            "modérerait" to "modèrerait",
            "modérerions" to "modèrerions",
            "modéreriez" to "modèreriez",
            "modéreraient" to "modèreraient"
        )

        // Obérer (Accabler de dettes)
        val obererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "obérerai" to "obèrerai",
            "obéreras" to "obèreras",
            "obérera" to "obèrera",
            "obérerons" to "obèrerons",
            "obérerez" to "obèrerez",
            "obéreront" to "obèreront",

            // Conditionnel Présent
            "obérerais" to "obèrerais",
            "obérerait" to "obèrerait",
            "obérerions" to "obèrerions",
            "obéreriez" to "obèreriez",
            "obéreraient" to "obèreraient"
        )

        // Oblitérer (Effacer, supprimer progressivement)
        val oblitererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "oblitérerai" to "oblitèrerai",
            "oblitéreras" to "oblitèreras",
            "oblitérera" to "oblitèrera",
            "oblitérerons" to "oblitèrerons",
            "oblitérerez" to "oblitèrerez",
            "oblitéreront" to "oblitèreront",

            // Conditionnel Présent
            "oblitérerais" to "oblitèrerais",
            "oblitérerait" to "oblitèrerait",
            "oblitérerions" to "oblitèrerions",
            "oblitéreriez" to "oblitèreriez",
            "oblitéreraient" to "oblitèreraient"
        )

        // Obtempérer (Obéir à un ordre)
        val obtempererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "obtempérerai" to "obtempèrerai",
            "obtempéreras" to "obtempèreras",
            "obtempérera" to "obtempèrera",
            "obtempérerons" to "obtempèrerons",
            "obtempérerez" to "obtempèrerez",
            "obtempéreront" to "obtempèreront",

            // Conditionnel Présent
            "obtempérerais" to "obtempèrerais",
            "obtempérerait" to "obtempèrerait",
            "obtempérerions" to "obtempèrerions",
            "obtempéreriez" to "obtempèreriez",
            "obtempéreraient" to "obtempèreraient"
        )

        // Opérer (Réaliser une action, une intervention chirurgicale)
        val opererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "opérerai" to "opèrerai",
            "opéreras" to "opèreras",
            "opérera" to "opèrera",
            "opérerons" to "opèrerons",
            "opérerez" to "opèrerez",
            "opéreront" to "opèreront",

            // Conditionnel Présent
            "opérerais" to "opèrerais",
            "opérerait" to "opèrerait",
            "opérerions" to "opèrerions",
            "opéreriez" to "opèreriez",
            "opéreraient" to "opèreraient"
        )

        // Persévérer (Continuer de faire ce qu'on a entrepris)
        val persevererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "persévérerai" to "persévèrerai",
            "persévéreras" to "persévèreras",
            "persévérera" to "persévèrera",
            "persévérerons" to "persévèrerons",
            "persévérerez" to "persévèrerez",
            "persévéreront" to "persévèreront",

            // Conditionnel Présent
            "persévérerais" to "persévèrerais",
            "persévérerait" to "persévèrerait",
            "persévérerions" to "persévèrerions",
            "persévéreriez" to "persévèreriez",
            "persévéreraient" to "persévèreraient"
        )

        // Pestiférer (Infecter de la peste ; exhaler une odeur infecte)
        val pestifererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "pestiférerai" to "pestifèrerai",
            "pestiféreras" to "pestifèreras",
            "pestiférera" to "pestifèrera",
            "pestiférerons" to "pestifèrerons",
            "pestiférerez" to "pestifèrerez",
            "pestiféreront" to "pestifèreront",

            // Conditionnel Présent
            "pestiférerais" to "pestifèrerais",
            "pestiférerait" to "pestifèrerait",
            "pestiférerions" to "pestifèrerions",
            "pestiféreriez" to "pestifèreriez",
            "pestiféreraient" to "pestifèreraient"
        )

        // Pondérer (Équilibrer, modérer)
        val pondererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "pondérerai" to "pondèrerai",
            "pondéreras" to "pondèreras",
            "pondérera" to "pondèrera",
            "pondérerons" to "pondèrerons",
            "pondérerez" to "pondèrerez",
            "pondéreront" to "pondèreront",

            // Conditionnel Présent
            "pondérerais" to "pondèrerais",
            "pondérerait" to "pondèrerait",
            "pondérerions" to "pondèrerions",
            "pondéreriez" to "pondèreriez",
            "pondéreraient" to "pondèreraient"
        )

        // Préférer (Aimer mieux, choisir par priorité)
        val prefererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "préférerai" to "préfèrerai",
            "préféreras" to "préfèreras",
            "préférera" to "préfèrera",
            "préférerons" to "préfèrerons",
            "préférerez" to "préfèrerez",
            "préféreront" to "préfèreront",

            // Conditionnel Présent
            "préférerais" to "préfèrerais",
            "préférerait" to "préfèrerait",
            "préférerions" to "préfèrerions",
            "préféreriez" to "préfèreriez",
            "préféreraient" to "préfèreraient"
        )

        // Proférer (Prononcer des paroles avec force)
        val profererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "proférerai" to "profèrerai",
            "proféreras" to "profèreras",
            "proférera" to "profèrera",
            "proférerons" to "profèrerons",
            "proférerez" to "profèrerez",
            "proféreront" to "profèreront",

            // Conditionnel Présent
            "proférerais" to "profèrerais",
            "proférerait" to "profèrerait",
            "proférerions" to "profèrerions",
            "proféreriez" to "profèreriez",
            "proféreraient" to "profèreraient"
        )

        // Proliférer (Se multiplier rapidement)
        val prolifererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "proliférerai" to "prolifèrerai",
            "proliféreras" to "prolifèreras",
            "proliférera" to "prolifèrera",
            "proliférerons" to "prolifèrerons",
            "proliférerez" to "prolifèrerez",
            "proliféreront" to "prolifèreront",

            // Conditionnel Présent
            "proliférerais" to "prolifèrerais",
            "proliférerait" to "prolifèrerait",
            "proliférerions" to "prolifèrerions",
            "proliféreriez" to "prolifèreriez",
            "proliféreraient" to "prolifèreraient"
        )

        // Prospérer (Être dans un état de réussite, de bonheur)
        val prospererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "prospérerai" to "prospèrerai",
            "prospéreras" to "prospèreras",
            "prospérera" to "prospèrera",
            "prospérerons" to "prospèrerons",
            "prospérerez" to "prospèrerez",
            "prospéreront" to "prospèreront",

            // Conditionnel Présent
            "prospérerais" to "prospèrerais",
            "prospérerait" to "prospèrerait",
            "prospérerions" to "prospèrerions",
            "prospéreriez" to "prospèreriez",
            "prospéreraient" to "prospèreraient"
        )

        // Reconsidérer (Examiner de nouveau)
        val reconsidererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "reconsidérerai" to "reconsidèrerai",
            "reconsidéreras" to "reconsidèreras",
            "reconsidérera" to "reconsidèrera",
            "reconsidérerons" to "reconsidèrerons",
            "reconsidérerez" to "reconsidèrerez",
            "reconsidéreront" to "reconsidèreront",

            // Conditionnel Présent
            "reconsidérerais" to "reconsidèrerais",
            "reconsidérerait" to "reconsidèrerait",
            "reconsidérerions" to "reconsidèrerions",
            "reconsidéreriez" to "reconsidèreriez",
            "reconsidéreraient" to "reconsidèreraient"
        )

        // Récupérer (Rentrer en possession de ; reprendre ses forces)
        val recupererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "récupérerai" to "récupèrerai",
            "récupéreras" to "récupèreras",
            "récupérera" to "récupèrera",
            "récupérerons" to "récupèrerons",
            "récupérerez" to "récupèrerez",
            "récupéreront" to "récupèreront",

            // Conditionnel Présent
            "récupérerais" to "récupèrerais",
            "récupérerait" to "récupèrerait",
            "récupérerions" to "récupèrerions",
            "récupéreriez" to "récupèreriez",
            "récupéreraient" to "récupèreraient"
        )

        // Référer (Rapporter une chose à une autre)
        val refererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "référerai" to "réfèrerai",
            "référeras" to "réfèreras",
            "référera" to "réfèrera",
            "référerons" to "réfèrerons",
            "référerez" to "réfèrerez",
            "référeront" to "réfèreront",

            // Conditionnel Présent
            "référerais" to "réfèrerais",
            "référerait" to "réfèrerait",
            "référerions" to "réfèrerions",
            "référeriez" to "réfèreriez",
            "référeraient" to "réfèreraient"
        )

        // Réfrigérer (Refroidir artificiellement)
        val refrigererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réfrigérerai" to "réfrigèrerai",
            "réfrigéreras" to "réfrigèreras",
            "réfrigérera" to "réfrigèrera",
            "réfrigérerons" to "réfrigèrerons",
            "réfrigérerez" to "réfrigèrerez",
            "réfrigéreront" to "réfrigèreront",

            // Conditionnel Présent
            "réfrigérerais" to "réfrigèrerais",
            "réfrigérerait" to "réfrigèrerait",
            "réfrigérerions" to "réfrigèrerions",
            "réfrigéreriez" to "réfrigèreriez",
            "réfrigéreraient" to "réfrigèreraient"
        )

        // Régénérer (Donner une nouvelle vie, renouveler)
        val regenererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "régénérerai" to "régènérerai",
            "régénéreras" to "régènéreras",
            "régénérera" to "régènérera",
            "régénérerons" to "régènérerons",
            "régénérerez" to "régènérerez",
            "régénéreront" to "régènéreront",

            // Conditionnel Présent
            "régénérerais" to "régènérerais",
            "régénérerait" to "régènérerait",
            "régénérerions" to "régènérerions",
            "régénéreriez" to "régènéreriez",
            "régénéreraient" to "régènéreraient"
        )

        // Réincarcérer (Incarcérer de nouveau)
        val reincarcererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réincarcérerai" to "réincarcèrerai",
            "réincarcéreras" to "réincarcèreras",
            "réincarcérera" to "réincarcèrera",
            "réincarcérerons" to "réincarcèrerons",
            "réincarcérerez" to "réincarcèrerez",
            "réincarcéreront" to "réincarcèreront",

            // Conditionnel Présent
            "réincarcérerais" to "réincarcèrerais",
            "réincarcérerait" to "réincarcèrerait",
            "réincarcérerions" to "réincarcèrerions",
            "réincarcéreriez" to "réincarcèreriez",
            "réincarcéreraient" to "réincarcèreraient"
        )

        // Réinsérer (Insérer de nouveau ; réintégrer socialement)
        val reinsererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réinsérerai" to "réinsèrerai",
            "réinséreras" to "réinsèreras",
            "réinsérera" to "réinsèrera",
            "réinsérerons" to "réinsèrerons",
            "réinsérerez" to "réinsèrerez",
            "réinséreront" to "réinsèreront",

            // Conditionnel Présent
            "réinsérerais" to "réinsèrerais",
            "réinsérerait" to "réinsèrerait",
            "réinsérerions" to "réinsèrerions",
            "réinséreriez" to "réinsèreriez",
            "réinséreraient" to "réinsèreraient"
        )

        // Réitérer (Renouveler, faire de nouveau)
        val reitererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réitérerai" to "réitèrerai",
            "réitéreras" to "réitèreras",
            "réitérera" to "réitèrera",
            "réitérerons" to "réitèrerons",
            "réitérerez" to "réitèrerez",
            "réitéreront" to "réitèreront",

            // Conditionnel Présent
            "réitérerais" to "réitèrerais",
            "réitérerait" to "réitèrerait",
            "réitérerions" to "réitèrerions",
            "réitéreriez" to "réitèreriez",
            "réitéreraient" to "réitèreraient"
        )

        // Rémunérer (Donner un salaire, une récompense pour un travail)
        val remunererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rémunérerai" to "rémunèrerai",
            "rémunéreras" to "rémunèreras",
            "rémunérera" to "rémunèrera",
            "rémunérerons" to "rémunèrerons",
            "rémunérerez" to "rémunèrerez",
            "rémunéreront" to "rémunèreront",

            // Conditionnel Présent
            "rémunérerais" to "rémunèrerais",
            "rémunérerait" to "rémunèrerait",
            "rémunérerions" to "rémunèrerions",
            "rémunéreriez" to "rémunèreriez",
            "rémunéreraient" to "rémunèreraient"
        )

        // Réopérer (Opérer une seconde fois)
        val reopererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réopérerai" to "réopèrerai",
            "réopéreras" to "réopèreras",
            "réopérera" to "réopèrera",
            "réopérerons" to "réopèrerons",
            "réopérerez" to "réopèrerez",
            "réopéreront" to "réopèreront",

            // Conditionnel Présent
            "réopérerais" to "réopèrerais",
            "réopérerait" to "réopèrerait",
            "réopérerions" to "réopèrerions",
            "réopéreriez" to "réopèreriez",
            "réopéreraient" to "réopèreraient"
        )

        // Repérer (Découvrir, reconnaître par des signes)
        val repererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "repérerai" to "repèrerai",
            "repéreras" to "repèreras",
            "repérera" to "repèrera",
            "repérerons" to "repèrerons",
            "repérerez" to "repèrerez",
            "repéreront" to "repèreront",

            // Conditionnel Présent
            "repérerais" to "repèrerais",
            "repérerait" to "repèrerait",
            "repérerions" to "repèrerions",
            "repéreriez" to "repèreriez",
            "repéreraient" to "repèreraient"
        )

        // Réverbérer (Renvoyer la lumière ou la chaleur)
        val reverbererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réverbérerai" to "réverbèrerai",
            "réverbéreras" to "réverbèreras",
            "réverbérera" to "réverbèrera",
            "réverbérerons" to "réverbèrerons",
            "réverbérerez" to "réverbèrerez",
            "réverbéreront" to "réverbèreront",

            // Conditionnel Présent
            "réverbérerais" to "réverbèrerais",
            "réverbérerait" to "réverbèrerait",
            "réverbérerions" to "réverbèrerions",
            "réverbéreriez" to "réverbèreriez",
            "réverbéreraient" to "réverbèreraient"
        )

        // Révérer (Traiter avec un respect profond)
        val revererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "révérerai" to "révèrerai",
            "révéreras" to "révèreras",
            "révérera" to "révèrera",
            "révérerons" to "révèrerons",
            "révérerez" to "révèrerez",
            "révéreront" to "révèreront",

            // Conditionnel Présent
            "révérerais" to "révèrerais",
            "révérerait" to "révèrerait",
            "révérerions" to "révèrerions",
            "révéreriez" to "révèreriez",
            "révéreraient" to "révèreraient"
        )

        // Salterer (Action relative au verbe salterer)
// S'altérer (Se détériorer, se modifier)
        val saltererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "altérerai" to "altèrerai",
            "altéreras" to "altèreras",
            "altérera" to "altèrera",
            "altérerons" to "altèrerons",
            "altérerez" to "altèrerez",
            "altéreront" to "altèreront",

            // Conditionnel Présent
            "altérerais" to "altèrerais",
            "altérerait" to "altèrerait",
            "altérerions" to "altèrerions",
            "altéreriez" to "altèreriez",
            "altéreraient" to "altèreraient"
        )

        // Sidérer (Frapper de stupeur)
        val sidererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sidérerai" to "sidèrerai",
            "sidéreras" to "sidèreras",
            "sidérera" to "sidèrera",
            "sidérerons" to "sidèrerons",
            "sidérerez" to "sidèrerez",
            "sidéreront" to "sidèreront",

            // Conditionnel Présent
            "sidérerais" to "sidèrerais",
            "sidérerait" to "sidèrerait",
            "sidérerions" to "sidèrerions",
            "sidéreriez" to "sidèreriez",
            "sidéreraient" to "sidèreraient"
        )

        // Singerer (Action relative au verbe singerer)
// S'ingérer (S'introduire indûment dans les affaires d'autrui)
        val singererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "ingérerai" to "ingèrerai",
            "ingéreras" to "ingèreras",
            "ingérera" to "ingèrera",
            "ingérerons" to "ingèrerons",
            "ingérerez" to "ingèrerez",
            "ingéreront" to "ingèreront",

            // Conditionnel Présent
            "ingérerais" to "ingèrerais",
            "ingérerait" to "ingèrerait",
            "ingérerions" to "ingèrerions",
            "ingéreriez" to "ingèreriez",
            "ingéreraient" to "ingèreraient"
        )

        // Sinserer (Action relative au verbe sinserer)
// S'insérer (Se placer, s'introduire dans un ensemble)
        val sinsererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "insérerai" to "insèrerai",
            "inséreras" to "insèreras",
            "insérera" to "insèrera",
            "insérerons" to "insèrerons",
            "insérerez" to "insèrerez",
            "inséreront" to "insèreront",

            // Conditionnel Présent
            "insérerais" to "insèrerais",
            "insérerait" to "insèrerait",
            "insérerions" to "insèrerions",
            "inséreriez" to "insèreriez",
            "inséreraient" to "insèreraient"
        )

        // Stérer (Mesurer du bois en stères)
        val stererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "stérerai" to "stèrerai",
            "stéreras" to "stèreras",
            "stérera" to "stèrera",
            "stérerons" to "stèrerons",
            "stérerez" to "stèrerez",
            "stéreront" to "stèreront",

            // Conditionnel Présent
            "stérerais" to "stèrerais",
            "stérerait" to "stèrerait",
            "stérerions" to "stèrerions",
            "stéreriez" to "stèreriez",
            "stéreraient" to "stèreraient"
        )

        // Suggérer (Inspirer une idée, proposer)
        val suggererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "suggérerai" to "suggèrerai",
            "suggéreras" to "suggèreras",
            "suggérera" to "suggèrera",
            "suggérerons" to "suggèrerons",
            "suggérerez" to "suggèrerez",
            "suggéreront" to "suggèreront",

            // Conditionnel Présent
            "suggérerais" to "suggèrerais",
            "suggérerait" to "suggèrerait",
            "suggérerions" to "suggèrerions",
            "suggéreriez" to "suggèreriez",
            "suggéreraient" to "suggèreraient"
        )

        // Tempérer (Modérer, adoucir)
        val tempererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "tempérerai" to "tempèrerai",
            "tempéreras" to "tempèreras",
            "tempérera" to "tempèrera",
            "tempérerons" to "tempèrerons",
            "tempérerez" to "tempèrerez",
            "tempéreront" to "tempèreront",

            // Conditionnel Présent
            "tempérerais" to "tempèrerais",
            "tempérerait" to "tempèrerait",
            "tempérerions" to "tempèrerions",
            "tempéreriez" to "tempèreriez",
            "tempéreraient" to "tempèreraient"
        )

        // Tolérer (Supporter ce qu'on ne peut éviter ; admettre)
        val tolererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "tolérerai" to "tolèrerai",
            "toléreras" to "tolèreras",
            "tolérera" to "tolèrera",
            "tolérerons" to "tolèrerons",
            "tolérerez" to "tolèrerez",
            "toléreront" to "tolèreront",

            // Conditionnel Présent
            "tolérerais" to "tolèrerais",
            "tolérerait" to "tolèrerait",
            "tolérerions" to "tolèrerions",
            "toléreriez" to "tolèreriez",
            "toléreraient" to "tolèreraient"
        )

        // Transférer (Déplacer d'un lieu à un autre)
        val transfererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "transférerai" to "transfèrerai",
            "transféreras" to "transfèreras",
            "transférera" to "transfèrera",
            "transférerons" to "transfèrerons",
            "transférerez" to "transfèrerez",
            "transféreront" to "transfèreront",

            // Conditionnel Présent
            "transférerais" to "transfèrerais",
            "transférerait" to "transfèrerait",
            "transférerions" to "transfèrerions",
            "transféreriez" to "transfèreriez",
            "transféreraient" to "transfèreraient"
        )

        // Translitérer (Transcrire lettre par lettre dans un autre alphabet)
        val translitererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "translitérerai" to "translitèrerai",
            "translitéreras" to "translitèreras",
            "translitérera" to "translitèrera",
            "translitérerons" to "translitèrerons",
            "translitérerez" to "translitèrerez",
            "translitéreront" to "translitèreront",

            // Conditionnel Présent
            "translitérerais" to "translitèrerais",
            "translitérerait" to "translitèrerait",
            "translitérerions" to "translitèrerions",
            "translitéreriez" to "translitèreriez",
            "translitéreraient" to "translitèreraient"
        )

        // Translittérer (Variante orthographique de translitérer)
        val translittererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "translittérerai" to "translittèrerai",
            "translittéreras" to "translittèreras",
            "translittérera" to "translittèrera",
            "translittérerons" to "translittèrerons",
            "translittérerez" to "translittèrerez",
            "translittéreront" to "translittèreront",

            // Conditionnel Présent
            "translittérerais" to "translittèrerais",
            "translittérerait" to "translittèrerait",
            "translittérerions" to "translittèrerions",
            "translittéreriez" to "translittèreriez",
            "translittéreraient" to "translittèreraient"
        )
        // Ulcérer (Causer une plaie ; blesser vivement)
        val ulcererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "ulcérerai" to "ulcèrerai",
            "ulcéreras" to "ulcèreras",
            "ulcérera" to "ulcèrera",
            "ulcérerons" to "ulcèrerons",
            "ulcérerez" to "ulcèrerez",
            "ulcéreront" to "ulcèreront",

            // Conditionnel Présent
            "ulcérerais" to "ulcèrerais",
            "ulcérerait" to "ulcèrerait",
            "ulcérerions" to "ulcèrerions",
            "ulcéreriez" to "ulcèreriez",
            "ulcéreraient" to "ulcèreraient"
        )

        // Vénérer (Adorer, rendre un culte)
        val venererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "vénérerai" to "vénèrerai",
            "vénéreras" to "vénèreras",
            "vénérera" to "vénèrera",
            "vénérerons" to "vénèrerons",
            "vénérerez" to "vénèrerez",
            "vénéreront" to "vénèreront",

            // Conditionnel Présent
            "vénérerais" to "vénèrerais",
            "vénérerait" to "vénèrerait",
            "vénérerions" to "vénèrerions",
            "vénéreriez" to "vénèreriez",
            "vénéreraient" to "vénèreraient"
        )

        // Vitupérer (Blâmer avec violence)
        val vitupererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "vitupérerai" to "vitupèrerai",
            "vitupéreras" to "vitupèreras",
            "vitupérera" to "vitupèrera",
            "vitupérerons" to "vitupèrerons",
            "vitupérerez" to "vitupèrerez",
            "vitupéreront" to "vitupèreront",

            // Conditionnel Présent
            "vitupérerais" to "vitupèrerais",
            "vitupérerait" to "vitupèrerait",
            "vitupérerions" to "vitupèrerions",
            "vitupéreriez" to "vitupèreriez",
            "vitupéreraient" to "vitupèreraient"
        )

        // Vociférer (Crier avec colère)
        val vocifererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "vociférerai" to "vocifèrerai",
            "vociféreras" to "vocifèreras",
            "vociférera" to "vocifèrera",
            "vociférerons" to "vocifèrerons",
            "vociférerez" to "vocifèrerez",
            "vociféreront" to "vocifèreront",

            // Conditionnel Présent
            "vociférerais" to "vocifèrerais",
            "vociférerait" to "vocifèrerait",
            "vociférerions" to "vocifèrerions",
            "vociféreriez" to "vocifèreriez",
            "vociféreraient" to "vocifèreraient"
        )
        // Atterer (Variante de atterrer : frapper de stupeur)
        val attererModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "attérerai" to "attèrerai",
            "attéreras" to "attèreras",
            "attérera" to "attèrera",
            "attérerons" to "attèrerons",
            "attérerez" to "attèrerez",
            "attéreront" to "attèreront",
            // Conditionnel Présent
            "attérerais" to "attèrerais",
            "attérerait" to "attèrerait",
            "attérerions" to "attèrerions",
            "attéreriez" to "attèreriez",
            "attéreraient" to "attèreraient"
        )
        val erer : Map<String, String> =
            accelererModifAccent +
                    acererModifAccent +
                    aciererModifAccent +
                    adhererModifAccent +
                    adultererModifAccent +
                    aererModifAccent +
                    affererModifAccent +
                    agglomererModifAccent +
                    allitererModifAccent +
                    altererModifAccent +
                    arriererModifAccent +
                    attererModifAccent +
                    autogererModifAccent +
                    avererModifAccent +
                    barriererModifAccent +
                    blatererModifAccent +
                    cadavererModifAccent +
                    camembererModifAccent +
                    chererModifAccent +
                    cogererModifAccent +
                    cohererModifAccent +
                    colererModifAccent +
                    commererModifAccent +
                    confedererModifAccent +
                    confererModifAccent +
                    conglomererModifAccent +
                    congregerModifAccent +
                    considererModifAccent +
                    coopererModifAccent +
                    deblatererModifAccent +
                    decelererModifAccent +
                    decohererModifAccent +
                    decolererModifAccent +
                    deconsidererModifAccent +
                    defererModifAccent +
                    degenererModifAccent +
                    delibererModifAccent +
                    depoussiererModifAccent +
                    desaciererModifAccent +
                    desaererModifAccent +
                    desaltererModifAccent +
                    desaubiererModifAccent +
                    desempoussiererModifAccent +
                    desespererModifAccent +
                    desincarcererModifAccent +
                    desinsererModifAccent +
                    differerModifAccent +
                    digererModifAccent +
                    dilacererModifAccent +
                    empoussiererModifAccent +
                    encolererModifAccent +
                    enstererModifAccent +
                    enumererModifAccent +
                    espererModifAccent +
                    eviscererModifAccent +
                    exagererModifAccent +
                    exaspererModifAccent +
                    exonererModifAccent +
                    exulcererModifAccent +
                    federerModifAccent +
                    galererModifAccent +
                    genererModifAccent +
                    gererModifAccent +
                    incamererModifAccent +
                    incarcererModifAccent +
                    incererModifAccent +
                    incinererModifAccent +
                    incohererModifAccent +
                    indiffererModifAccent +
                    indigererModifAccent +
                    infererModifAccent +
                    ingererModifAccent +
                    insererModifAccent +
                    interfererModifAccent +
                    invetererModifAccent +
                    itererModifAccent +
                    jachererModifAccent +
                    lacererModifAccent +
                    legifererModifAccent +
                    libererModifAccent +
                    lisererAccentuModifAccent +
                    macererModifAccent +
                    maniererModifAccent +
                    memererModifAccent +
                    modererModifAccent +
                    obererModifAccent +
                    oblitererModifAccent +
                    obtempererModifAccent +
                    opererModifAccent +
                    persevererModifAccent +
                    pestifererModifAccent +
                    pondererModifAccent +
                    prefererModifAccent +
                    profererModifAccent +
                    prolifererModifAccent +
                    prospererModifAccent +
                    reaccelererModifAccent +
                    reconsidererModifAccent +
                    recupererModifAccent +
                    refererModifAccent +
                    refrigererModifAccent +
                    regenererModifAccent +
                    reincarcererModifAccent +
                    reingererModifAccent +
                    reinsererModifAccent +
                    reitererModifAccent +
                    remunererModifAccent +
                    remererModifAccent +
                    reopererModifAccent +
                    repererModifAccent +
                    retransfererModifAccent +
                    reverbererModifAccent +
                    revererModifAccent +
                    saltererModifAccent +
                    sidererModifAccent +
                    singererModifAccent +
                    sinsererModifAccent +
                    sousRemunererModifAccent +
                    stererModifAccent +
                    suggererModifAccent +
                    teleopererModifAccent +
                    tempererModifAccent +
                    tolererModifAccent +
                    transfererModifAccent +
                    translitererModifAccent +
                    translittererModifAccent +
                    transverbererModifAccent +
                    ulcererModifAccent +
                    venererModifAccent +
                    vitupererModifAccent +
                    vocifererModifAccent +
                    vulnererModifAccent
    }
}