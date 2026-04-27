package com.toutcourtc.tests.verbes.accentsaiguversgrave

class StringHarmonizationEter {
    companion object{

        // Il est indispensable de vérifier si c'est le verbe conjugué de la phrase avant de faire la comparaison
        // Afin d'éviter une harmonization incensée comme canette (verbe et nom)
        // Alternative : faire l'harmonization avec des verbes ciblés seulement

        //En règle générale, les verbes en -eler et en -eter doublent la consonne l ou t devant un e muet :
        // je jette et j'appelle. Quelques verbes ne doublent pas le l ou le t devant un e muet.
        // Ils prennent alors un accent grave sur le e qui précède le t ou le l. Un exemple est j'achète.
        // Ce sont des verbes irréguliers. Les modèles sont acheter et geler. En voici la liste :

        //mnémo
        //Ce conseiller dit étonnamment et galamment :
        // « mon mari préfère acheter beaucoup, car ce fameux fils hait rembourser. »


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
        // Accréter (Accroître par apport de matière)
        val accreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "accréterai" to "accrèterai",
            "accréteras" to "accrèteras",
            "accrétera" to "accrètera",
            "accréterons" to "accrèterons",
            "accréterez" to "accrèterez",
            "accréteront" to "accrèteront",

            // Conditionnel Présent
            "accréterais" to "accrèterais",
            "accréterait" to "accrèterait",
            "accréterions" to "accrèterions",
            "accréteriez" to "accrèteriez",
            "accréteraient" to "accrèteraient"
        )

        val admoneterModifAccent : Map<String, String> = mapOf(

            // Futur simple (Toutes les personnes)
            "admonétera" to "admonètera",
            "admonéteras" to "admonèteras",
            "admonéterai" to "admonèterai",
            "admonéterons" to "admonèterons",
            "admonéterez" to "admonèterez",
            "admonéteront" to "admonèteront",

            // Conditionnel présent (Toutes les personnes)
            "admonéterais" to "admonèterais",
            "admonéterait" to "admonèterait",
            "admonéterions" to "admonèterions",
            "admonéteriez" to "admonèteriez",
            "admonéteraient" to "admonèteraient"
        )

        // Affréter (Louer un navire ou un moyen de transport)
        val affreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "affréterai" to "affrèterai",
            "affréteras" to "affrèteras",
            "affrétera" to "affrètera",
            "affréterons" to "affrèterons",
            "affréterez" to "affrèterez",
            "affréteront" to "affrèteront",

            // Conditionnel Présent
            "affréterais" to "affrèterais",
            "affréterait" to "affrèterait",
            "affréterions" to "affrèterions",
            "affréteriez" to "affrèteriez",
            "affréteraient" to "affrèteraient"
        )

        // Aiguilleter (Attacher avec une aiguillette ; serrer avec un cordage)
        val aiguilleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "aiguillette" to "aiguillète",
            "aiguillettes" to "aiguillètes",
            "aiguillettent" to "aiguillètent",

            // Futur Simple
            "aiguilletterai" to "aiguillèterai",
            "aiguilletteras" to "aiguillèteras",
            "aiguilletera" to "aiguillètera",
            "aiguilletterons" to "aiguillèterons",
            "aiguilletterez" to "aiguillèterez",
            "aiguilletteront" to "aiguillèteront",

            // Conditionnel Présent
            "aiguilletterais" to "aiguillèterais",
            "aiguilletterait" to "aiguillèterait",
            "aiguilletterions" to "aiguillèterions",
            "aiguilletteriez" to "aiguillèteriez",
            "aiguilletteraient" to "aiguillèteraient"
        )

        // Appéter (Désirer instinctivement, tendre vers)
        val appeterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "appéterai" to "appèterai",
            "appéteras" to "appèteras",
            "appétera" to "appètera",
            "appéterons" to "appèterons",
            "appéterez" to "appèterez",
            "appéteront" to "appèteront",

            // Conditionnel Présent
            "appéterais" to "appèterais",
            "appéterait" to "appèterait",
            "appéterions" to "appèterions",
            "appéteriez" to "appèteriez",
            "appéteraient" to "appèteraient"
        )

        // Banqueter (Faire un banquet)
        val banqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "banquette" to "banquète",
            "banquettes" to "banquètes",
            "banquettent" to "banquètent",

            // Futur Simple
            "banquetterai" to "banquèterai",
            "banquetteras" to "banquèteras",
            "banquettera" to "banquètera",
            "banquetterons" to "banquèterons",
            "banquetterez" to "banquèterez",
            "banquetteront" to "banquèteront",

            // Conditionnel Présent
            "banquetterais" to "banquèterais",
            "banquetterait" to "banquèterait",
            "banquetterions" to "banquèterions",
            "banquetteriez" to "banquèteriez",
            "banquetteraient" to "banquèteraient"
        )

        // Baqueter (Dégager l'eau avec un baquet)
        val baqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "baquette" to "baquète",
            "baquettes" to "baquètes",
            "baquettent" to "baquètent",

            // Futur Simple
            "baquetterai" to "baquèterai",
            "baquetteras" to "baquèteras",
            "baquettera" to "baquètera",
            "baquetterons" to "baquèterons",
            "baquetterez" to "baquèterez",
            "baquetteront" to "baquèteront",

            // Conditionnel Présent
            "baquetterais" to "baquèterais",
            "baquetterait" to "baquèterait",
            "baquetterions" to "baquèterions",
            "baquetteriez" to "baquèteriez",
            "baquetteraient" to "baquèteraient"
        )

        // Baréter (Pousser son cri, en parlant de l'éléphant ou du rhinocéros)
        val bareterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "baréterai" to "barèterai",
            "baréteras" to "barèteras",
            "barétera" to "barètera",
            "baréterons" to "barèterons",
            "baréterez" to "barèterez",
            "baréteront" to "barèteront",

            // Conditionnel Présent
            "baréterais" to "barèterais",
            "baréterait" to "barèterait",
            "baréterions" to "barèterions",
            "baréteriez" to "barèteriez",
            "baréteraient" to "barèteraient"
        )

        // Bêcheveter (Attacher des bêtes tête-bêche)
        val becheveterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "bêchevette" to "bêchevète",
            "bêchevettes" to "bêchevètes",
            "bêchevettent" to "bêchevètent",

            // Futur Simple
            "bêchevetterai" to "bêchevèterai",
            "bêchevetteras" to "bêchevèteras",
            "bêchevettera" to "bêchevètera",
            "bêchevetterons" to "bêchevèterons",
            "bêchevetterez" to "bêchevèterez",
            "bêchevetteront" to "bêchevèteront",

            // Conditionnel Présent
            "bêchevetterais" to "bêchevèterais",
            "bêchevetterait" to "bêchevèterait",
            "bêchevetterions" to "bêchevèterions",
            "bêchevetteriez" to "bêchevèteriez",
            "bêchevetteraient" to "bêchevèteraient"
        )

        // Bégueter (Pousser son cri, en parlant de la chèvre)
        val begueterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "bégueterai" to "béguèterai",
            "bégueteras" to "béguèteras",
            "béguetera" to "béguètera",
            "bégueterons" to "béguèterons",
            "bégueterez" to "béguèterez",
            "bégueteront" to "béguèteront",

            // Conditionnel Présent
            "bégueterais" to "béguèterais",
            "bégueterait" to "béguèterait",
            "bégueterions" to "béguèterions",
            "bégueteriez" to "béguèteriez",
            "béguéteraient" to "béguèteraient"
        )

        // Béqueter (Saisir avec le bec - variante de becqueter)
        val bequeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "béquette" to "béquète",
            "béquettes" to "béquètes",
            "béquettent" to "béquètent",

            // Futur Simple
            "béquetterai" to "béquèterai",
            "béquetteras" to "béquèteras",
            "béquettera" to "béquètera",
            "béquetterons" to "béquèterons",
            "béquetterez" to "béquèterez",
            "béquetteront" to "béquèteront",

            // Conditionnel Présent
            "béquetterais" to "béquèterais",
            "béquetterait" to "béquèterait",
            "béquetterions" to "béquèterions",
            "béquetteriez" to "béquèteriez",
            "béquetteraient" to "béquèteraient"
        )

        // Biqueter (Mettre bas, en parlant de la chèvre)
        val biqueterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "biquette" to "biquète",
            "biquettes" to "biquètes",
            "biquettent" to "biquètent",

            // Futur Simple
            "biquetterai" to "biquèterai",
            "biquetteras" to "biquèteras",
            "biquettera" to "biquètera",
            "biquetterons" to "biquèterons",
            "biquetterez" to "biquèterez",
            "biquetteront" to "biquèteront",

            // Conditionnel Présent
            "biquetterais" to "biquèterais",
            "biquetterait" to "biquèterait",
            "biquetterions" to "biquèterions",
            "biquetteriez" to "biquèteriez",
            "biquetteraient" to "biquèteraient"
        )

        // Bonneter (Saluer en ôtant son bonnet ou flatter bassement)
        val bonneterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "bonnette" to "bonnète",
            "bonnettes" to "bonnètes",
            "bonnettent" to "bonnètent",

            // Futur Simple
            "bonnetterai" to "bonnèterai",
            "bonnetteras" to "bonnèteras",
            "bonnettera" to "bonnètera",
            "bonnetterons" to "bonnèterons",
            "bonnetterez" to "bonnèterez",
            "bonnetteront" to "bonnèteront",

            // Conditionnel Présent
            "bonnetterais" to "bonnèterais",
            "bonnetterait" to "bonnèterait",
            "bonnetterions" to "bonnèterions",
            "bonnetteriez" to "bonnèteriez",
            "bonnetteraient" to "bonnèteraient"
        )

        // Bouveter (Assembler par rainure et languette)
        val bouveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "bouvette" to "bouvète",
            "bouvettes" to "bouvètes",
            "bouvettent" to "bouvètent",

            // Futur Simple
            "bouvetterai" to "bouvèterai",
            "bouvetteras" to "bouvèteras",
            "bouvettera" to "bouvètera",
            "bouvetterons" to "bouvèterons",
            "bouvetterez" to "bouvèterez",
            "bouvetteront" to "bouvèteront",

            // Conditionnel Présent
            "bouvetterais" to "bouvèterais",
            "bouvetterait" to "bouvèterait",
            "bouvetterions" to "bouvèterions",
            "bouvetteriez" to "bouvèteriez",
            "bouvetteraient" to "bouvèteraient"
        )

        // Bouqueter (Disposer en bouquets ou se tenir ramassé)
        val bouqueterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "bouquette" to "bouquète",
            "bouquettes" to "bouquètes",
            "bouquettent" to "bouquètent",

            // Futur Simple
            "bouquetterai" to "bouquèterai",
            "bouquetteras" to "bouquèteras",
            "bouquettera" to "bouquètera",
            "bouquetterons" to "bouquèterons",
            "bouquetterez" to "bouquèterez",
            "bouquetteront" to "bouquèteront",

            // Conditionnel Présent
            "bouquetterais" to "bouquèterais",
            "bouquetterait" to "bouquèterait",
            "bouquetterions" to "bouquèterions",
            "bouquetteriez" to "bouquèteriez",
            "bouquetteraient" to "bouquèteraient"
        )

        // Breveter (Accorder un brevet)
        val breveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "brevette" to "brevète",
            "brevettes" to "brevètes",
            "brevettent" to "brevètent",

            // Futur Simple
            "brevetterai" to "brevèterai",
            "brevetteras" to "brevèteras",
            "brevettera" to "brevètera",
            "brevetterons" to "brevèterons",
            "brevetterez" to "brevèterez",
            "brevetteront" to "brevèteront",

            // Conditionnel Présent
            "brevetterais" to "brevèterais",
            "brevetterait" to "brevèterait",
            "brevetterions" to "brevèterions",
            "brevetteriez" to "brevèteriez",
            "brevetteraient" to "brevèteraient"
        )

        // Briqueter (Revêtir de briques)
        val briqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "briquette" to "briquète",
            "briquettes" to "briquètes",
            "briquettent" to "briquètent",

            // Futur Simple
            "briquetterai" to "briquèterai",
            "briquetteras" to "briquèteras",
            "briquettera" to "briquètera",
            "briquetterons" to "briquèterons",
            "briquetterez" to "briquèterez",
            "briquetteront" to "briquèteront",

            // Conditionnel Présent
            "briquetterais" to "briquèterais",
            "briquetterait" to "briquèterait",
            "briquetterions" to "briquèterions",
            "briquetteriez" to "briquèteriez",
            "briquetteraient" to "briquèteraient"
        )

        // Brocheter (Attacher avec une brochette)
        val brocheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "brochette" to "brochète",
            "brochettes" to "brochètes",
            "brochettent" to "brochètent",

            // Futur Simple
            "brochetterai" to "brochèterai",
            "brochetteras" to "brochèteras",
            "brochettera" to "brochètera",
            "brochetterons" to "brochèterons",
            "brochetterez" to "brochèterez",
            "brochetteront" to "brochèteront",

            // Conditionnel Présent
            "brochetterais" to "brochèterais",
            "brochetterait" to "brochèterait",
            "brochetterions" to "brochèterions",
            "brochetteriez" to "brochèteriez",
            "brochetteraient" to "brochèteraient"
        )

        // Budgéter (Inscrire au budget)
        val budgeterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "budgéterai" to "budgèterai",
            "budgéteras" to "budgèteras",
            "budgétera" to "budgètera",
            "budgéterons" to "budgèterons",
            "budgéterez" to "budgèterez",
            "budgéteront" to "budgèteront",

            // Conditionnel Présent
            "budgéterais" to "budgèterais",
            "budgéterait" to "budgèterait",
            "budgéterions" to "budgèterions",
            "budgéteriez" to "budgèteriez",
            "budgéteraient" to "budgèteraient"
        )

        // Buffeter (Garnir de cuir ; boire à un buffet)
        val buffeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "buffette" to "buffète",
            "buffettes" to "buffètes",
            "buffettent" to "buffètent",

            // Futur Simple
            "buffetterai" to "buffèterai",
            "buffetteras" to "buffèteras",
            "buffettera" to "buffètera",
            "buffetterons" to "buffèterons",
            "buffetterez" to "buffèterez",
            "buffetteront" to "buffèteront",

            // Conditionnel Présent
            "buffetterais" to "buffèterais",
            "buffetterait" to "buffèterait",
            "buffetterions" to "buffèterions",
            "buffetteriez" to "buffèteriez",
            "buffetteraient" to "buffèteraient"
        )

        // Cacheter (Fermer avec un sceau ou de la colle)
        val cacheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "cachette" to "cachète",
            "cachettes" to "cachètes",
            "cachettent" to "cachètent",

            // Futur Simple
            "cachetterai" to "cachèterai",
            "cachetteras" to "cachèteras",
            "cachettera" to "cachètera",
            "cachetterons" to "cachèterons",
            "cachetterez" to "cachèterez",
            "cachetteront" to "cachèteront",

            // Conditionnel Présent
            "cachetterais" to "cachèterais",
            "cachetterait" to "cachèterait",
            "cachetterions" to "cachèterions",
            "cachetteriez" to "cachèteriez",
            "cachetteraient" to "cachèteraient"
        )

        // Cafeter (Dénoncer, rapporter ; préparer ou servir du café)
        val cafeterModifAccent : Map<String, String> = mapOf(

            // Présent de l'indicatif et subjonctif présent
            "cafette" to "cafète",
            "cafettes" to "cafètes",
            "cafettent" to "cafètent",

            // Futur Simple
            "cafetterai" to "cafèterai",
            "cafetteras" to "cafèteras",
            "cafettera" to "cafètera",
            "cafetterons" to "cafèterons",
            "cafetterez" to "cafèterez",
            "cafetteront" to "cafèteront",

            // Conditionnel Présent
            "cafetterais" to "cafèterais",
            "cafetterait" to "cafèterait",
            "cafetterions" to "cafèterions",
            "cafetteriez" to "cafèteriez",
            "cafetteraient" to "cafèteraient"
        )

        // Cailleter (Bavarder de choses futiles)
        val cailleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "caillette" to "caillète",
            "caillettes" to "caillètes",
            "caillettent" to "caillètent",

            // Futur Simple
            "cailletterai" to "caillèterai",
            "cailletteras" to "caillèteras",
            "caillettera" to "caillètera",
            "cailletterons" to "caillèterons",
            "cailletterez" to "caillèterez",
            "cailletteront" to "caillèteront",

            // Conditionnel Présent
            "cailletterais" to "caillèterais",
            "cailletterait" to "caillèterait",
            "cailletterions" to "caillèterions",
            "cailletteriez" to "caillèteriez",
            "cailletteraient" to "caillèteraient"
        )

        // Caleter (S'enfuir, s'en aller ; caler un objet)
        val caleterModifAccent : Map<String, String> = mapOf(

            // Présent de l'indicatif et subjonctif présent
            "calette" to "calète",
            "calettes" to "calètes",
            "calettent" to "calètent",

            // Futur Simple
            "caletterai" to "calèterai",
            "caletteras" to "calèteras",
            "calettera" to "calètera",
            "caletterons" to "calèterons",
            "caletterez" to "calèterez",
            "caletteront" to "calèteront",

            // Conditionnel Présent
            "caletterais" to "calèterais",
            "caletterait" to "calèterait",
            "caletterions" to "calèterions",
            "caletteriez" to "calèteriez",
            "caletteraient" to "calèteraient"
        )

        // Caneter (Marcher comme un canard)
        val caneterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "canette" to "canète",
            "canettes" to "canètes",
            "canettent" to "canètent",

            // Futur Simple
            "canetterai" to "canèterai",
            "canetteras" to "canèteras",
            "canettera" to "canètera",
            "canetterons" to "canèterons",
            "canetterez" to "canèterez",
            "canetteront" to "canèteront",

            // Conditionnel Présent
            "canetterais" to "canèterais",
            "canetterait" to "canèterait",
            "canetterions" to "canèterions",
            "canetteriez" to "canèteriez",
            "canetteraient" to "canèteraient"
        )

        // Caqueter (Crier comme une poule ; bavarder)
        val caqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "caquette" to "caquète",
            "caquettes" to "caquètes",
            "caquettent" to "caquètent",

            // Futur Simple
            "caquetterai" to "caquèterai",
            "caquetteras" to "caquèteras",
            "caquettera" to "caquètera",
            "caquetterons" to "caquèterons",
            "caquetterez" to "caquèterez",
            "caquetteront" to "caquèteront",

            // Conditionnel Présent
            "caquetterais" to "caquèterais",
            "caquetterait" to "caquèterait",
            "caquetterions" to "caquèterions",
            "caquetteriez" to "caquèteriez",
            "caquetteraient" to "caquèteraient"
        )

        // Causeter (Parler familièrement de choses peu importantes)
        val causeterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "causette" to "causète",
            "causettes" to "causètes",
            "causettent" to "causètent",

            // Futur Simple
            "causetterai" to "causèterai",
            "causetteras" to "causèteras",
            "causettera" to "causètera",
            "causetterons" to "causèterons",
            "causetterez" to "causèterez",
            "causetteront" to "causèteront",

            // Conditionnel Présent
            "causetterais" to "causèterais",
            "causetterait" to "causèterait",
            "causetterions" to "causèterions",
            "causetteriez" to "causèteriez",
            "causetteraient" to "causèteraient"
        )

        // Charreter (Transporter en charrette)
        val charreterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "charrette" to "charrète",
            "charrettes" to "charrètes",
            "charrettent" to "charrètent",

            // Futur Simple
            "charretterai" to "charrèterai",
            "charretteras" to "charrèteras",
            "charrettera" to "charrètera",
            "charretterons" to "charrèterons",
            "charretterez" to "charrèterez",
            "charretteront" to "charrèteront",

            // Conditionnel Présent
            "charretterais" to "charrèterais",
            "charretterait" to "charrèterait",
            "charretterions" to "charrèterions",
            "charretteriez" to "charrèteriez",
            "charretteraient" to "charrèteraient"
        )

        // Chevreter (Mettre bas, pour la chèvre)
        val chevreterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "chevrette" to "chevrète",
            "chevrettes" to "chevrètes",
            "chevrettent" to "chevrètent",

            // Futur Simple
            "chevretterai" to "chevrèterai",
            "chevretteras" to "chevrèteras",
            "chevrettera" to "chevrètera",
            "chevretterons" to "chevrèterons",
            "chevretterez" to "chevrèterez",
            "chevretteront" to "chevrèteront",

            // Conditionnel Présent
            "chevretterais" to "chevrèterais",
            "chevretterait" to "chevrèterait",
            "chevretterions" to "chevrèterions",
            "chevretteriez" to "chevrèteriez",
            "chevretteraient" to "chevrèteraient"
        )

        // Chiqueter (Couper en menus morceaux)
        val chiqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "chiquette" to "chiquète",
            "chiquettes" to "chiquètes",
            "chiquettent" to "chiquètent",

            // Futur Simple
            "chiquetterai" to "chiquèterai",
            "chiquetteras" to "chiquèteras",
            "chiquettera" to "chiquètera",
            "chiqutterons" to "chiquèterons",
            "chiquetterez" to "chiquèterez",
            "chiquetteront" to "chiquèteront",

            // Conditionnel Présent
            "chiquetterais" to "chiquèterais",
            "chiquetterait" to "chiquèterait",
            "chiquetterions" to "chiquèterions",
            "chiquetteriez" to "chiquèteriez",
            "chiquetteraient" to "chiquèteraient"
        )

        // Chucheter (Chuchoter légèrement)
        val chucheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "chuchette" to "chuchète",
            "chuchettes" to "chuchètes",
            "chuchettent" to "chuchètent",

            // Futur Simple
            "chuchetterai" to "chuchèterai",
            "chuchetteras" to "chuchèteras",
            "chuchettera" to "chuchètera",
            "chuchetterons" to "chuchèterons",
            "chuchetterez" to "chuchèterez",
            "chuchetteront" to "chuchèteront",

            // Conditionnel Présent
            "chuchetterais" to "chuchèterais",
            "chuchetterait" to "chuchèterait",
            "chuchetterions" to "chuchèterions",
            "chuchetteriez" to "chuchèteriez",
            "chuchetteraient" to "chuchèteraient"
        )

        // Claqueter (Produire des claquements secs)
        val claqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "claquette" to "claquète",
            "claquettes" to "claquètes",
            "claquettent" to "claquètent",

            // Futur Simple
            "claquetterai" to "claquèterai",
            "claquetteras" to "claquèteras",
            "claquettera" to "claquètera",
            "claquetterons" to "claquèterons",
            "claquetterez" to "claquèterez",
            "claquetteront" to "claquèteront",

            // Conditionnel Présent
            "claquetterais" to "claquèterais",
            "claquetterait" to "claquèterait",
            "claquetterions" to "claquèterions",
            "claquetteriez" to "claquèteriez",
            "claquetteraient" to "claquèteraient"
        )

        // Claveter (Fixer avec une clavette)
        val claveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "clavette" to "clavète",
            "clavettes" to "clavètes",
            "clavettent" to "clavètent",

            // Futur Simple
            "clavetterai" to "clavèterai",
            "clavetteras" to "clavèteras",
            "clavettera" to "clavètera",
            "clavetterons" to "clavèterons",
            "clavetterez" to "clavèterez",
            "clavetteront" to "clavèteront",

            // Conditionnel Présent
            "clavetterais" to "clavèterais",
            "clavetterait" to "clavèterait",
            "clavetterions" to "clavèterions",
            "clavetteriez" to "clavèteriez",
            "clavetteraient" to "clavèteraient"
        )

        // Cliqueter (Faire entendre un cliquetis)
        val cliqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "cliquette" to "cliquète",
            "cliquettes" to "cliquètes",
            "cliquettent" to "cliquètent",

            // Futur Simple
            "cliquetterai" to "cliquèterai",
            "cliquetteras" to "cliquèteras",
            "cliquettera" to "cliquètera",
            "cliquetterons" to "cliquèterons",
            "cliquetterez" to "cliquèterez",
            "cliquetteront" to "cliquèteront",

            // Conditionnel Présent
            "cliquetterais" to "cliquèterais",
            "cliquetterait" to "cliquèterait",
            "cliquetterions" to "cliquèterions",
            "cliquetteriez" to "cliquèteriez",
            "cliquetteraient" to "cliquèteraient"
        )


        // Colleter (Saisir au collet ; munir d'un collet)
        val colleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "collette" to "collète",
            "collettes" to "collètes",
            "collettent" to "collètent",

            // Futur Simple
            "colletterai" to "collèterai",
            "colletteras" to "collèteras",
            "collettera" to "collètera",
            "colletterons" to "collèterons",
            "colletterez" to "collèterez",
            "colletteront" to "collèteront",

            // Conditionnel Présent
            "colletterais" to "collèterais",
            "colletterait" to "collèterait",
            "colletterions" to "collèterions",
            "colletteriez" to "collèteriez",
            "colletteraient" to "collèteraient"
        )


        // Compéter (Être du ressort de, appartenir à)
        val competerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "compéterai" to "compèterai",
            "compéteras" to "compèteras",
            "compétera" to "compètera",
            "compéterons" to "compèterons",
            "compéterez" to "compèterez",
            "compéteront" to "compèteront",

            // Conditionnel Présent
            "compéterais" to "compèterais",
            "compéterait" to "compèterait",
            "compéterions" to "compèterions",
            "compéteriez" to "compèteriez",
            "compéteraient" to "compèteraient"
        )

        // Compléter (Rendre complet)
        val completerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "compléterai" to "complèterai",
            "compléteras" to "complèteras",
            "complétera" to "complètera",
            "compléterons" to "complèterons",
            "compléterez" to "complèterez",
            "compléteront" to "complèteront",

            // Conditionnel Présent
            "compléterais" to "complèterais",
            "compléterait" to "complèterait",
            "compléterions" to "complèterions",
            "compléteriez" to "complèteriez",
            "compléteraient" to "complèteraient"
        )

        // Concréter (Solidifier, transformer en concret)
        val concreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "concréterai" to "concrèterai",
            "concréteras" to "concrèteras",
            "concrétera" to "concrètera",
            "concréterons" to "concrèterons",
            "concréterez" to "concrèterez",
            "concréteront" to "concrèteront",

            // Conditionnel Présent
            "concréterais" to "concrèterais",
            "concréterait" to "concrèterait",
            "concréterions" to "concrèterions",
            "concréteriez" to "concrèteriez",
            "concréteraient" to "concrèteraient"
        )

        // Coqueter (Chercher à plaire par coquetterie)
        val coqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "coquette" to "coquète",
            "coquettes" to "coquètes",
            "coquettent" to "coquètent",

            // Futur Simple
            "coquetterai" to "coquèterai",
            "coquetteras" to "coquèteras",
            "coquettera" to "coquètera",
            "coquetterons" to "coquèterons",
            "coquetterez" to "coquèterez",
            "coquetteront" to "coquèteront",

            // Conditionnel Présent
            "coquetterais" to "coquèterais",
            "coquetterait" to "coquèterait",
            "coquetterions" to "coquèterions",
            "coquetteriez" to "coquèteriez",
            "coquetteraient" to "coquèteraient"
        )

        // Coupleter (Faire des couplets)
        val coupleterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "couplette" to "couplète",
            "couplettes" to "couplètes",
            "couplettent" to "couplètent",

            // Futur Simple
            "coupletterai" to "couplèterai",
            "coupletteras" to "couplèteras",
            "couplettera" to "couplètera",
            "coupletterons" to "couplèterons",
            "coupletterez" to "couplèterez",
            "coupletteront" to "couplèteront",

            // Conditionnel Présent
            "coupletterais" to "couplèterais",
            "coupletterait" to "couplèterait",
            "coupletterions" to "couplèterions",
            "coupletteriez" to "couplèteriez",
            "coupletteraient" to "couplèteraient"
        )

        // Craqueter (Produire de petits craquements)
        val craqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "craquette" to "craquète",
            "craquettes" to "craquètes",
            "craquettent" to "craquètent",

            // Futur Simple
            "craquetterai" to "craquèterai",
            "craquetteras" to "craquèteras",
            "craquettera" to "craquètera",
            "craquetterons" to "craquèterons",
            "craquetterez" to "craquèterez",
            "craquetteront" to "craquèteront",

            // Conditionnel Présent
            "craquetterais" to "craquèterais",
            "craquetterait" to "craquèterait",
            "craquetterions" to "craquèterions",
            "craquetteriez" to "craquèteriez",
            "craquetteraient" to "craquèteraient"
        )

        // Cureter (Nettoyer une cavité avec une curette)
        val cureterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "curette" to "curète",
            "curettes" to "curètes",
            "curettent" to "curètent",

            // Futur Simple
            "curetterai" to "curèterai",
            "curetteras" to "curèteras",
            "curettera" to "curètera",
            "curetterons" to "curèterons",
            "curetterez" to "curèterez",
            "curetteront" to "curèteront",

            // Conditionnel Présent
            "curetterais" to "curèterais",
            "curetterait" to "curèterait",
            "curetterions" to "curèterions",
            "curetteriez" to "curèteriez",
            "curetteraient" to "curèteraient"
        )

        // Débéqueter (Enlever le bec ; en parlant d'un oiseau, briser la coquille de l'œuf)
        val debequeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "débéquette" to "débéquète",
            "débéquettes" to "débéquètes",
            "débéquettent" to "débéquètent",

            // Futur Simple
            "débéquetterai" to "débéquèterai",
            "débéquetteras" to "débéquèteras",
            "débéquettera" to "débéquètera",
            "débéquetterons" to "débéquèterons",
            "débéquetterez" to "débéquèterez",
            "débéquetteront" to "débéquèteront",

            // Conditionnel Présent
            "débéquetterais" to "débéquèterais",
            "débéquetterait" to "débéquèterait",
            "débéquetterions" to "débequèterions",
            "débéquetteriez" to "débequèteriez",
            "débéquetteraient" to "débéquèteraient"
        )

        // Décacheter (Ouvrir ce qui est scellé par un cachet)
        val decacheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "décachette" to "décachète",
            "décachettes" to "décachètes",
            "décachettent" to "décachètent",

            // Futur Simple
            "décachetterai" to "décachèterai",
            "décachetteras" to "décachèteras",
            "décachettera" to "décachètera",
            "décachetterons" to "décachèterons",
            "décachetterez" to "décachèterez",
            "décachetteront" to "décachèteront",

            // Conditionnel Présent
            "décachetterais" to "décachèterais",
            "décachetterait" to "décachèterait",
            "décachetterions" to "decachèterions",
            "décachetteriez" to "decachèteriez",
            "décachetteraient" to "décachèteraient"
        )

        // Déchiqueter (Couper, déchirer en petits morceaux)
        val dechiqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "déchiquette" to "déchiquète",
            "déchiquettes" to "déchiquètes",
            "déchiquettent" to "déchiquètent",

            // Futur Simple
            "déchiquetterai" to "déchiquèterai",
            "déchiquetteras" to "déchiquèteras",
            "déchiquettera" to "déchiquètera",
            "déchiquetterons" to "déchiquèterons",
            "déchiquetterez" to "déchiquèterez",
            "déchiquetteront" to "déchiquèteront",

            // Conditionnel Présent
            "déchiquetterais" to "déchiquèterais",
            "déchiquetterait" to "déchiquèterait",
            "déchiquetterions" to "dechiquèterions",
            "déchiquetteriez" to "dechiquèteriez",
            "déchiquetteraient" to "déchiquèteraient"
        )

        // Déclaveter (Enlever la clavette qui fixe une pièce mécanique)
        val declaveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "déclavette" to "déclavète",
            "déclavettes" to "déclavètes",
            "déclavettent" to "déclavètent",

            // Futur Simple
            "déclavetterai" to "déclavèterai",
            "déclavetteras" to "déclavèteras",
            "déclavettera" to "déclavètera",
            "déclavetterons" to "déclavèterons",
            "déclavetterez" to "déclavèterez",
            "déclavetteront" to "déclavèteront",

            // Conditionnel Présent
            "déclavetterais" to "déclavèterais",
            "déclavetterait" to "déclavèterait",
            "déclavetterions" to "declavèterions",
            "déclavetteriez" to "declavèteriez",
            "déclavetteraient" to "déclavèteraient"
        )

        // Décliqueter (Libérer un cliquet pour débloquer un mécanisme)
        val decliqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "décliquette" to "décliquète",
            "décliquettes" to "décliquètes",
            "décliquettent" to "décliquètent",

            // Futur Simple
            "décliquetterai" to "décliquèterai",
            "décliquetteras" to "décliquèteras",
            "décliquettera" to "décliquètera",
            "décliquetterons" to "décliquèterons",
            "décliquetterez" to "décliquèterez",
            "décliquetteront" to "décliquèteront",

            // Conditionnel Présent
            "décliquetterais" to "décliquèterais",
            "décliquetterait" to "décliquèterait",
            "décliquetterions" to "decliquèterions",
            "décliquetteriez" to "decliquèteriez",
            "décliquetteraient" to "décliquèteraient"
        )

        // Décolleter (Dégager le col ou l'encolure ; ôter le collet de certains légumes)
        val decolleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "décollette" to "décollète",
            "décollettes" to "décollètes",
            "décollettent" to "décollètent",

            // Futur Simple
            "décolletterai" to "décollèterai",
            "décolletteras" to "décollèteras",
            "décollettera" to "décollètera",
            "décolletterons" to "décollèterons",
            "décolletterez" to "décollèterez",
            "décolletteront" to "décollèteront",

            // Conditionnel Présent
            "décolletterais" to "décollèterais",
            "décolletterait" to "décollèterait",
            "décolletterions" to "decollèterions",
            "décolletteriez" to "decollèteriez",
            "décolletteraient" to "décollèteraient"
        )

        // Décompléter
        val decompleterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décompléterai" to "décomplèterai",
            "décompléteras" to "décomplèteras",
            "décomplétera" to "décomplètera",
            "décompléterons" to "décomplèterons",
            "décomplétererez" to "décomplètererez",
            "décompléteront" to "décomplèteront",
            // Conditionnel Présent
            "décompléterais" to "décomplèrerais",
            "décompléterait" to "décomplèterait",
            "décompléterions" to "décomplèterions",
            "décompléteriez" to "décomplèteriez",
            "décompléteraient" to "décomplèteraient"
        )

        // Décréter (Ordonner par décret)
        val decreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décréterai" to "décrèterai",
            "décréteras" to "décrèteras",
            "décrétera" to "décrètera",
            "décréterons" to "décrèterons",
            "décréterez" to "décrèterez",
            "décréteront" to "décrèteront",

            // Conditionnel Présent
            "décréterais" to "décrèterais",
            "décréterait" to "décrèterait",
            "décréterions" to "décréterions",
            "décréteriez" to "décréteriez",
            "décréteraient" to "décrèteraient"
        )

        // Démoucheter (Enlever le bouton qui mouchette un fleuret pour le rendre tranchant)
        val demoucheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "démouchette" to "démouchète",
            "démouchettes" to "démouchètes",
            "démouchettent" to "démouchètent",

            // Futur Simple
            "démouchetterai" to "démouchèterai",
            "démouchetteras" to "démouchèteras",
            "démouchettera" to "démouchètera",
            "démouchetterons" to "démouchèterons",
            "démouchetterez" to "démouchèterez",
            "démouchetteront" to "démouchèteront",

            // Conditionnel Présent
            "démouchetterais" to "démouchèterais",
            "démouchetterait" to "démouchèterait",
            "démouchetterions" to "demouchèterions",
            "démouchetteriez" to "demouchèteriez",
            "démouchetteraient" to "démouchèteraient"
        )

        // Dépaqueter (Sortir d'un paquet, déballer)
        val depaqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "dépaquette" to "dépaquète",
            "dépaquettes" to "dépaquètes",
            "dépaquettent" to "dépaquètent",

            // Futur Simple
            "dépaquetterai" to "dépaquèterai",
            "dépaquetteras" to "dépaquèteras",
            "dépaquettera" to "dépaquètera",
            "dépaquetterons" to "dépaquèterons",
            "dépaquetterez" to "dépaquèterez",
            "dépaquetteront" to "dépaquèteront",

            // Conditionnel Présent
            "dépaquetterais" to "dépaquèterais",
            "dépaquetterait" to "dépaquèterait",
            "dépaquetterions" to "depaquèterions",
            "dépaquetteriez" to "depaquèteriez",
            "dépaquetteraient" to "dépaquèteraient"
        )

        // Dériveter (Enlever les rivets)
        val deriveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "dérivette" to "dérivète",
            "dérivettes" to "dérivètes",
            "dérivettent" to "dérivètent",

            // Futur Simple
            "dérivetterai" to "dérivèterai",
            "dérivetteras" to "dérivèteras",
            "dérivettera" to "dérivètera",
            "dérivetterons" to "dérivèterons",
            "dérivetterez" to "dérivèterez",
            "dérivetteront" to "dérivèteront",

            // Conditionnel Présent
            "dérivetterais" to "dérivèterais",
            "dérivetterait" to "dérivèterait",
            "dérivetterions" to "dérivèterions",
            "dérivetteriez" to "dérivèteriez",
            "dérivetteraient" to "dérivèteraient"
        )

        // Duveter (Garnir de duvet ; se couvrir de duvet)
        val duveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "duvette" to "duvète",
            "duvettes" to "duvètes",
            "duvettent" to "duvètent",

            // Futur Simple
            "duvetterai" to "duvèterai",
            "duvetteras" to "duvèteras",
            "duvettera" to "duvètera",
            "duvetterons" to "duvèterons",
            "duvetterez" to "duvèterez",
            "duvetteront" to "duvèteront",

            // Conditionnel Présent
            "duvetterais" to "duvèterais",
            "duvetterait" to "duvèterait",
            "duvetterions" to "duvèterions",
            "duvetteriez" to "duvèteriez",
            "duvetteraient" to "duvèteraient"
        )


        // Écolleter (Tailler une pièce de cuir ou de bois au niveau du collet)
        val ecolleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "écollette" to "écollète",
            "écollettes" to "écollètes",
            "écollettent" to "écollètent",

            // Futur Simple
            "écolletterai" to "écollèterai",
            "écolletteras" to "écollèteras",
            "écollettera" to "écollètera",
            "écolletterons" to "écollèterons",
            "écolletterez" to "écollèterez",
            "écolletteront" to "écollèteront",

            // Conditionnel Présent
            "écolletterais" to "écollèterais",
            "écolletterait" to "écollèterait",
            "écolletterions" to "écollèterions",
            "écolletteriez" to "écollèteriez",
            "écolletteraient" to "écollèteraient"
        )

        // Émoucheter (Enlever les mouchetures ; protéger des mouches ; émousser la pointe d'un fleuret)
        val emoucheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "émouchette" to "émouchète",
            "émouchettes" to "émouchètes",
            "émouchettent" to "émouchètent",

            // Futur Simple
            "émouchetterai" to "émouchèterai",
            "émouchetteras" to "émouchèteras",
            "émouchettera" to "émouchètera",
            "émouchetterons" to "émouchèterons",
            "émouchetterez" to "émouchèterez",
            "émouchetteront" to "émouchèteront",

            // Conditionnel Présent
            "émouchetterais" to "émouchèterais",
            "émouchetterait" to "émouchèterait",
            "émouchetterions" to "emouchèterions",
            "émouchetteriez" to "emouchèteriez",
            "émouchetteraient" to "émouchèteraient"
        )

        // Empaqueter (Mettre en paquet, emballer)
        val empaqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "empaquette" to "empaquète",
            "empaquettes" to "empaquètes",
            "empaquettent" to "empaquètent",

            // Futur Simple
            "empaquetterai" to "empaquèterai",
            "empaquetteras" to "empaquèteras",
            "empaquettera" to "empaquètera",
            "empaquetterons" to "empaquèterons",
            "empaquetterez" to "empaquèterez",
            "empaquetteront" to "empaquèteront",

            // Conditionnel Présent
            "empaquetterais" to "empaquèterais",
            "empaquetterait" to "empaquèterait",
            "empaquetterions" to "empaquèterions",
            "empaquetteriez" to "empaquèteriez",
            "empaquetteraient" to "empaquèteraient"
        )

        // Empiéter (Prendre indûment sur le terrain ou les droits d'autrui)
        val empieterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "empiéterai" to "empièterai",
            "empiéteras" to "empièteras",
            "empiétera" to "empiètera",
            "empiéterons" to "empièterons",
            "empiéterez" to "empièterez",
            "empiéteront" to "empièteront",

            // Conditionnel Présent
            "empiéterais" to "empièterais",
            "empiéterait" to "empièterait",
            "empiéterions" to "empiéterions",
            "empiéteriez" to "empiéteriez",
            "empiéteraient" to "empièteraient"
        )

        // Encliqueter (Engager un cliquet dans une roue dentée)
        val encliqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "encliquette" to "encliquète",
            "encliquettes" to "encliquètes",
            "encliquettent" to "encliquètent",

            // Futur Simple
            "encliquetterai" to "encliquèterai",
            "encliquetteras" to "encliquèteras",
            "encliquettera" to "encliquètera",
            "encliquetterons" to "encliquèterons",
            "encliquetterez" to "encliquèterez",
            "encliquetteront" to "encliquèteront",

            // Conditionnel Présent
            "encliquetterais" to "encliquèterais",
            "encliquetterait" to "encliquèterait",
            "encliquetterions" to "encliquèterions",
            "encliquetteriez" to "encliquèteriez",
            "encliquetteraient" to "encliquèteraient"
        )

        // Épinceter (Enlever les impuretés d'une étoffe)
        val epinceterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "épincette" to "épincète",
            "épincettes" to "épincètes",
            "épincettent" to "épincètent",

            // Futur Simple
            "épincetterai" to "épincèterai",
            "épincetteras" to "épincèteras",
            "épincettera" to "épincètera",
            "épincetterons" to "épincèterons",
            "épincetterez" to "épincèterez",
            "épincetteront" to "épincèteront",

            // Conditionnel Présent
            "épincetterais" to "épincèterais",
            "épincetterait" to "épincèterait",
            "épincetterions" to "épincèterions",
            "épincetteriez" to "épincèteriez",
            "épincetteraient" to "épincèteraient"
        )

        // Épousseter (Enlever la poussière avec un époussette ou un chiffon)
        val epousseterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "époussette" to "époussète",
            "époussettes" to "époussètes",
            "époussettent" to "époussètent",

            // Futur Simple
            "époussetterai" to "époussèterai",
            "époussetteras" to "époussèteras",
            "époussettera" to "époussètera",
            "époussetterons" to "époussèterons",
            "époussetterez" to "époussèterez",
            "époussetteront" to "époussèteront",

            // Conditionnel Présent
            "époussetterais" to "époussèterais",
            "époussetterait" to "époussèterait",
            "époussetterions" to "epoussèterions",
            "époussetteriez" to "epoussèteriez",
            "époussetteraient" to "époussèteraient"
        )


        // Étiqueter (Marquer d'une étiquette)
        val etiqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "étiquette" to "étiquète",
            "étiquettes" to "étiquètes",
            "étiquettent" to "étiquètent",

            // Futur Simple
            "étiquetterai" to "étiquèterai",
            "étiquetteras" to "étiquèteras",
            "étiquettera" to "étiquètera",
            "étiquetterons" to "étiquèterons",
            "étiquetterez" to "étiquèterez",
            "étiquetteront" to "étiquèteront",

            // Conditionnel Présent
            "étiquetterais" to "étiquèterais",
            "étiquetterait" to "étiquèterait",
            "étiquetterions" to "étiquèterions",
            "étiquetteriez" to "étiquèteriez",
            "étiquetteraient" to "étiquèteraient"
        )

        // Excréter (Évacuer des substances hors de l'organisme)
        val excreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "excréterai" to "excrèterai",
            "excréteras" to "excrèteras",
            "excrétera" to "excrètera",
            "excréterons" to "excrèterons",
            "excréterez" to "excrèterez",
            "excréteront" to "excrèteront",

            // Conditionnel Présent
            "excréterais" to "excrèterais",
            "excréterait" to "excrèterait",
            "excréterions" to "excréterions",
            "excréteriez" to "excréteriez",
            "excréteraient" to "excrèteraient"
        )

        // Feuilleter (Tourner les feuilles d'un livre ; préparer une pâte feuilletée)
        val feuilleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "feuillette" to "feuillète",
            "feuillettes" to "feuillètes",
            "feuillettent" to "feuillètent",

            // Futur Simple
            "feuilletterai" to "feuillèterai",
            "feuilletteras" to "feuillèteras",
            "feuillettera" to "feuillètera",
            "feuilletterons" to "feuillèterons",
            "feuilletterez" to "feuillèterez",
            "feuilletteront" to "feuillèteront",

            // Conditionnel Présent
            "feuilletterais" to "feuillèterais",
            "feuilletterait" to "feuillèterait",
            "feuilletterions" to "feuillèterions",
            "feuilletteriez" to "feuillèteriez",
            "feuilletteraient" to "feuillèteraient"
        )

        // Fréter (Prendre en location un navire, un avion, un véhicule de transport)
        val freterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "fréterai" to "frèterai",
            "fréteras" to "frèteras",
            "frétera" to "frètera",
            "fréterons" to "frèterons",
            "fréterez" to "frèterez",
            "fréteront" to "frèteront",

            // Conditionnel Présent
            "fréterais" to "frèterais",
            "fréterait" to "frèterait",
            "fréterions" to "frèterions",
            "fréteriez" to "frèteriez",
            "fréteraient" to "frèteraient"
        )

        // Galeter (Aplatir, donner la forme d'un galet)
        val galeterModifAccent : Map<String, String> = mapOf(

            // Présent de l'indicatif et subjonctif présent
            "galette" to "galète",
            "galettes" to "galètes",
            "galettent" to "galètent",

            // Futur Simple
            "galetterai" to "galèterai",
            "galetteras" to "galèteras",
            "galettera" to "galètera",
            "galetterons" to "galèterons",
            "galetterez" to "galèterez",
            "galetteront" to "galèteront",

            // Conditionnel Présent
            "galetterais" to "galèterais",
            "galetterait" to "galèterait",
            "galetterions" to "galèterions",
            "galetteriez" to "galèteriez",
            "galetteraient" to "galèteraient"
        )

        // Gobeter (Appliquer une première couche d'enduit sur un mur)
        val gobeterModifAccent : Map<String, String> = mapOf(

            // Présent de l'indicatif et subjonctif présent
            "gobette" to "gobète",
            "gobettes" to "gobètes",
            "gobettent" to "gobètent",

            // Futur Simple
            "gobetterai" to "gobèterai",
            "gobetteras" to "gobèteras",
            "gobettera" to "gobètera",
            "gobetterons" to "gobèterons",
            "gobetterez" to "gobèterez",
            "gobetteront" to "gobèteront",

            // Conditionnel Présent
            "gobetterais" to "gobèterais",
            "gobetterait" to "gobèterait",
            "gobetterions" to "gobèterions",
            "gobetteriez" to "gobèteriez",
            "gobetteraient" to "gobèteraient"
        )

        // Guillemeter (Mettre entre guillemets)
        val guillemeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "guillemette" to "guillemète",
            "guillemettes" to "guillemètes",
            "guillemettent" to "guillemètent",

            // Futur Simple
            "guillemetterai" to "guillemèterai",
            "guillemetteras" to "guillemèteras",
            "guillemettera" to "guillemètera",
            "guillemetterons" to "guillemèterons",
            "guillemetterez" to "guillemèterez",
            "guillemetteront" to "guillemèteront",

            // Conditionnel Présent
            "guillemetterais" to "guillemèterais",
            "guillemetterait" to "guillemèterait",
            "guillemetterions" to "guillemèterions",
            "guillemetteriez" to "guillemèteriez",
            "guillemetteraient" to "guillemèteraient"
        )

        // Hébéter (Rendre stupide, priver d'intelligence ou de réaction)
        val hebeterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "hébéterai" to "hébèterai",
            "hébéteras" to "hébèteras",
            "hébétera" to "hébètera",
            "hébéterons" to "hébèterons",
            "hébéterez" to "hébèterez",
            "hébéteront" to "hébèteront",

            // Conditionnel Présent
            "hébéterais" to "hébèterais",
            "hébéterait" to "hébèterait",
            "hébéterions" to "hébèterions",
            "hébéteriez" to "hébèteriez",
            "hébéteraient" to "hébèteraient"
        )

        // Hoqueter (Avoir le hoquet)
        val hoqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "hoquette" to "hoquète",
            "hoquettes" to "hoquètes",
            "hoquettent" to "hoquètent",

            // Futur Simple
            "hoquetterai" to "hoquèterai",
            "hoquetteras" to "hoquèteras",
            "hoquettera" to "hoquètera",
            "hoquetterons" to "hoquèterons",
            "hoquetterez" to "hoquèterez",
            "hoquetteront" to "hoquèteront",

            // Conditionnel Présent
            "hoquetterais" to "hoquèterais",
            "hoquetterait" to "hoquèterait",
            "hoquetterions" to "hoquèterions",
            "hoquetteriez" to "hoquèteriez",
            "hoquetteraient" to "hoquèteraient"
        )

        // Inquiéter (Causer de l'inquiétude)
        val inquieterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "inquiéterai" to "inquièterai",
            "inquiéteras" to "inquièteras",
            "inquiétera" to "inquiètera",
            "inquiéterons" to "inquièterons",
            "inquiéterez" to "inquièterez",
            "inquiéteront" to "inquièteront",

            // Conditionnel Présent
            "inquiéterais" to "inquièterais",
            "inquiéterait" to "inquièterait",
            "inquiéterions" to "inquièterions",
            "inquiéteriez" to "inquièteriez",
            "inquiéteraient" to "inquièteraient"
        )

        // Interpréter (Expliquer, traduire ou rendre une œuvre)
        val interpreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "interpréterai" to "interprèterai",
            "interpréteras" to "interprèteras",
            "interprétera" to "interprètera",
            "interpréterons" to "interprèterons",
            "interpréterez" to "interprèterez",
            "interpréteront" to "interprèteront",

            // Conditionnel Présent
            "interpréterais" to "interprèterais",
            "interpréterait" to "interprèterait",
            "interpréterions" to "interprèterions",
            "interpréteriez" to "interprèteriez",
            "interpréteraient" to "interprèteraient"
        )

        // Jarreter (Couper le jarret ; faire un angle dans une courbe)
        val jarreterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "jarrette" to "jarrète",
            "jarrettes" to "jarrètes",
            "jarrettent" to "jarrètent",

            // Futur Simple
            "jarretterai" to "jarrèterai",
            "jarretteras" to "jarrèteras",
            "jarrettera" to "jarrètera",
            "jarretterons" to "jarrèterons",
            "jarretterez" to "jarrèterez",
            "jarretteront" to "jarrèteront",

            // Conditionnel Présent
            "jarretterais" to "jarrèterais",
            "jarretterait" to "jarrèterait",
            "jarretterions" to "jarrèterions",
            "jarretteriez" to "jarrèteriez",
            "jarretteraient" to "jarrèteraient"
        )

        // Langueter (Garnir d'une languette ; façonner en forme de langue)
        val langueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "languette" to "languète",
            "languettes" to "languètes",
            "languettent" to "languètent",

            // Futur Simple
            "languetterai" to "languèterai",
            "languetteras" to "languèteras",
            "languettera" to "languètera",
            "languetterons" to "languèterons",
            "languetterez" to "languèterez",
            "languetteront" to "languèteront",

            // Conditionnel Présent
            "languetterais" to "languèterais",
            "languetterait" to "languèterait",
            "languetterions" to "languèterions",
            "languetteriez" to "languèteriez",
            "languetteraient" to "languèteraient"
        )

        // Loqueter (Battre comme un loquet ; être en loques)
        val loqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "loquette" to "loquète",
            "loquettes" to "loquètes",
            "loquettent" to "loquètent",

            // Futur Simple
            "loquetterai" to "loquèterai",
            "loquetteras" to "loquèteras",
            "loquettera" to "loquètera",
            "loquetterons" to "loquèterons",
            "loquetterez" to "loquèterez",
            "loquetteront" to "loquèteront",

            // Conditionnel Présent
            "loquetterais" to "loquèterais",
            "loquetterait" to "loquèterait",
            "loquetterions" to "loquèterions",
            "loquetteriez" to "loquèteriez",
            "loquetteraient" to "loquèteraient"
        )

        // Louveter (Mettre bas, en parlant de la louve)
        val louveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "louvette" to "louvète",
            "louvettes" to "louvètes",
            "louvettent" to "louvètent",

            // Futur Simple
            "louvetterai" to "louvèterai",
            "louvetteras" to "louvèteras",
            "louvettera" to "louvètera",
            "louvetterons" to "louvèterons",
            "louvetterez" to "louvèterez",
            "louvetteront" to "louvèteront",

            // Conditionnel Présent
            "louvetterais" to "louvèterais",
            "louvetterait" to "louvèterait",
            "louvetterions" to "louvèterions",
            "louvetteriez" to "louvèteriez",
            "louvetteraient" to "louvèteraient"
        )

        // Mailleter (Garnir de clous à large tête appelés mailles)
        val mailleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "maillette" to "maillète",
            "maillettes" to "maillètes",
            "maillettent" to "maillètent",

            // Futur Simple
            "mailletterai" to "maillèterai",
            "mailletteras" to "maillèteras",
            "maillettera" to "maillètera",
            "mailletterons" to "maillèterons",
            "mailletterez" to "maillèterez",
            "mailletteront" to "maillèteront",

            // Conditionnel Présent
            "mailletterais" to "maillèterais",
            "mailletterait" to "maillèterait",
            "mailletterions" to "maillèterions",
            "mailletteriez" to "maillèteriez",
            "mailletteraient" to "maillèteraient"
        )

        // Marketer (Mettre sur le marché ; faire du marketing)
        val marketerModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "markette" to "markète",
            "markettes" to "markètes",
            "markettent" to "markètent",

            // Futur Simple
            "marketterai" to "markèterai",
            "marketteras" to "markèteras",
            "markettera" to "markètera",
            "marketterons" to "markèterons",
            "marketterez" to "markèterez",
            "marketteront" to "markèteront",

            // Conditionnel Présent
            "marketterais" to "markèterais",
            "marketterait" to "markèterait",
            "marketterions" to "markèterions",
            "marketteriez" to "markèteriez",
            "marketteraient" to "markèteraient"
        )

        // Marqueter (Orner de marqueterie ; tacher de diverses couleurs)
        val marqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "marquette" to "marquète",
            "marquettes" to "marquètes",
            "marquettent" to "marquètent",

            // Futur Simple
            "marquetterai" to "marquèterai",
            "marquetteras" to "marquèteras",
            "marquettera" to "marquètera",
            "marquetterons" to "marquèterons",
            "marquetterez" to "marquèterez",
            "marquetteront" to "marquèteront",

            // Conditionnel Présent
            "marquetterais" to "marquèterais",
            "marquetterait" to "marquèterait",
            "marquetterions" to "marquèterions",
            "marquetteriez" to "marquèteriez",
            "marquetteraient" to "marquèteraient"
        )

        // Moleter (Marquer avec une molette)
        val moleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "molette" to "molète",
            "molettes" to "molètes",
            "molettent" to "molètent",

            // Futur Simple
            "moletterai" to "molèterai",
            "moletteras" to "molèteras",
            "molettera" to "molètera",
            "moletterons" to "molèterons",
            "moletterez" to "molèterez",
            "moletteront" to "molèteront",

            // Conditionnel Présent
            "moletterais" to "molèterais",
            "moletterait" to "molèterait",
            "moletterions" to "molèterions",
            "moletteriez" to "molèteriez",
            "moletteraient" to "molèteraient"
        )

        // Moucheter (Marquer de petites taches ; garnir d'un bouton le bout d'un fleuret)
        val moucheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "mouchette" to "mouchète",
            "mouchettes" to "mouchètes",
            "mouchettent" to "mouchètent",

            // Futur Simple
            "mouchetterai" to "mouchèterai",
            "mouchetteras" to "mouchèteras",
            "mouchettera" to "mouchètera",
            "mouchetterons" to "mouchèterons",
            "mouchetterez" to "mouchèterez",
            "mouchetteront" to "mouchèteront",

            // Conditionnel Présent
            "mouchetterais" to "mouchèterais",
            "mouchetterait" to "mouchèterait",
            "mouchetterions" to "mouchèterions",
            "mouchetteriez" to "mouchèteriez",
            "mouchetteraient" to "mouchèteraient"
        )

        // Moufeter (Prononcer un mot, répliquer - souvent à la forme négative)
        val moufeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "moufette" to "moufète",
            "moufettes" to "moufètes",
            "moufettent" to "moufètent",

            // Futur Simple
            "moufetterai" to "moufèterai",
            "moufetteras" to "moufèteras",
            "moufettera" to "moufètera",
            "moufetterons" to "moufèterons",
            "moufetterez" to "moufèterez",
            "moufetteront" to "moufèteront",

            // Conditionnel Présent
            "moufetterais" to "moufèterais",
            "moufetterait" to "moufèterait",
            "moufetterions" to "moufèterions",
            "moufetteriez" to "moufèteriez",
            "moufetteraient" to "moufèteraient"
        )

        // Mugueter (Faire le galant ; courtiser)
        val mugueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "muguette" to "muguète",
            "muguettes" to "muguètes",
            "muguettent" to "muguètent",

            // Futur Simple
            "muguetterai" to "muguèterai",
            "muguetteras" to "muguèteras",
            "muguettera" to "muguètera",
            "muguetterons" to "muguèterons",
            "muguetterez" to "muguèterez",
            "muguetteront" to "muguèteront",

            // Conditionnel Présent
            "muguetterais" to "muguèterais",
            "muguetterait" to "muguèterait",
            "muguetterions" to "muguèterions",
            "muguetteriez" to "muguèteriez",
            "muguetteraient" to "muguèteraient"
        )

        // Museleter (Mettre un muselet, notamment sur une bouteille de champagne)
        val museleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "muselette" to "muselète",
            "muselettes" to "muselètes",
            "muselettent" to "muselètent",

            // Futur Simple
            "museletterai" to "muselèterai",
            "museletteras" to "muselèteras",
            "muselettera" to "muselètera",
            "museletterons" to "muselèterons",
            "museletterez" to "muselèterez",
            "museletteront" to "muselèteront",

            // Conditionnel Présent
            "museletterais" to "muselèterais",
            "museletterait" to "muselèterait",
            "museletterions" to "muselèterions",
            "museletteriez" to "muselèteriez",
            "museletteraient" to "muselèteraient"
        )

        // Niqueter (Marquer les dents d'un cheval ; faire des niquets)
        val niqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "niquette" to "niquète",
            "niquettes" to "niquètes",
            "niquettent" to "niquètent",

            // Futur Simple
            "niquetterai" to "niquèterai",
            "niquetteras" to "niquèteras",
            "niquettera" to "niquètera",
            "niquetterons" to "niquèterons",
            "niquetterez" to "niquèterez",
            "niquetteront" to "niquèteront",

            // Conditionnel Présent
            "niquetterais" to "niquèterais",
            "niquetterait" to "niquèterait",
            "niquetterions" to "niquèterions",
            "niquetteriez" to "niquèteriez",
            "niquetteraient" to "niquèteraient"
        )

        // Pailleter (Garnir de paillettes)
        val pailleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "paillette" to "paillète",
            "paillettes" to "paillètes",
            "paillettent" to "paillètent",

            // Futur Simple
            "pailletterai" to "paillèterai",
            "pailletteras" to "paillèteras",
            "paillettera" to "paillètera",
            "pailletterons" to "paillèterons",
            "pailletterez" to "paillèterez",
            "pailletteront" to "paillèteront",

            // Conditionnel Présent
            "pailletterais" to "paillèterais",
            "pailletterait" to "paillèterait",
            "pailletterions" to "paillèterions",
            "pailletteriez" to "paillèteriez",
            "pailletteraient" to "paillèteraient"
        )

        // Paqueter (Mettre en paquets)
        val paqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "paquette" to "paquète",
            "paquettes" to "paquètes",
            "paquettent" to "paquètent",

            // Futur Simple
            "paquetterai" to "paquèterai",
            "paquetteras" to "paquèteras",
            "paquettera" to "paquètera",
            "paquetterons" to "paquèterons",
            "paquetterez" to "paquèterez",
            "paquetteront" to "paquèteront",

            // Conditionnel Présent
            "paquetterais" to "paquèterais",
            "paquetterait" to "paquèterait",
            "paquetterions" to "paquèterions",
            "paquetteriez" to "paquèteriez",
            "paquetteraient" to "paquèteraient"
        )

        // Parqueter (Recouvrir d'un parquet)
        val parqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "parquette" to "parquète",
            "parquettes" to "parquètes",
            "parquettent" to "parquètent",

            // Futur Simple
            "parquetterai" to "parquèterai",
            "parquetteras" to "parquèteras",
            "parquettera" to "parquètera",
            "parquetterons" to "parquèterons",
            "parquetterez" to "parquèterez",
            "parquetteront" to "parquèteront",

            // Conditionnel Présent
            "parquetterais" to "parquèterais",
            "parquetterait" to "parquèterait",
            "parquetterions" to "parquèterions",
            "parquetteriez" to "parquèteriez",
            "parquetteraient" to "parquèteraient"
        )

        // Pelleter (Travailler à la pelle)
        val pelleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "pellette" to "pellète",
            "pellettes" to "pellètes",
            "pellettent" to "pellètent",

            // Futur Simple
            "pelletterai" to "pellèterai",
            "pelletteras" to "pellèteras",
            "pellettera" to "pellètera",
            "pelletterons" to "pellèterons",
            "pelletterez" to "pellèterez",
            "pelletteront" to "pellèteront",

            // Conditionnel Présent
            "pelletterais" to "pellèterais",
            "pelletterait" to "pellèterait",
            "pelletterions" to "pellèterions",
            "pelletteriez" to "pellèteriez",
            "pelletteraient" to "pellèteraient"
        )


        // Encolleter (Saisir au collet)
        val encolleterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "encollette" to "encollète",
            "encollettes" to "encollètes",
            "encollettent" to "encollètent",
            // Futur Simple
            "encolletterai" to "encollèterai",
            "encolletteras" to "encollèteras",
            "encollettera" to "encollètera",
            "encolletterons" to "encollèterons",
            "encolletterez" to "encollèterez",
            "encolletteront" to "encollèteront",
            // Conditionnel Présent
            "encolletterais" to "encollèterais",
            "encolletterait" to "encollèterait",
            "encolletterions" to "encollèterions",
            "encolletteriez" to "encollèteriez",
            "encolletteraient" to "encollèteraient"
        )

        // Foufeter / Fouffeter (Action technique de reliure ou couture)
        val foufeterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "foufette" to "foufète",
            "foufettes" to "foufètes",
            "foufettent" to "foufètent",
            // Futur Simple
            "foufetterai" to "foufèterai",
            "foufetteras" to "foufèteras",
            "foufettera" to "foufètera",
            "foufetterons" to "foufèterons",
            "foufetterez" to "foufèterez",
            "foufetteront" to "foufèteront",
            // Conditionnel Présent
            "foufetterais" to "foufèterais",
            "foufetterait" to "foufèterait",
            "foufetterions" to "foufèterions",
            "foufetteriez" to "foufèteriez",
            "foufetteraient" to "foufèteraient"
        )

        // Gileter (Action de fabriquer des gilets)
        val gileterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "gillette" to "gilète",
            "gillettes" to "gilètes",
            "gillettent" to "gilètent",
            // Futur Simple
            "gilletterai" to "gilèterai",
            "gilletteras" to "gilèteras",
            "gillettera" to "gilètera",
            "gilletterons" to "gilèterons",
            "gilletterez" to "gilèterez",
            "gilletteront" to "gilèteront",
            // Conditionnel Présent
            "gilletterais" to "gilèterais",
            "gilletterait" to "gilèterait",
            "gilletterions" to "gilèterions",
            "gilletteriez" to "gilèteriez",
            "gilletteraient" to "gilèteraient"
        )

        // Greneter (Passer des peaux au grenoir)
        val greneterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "grenette" to "grenète",
            "grenettes" to "grenètes",
            "grenettent" to "grenètent",
            // Futur Simple
            "grenetterai" to "grenèterai",
            "grenetteras" to "grenèteras",
            "grenettera" to "grenètera",
            "grenetterons" to "grenèterons",
            "grenetterez" to "grenèterez",
            "grenetteront" to "grenèteront",
            // Conditionnel Présent
            "grenetterais" to "grenèterais",
            "grenetterait" to "grenèterait",
            "grenetterions" to "grenèterions",
            "grenetteriez" to "grenèteriez",
            "grenetteraient" to "grenèteraient"
        )

        // Levreter (Mettre bas en parlant de la hase)
        val levreterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "levrette" to "levrète",
            "levrettes" to "levrètes",
            "levrettent" to "levrètent",
            // Futur Simple
            "levretterai" to "levrèterai",
            "levretteras" to "levrèteras",
            "levrettera" to "levrètera",
            "levretterons" to "levrèterons",
            "levretterez" to "levrèterez",
            "levretteront" to "levrèteront",
            // Conditionnel Présent
            "levretterais" to "levrèterais",
            "levretterait" to "levrèterait",
            "levretterions" to "levrèterions",
            "levretteriez" to "levrèteriez",
            "levretteraient" to "levrèteraient"
        )

        // Mésinterpréter
        val mesinterpreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "mésinterpréterai" to "mésinterprèterai",
            "mésinterpréteras" to "mésinterprèteras",
            "mésinterprétera" to "mésinterprètera",
            "mésinterpréterons" to "mésinterprèterons",
            "mésinterpréterez" to "mésinterprèterez",
            "mésinterpréteront" to "mésinterprèteront",
            // Conditionnel Présent
            "mésinterpréterais" to "mésinterprèterais",
            "mésinterpréterait" to "mésinterprèterait",
            "mésinterpréterions" to "mésinterprèterions",
            "mésinterpréteriez" to "mésinterprèteriez",
            "mésinterpréteraient" to "mésinterprèteraient"
        )
        // Recompléter
        val recompleterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "recompléterai" to "recomplèterai",
            "recompléteras" to "recomplèteras",
            "recomplétera" to "recomplètera",
            "recompléterons" to "recomplèterons",
            "recompléterez" to "recomplèterez",
            "recompléteront" to "recomplèteront",
            // Conditionnel Présent
            "recompléterais" to "recomplèterais",
            "recompléterait" to "recomplèterait",
            "recompléterions" to "recomplèterions",
            "recompléteriez" to "recomplèteriez",
            "recompléteraient" to "recomplèteraient"
        )

        // Péter (Émettre un gaz intestinal ; éclater avec bruit)
        val peterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "péterai" to "pèterai",
            "péteras" to "pèteras",
            "pétera" to "pètera",
            "péterons" to "pèterons",
            "péterez" to "pèterez",
            "péteront" to "pèteront",

            // Conditionnel Présent
            "péterais" to "pèterais",
            "péterait" to "pèterait",
            "péterions" to "pèterions",
            "péteriez" to "pèteriez",
            "péteraient" to "pèteraient"
        )

        // Piéter (Disposer ses pieds d'une certaine façon au jeu de boules ; courir sur le sol en parlant d'un oiseau)
        val pieterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "piéterai" to "pièterai",
            "piéteras" to "pièteras",
            "piétera" to "piètera",
            "piéterons" to "pièterons",
            "piéterez" to "pièterez",
            "piéteront" to "pièteront",

            // Conditionnel Présent
            "piéterais" to "pièterais",
            "piéterait" to "pièterait",
            "piéterions" to "pièterions",
            "piéteriez" to "pièteriez",
            "piéteraient" to "pièteraient"
        )

        // Pinceter (Saisir avec des pincettes)
        val pinceterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "pincette" to "pincète",
            "pincettes" to "pincètes",
            "pincettent" to "pincètent",
            // Futur Simple
            "pincetterai" to "pincèterai",
            "pincetteras" to "pincèteras",
            "pincettera" to "pincètera",
            "pincetterons" to "pincèterons",
            "pincetterez" to "pincèterez",
            "pincetteront" to "pincèteront",
            // Conditionnel Présent
            "pincetterais" to "pincèterais",
            "pincetterait" to "pincèterait",
            "pincetterions" to "pincèterions",
            "pincetteriez" to "pincèteriez",
            "pincetteraient" to "pincèteraient"
        )

        // Pipeter (Prélever avec une pipette)
        val pipeterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "pipette" to "pipète",
            "pipettes" to "pipètes",
            "pipettent" to "pipètent",
            // Futur Simple
            "pipetterai" to "pipèterai",
            "pipetteras" to "pipèteras",
            "pipettera" to "pipètera",
            "pipetterons" to "pipèterons",
            "pipetterez" to "pipèterez",
            "pipetteront" to "pipèteront",
            // Conditionnel Présent
            "pipetterais" to "pipèterais",
            "pipetterait" to "pipèterait",
            "pipetterions" to "pipèterions",
            "pipetteriez" to "pipèteriez",
            "pipetteraient" to "pipèteraient"
        )

        // Planeter (Action technique de polissage/aplanissage)
        val planeterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "planette" to "planète",
            "planettes" to "planètes",
            "planettent" to "planètent",
            // Futur Simple
            "planetterai" to "planèterai",
            "planetteras" to "planèteras",
            "planettera" to "planètera",
            "planetterons" to "planèterons",
            "planetterez" to "planèterez",
            "planetteront" to "planèteront",
            // Conditionnel Présent
            "planetterais" to "planèterais",
            "planetterait" to "planèterait",
            "planetterions" to "planèterions",
            "planetteriez" to "planèteriez",
            "planetteraient" to "planèteraient"
        )

        // Pocheter (Mettre en poche / Faire des poches)
        val pocheterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "pochette" to "pochète",
            "pochettes" to "pochètes",
            "pochettent" to "pochètent",
            // Futur Simple
            "pochetterai" to "pochèterai",
            "pochetteras" to "pochèteras",
            "pochettera" to "pochètera",
            "pochetterons" to "pochèterons",
            "pochetterez" to "pochèterez",
            "pochetteront" to "pochèteront",
            // Conditionnel Présent
            "pochetterais" to "pochèterais",
            "pochetterait" to "pochèterait",
            "pochetterions" to "pochèterions",
            "pochetteriez" to "pochèteriez",
            "pochetteraient" to "pochèteraient"
        )

        // Rebéqueter (Béqueter de nouveau)
        val rebequeterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "rebéquette" to "rebéquète",
            "rebéquettes" to "rebéquètes",
            "rebéquettent" to "rebéquètent",
            // Futur Simple
            "rebéquetterai" to "rebéquèterai",
            "rebéquetteras" to "rebéquèteras",
            "rebéquettera" to "rebéquètera",
            "rebéquetterons" to "rebéquèterons",
            "rebéquetterez" to "rebéquèterez",
            "rebéquetteront" to "rebéquèteront",
            // Conditionnel Présent
            "rebéquetterais" to "rebéquèterais",
            "rebéquetterait" to "rebéquèterait",
            "rebéquetterions" to "rebéquèterions",
            "rebéquetteriez" to "rebéquèteriez",
            "rebéquetteraient" to "rebéquèteraient"
        )

        // Piqueter (Planter des piquets ; marquer de points)
        val piqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "piquette" to "piquète",
            "piquettes" to "piquètes",
            "piquettent" to "piquètent",

            // Futur Simple
            "piquetterai" to "piquèterai",
            "piquetteras" to "piquèteras",
            "piquettera" to "piquètera",
            "piquetterons" to "piquèterons",
            "piquetterez" to "piquèterez",
            "piquetteront" to "piquèteront",

            // Conditionnel Présent
            "piquetterais" to "piquèterais",
            "piquetterait" to "piquèterait",
            "piquetterions" to "piquèterions",
            "piquetteriez" to "piquèteriez",
            "piquetteraient" to "piquèteraient"
        )

        // Raineter (Marquer le bois ou le cuir avec une rainette)
        val raineterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "rainette" to "rainète",
            "rainettes" to "rainètes",
            "rainettent" to "rainètent",

            // Futur Simple
            "rainetterai" to "rainèterai",
            "rainetteras" to "rainèteras",
            "rainettera" to "rainètera",
            "rainetterons" to "rainèterons",
            "rainetterez" to "rainèterez",
            "rainetteront" to "rainèteront",

            // Conditionnel Présent
            "rainetterais" to "rainèterais",
            "rainetterait" to "rainèterait",
            "rainetterions" to "rainèterions",
            "rainetteriez" to "rainèteriez",
            "rainetteraient" to "rainèteraient"
        )

        // Recacheter (Cacheter de nouveau)
        val recacheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "recachette" to "recachète",
            "recachettes" to "recachètes",
            "recachettent" to "recachètent",

            // Futur Simple
            "recachetterai" to "recachèterai",
            "recachetteras" to "recachèteras",
            "recachettera" to "recachètera",
            "recachetterons" to "recachèterons",
            "recachetterez" to "recachèterez",
            "recachetteront" to "recachèteront",

            // Conditionnel Présent
            "recachetterais" to "recachèterais",
            "recachetterait" to "recachèterait",
            "recachetterions" to "recachèterions",
            "recachetteriez" to "recachèteriez",
            "recachetteraient" to "recachèteraient"
        )

        // Refléter (Renvoyer la lumière, l'image)
        val refleterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "refléterai" to "reflèterai",
            "refléteras" to "reflèteras",
            "reflétera" to "reflètera",
            "refléterons" to "reflèterons",
            "refléterez" to "reflèterez",
            "refléteront" to "reflèteront",

            // Conditionnel Présent
            "refléterais" to "reflèterais",
            "refléterait" to "reflèterait",
            "refléterions" to "reflèterions",
            "refléteriez" to "reflèteriez",
            "refléteraient" to "reflèteraient"
        )

        // Refeuilleter (Feuilleter de nouveau)
        val refeuilleterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "refeuillette" to "refeuillète",
            "refeuillettes" to "refeuillètes",
            "refeuillettent" to "refeuillètent",
            // Futur Simple
            "refeuilleterai" to "refeuillèterai",
            "refeuilleteras" to "refeuillèteras",
            "refeuilletera" to "refeuillètera",
            "refeuilleterons" to "refeuillèterons",
            "refeuilleterez" to "refeuillèterez",
            "refeuilleteront" to "refeuillèteront",
            // Conditionnel Présent
            "refeuilleterais" to "refeuillèterais",
            "refeuilleterait" to "refeuillèterait",
            "refeuilleterions" to "refeuillèterions",
            "refeuilleteriez" to "refeuillèteriez",
            "refeuilleteraient" to "refeuillèteraient"
        )

        // Rempaqueter (Remettre en paquet)
        val rempaqueterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "rempaquette" to "rempaquète",
            "rempaquettes" to "rempaquètes",
            "rempaquettent" to "rempaquètent",
            // Futur Simple
            "rempaquetterai" to "rempaquèterai",
            "rempaquetteras" to "rempaquèteras",
            "rempaquettera" to "rempaquètera",
            "rempaquetterons" to "rempaquèterons",
            "rempaquetterez" to "rempaquèterez",
            "rempaquetteront" to "rempaquèteront",
            // Conditionnel Présent
            "rempaquetterais" to "rempaquèterais",
            "rempaquetterait" to "rempaquèterait",
            "rempaquetterions" to "rempaquèterions",
            "rempaquetteriez" to "rempaquèteriez",
            "rempaquetteraient" to "rempaquèteraient"
        )

        // Sauveter (Récupérer en mer)
        val sauveterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "sauvette" to "sauvète",
            "sauvettes" to "sauvètes",
            "sauvettent" to "sauvètent",
            // Futur Simple
            "sauvetterai" to "sauvèterai",
            "sauvetteras" to "sauvèteras",
            "sauvettera" to "sauvètera",
            "sauvetterons" to "sauvèterons",
            "sauvetterez" to "sauvèterez",
            "sauvetteront" to "sauvèteront",
            // Conditionnel Présent
            "sauvetterais" to "sauvèterais",
            "sauvetterait" to "sauvèterait",
            "sauvetterions" to "sauvèterions",
            "sauvetteriez" to "sauvèteriez",
            "sauvetteraient" to "sauvèteraient"
        )

        // Saveter (Faire de la besogne malpropre)
        val saveterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "savette" to "savète",
            "savettes" to "savètes",
            "savettent" to "savètent",
            // Futur Simple
            "savetterai" to "savèterai",
            "savetteras" to "savèteras",
            "savettera" to "savètera",
            "savetterons" to "savèterons",
            "savetterez" to "savèterez",
            "savetteront" to "savèteront",
            // Conditionnel Présent
            "savetterais" to "savèterais",
            "savetterait" to "savèterait",
            "savetterions" to "savèterions",
            "savetteriez" to "savèteriez",
            "savetteraient" to "savèteraient"
        )

        // Sous-affréter
        val sousAffreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sous-affréterai" to "sous-affrèterai",
            "sous-affréteras" to "sous-affrèteras",
            "sous-affrétera" to "sous-affrètera",
            "sous-affréterons" to "sous-affrèterons",
            "sous-affréterez" to "sous-affrèterez",
            "sous-affréteront" to "sous-affrèteront",
            // Conditionnel Présent
            "sous-affréterais" to "sous-affrèterais",
            "sous-affréterait" to "sous-affrèterait",
            "sous-affréterions" to "sous-affrèterions",
            "sous-affréteriez" to "sous-affrèteriez",
            "sous-affréteraient" to "sous-affrèteraient"
        )

        // Sous-fréter
        val sousFreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sous-fréterai" to "sous-frèterai",
            "sous-fréteras" to "sous-frèteras",
            "sous-frétera" to "sous-frètera",
            "sous-fréterons" to "sous-frèterons",
            "sous-fréterez" to "sous-frèterez",
            "sous-fréteront" to "sous-frèteront",
            // Conditionnel Présent
            "sous-fréterais" to "sous-frèterais",
            "sous-fréterait" to "sous-frèterait",
            "sous-fréterions" to "sous-frèterions",
            "sous-fréteriez" to "sous-frèteriez",
            "sous-fréteraient" to "sous-frèteraient"
        )

        // Répéter (pour être sûr que tout y est)
        val repeterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "répéterai" to "répèterai",
            "répéteras" to "répèteras",
            "répétera" to "répètera",
            "répéterons" to "répèterons",
            "répéterez" to "répèterez",
            "répéteront" to "répèteront",
            // Conditionnel Présent
            "répéterais" to "répèterais",
            "répéterait" to "répèterait",
            "répéterions" to "répèterions",
            "répéteriez" to "répèteriez",
            "répéteraient" to "répèteraient"
        )

        // Surinterpréter (pour être sûr que tout y est)
        val surinterpreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "surinterpréterai" to "surinterprèterai",
            "surinterpréteras" to "surinterprèteras",
            "surinterprétera" to "surinterprètera",
            "surinterpréterons" to "surinterprèterons",
            "surinterpréterez" to "surinterprèterez",
            "surinterpréteront" to "surinterprèteront",
            // Conditionnel Présent
            "surinterpréterais" to "surinterprèterais",
            "surinterpréterait" to "surinterprèterait",
            "surinterpréterions" to "surinterprèterions",
            "surinterpréteriez" to "surinterprèteriez",
            "surinterpréteraient" to "surinterprèteraient"
        )

        // Tiqueter (Marquer de taches)
        val tiqueterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "tiquette" to "tiquète",
            "tiquettes" to "tiquètes",
            "tiquettent" to "tiquètent",
            // Futur Simple
            "tiquetterai" to "tiquèterai",
            "tiquetteras" to "tiquèteras",
            "tiquettera" to "tiquètera",
            "tiquetterons" to "tiquèterons",
            "tiquetterez" to "tiquèterez",
            "tiquetteront" to "tiquèteront",
            // Conditionnel Présent
            "tiquetterais" to "tiquèterais",
            "tiquetterait" to "tiquèterait",
            "tiquetterions" to "tiquèterions",
            "tiquetteriez" to "tiquèteriez",
            "tiquetteraient" to "tiquèteraient"
        )

        // Tireter (Tirer par petites secousses)
        val tireterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "tirette" to "tirete",
            "tirettes" to "tiretes",
            "tirettent" to "tiretent",
            // Futur Simple
            "tiretterai" to "tireterai",
            "tiretteras" to "tireteras",
            "tirettera" to "tiretera",
            "tiretterons" to "tireterons",
            "tiretterez" to "tireterez",
            "tiretteront" to "tireteront",
            // Conditionnel Présent
            "tiretterais" to "tireterais",
            "tiretterait" to "tireterait",
            "tiretterions" to "tireterions",
            "tiretteriez" to "tireteriez",
            "tiretteraient" to "tireteraient"
        )

        // Vergeter (Marquer de vergetures / Nettoyer avec une vergette)
        val vergeterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "vergette" to "vergète",
            "vergettes" to "vergètes",
            "vergettent" to "vergètent",
            // Futur Simple
            "vergetterai" to "vergèterai",
            "vergetteras" to "vergèteras",
            "vergettera" to "vergètera",
            "vergetterons" to "vergèterons",
            "vergetterez" to "vergèterez",
            "vergetteront" to "vergèteront",
            // Conditionnel Présent
            "vergetterais" to "vergèterais",
            "vergetterait" to "vergèterait",
            "vergetterions" to "vergèterions",
            "vergetteriez" to "vergèteriez",
            "vergetteraient" to "vergèteraient"
        )

        // Ébouqueter (Couper le bout des bourgeons)
        val ebouqueterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "ébouquette" to "ébouquète",
            "ébouquettes" to "ébouquètes",
            "ébouquettent" to "ébouquètent",
            // Futur Simple
            "ébouquetterai" to "ébouquèterai",
            "ébouquetteras" to "ébouquèteras",
            "ébouquettera" to "ébouquètera",
            "ébouquetterons" to "ébouquèterons",
            "ébouquetterez" to "ébouquèterez",
            "ébouquetteront" to "ébouquèteront",
            // Conditionnel Présent
            "ébouquetterais" to "ébouquèterais",
            "ébouquetterait" to "ébouquèterait",
            "ébouquetterions" to "ébouquèterions",
            "ébouquetteriez" to "ébouquèteriez",
            "ébouquetteraient" to "ébouquèteraient"
        )

        // Échiqueter (Marquer comme un échiquier)
        val echiqueterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "échiquette" to "échiquète",
            "échiquettes" to "échiquètes",
            "échiquettent" to "échiquètent",
            // Futur Simple
            "échiquetterai" to "échiquèterai",
            "échiquetteras" to "échiquèteras",
            "échiquettera" to "échiquètera",
            "échiquetterons" to "échiquèterons",
            "échiquetterez" to "échiquèterez",
            "échiquetteront" to "échiquèteront",
            // Conditionnel Présent
            "échiquetterais" to "échiquèterais",
            "échiquetterait" to "échiquèterait",
            "échiquetterions" to "échiquèterions",
            "échiquetteriez" to "échiquèteriez",
            "échiquetteraient" to "échiquèteraient"
        )

        // Écoqueter (Action technique de briser une coque)
        val ecoqueterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "écoquette" to "écoquète",
            "écoquettes" to "écoquètes",
            "écoquettent" to "écoquètent",
            // Futur Simple
            "écoquetterai" to "écoquèterai",
            "écoquetteras" to "écoquèteras",
            "écoquettera" to "écoquètera",
            "écoquetterons" to "écoquèterons",
            "écoquetterez" to "écoquèterez",
            "écoquetteront" to "écoquèteront",
            // Conditionnel Présent
            "écoquetterais" to "écoquèterais",
            "écoquetterait" to "écoquèterait",
            "écoquetterions" to "écoquèterions",
            "écoquetteriez" to "écoquèteriez",
            "écoquetteraient" to "écoquèteraient"
        )

        // Réinterpréter (Interpréter de nouveau ou d'une manière nouvelle)
        val reinterpreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "réinterpréterai" to "réinterprèterai",
            "réinterpréteras" to "réinterprèteras",
            "réinterprétera" to "réinterprètera",
            "réinterpréterons" to "réinterprèterons",
            "réinterpréterez" to "réinterprèterez",
            "réinterpréteront" to "réinterprèteront",

            // Conditionnel Présent
            "réinterpréterais" to "réinterprèterais",
            "réinterpréterait" to "réinterprèterait",
            "réinterpréterions" to "réinterprèterions",
            "réinterpréteriez" to "réinterprèteriez",
            "réinterpréteraient" to "réinterprèteraient"
        )
        // Reloqueter (Mettre des loquets ; remettre en loques)
        val reloqueterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "reloquette" to "reloquète",
            "reloquettes" to "reloquètes",
            "reloquettent" to "reloquètent",

            // Futur Simple
            "reloquetterai" to "reloquèterai",
            "reloquetteras" to "reloquèteras",
            "reloquettera" to "reloquètera",
            "reloquetterons" to "reloquèterons",
            "reloquetterez" to "reloquèterez",
            "reloquetteront" to "reloquèteront",

            // Conditionnel Présent
            "reloquetterais" to "reloquèterais",
            "reloquetterait" to "reloquèterait",
            "reloquetterions" to "reloquèterions",
            "reloquetteriez" to "reloquèteriez",
            "reloquetteraient" to "reloquèteraient"
        )

        // Rempiéter (Refaire le pied d'un mur, d'un bas)
        val rempieterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rempiéterai" to "rempièterai",
            "rempiéteras" to "rempièteras",
            "rempiétera" to "rempiètera",
            "rempiéterons" to "rempièterons",
            "rempiéterez" to "rempièterez",
            "rempiéteront" to "rempièteront",

            // Conditionnel Présent
            "rempiéterais" to "rempièterais",
            "rempiéterait" to "rempièterait",
            "rempiéterions" to "rempièterions",
            "rempiéteriez" to "rempièteriez",
            "rempiéteraient" to "rempièteraient"
        )

        // Riveter (Fixer avec des rivets)
        val riveterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "rivette" to "rivète",
            "rivettes" to "rivètes",
            "rivettent" to "rivètent",

            // Futur Simple
            "rivetterai" to "rivèterai",
            "rivetteras" to "rivèteras",
            "rivettera" to "rivètera",
            "rivetterons" to "rivèterons",
            "rivetterez" to "rivèterez",
            "rivetteront" to "rivèteront",

            // Conditionnel Présent
            "rivetterais" to "rivèterais",
            "rivetterait" to "rivèterait",
            "rivetterions" to "rivèterions",
            "rivetteriez" to "rivèteriez",
            "rivetteraient" to "rivèteraient"
        )

        // Rouspéter (Manifester son mécontentement)
        val rouspeterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "rouspéterai" to "rouspèterai",
            "rouspéteras" to "rouspèteras",
            "rouspétera" to "rouspètera",
            "rouspéterons" to "rouspèterons",
            "rouspéterez" to "rouspèterez",
            "rouspéteront" to "rouspèteront",

            // Conditionnel Présent
            "rouspéterais" to "rouspèterais",
            "rouspéterait" to "rouspèterait",
            "rouspéterions" to "rouspèterions",
            "rouspéteriez" to "rouspèteriez",
            "rouspéteraient" to "rouspèteraient"
        )

        // Sécréter (Produire une sécrétion)
        val secreterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sécréterai" to "sécrèterai",
            "sécréteras" to "sécrèteras",
            "sécrétera" to "sécrètera",
            "sécréterons" to "sécrèterons",
            "sécréterez" to "sécrèterez",
            "sécréteront" to "sécrèteront",

            // Conditionnel Présent
            "sécréterais" to "sécrèterais",
            "sécréterait" to "sécrèterait",
            "sécréterions" to "sécrèterions",
            "sécréteriez" to "sécrèteriez",
            "sécréteraient" to "sécrèteraient"
        )

        // Soucheter (Inscrire sur une souche de registre)
        val soucheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "souchette" to "souchète",
            "souchettes" to "souchètes",
            "souchettent" to "souchètent",

            // Futur Simple
            "souchetterai" to "souchèterai",
            "souchetteras" to "souchèteras",
            "souchettera" to "souchètera",
            "souchetterons" to "souchèterons",
            "souchetterez" to "souchèterez",
            "souchetteront" to "souchèteront",

            // Conditionnel Présent
            "souchetterais" to "souchèterais",
            "souchetterait" to "souchèterait",
            "souchetterions" to "souchèterions",
            "souchetteriez" to "souchèteriez",
            "souchetteraient" to "souchèteraient"
        )

        // Souffleter (Donner un soufflet, une gifle)
        val souffleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "soufflette" to "soufflète",
            "soufflettes" to "soufflètes",
            "soufflettent" to "soufflètent",

            // Futur Simple
            "souffletterai" to "soufflèterai",
            "souffletteras" to "soufflèteras",
            "soufflettera" to "soufflètera",
            "souffletterons" to "soufflèterons",
            "souffletterez" to "soufflèterez",
            "souffletteront" to "soufflèteront",

            // Conditionnel Présent
            "souffletterais" to "soufflèterais",
            "souffletterait" to "soufflèterait",
            "souffletterions" to "soufflèterions",
            "souffletteriez" to "soufflèteriez",
            "souffletteraient" to "soufflèteraient"
        )

        // Tacheter (Marquer de petites taches)
        val tacheterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "tachette" to "tachète",
            "tachettes" to "tachètes",
            "tachettent" to "tachètent",

            // Futur Simple
            "tachetterai" to "tachèterai",
            "tachetteras" to "tachèteras",
            "tachettera" to "tachètera",
            "tachetterons" to "tachèterons",
            "tachetterez" to "tachèterez",
            "tachetteront" to "tachèteront",

            // Conditionnel Présent
            "tachetterais" to "tachèterais",
            "tachetterait" to "tachèterait",
            "tachetterions" to "tachèterions",
            "tachetteriez" to "tachèteriez",
            "tachetteraient" to "tachèteraient"
        )

        // Téter (Sucer le lait de sa mère ou d'une nourrice)
        val teterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "téterai" to "tèterai",
            "téteras" to "tèteras",
            "tétera" to "tètera",
            "téterons" to "tèterons",
            "téterez" to "tèterez",
            "téteront" to "tèteront",

            // Conditionnel Présent
            "téterais" to "tèterais",
            "téterait" to "tèterait",
            "téterions" to "tèterions",
            "téteriez" to "tèteriez",
            "téteraient" to "tèteraient"
        )

        // Tripleter (Tordre ensemble trois fils pour en faire un seul)
        val tripleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "triplette" to "triplète",
            "triplettes" to "triplètes",
            "triplettent" to "triplètent",

            // Futur Simple
            "tripletterai" to "triplèterai",
            "tripletteras" to "triplèteras",
            "triplettera" to "triplètera",
            "tripletterons" to "triplèterons",
            "tripletterez" to "triplèterez",
            "tripletteront" to "triplèteront",

            // Conditionnel Présent
            "tripletterais" to "triplèterais",
            "tripletterait" to "triplèterait",
            "tripletterions" to "triplèterions",
            "tripletteriez" to "triplèteriez",
            "tripletteraient" to "triplèteraient"
        )


        // Trompeter (Annoncer au son de la trompette ; crier, en parlant de l'aigle)
        val trompeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "trompette" to "trompète",
            "trompettes" to "trompètes",
            "trompettent" to "trompètent",

            // Futur Simple
            "trompetterai" to "trompèterai",
            "trompetteras" to "trompèteras",
            "trompettera" to "trompètera",
            "trompetterons" to "trompèterons",
            "trompetterez" to "trompèterez",
            "trompetteront" to "trompèteront",

            // Conditionnel Présent
            "trompetterais" to "trompèterais",
            "trompetterait" to "trompèterait",
            "trompetterions" to "trompèterions",
            "trompetteriez" to "trompèteriez",
            "trompetteraient" to "trompèteraient"
        )

        // Valeter (Être servile, faire le valet)
        val valeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "valette" to "valète",
            "valettes" to "valètes",
            "valettent" to "valètent",

            // Futur Simple
            "valetterai" to "valèterai",
            "valetteras" to "valèteras",
            "valettera" to "valètera",
            "valetterons" to "valèterons",
            "valetterez" to "valèterez",
            "valetteront" to "valèteront",

            // Conditionnel Présent
            "valetterais" to "valèterais",
            "valetterait" to "valèterait",
            "valetterions" to "valèterions",
            "valetteriez" to "valèteriez",
            "valetteraient" to "valèteraient"
        )

        // Végéter (Vivre au ralenti ; croître, pour une plante)
        val vegeterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "végéterai" to "végèterai",
            "végéteras" to "végèteras",
            "végétera" to "végètera",
            "végéterons" to "végèterons",
            "végéterez" to "végèterez",
            "végéteront" to "végèteront",

            // Conditionnel Présent
            "végéterais" to "végèterais",
            "végéterait" to "végèterait",
            "végéterions" to "végèterions",
            "végéteriez" to "végèteriez",
            "végéteraient" to "végèteraient"
        )

        // Vigneter (Orner d'une vignette)
        val vigneterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "vignette" to "vignète",
            "vignettes" to "vignètes",
            "vignettent" to "vignètent",

            // Futur Simple
            "vignetterai" to "vignèterai",
            "vignetteras" to "vignèteras",
            "vignettera" to "vignètera",
            "vignetterons" to "vignèterons",
            "vignetterez" to "vignèterez",
            "vignetteront" to "vignèteront",

            // Conditionnel Présent
            "vignetterais" to "vignèterais",
            "vignetterait" to "vignèterait",
            "vignetterions" to "vignèterions",
            "vignetteriez" to "vignèteriez",
            "vignetteraient" to "vignèteraient"
        )

        // Violeter (Teinter de violet)
        val violeterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "violette" to "violète",
            "violettes" to "violètes",
            "violettent" to "violètent",

            // Futur Simple
            "violetterai" to "violèterai",
            "violetteras" to "violèteras",
            "violettera" to "violètera",
            "violetterons" to "violèterons",
            "violetterez" to "violèterez",
            "violetteront" to "violèteront",

            // Conditionnel Présent
            "violetterais" to "violèterais",
            "violetterait" to "violèterait",
            "violetterions" to "violèterions",
            "violetteriez" to "violèteriez",
            "violetteraient" to "violèteraient"
        )

        // Voleter (Voler à petits coups d'ailes, voltiger)
        val voleterModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif présent
            "volette" to "volète",
            "volettes" to "volètes",
            "volettent" to "volètent",

            // Futur Simple
            "voletterai" to "volèterai",
            "voletteras" to "volèteras",
            "volettera" to "volètera",
            "voletterons" to "volèterons",
            "voletterez" to "volèterez",
            "voletteront" to "volèteront",

            // Conditionnel Présent
            "voletterais" to "volèterais",
            "voletterait" to "volèterait",
            "voletterions" to "volèterions",
            "voletteriez" to "volèteriez",
            "voletteraient" to "volèteraient"
        )

        val apleterModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "apléterai" to "aplèterai",
            "apléteras" to "aplèteras",
            "aplétera" to "aplètera",
            "apléterons" to "aplèterons",
            "apléterez" to "aplèterez",
            "apléteront" to "aplèteront",

            // Conditionnel Présent
            "apléterais" to "aplèterais",
            "apléterait" to "aplèterait",
            "apléterions" to "aplèterions",
            "apléteriez" to "aplèteriez",
            "apléteraient" to "aplèteraient"
        )
        // Clocheter
        val clocheterModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "clochette" to "clochète",
            "clochettes" to "clochètes",
            "clochettent" to "clochètent",
            // Futur Simple
            "clochetterai" to "clochèterai",
            "clochetteras" to "clochèteras",
            "clochettera" to "clochètera",
            "clochetterons" to "clochèterons",
            "clochetterez" to "clochèterez",
            "clochetteront" to "clochèteront",
            // Conditionnel Présent
            "clochetterais" to "clochèterais",
            "clochetterait" to "clochèterait",
            "clochetterions" to "clochèterions",
            "clochetteriez" to "clochèteriez",
            "clochetteraient" to "clochèteraient"
        )

        val eter : Map<String, String> =
            accreterModifAccent +
                    admoneterModifAccent +
                    affreterModifAccent +
                    aiguilleterModifAccent +
                    apleterModifAccent +
                    appeterModifAccent +
                    banqueterModifAccent +
                    baqueterModifAccent +
                    bareterModifAccent +
                    becheveterModifAccent +
                    begueterModifAccent +
                    bequeterModifAccent +
                    biqueterModifAccent +
                    bonneterModifAccent +
                    bouqueterModifAccent +
                    bouveterModifAccent +
                    breveterModifAccent +
                    briqueterModifAccent +
                    brocheterModifAccent +
                    budgeterModifAccent +
                    buffeterModifAccent +
                    cacheterModifAccent +
                    cafeterModifAccent +
                    cailleterModifAccent +
                    caleterModifAccent +
                    caneterModifAccent +
                    causeterModifAccent +
                    caqueterModifAccent +
                    charreterModifAccent +
                    chevreterModifAccent +
                    chiqueterModifAccent +
                    chucheterModifAccent +
                    claqueterModifAccent +
                    claveterModifAccent +
                    cliqueterModifAccent +
                    clocheterModifAccent +
                    colleterModifAccent +
                    competerModifAccent +
                    completerModifAccent +
                    concreterModifAccent +
                    coqueterModifAccent +
                    coupleterModifAccent +
                    craqueterModifAccent +
                    cureterModifAccent +
                    debequeterModifAccent +
                    decacheterModifAccent +
                    dechiqueterModifAccent +
                    declaveterModifAccent +
                    decliqueterModifAccent +
                    decolleterModifAccent +
                    decompleterModifAccent +
                    decreterModifAccent +
                    demoucheterModifAccent +
                    depaqueterModifAccent +
                    deriveterModifAccent +
                    duveterModifAccent +
                    ebouqueterModifAccent +
                    echiqueterModifAccent +
                    ecolleterModifAccent +
                    ecoqueterModifAccent +
                    emoucheterModifAccent +
                    empaqueterModifAccent +
                    empieterModifAccent +
                    encliqueterModifAccent +
                    encolleterModifAccent +
                    epinceterModifAccent +
                    epousseterModifAccent +
                    etiqueterModifAccent +
                    excreterModifAccent +
                    feuilleterModifAccent +
                    foufeterModifAccent +
                    freterModifAccent +
                    galeterModifAccent +
                    gileterModifAccent +
                    gobeterModifAccent +
                    greneterModifAccent +
                    guillemeterModifAccent +
                    galeterModifAccent +
                    hebeterModifAccent +
                    hoqueterModifAccent +
                    inquieterModifAccent +
                    interpreterModifAccent +
                    jarreterModifAccent +
                    langueterModifAccent +
                    levreterModifAccent +
                    loqueterModifAccent +
                    louveterModifAccent +
                    mailleterModifAccent +
                    marketerModifAccent +
                    marqueterModifAccent +
                    mesinterpreterModifAccent +
                    moleterModifAccent +
                    moucheterModifAccent +
                    moufeterModifAccent +
                    mugueterModifAccent +
                    museleterModifAccent +
                    niqueterModifAccent +
                    pailleterModifAccent +
                    paqueterModifAccent +
                    parqueterModifAccent +
                    pelleterModifAccent +
                    peterModifAccent +
                    pieterModifAccent +
                    pinceterModifAccent +
                    pipeterModifAccent +
                    piqueterModifAccent +
                    planeterModifAccent +
                    pocheterModifAccent +
                    raineterModifAccent +
                    rebequeterModifAccent +
                    recacheterModifAccent +
                    recompleterModifAccent +
                    refeuilleterModifAccent +
                    refleterModifAccent +
                    reinterpreterModifAccent +
                    reloqueterModifAccent +
                    rempaqueterModifAccent +
                    rempieterModifAccent +
                    repeterModifAccent +
                    riveterModifAccent +
                    rouspeterModifAccent +
                    saveterModifAccent +
                    sauveterModifAccent +
                    secreterModifAccent +
                    soucheterModifAccent +
                    souffleterModifAccent +
                    sousAffreterModifAccent +
                    sousFreterModifAccent +
                    surinterpreterModifAccent +
                    tacheterModifAccent +
                    teterModifAccent +
                    tiqueterModifAccent +
                    tireterModifAccent +
                    tripleterModifAccent +
                    trompeterModifAccent +
                    valeterModifAccent +
                    vegeterModifAccent +
                    vergeterModifAccent +
                    vigneterModifAccent +
                    violeterModifAccent +
                    voleterModifAccent

    }
}