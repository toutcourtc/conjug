package com.toutcourtc.tests.verbes.accentsaiguversgrave

class StringHarmonizationEler {
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

        // Aciseler (Orner un métal de motifs ciselés, terme technique)
        val aciselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "aciselle" to "acisèle",
            "aciselles" to "acisèles",
            "acisellent" to "acisèlent",

            // Futur Simple
            "acisellerai" to "acisèlerai",
            "aciselleras" to "acisèleras",
            "acisellera" to "acisèlera",
            "acisellerons" to "acisèlerons",
            "acisellerez" to "acisèlerez",
            "aciselleront" to "acisèleront",

            // Conditionnel Présent
            "acisellerais" to "acisèlerais",
            "acisellerait" to "acisèlerait",
            "acisellerions" to "acisèlerions",
            "aciselleriez" to "acisèleriez",
            "aciselleraient" to "acisèleraient"
        )

        // Agneler (Mettre bas, en parlant de la brebis)
        val agnelerModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif
            "agnelle" to "agnèle",
            "agnelles" to "agnèles",
            "agnellent" to "agnèlent",

            // Futur Simple
            "agnellerai" to "agnèlerai",
            "agnelleras" to "agnèleras",
            "agnellera" to "agnèlera",
            "agnellerons" to "agnèlerons",
            "agnellerez" to "agnèlerez",
            "agnelleront" to "agnèleront",

            // Conditionnel Présent
            "agnellerais" to "agnèlerais",
            "agnellerait" to "agnèlerait",
            "agnellerions" to "agnèlerions",
            "agnelleriez" to "agnèleriez",
            "agnelleraient" to "agnèleraient"
        )
        // Amonceler (Mettre en monceau, accumuler)
        val amoncelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "amoncelle" to "amoncèle",
            "amoncelles" to "amoncèles",
            "amoncellent" to "amoncèlent",

            // Futur Simple
            "amoncellerai" to "amoncèlerai",
            "amoncelleras" to "amoncèleras",
            "amoncellera" to "amoncèlera",
            "amoncellerons" to "amoncèlerons",
            "amoncellerez" to "amoncèlerez",
            "amoncelleront" to "amoncèleront",

            // Conditionnel Présent
            "amoncellerais" to "amoncèlerais",
            "amoncellerait" to "amoncèlerait",
            "amoncellerions" to "amoncèlerions",
            "amoncelleriez" to "amoncèleriez",
            "amoncelleraient" to "amoncèleraient"
        )

        // Anheler (Respirer avec peine, d'une manière courte et précipitée.)
        val anhelerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "anhélerai" to "anhèlerai",
            "anhéleras" to "anhèleras",
            "anhélera" to "anhèlera",
            "anhélerons" to "anhèlerons",
            "anhélerez" to "anhèlerez",
            "anhéleront" to "anhèleront",

            // Conditionnel Présent
            "anhélerais" to "anhèlerais",
            "anhélerait" to "anhèlerait",
            "anhélerions" to "anhèlerions",
            "anhéleriez" to "anhèleriez",
            "anhéleraient" to "anhèleraient"
        )
        // Anneler (Former des anneaux, friser les cheveux)
        val annelerModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif
            "annelle" to "annèle",
            "annelles" to "annèles",
            "annellent" to "annèlent",

            // Futur Simple
            "annellerai" to "annèlerai",
            "annelleras" to "annèleras",
            "annellera" to "annèlera",
            "annellerons" to "annèlerons",
            "annellerez" to "annèlerez",
            "annelleront" to "annèleront",

            // Conditionnel Présent
            "annellerais" to "annèlerais",
            "annellerait" to "annèlerait",
            "annellerions" to "annèlerions",
            "annelleriez" to "annèleriez",
            "annelleraient" to "annèleraient"
        )

        // Atteler (Attacher un animal à un véhicule ou s'attacher à une tâche)
        val attelerModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif
            "attelle" to "attèle",
            "attelles" to "attèles",
            "attellent" to "attèlent",

            // Futur Simple
            "attellerai" to "attèlerai",
            "attelleras" to "attèleras",
            "attellera" to "attèlera",
            "attellerons" to "attèlerons",
            "attellerez" to "attèlerez",
            "attelleront" to "attèleront",

            // Conditionnel Présent
            "attellerais" to "attèlerais",
            "attellerait" to "attèlerait",
            "attellerions" to "attèlerions",
            "attelleriez" to "attèleriez",
            "attelleraient" to "attèleraient"
        )

        // Babeler (Bavarder, terme régional)
        val babelerModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif
            "babelle" to "babèle",
            "babelles" to "babèles",
            "babellent" to "babèlent",

            // Futur Simple
            "babellerai" to "babèlerai",
            "babelleras" to "babèleras",
            "babellera" to "babèlera",
            "babellerons" to "babèlerons",
            "babellerez" to "babèlerez",
            "babelleront" to "babèleront",

            // Conditionnel Présent
            "babellerais" to "babèlerais",
            "babellerait" to "babèlerait",
            "babellerions" to "babèlerions",
            "babelleriez" to "babèleriez",
            "babelleraient" to "babèleraient"
        )

        // Barbeler (Garnir de pointes ou de barbes)
        val barbelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "barbelle" to "barbèle",
            "barbelles" to "barbèles",
            "barbellent" to "barbèlent",

            // Futur Simple
            "barbellerai" to "barbèlerai",
            "barbelleras" to "barbèleras",
            "barbellera" to "barbèlera",
            "barbellerons" to "barbèlerons",
            "barbellerez" to "barbèlerez",
            "barbellont" to "barbèleront",

            // Conditionnel Présent
            "barbellerais" to "barbèlerais",
            "barbellerait" to "barbèlerait",
            "barbellerions" to "barbèlerions",
            "barbelleriez" to "barbèleriez",
            "barbelleraient" to "barbèleraient"
        )

        // Bateler (Transporter par bateau ou faire des tours de bateleur)
        val batelerModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif et subjonctif
            "batelle" to "batèle",
            "batelles" to "batèles",
            "batellent" to "batèlent",

            // Futur Simple
            "batellerai" to "batèlerai",
            "batelleras" to "batèleras",
            "batellera" to "batèlera",
            "batellerons" to "batèlerons",
            "batellerez" to "batèlerez",
            "batelleront" to "batèleront",

            // Conditionnel Présent
            "batellerais" to "batèlerais",
            "batellerait" to "batèlerait",
            "batellerions" to "batèlerions",
            "batelleriez" to "batèleriez",
            "batelleraient" to "batèleraient"
        )


        // Bosseler (Produire des bosses sur une surface métallique)
        val bosselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "bosselle" to "bossèle",
            "bosselles" to "bossèles",
            "bossellent" to "bossèlent",

            // Futur Simple
            "bossellerai" to "bossèlerai",
            "bosselleras" to "bossèleras",
            "bossellera" to "bossèlera",
            "bossellerons" to "bossèlerons",
            "bossellerez" to "bossèlerez",
            "bosselleront" to "bossèleront",

            // Conditionnel Présent
            "bossellerais" to "bossèlerais",
            "bossellerait" to "bossèlerait",
            "bossellerions" to "bossèlerions",
            "bosselleriez" to "bossèleriez",
            "bosselleraient" to "bossèleraient"
        )

        // Bréler (Attacher avec des cordages)
        val brelerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "brélerai" to "brèlerai",
            "bréleras" to "brèleras",
            "brélera" to "brèlera",
            "brélerons" to "brèlerons",
            "brélerez" to "brèlerez",
            "bréleront" to "brèleront",

            // Conditionnel Présent
            "brélerais" to "brèlerais",
            "brélerait" to "brèlerait",
            "brélerions" to "brèlerions",
            "bréleriez" to "brèleriez",
            "bréleraient" to "brèleraient"
        )

        // Broubeler (S'agiter, bouillonner)
        val broubelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "broubelle" to "broubèle",
            "broubelles" to "broubèles",
            "broubellent" to "broubèlent",

            // Futur Simple
            "broubellerai" to "broubèlerai",
            "broubelleras" to "broubèleras",
            "broubellera" to "broubèlera",
            "broubellerons" to "broubèlerons",
            "broubellerez" to "broubèlerez",
            "broubelleront" to "broubèleront",

            // Conditionnel Présent
            "broubellerais" to "broubèlerais",
            "broubellerait" to "broubèlerait",
            "broubellerions" to "broubèlerions",
            "broubelleriez" to "broubèleriez",
            "broubelleraient" to "broubèleraient"
        )

        // Botteler (Lier en bottes, comme du foin ou de la paille)
        val bottelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "bottelle" to "bottèle",
            "bottelles" to "bottèles",
            "bottellent" to "bottèlent",

            // Futur Simple
            "bottellerai" to "bottèlerai",
            "bottelleras" to "bottèleras",
            "bottellera" to "bottèlera",
            "bottellerons" to "bottèlerons",
            "bottellerez" to "bottèlerez",
            "bottelleront" to "bottèleront",

            // Conditionnel Présent
            "bottellerais" to "bottèlerais",
            "bottellerait" to "bottèlerait",
            "bottellerions" to "bottèlerions",
            "bottelleriez" to "bottèleriez",
            "bottelleraient" to "bottèleraient"
        )

        // Bouéler (Crier, terme régional/maritime)
        val bouelerModifAccent : Map<String, String> = mapOf(
            "bouélerai" to "bouèlerai",
            "bouéleras" to "bouèleras",
            "bouélera" to "bouèlera",
            "bouélerons" to "bouèlerons",
            "bouélerez" to "bouèlerez",
            "bouéleront" to "bouèleront",

            "bouélerais" to "bouèlerais",
            "bouélerait" to "bouèlerait",
            "bouélerions" to "bouèlerions",
            "bouéleriez" to "bouèleriez",
            "bouéleraient" to "bouèleraient"
        )

        // Bourreler (Tourmenter, infliger des remords)
        val bourrelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "bourrelle" to "bourrèle",
            "bourrelles" to "bourrèles",
            "bourrellent" to "bourrèlent",

            // Futur Simple
            "bourrellerai" to "bourrèlerai",
            "bourrelleras" to "bourrèleras",
            "bourrellera" to "bourrèlera",
            "bourrellerons" to "bourrèlerons",
            "bourrellerez" to "bourrèlerez",
            "bourrelleront" to "bourrèleront",

            // Conditionnel Présent
            "bourrellerais" to "bourrèlerais",
            "bourrellerait" to "bourrèlerait",
            "bourrellerions" to "bourrèlerions",
            "bourrelleriez" to "bourrèleriez",
            "bourrelleraient" to "bourrèleraient"
        )

        // Bretteler (Entamer une pierre avec la brettelle)
        val brettelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "brettelle" to "brettèle",
            "brettelles" to "brettèles",
            "brettellent" to "brettèlent",

            // Futur Simple
            "brettellerai" to "brettèlerai",
            "brettelleras" to "brettèleras",
            "brettellera" to "brettèlera",
            "brettellerons" to "brettèlerons",
            "brettellerez" to "brettèlerez",
            "brettelleront" to "brettèleront",

            // Conditionnel Présent
            "brettellerais" to "brettèlerais",
            "brettellerait" to "brettèlerait",
            "brettellerions" to "brettèlerions",
            "brettelleriez" to "brettèleriez",
            "brettelleraient" to "brettèleraient"
        )

        // Bureler (Tracer des burelles ou des filets sur un blason)
        val burelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "burelle" to "burèle",
            "burelles" to "burèles",
            "burellent" to "burèlent",

            // Futur Simple
            "burellerai" to "burèlerai",
            "burelleras" to "burèleras",
            "burellera" to "burèlera",
            "burellerons" to "burèlerons",
            "burellerez" to "burèlerez",
            "burelleront" to "burèleront",

            // Conditionnel Présent
            "burellerais" to "burèlerais",
            "burellerait" to "burèlerait",
            "burellerions" to "burèlerions",
            "burelleriez" to "burèleriez",
            "burelleraient" to "burèleraient"
        )

        // Canneler (Pratiquer des rainures ou des cannelures sur un objet)
        val cannelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "cannelle" to "cannèle",
            "cannelles" to "cannèles",
            "cannellent" to "cannèlent",

            // Futur Simple
            "cannellerai" to "cannèlerai",
            "cannelleras" to "cannèleras",
            "cannellera" to "cannèlera",
            "cannellerons" to "cannèlerons",
            "cannellerez" to "cannèlerez",
            "cannelleront" to "cannèleront",

            // Conditionnel Présent
            "cannellerais" to "cannèlerais",
            "cannellerait" to "cannèlerait",
            "cannellerions" to "cannèlerions",
            "cannelleriez" to "cannèleriez",
            "cannelleraient" to "cannèleraient"
        )

        // Capeler (Fixer un cordage, terme maritime)
        val capelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "capelle" to "capèle",
            "capelles" to "capèles",
            "capellent" to "capèlent",

            // Futur Simple
            "capellerai" to "capèlerai",
            "capelleras" to "capèleras",
            "capellera" to "capèlera",
            "capellerons" to "capèlerons",
            "capellerez" to "capèlerez",
            "capelleront" to "capèleront",

            // Conditionnel Présent
            "capellerais" to "capèlerais",
            "capellerait" to "capèlerait",
            "capellerions" to "capèlerions",
            "capelleriez" to "capèleriez",
            "capelleraient" to "capèleraient"
        )

        // Carneler (Ajouter une bordure de type carnèle sur une monnaie ou un blason)
        val carnelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "carnelle" to "carnèle",
            "carnelles" to "carnèles",
            "carnellent" to "carnèlent",

            // Futur Simple
            "carnellerai" to "carnèlerai",
            "carnelleras" to "carnèleras",
            "carnellera" to "carnèlera",
            "carnellerons" to "carnèlerons",
            "carnellerez" to "carnèlerez",
            "carnelleront" to "carnèleront",

            // Conditionnel Présent
            "carnellerais" to "carnèlerais",
            "carnellerait" to "carnèlerait",
            "carnellerions" to "carnèlerions",
            "carnelleriez" to "carnèleriez",
            "carnelleraient" to "carnèleraient"
        )

        // Carreler (Recouvrir un sol de carreaux)
        val carrelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "carrelle" to "carrèle",
            "carrelles" to "carrèles",
            "carrellent" to "carrèlent",

            // Futur Simple
            "carrellerai" to "carrèlerai",
            "carrelleras" to "carrèleras",
            "carrellera" to "carrèlera",
            "carrellerons" to "carrèlerons",
            "carrellerez" to "carrèlerez",
            "carrellont" to "carrèleront",

            // Conditionnel Présent
            "carrellerais" to "carrèlerais",
            "carrellerait" to "carrèlerait",
            "carrellerions" to "carrèlerions",
            "carrelleriez" to "carrèleriez",
            "carrelleraient" to "carrèleraient"
        )

        // Chanceler (Manquer d'équilibre, être instable)
        val chancelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "chancelle" to "chancèle",
            "chancelles" to "chancèles",
            "chancellent" to "chancèlent",

            // Futur Simple
            "chancellerai" to "chancèlerai",
            "chancelleras" to "chancèleras",
            "chancellera" to "chancèlera",
            "chancellerons" to "chancèlerons",
            "chancellerez" to "chancèlerez",
            "chancelleront" to "chancèleront",

            // Conditionnel Présent
            "chancellerais" to "chancèlerais",
            "chancellerait" to "chancèlerait",
            "chancellerions" to "chancèlerions",
            "chancelleriez" to "chancèleriez",
            "chancelleraient" to "chancèleraient"
        )

        // Chapeler (Enlever la croûte du pain ou réduire en chapelure)
        val chapelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "chapelle" to "chapèle",
            "chapelles" to "chapèles",
            "chapellent" to "chapèlent",

            // Futur Simple
            "chapellerai" to "chapèlerai",
            "chapelleras" to "chapèleras",
            "chapellera" to "chapèlera",
            "chapellerons" to "chapèlerons",
            "chapellerez" to "chapèlerez",
            "chapelleront" to "chapèleront",

            // Conditionnel Présent
            "chapellerais" to "chapèlerais",
            "chapellerait" to "chapèlerait",
            "chapellerions" to "chapèlerions",
            "chapelleriez" to "chapèleriez",
            "chapelleraient" to "chapèleraient"
        )

        // Cordeler (Tordre ensemble plusieurs brins pour former une corde)
        val cordelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "cordelle" to "cordèle",
            "cordelles" to "cordèles",
            "cordellent" to "cordèlent",

            // Futur Simple
            "cordellerai" to "cordèlerai",
            "cordelleras" to "cordèleras",
            "cordellera" to "cordèlera",
            "cordellerons" to "cordèlerons",
            "cordellerez" to "cordèlerez",
            "cordelleront" to "cordèleront",

            // Conditionnel Présent
            "cordellerais" to "cordèlerais",
            "cordellerait" to "cordèlerait",
            "cordellerions" to "cordèlerions",
            "cordelleriez" to "cordèleriez",
            "cordelleraient" to "cordèleraient"
        )

        // Corréler
        val correlerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "corrélerai" to "corrèlerai",
            "corréleras" to "corrèleras",
            "corrélera" to "corrèlera",
            "corrélerons" to "corrèlerons",
            "corrélerez" to "corrèlerez",
            "corréleront" to "corrèleront",
            // Conditionnel Présent
            "corrélerais" to "corrèlerais",
            "corrélerait" to "corrèlerait",
            "corrélerions" to "corrèlerions",
            "corréleriez" to "corrèleriez",
            "corréleraient" to "corrèleraient"
        )

        // Côteler (Marquer de côtes ou de nervures)
        val cotelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "côtelle" to "côtèle",
            "côtelles" to "côtèles",
            "côtellent" to "côtèlent",

            // Futur Simple
            "côtellerai" to "côtèlerai",
            "côtelleras" to "côtèleras",
            "côtellera" to "côtèlera",
            "côtellerons" to "côtèlerons",
            "côtellerez" to "côtèlerez",
            "côtelleront" to "côtèleront",

            // Conditionnel Présent
            "côtellerais" to "côtèlerais",
            "côtellerait" to "côtèlerait",
            "côtellerions" to "côtèlerions",
            "côtelleriez" to "côtèleriez",
            "côtelleraient" to "côtèleraient"
        )

        // Couteler (Frapper ou couper avec un couteau)
        val coutelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "coutelle" to "coutèle",
            "coutelles" to "coutèles",
            "coutellent" to "coutèlent",

            // Futur Simple
            "coutellerai" to "coutèlerai",
            "coutelleras" to "coutèleras",
            "coutellera" to "coutèlera",
            "coutellerons" to "coutèlerons",
            "coutellerez" to "coutèlerez",
            "coutelleront" to "coutèleront",

            // Conditionnel Présent
            "coutellerais" to "coutèlerais",
            "coutellerait" to "coutèlerait",
            "coutellerions" to "coutèlerions",
            "coutelleriez" to "coutèleriez",
            "coutelleraient" to "coutèleraient"
        )

        // Craqueler (Produire des petites fentes à la surface de quelque chose)
        val craquelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "craquelle" to "craquèle",
            "craquelles" to "craquèles",
            "craquellent" to "craquèlent",

            // Futur Simple
            "craquellerai" to "craquèlerai",
            "craquelleras" to "craquèleras",
            "craquellera" to "craquèlera",
            "craquellerons" to "craquèlerons",
            "craquellerez" to "craquèlerez",
            "craquelleront" to "craquèleront",

            // Conditionnel Présent
            "craquellerais" to "craquèlerais",
            "craquellerait" to "craquèlerait",
            "craquellerions" to "craquèlerions",
            "craquelleriez" to "craquèleriez",
            "craquelleraient" to "craquèleraient"
        )

        // Créneler (Garnir de créneaux)
        val crenelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "crénelle" to "crénèle",
            "crénelles" to "crénèles",
            "crénellent" to "crénèlent",

            // Futur Simple
            "crénellerai" to "crénèlerai",
            "crénelleras" to "crénèleras",
            "crénellera" to "crénèlera",
            "crénellerons" to "crénèlerons",
            "crénellerez" to "crénèlerez",
            "crénelleront" to "crénèleront",

            // Conditionnel Présent
            "crénellerais" to "crénèlerais",
            "crénellerait" to "crénèlerait",
            "crénellerions" to "crénèlerions",
            "crénelleriez" to "crénèleriez",
            "crénelleraient" to "crénèleraient"
        )

        // Crépeler (Rendre crépu)
        val crepelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "crépelle" to "crépèle",
            "crépelles" to "crépèles",
            "crépellent" to "crépèlent",
            // Futur Simple
            "crépellerai" to "crépèlerai",
            "crépelleras" to "crépèleras",
            "crépellera" to "crépèlera",
            "crépellerons" to "crépèlerons",
            "crépellerez" to "crépèlerez",
            "crépelleront" to "crépèleront",
            // Conditionnel Présent
            "crépellerais" to "crépèlerais",
            "crépellerait" to "crépèlerait",
            "crépellerions" to "crépèlerions",
            "crépelleriez" to "crépèleriez",
            "crépelleraient" to "crépèleraient"
        )

        // Crételer (Pousser son cri, en parlant de la poule)
        val cretelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "crételle" to "crétèle",
            "crételles" to "crétèles",
            "crétellent" to "crétèlent",
            // Futur Simple
            "crétellerai" to "crétèlerai",
            "crételleras" to "crétèleras",
            "crétellera" to "crétèlera",
            "crétellerons" to "crétèlerons",
            "crétellerez" to "crétèlerez",
            "crételleront" to "crétèleront",
            // Conditionnel Présent
            "crétellerais" to "crétèlerais",
            "crétellerait" to "crétèlerait",
            "crétellerions" to "crétèlerions",
            "crételleriez" to "crétèleriez",
            "crételleraient" to "crétèleraient"
        )

        // Crêpeler (Donner l'aspect du crêpe)
        val crepelerCirconflexeModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "crêpelle" to "crêpèle",
            "crêpelles" to "crêpèles",
            "crêpellent" to "crêpèlent",
            // Futur Simple
            "crêpellerai" to "crêpèlerai",
            "crêpelleras" to "crêpèleras",
            "crêpellera" to "crêpèlera",
            "crêpellerons" to "crêpèlerons",
            "crêpellerez" to "crêpèlerez",
            "crêpelleront" to "crêpèleront",
            // Conditionnel Présent
            "crêpellerais" to "crêpèlerais",
            "crêpellerait" to "crêpèlerait",
            "crêpellerions" to "crêpèlerions",
            "crêpelleriez" to "crêpèleriez",
            "crêpelleraient" to "crêpèleraient"
        )

        // Crespeler (Rendre crépu ou frisé)
        val crespelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "crespelle" to "crespèle",
            "crespelles" to "crespèles",
            "crespellent" to "crespèlent",

            // Futur Simple
            "crespellerai" to "crespèlerai",
            "crespelleras" to "crespèleras",
            "crespellera" to "crespèlera",
            "crespellerons" to "crespèlerons",
            "crespellerez" to "crespèlerez",
            "crespelleront" to "crespèleront",

            // Conditionnel Présent
            "crespellerais" to "crespèlerais",
            "crespellerait" to "crespèlerait",
            "crespellerions" to "crespèlerions",
            "crespelleriez" to "crespèleriez",
            "crespelleraient" to "crespèleraient"
        )

        // Cuveler (Revêtir les parois d'un puits, d'une galerie, avec un cuvelage)
        val cuvelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "cuvelle" to "cuvèle",
            "cuvelles" to "cuvèles",
            "cuvellent" to "cuvèlent",

            // Futur Simple
            "cuvellerai" to "cuvèlerai",
            "cuvelleras" to "cuvèleras",
            "cuvellera" to "cuvèlera",
            "cuvellerons" to "cuvèlerons",
            "cuvellerez" to "cuvèlerez",
            "cuvelleront" to "cuvèleront",

            // Conditionnel Présent
            "cuvellerais" to "cuvèlerais",
            "cuvellerait" to "cuvèlerait",
            "cuvellerions" to "cuvèlerions",
            "cuvelleriez" to "cuvèleriez",
            "cuvelleraient" to "cuvèleraient"
        )

        // Débosseler (Redresser une surface métallique en enlevant les bosses)
        val debosselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "débosselle" to "débossèle",
            "débosselles" to "débossèles",
            "débossellent" to "débossèlent",

            // Futur Simple
            "débossellerai" to "débossèlerai",
            "débosselleras" to "débossèleras",
            "débossellera" to "débossèlera",
            "débossellerons" to "débossèlerons",
            "débossellerez" to "débossèlerez",
            "débosselleront" to "débossèleront",

            // Conditionnel Présent
            "débossellerais" to "débossèlerais",
            "débossellerait" to "débossèlerait",
            "débossellerions" to "débossèlerions",
            "débosselleriez" to "débossèleriez",
            "débosselleraient" to "débossèleraient"
        )

        // Débotteler (Défaire des bottes)
        val debottelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "débottelle" to "débottèle",
            "débottelles" to "débottèles",
            "débottellent" to "débottèlent",
            // Futur Simple
            "débottellerai" to "débottèlerai",
            "débottelleras" to "débottèleras",
            "débottellera" to "débottèlera",
            "débottellerons" to "débottèlerons",
            "débottellerez" to "débottèlerez",
            "débottelleront" to "débottèleront",
            // Conditionnel Présent
            "débottellerais" to "débottèlerais",
            "débottellerait" to "débottèlerait",
            "débottellerions" to "débottèlerions",
            "débottelleriez" to "débottèleriez",
            "débottelleraient" to "débottèleraient"
        )

        // Décorréler
        val decorrelerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "décorrélerai" to "décorrèlerai",
            "décorréleras" to "décorrèleras",
            "décorrélera" to "décorrèlera",
            "décorrélerons" to "décorrèlerons",
            "décorrélerez" to "décorrèlerez",
            "décorréleront" to "décorrèleront",
            // Conditionnel Présent
            "décorrélerais" to "décorrèlerais",
            "décorrélerait" to "décorrèlerait",
            "décorrélerions" to "décorrèlerions",
            "décorréleriez" to "décorrèleriez",
            "décorréleraient" to "décorrèleraient"
        )

        // Décrêpeler
        val decrepelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "décrêpelle" to "décrêpèle",
            "décrêpelles" to "décrêpèles",
            "décrêpellent" to "décrêpèlent",
            // Futur Simple
            "décrêpellerai" to "décrêpèlerai",
            "décrêpelleras" to "décrêpèleras",
            "décrêpellera" to "décrêpèlera",
            "décrêpellerons" to "décrêpèlerons",
            "décrêpellerez" to "décrêpèlerez",
            "décrêpelleront" to "décrêpèleront",
            // Conditionnel Présent
            "décrêpellerais" to "décrêpèlerais",
            "décrêpellerait" to "décrêpèlerait",
            "décrêpellerions" to "décrêpèlerions",
            "décrêpelleriez" to "décrêpèleriez",
            "décrêpelleraient" to "décrêpèleraient"
        )

        // Décuveler
        val decuvelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "décuvelle" to "décuvèle",
            "décuvelles" to "décuvèles",
            "décuvellent" to "décuvèlent",
            // Futur Simple
            "décuvellerai" to "décuvèlerai",
            "décuvelleras" to "décuvèleras",
            "décuvellera" to "décuvèlera",
            "décuvellerons" to "décuvèlerons",
            "décuvellerez" to "décuvèlerez",
            "décuvelleront" to "décuvèleront",
            // Conditionnel Présent
            "décuvellerais" to "décuvèlerais",
            "décuvellerait" to "décuvèlerait",
            "décuvellerions" to "décuvèlerions",
            "décuvelleriez" to "décuvèleriez",
            "décuvelleraient" to "décuvèleraient"
        )

        // Décapeler (Enlever un cordage de son point d'attache)
        val decapelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "décapelle" to "décapèle",
            "décapelles" to "décapèles",
            "décapellent" to "décapèlent",

            // Futur Simple
            "décapellerai" to "décapèlerai",
            "décapelleras" to "décapèleras",
            "décapellera" to "décapèlera",
            "décapellerons" to "décapèlerons",
            "décapellerez" to "décapèlerez",
            "décapelleront" to "décapèleront",

            // Conditionnel Présent
            "décapellerais" to "décapèlerais",
            "décapellerait" to "décapèlerait",
            "décapellerions" to "décapèlerions",
            "décapelleriez" to "décapèleriez",
            "décapelleraient" to "décapèleraient"
        )

        // Décarreler (Enlever le carrelage d'un sol ou d'un mur)
        val decarrelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "décarrelle" to "décarrèle",
            "décarrelles" to "décarrèles",
            "décarrellent" to "décarrèlent",

            // Futur Simple
            "décarrellerai" to "décarrèlerai",
            "décarrelleras" to "décarrèleras",
            "décarrellera" to "décarrèlera",
            "décarrellerons" to "décarrèlerons",
            "décarrellerez" to "décarrèlerez",
            "décarrelleront" to "décarrèleront",

            // Conditionnel Présent
            "décarrellerais" to "décarrèlerais",
            "décarrellerait" to "décarrèlerait",
            "décarrellerions" to "décarrèlerions",
            "décarrelleriez" to "décarrèleriez",
            "décarrelleraient" to "décarrèleraient"
        )

        // Décerveler (Ôter la cervelle ou, au figuré, rendre stupide)
        val decervelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "décervelle" to "décervèle",
            "décervelles" to "décervèles",
            "décervellent" to "décervèlent",

            // Futur Simple
            "décervellerai" to "décervèlerai",
            "décervelleras" to "décervèleras",
            "décervellera" to "décervèlera",
            "décervellerons" to "décervèlerons",
            "décervellerez" to "décervèlerez",
            "décervelleront" to "décervèleront",

            // Conditionnel Présent
            "décervellerais" to "décervèlerais",
            "décervellerait" to "décervèlerait",
            "décervellerions" to "décervèlerions",
            "décervelleriez" to "décervèleriez",
            "décervelleraient" to "décervèleraient"
        )
        // Déficeler (Ôter les ficelles qui lient quelque chose)
        val deficelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "déficelle" to "déficèle",
            "déficelles" to "déficèles",
            "déficellent" to "déficèlent",

            // Futur Simple
            "déficellerai" to "déficèlerai",
            "déficelleras" to "déficèleras",
            "déficellera" to "déficèlera",
            "déficellerons" to "déficèlerons",
            "déficellerez" to "déficèlerez",
            "déficelleront" to "déficèleront",

            // Conditionnel Présent
            "déficellerais" to "déficèlerais",
            "déficellerait" to "déficèlerait",
            "déficellerions" to "déficèlerions",
            "déficelleriez" to "déficèleriez",
            "déficelleraient" to "déficèleraient"
        )

        // Dégraveler (Nettoyer du gravier)
        val degravelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dégravelle" to "dégravèle",
            "dégravelles" to "dégravèles",
            "dégravellent" to "dégravèlent",
            // Futur Simple
            "dégravellerai" to "dégravèlerai",
            "dégravelleras" to "dégravèleras",
            "dégravellera" to "dégravèlera",
            "dégravellerons" to "dégravèlerons",
            "dégravellerez" to "dégravèlerez",
            "dégravelleront" to "dégravèleront",
            // Conditionnel Présent
            "dégravellerais" to "dégravèlerais",
            "dégravellerait" to "dégravèlerait",
            "dégravellerions" to "dégravèlerions",
            "dégravelleriez" to "dégravèleriez",
            "dégravelleraient" to "dégravèleraient"
        )

        // Dégoutteler (Tomber goutte à goutte / Enlever des gouttes)
        val degouttelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dégouttelle" to "dégouttèle",
            "dégouttelles" to "dégouttèles",
            "dégouttellent" to "dégouttèlent",
            // Futur Simple
            "dégouttellerai" to "dégouttèlerai",
            "dégouttelleras" to "dégouttèleras",
            "dégouttellera" to "dégouttèlera",
            "dégouttellerons" to "dégouttèlerons",
            "dégouttellerez" to "dégouttèlerez",
            "dégouttelleront" to "dégouttèleront",
            // Conditionnel Présent
            "dégouttellerais" to "dégouttèlerais",
            "dégouttellerait" to "dégouttèlerait",
            "dégouttellerions" to "dégouttèlerions",
            "dégouttelleriez" to "dégouttèleriez",
            "dégouttelleraient" to "dégouttèleraient"
        )


        // Démuseler (Ôter la muselière)
        val demuselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "démuselle" to "démusèle",
            "démuselles" to "démusèles",
            "démusellent" to "démusèlent",

            // Futur Simple
            "démusellerai" to "démusèlerai",
            "démuselleras" to "démusèleras",
            "démusellera" to "démusèlera",
            "démusellerons" to "démusèlerons",
            "démusellerez" to "démusèlerez",
            "démuselleront" to "démusèleront",

            // Conditionnel Présent
            "démusellerais" to "démusèlerais",
            "démusellerait" to "démusèlerait",
            "démusellerions" to "démusèlerions",
            "démuselleriez" to "démusèleriez",
            "démuselleraient" to "démusèleraient"
        )

        // Dénickeler (Enlever la couche de nickel d'un objet)
        val denickelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dénickelle" to "dénickèle",
            "dénickelles" to "dénickèles",
            "dénickellent" to "dénickèlent",

            // Futur Simple
            "dénickellerai" to "dénickèlerai",
            "dénickelleras" to "dénickèleras",
            "dénickellera" to "dénickèlera",
            "dénickellerons" to "dénickèlerons",
            "dénickellerez" to "dénickèlerez",
            "dénickelleront" to "dénickèleront",

            // Conditionnel Présent
            "dénickellerais" to "dénickèlerais",
            "dénickellerait" to "dénickèlerait",
            "dénickellerions" to "dénickèlerions",
            "dénickelleriez" to "dénickèleriez",
            "dénickelleraient" to "dénickèleraient"
        )

        // Déniveler (Modifier le niveau, créer une dénivellation)
        val denivelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dénivelle" to "dénivèle",
            "dénivelles" to "dénivèles",
            "dénivellent" to "dénivèlent",

            // Futur Simple
            "dénivellerai" to "dénivèlerai",
            "dénivelleras" to "dénivèleras",
            "dénivellera" to "dénivèlera",
            "dénivellerons" to "dénivèlerons",
            "dénivellerez" to "dénivèlerez",
            "dénivelleront" to "dénivèleront",

            // Conditionnel Présent
            "dénivellerais" to "dénivèlerais",
            "dénivellerait" to "dénivèlerait",
            "dénivellerions" to "dénivèlerions",
            "dénivelleriez" to "dénivèleriez",
            "dénivelleraient" to "dénivèleraient"
        )

        // Denteler (Découper en forme de dents)
        val dentelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dentelle" to "dentèle",
            "dentelles" to "dentèles",
            "dentellent" to "dentèlent",

            // Futur Simple
            "dentellerai" to "dentèlerai",
            "dentelleras" to "dentèleras",
            "dentellera" to "dentèlera",
            "dentellerons" to "dentèlerons",
            "dentellerez" to "dentèlerez",
            "dentelleront" to "dentèleront",

            // Conditionnel Présent
            "dentellerais" to "dentèlerais",
            "dentellerait" to "dentèlerait",
            "dentellerions" to "dentèlerions",
            "dentelleriez" to "dentèleriez",
            "dentelleraient" to "dentèleraient"
        )

        // Dépaisseler (Ôter les paisselles ou les échalas d'une vigne)
        val depaisselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dépaisselle" to "dépaissèle",
            "dépaisselles" to "dépaissèles",
            "dépaissellent" to "dépaissèlent",

            // Futur Simple
            "dépaissellerai" to "dépaissèlerai",
            "dépaisselleras" to "dépaissèleras",
            "dépaissellera" to "dépaissèlera",
            "dépaissellerons" to "dépaissèlerons",
            "dépaissellerez" to "dépaissèlerez",
            "dépaisselleront" to "dépaissèleront",

            // Conditionnel Présent
            "dépaissellerais" to "dépaissèlerais",
            "dépaissellerait" to "dépaissèlerait",
            "dépaissellerions" to "dépaissèlerions",
            "dépaisselleriez" to "dépaissèleriez",
            "dépaisselleraient" to "dépaissèleraient"
        )

        // Dépuceler (Priver de sa virginité)
        val depucelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dépucelle" to "dépucèle",
            "dépucelles" to "dépucèles",
            "dépucellent" to "dépucèlent",

            // Futur Simple
            "dépucellerai" to "dépucèlerai",
            "dépucelleras" to "dépucèleras",
            "dépucellera" to "dépucèlera",
            "dépucellerons" to "dépucèlerons",
            "dépucellerez" to "dépucèlerez",
            "dépucelleront" to "dépucèleront",

            // Conditionnel Présent
            "dépucellerais" to "dépucèlerais",
            "dépucellerait" to "dépucèlerait",
            "dépucellerions" to "dépucèlerions",
            "dépucelleriez" to "dépucèleriez",
            "dépucelleraient" to "dépucèleraient"
        )

        // Dessemeler (Enlever la semelle)
        val dessemelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dessemelle" to "dessemèle",
            "dessemelles" to "dessemèles",
            "dessemellent" to "dessemèlent",

            // Futur Simple
            "dessemellerai" to "dessemèlerai",
            "dessemelleras" to "dessemèleras",
            "dessemellera" to "dessemèlera",
            "dessemellerons" to "dessemèlerons",
            "dessemellerez" to "dessemèlerez",
            "dessemelleront" to "dessemèleront",

            // Conditionnel Présent
            "dessemellerais" to "dessemèlerais",
            "dessemellerait" to "dessemèlerait",
            "dessemellerions" to "dessemèlerions",
            "dessemelleriez" to "dessemèleriez",
            "dessemelleraient" to "dessemèleraient"
        )

        // Désensorceler (Rompre un sortilège, libérer d'un enchantement)
        val desensorcelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "désensorcelle" to "désensorcèle",
            "désensorcelles" to "désensorcèles",
            "désensorcellent" to "désensorcèlent",

            // Futur Simple
            "désensorcellerai" to "désensorcèlerai",
            "désensorcelleras" to "désensorcèleras",
            "désensorcellera" to "désensorcèlera",
            "désensorcellerons" to "désensorcèlerons",
            "désensorcellerez" to "désensorcèlerez",
            "désensorcelleront" to "désensorcèleront",

            // Conditionnel Présent
            "désensorcellerais" to "désensorcèlerais",
            "désensorcellerait" to "désensorcèlerait",
            "désensorcellerions" to "désensorcèlerions",
            "désensorcelleriez" to "désensorcèleriez",
            "désensorcelleraient" to "désensorcèleraient"
        )
        // Dételer (Enlever l'attelage d'un animal ou d'un véhicule)
        val detelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "dételle" to "détèle",
            "dételles" to "détèles",
            "détellent" to "détèlent",

            // Futur Simple
            "détellerai" to "détèlerai",
            "dételleras" to "détèleras",
            "détellera" to "détèlera",
            "détellerons" to "détèlerons",
            "détellerez" to "détèlerez",
            "dételleront" to "détèleront",

            // Conditionnel Présent
            "détellerais" to "détèlerais",
            "détellerait" to "détèlerait",
            "détellerions" to "détèlerions",
            "dételleriez" to "détèleriez",
            "dételleraient" to "détèleraient"
        )

        // Détonneler (Sortir d'un tonneau)
        val detonnelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "détonnelle" to "détonnèle",
            "détonnelles" to "détonnèles",
            "détonnellent" to "détonnèlent",

            // Futur Simple
            "détonnellerai" to "détonnèlerai",
            "détonnelleras" to "détonnèleras",
            "détonnellera" to "détonnèlera",
            "détonnellerons" to "détonnèlerons",
            "détonnellerez" to "détonnèlerez",
            "détonnelleront" to "détonnèleront",

            // Conditionnel Présent
            "détonnellerais" to "détonnèlerais",
            "détonnellerait" to "détonnèlerait",
            "détonnellerions" to "détonnèlerions",
            "détonnelleriez" to "détonnèleriez",
            "détonnelleraient" to "détonnèleraient"
        )

        // Drapeler (Envelopper ou plisser)
        val drapelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "drapelle" to "drapèle",
            "drapelles" to "drapèles",
            "drapellent" to "drapèlent",

            // Futur Simple
            "drapellerai" to "drapèlerai",
            "drapelleras" to "drapèleras",
            "drapellera" to "drapèlera",
            "drapellerons" to "drapèlerons",
            "drapellerez" to "drapèlerez",
            "drapelleront" to "drapèleront",

            // Conditionnel Présent
            "drapellerais" to "drapèlerais",
            "drapellerait" to "drapèlerait",
            "drapellerions" to "drapèlerions",
            "drapelleriez" to "drapèleriez",
            "drapelleraient" to "drapèleraient"
        )


        // Ébiseler (Tailler en biseau)
        val ebiselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "ébiselle" to "ébisèle",
            "ébiselles" to "ébisèles",
            "ébisellent" to "ébisèlent",

            // Futur Simple
            "ébisellerai" to "ébisèlerai",
            "ébiselleras" to "ébisèleras",
            "ébisellera" to "ébisèlera",
            "ébisellerons" to "ébisèlerons",
            "ébisellerez" to "ébisèlerez",
            "ébiselleront" to "ébisèleront",

            // Conditionnel Présent
            "ébisellerais" to "ébisèlerais",
            "ébisellerait" to "ébisèlerait",
            "ébisellerions" to "ébisèlerions",
            "ébiselleriez" to "ébisèleriez",
            "ébiselleraient" to "ébisèleraient"
        )

        // Écheveler (Mettre les cheveux en désordre, ébouriffer)
        val echevelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "échevelle" to "échevèle",
            "échevelles" to "échevèles",
            "échevellent" to "échevèlent",

            // Futur Simple
            "échevellerai" to "échevèlerai",
            "échevelleras" to "échevèleras",
            "échevellera" to "échevèlera",
            "échevellerons" to "échevèlerons",
            "échevellerez" to "échevèlerez",
            "échevelleront" to "échevèleront",

            // Conditionnel Présent
            "échevellerais" to "échevèlerais",
            "échevellerait" to "échevèlerait",
            "échevellerions" to "échevèlerions",
            "échevelleriez" to "échevèleriez",
            "échevelleraient" to "échevèleraient"
        )

        // Embotteler (Mettre en bottes, comme du foin ou de la paille)
        val embottelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "embottelle" to "embottèle",
            "embottelles" to "embottèles",
            "embottellent" to "embottèlent",

            // Futur Simple
            "embottellerai" to "embottèlerai",
            "embottelleras" to "embottèleras",
            "embottellera" to "embottèlera",
            "embottellerons" to "embottèlerons",
            "embottellerez" to "embottèlerez",
            "embottelleront" to "embottèleront",

            // Conditionnel Présent
            "embottellerais" to "embottèlerais",
            "embottellerait" to "embottèlerait",
            "embottellerions" to "embottèlerions",
            "embottelleriez" to "embottèleriez",
            "embottelleraient" to "embottèleraient"
        )
        // Embreler (Saisir un cordage avec une brelle, terme de marine)
        val embrelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "embrelle" to "embrèle",
            "embrelles" to "embrèles",
            "embrellent" to "embrèlent",

            // Futur Simple
            "embrellerai" to "embrèlerai",
            "embrelleras" to "embrèleras",
            "embrellera" to "embrèlera",
            "embrellerons" to "embrèlerons",
            "embrellerez" to "embrèlerez",
            "embrelleront" to "embrèleront",

            // Conditionnel Présent
            "embrellerais" to "embrèlerais",
            "embrellerait" to "embrèlerait",
            "embrellerions" to "embrèlerions",
            "embrelleriez" to "embrèleriez",
            "embrelleraient" to "embrèleraient"
        )


        // Emmuseler (Mettre une muselière)
        val emmuselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "emmuselle" to "emmusèle",
            "emmuselles" to "emmusèles",
            "emmusellent" to "emmusèlent",
            // Futur Simple
            "emmusellerai" to "emmusèlerai",
            "emmuselleras" to "emmusèleras",
            "emmusellera" to "emmusèlera",
            "emmusellerons" to "emmusèlerons",
            "emmusellerez" to "emmusèlerez",
            "emmuselleront" to "emmusèleront",
            // Conditionnel Présent
            "emmusellerais" to "emmusèlerais",
            "emmusellerait" to "emmusèlerait",
            "emmusellerions" to "emmusèlerions",
            "emmuselleriez" to "emmusèleriez",
            "emmuselleraient" to "emmusèleraient"
        )

        // Empenneler (Ancrer une ancre avec une petite ancre, terme de marine)
        val empennelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "empennelle" to "empennèle",
            "empennelles" to "empennèles",
            "empennellent" to "empennèlent",

            // Futur Simple
            "empennellerai" to "empennèlerai",
            "empennelleras" to "empennèleras",
            "empennellera" to "empennèlera",
            "empennellerons" to "empennèlerons",
            "empennellerez" to "empennèlerez",
            "empennelleront" to "empennèleront",

            // Conditionnel Présent
            "empennellerais" to "empennèlerais",
            "empennellerait" to "empennèlerait",
            "empennellerions" to "empennèlerions",
            "empennelleriez" to "empennèleriez",
            "empennelleraient" to "empennèleraient"
        )

        // Enchâteler (Mettre des bois en chantiers ou les empiler, terme de scierie)
        val enchatelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "enchâtelle" to "enchâtèle",
            "enchâtelles" to "enchâtèles",
            "enchâtellent" to "enchâtèlent",

            // Futur Simple
            "enchâtellerai" to "enchâtèlerai",
            "enchâtelleras" to "enchâtèleras",
            "enchâtellera" to "enchâtèlera",
            "enchâtellerons" to "enchâtèlerons",
            "enchâtellerez" to "enchâtèlerez",
            "enchâtelleront" to "enchâtèleront",

            // Conditionnel Présent
            "enchâtellerais" to "enchâtèlerais",
            "enchâtellerait" to "enchâtèlerait",
            "enchâtellerions" to "enchâtèlerions",
            "enchâtelleriez" to "enchâtèleriez",
            "enchâtelleraient" to "enchâtèleraient"
        )

        // Enchanteler (Placer des tonneaux sur des chantiers)
        val enchantelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "enchantelle" to "enchantèle",
            "enchantelles" to "enchantèles",
            "enchantellent" to "enchantèlent",
            // Futur Simple
            "enchantellerai" to "enchantèlerai",
            "enchantelleras" to "enchantèleras",
            "enchantellera" to "enchantèlera",
            "enchantellerons" to "enchantèlerons",
            "enchantellerez" to "enchantèlerez",
            "enchantelleront" to "enchantèleront",
            // Conditionnel Présent
            "enchantellerais" to "enchantèlerais",
            "enchantellerait" to "enchantèlerait",
            "enchantellerions" to "enchantèlerions",
            "enchantelleriez" to "enchantèleriez",
            "enchantelleraient" to "enchantèleraient"
        )


        // Engrumeler (Se réduire en grumeaux, s'agglomérer)
        val engrumelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "engrumelle" to "engrumèle",
            "engrumelles" to "engrumèles",
            "engrumellent" to "engrumèlent",

            // Futur Simple
            "engrumellerai" to "engrumèlerai",
            "engrumelleras" to "engrumèleras",
            "engrumellera" to "engrumèlera",
            "engrumellerons" to "engrumèlerons",
            "engrumellerez" to "engrumèlerez",
            "engrumelleront" to "engrumèleront",

            // Conditionnel Présent
            "engrumellerais" to "engrumèlerais",
            "engrumellerait" to "engrumèlerait",
            "engrumellerions" to "engrumèlerions",
            "engrumelleriez" to "engrumèleriez",
            "engrumelleraient" to "engrumèleraient"
        )

        // Enjaveler (Mettre les céréales coupées en javelles)
        val enjavelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "enjavelle" to "enjavèle",
            "enjavelles" to "enjavèles",
            "enjavellent" to "enjavèlent",

            // Futur Simple
            "enjavellerai" to "enjavèlerai",
            "enjavelleras" to "enjavèleras",
            "enjavellera" to "enjavèlera",
            "enjavellerons" to "enjavèlerons",
            "enjavellerez" to "enjavèlerez",
            "enjavelleront" to "enjavèleront",

            // Conditionnel Présent
            "enjavellerais" to "enjavèlerais",
            "enjavellerait" to "enjavèlerait",
            "enjavellerions" to "enjavèlerions",
            "enjavelleriez" to "enjavèleriez",
            "enjavelleraient" to "enjavèleraient"
        )

        // Ensorceler (Séduire par un charme puissant ou jeter un sort)
        val ensorcelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "ensorcelle" to "ensorcèle",
            "ensorcelles" to "ensorcèles",
            "ensorcellent" to "ensorcèlent",

            // Futur Simple
            "ensorcellerai" to "ensorcèlerai",
            "ensorcelleras" to "ensorcèleras",
            "ensorcellera" to "ensorcèlera",
            "ensorcellerons" to "ensorcèlerons",
            "ensorcellerez" to "ensorcèlerez",
            "ensorcelleront" to "ensorcèleront",

            // Conditionnel Présent
            "ensorcellerais" to "ensorcèlerais",
            "ensorcellerait" to "ensorcèlerait",
            "ensorcellerions" to "ensorcèlerions",
            "ensorcelleriez" to "ensorcèleriez",
            "ensorcelleraient" to "ensorcèleraient"
        )

        // Epanneler (Dégrossir une pierre, une pièce de bois)
        val epannelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "épannelle" to "épannèle",
            "épannelles" to "épannèles",
            "épannellent" to "épannèlent",

            // Futur Simple
            "épannellerai" to "épannèlerai",
            "épannelleras" to "épannèleras",
            "épannellera" to "épannèlera",
            "épannellerons" to "épannèlerons",
            "épannellerez" to "épannèlerez",
            "épannelleront" to "épannèleront",

            // Conditionnel Présent
            "épannellerais" to "épannèlerais",
            "épannellerait" to "épannèlerait",
            "épannellerions" to "épannèlerions",
            "épannelleriez" to "épannèleriez",
            "épannelleraient" to "épannèleraient"
        )

        // Épeler (Nommer les lettres d'un mot l'une après l'autre)
        val epelerModifAccent : Map<String, String> = mapOf(
            // Présent de l'indicatif
            "épelle" to "épèle",
            "épelles" to "épèles",
            "épellent" to "épèlent",

            // Subjonctif présent
            "épelle" to "épèle",
            "épelles" to "épèles",
            "épellent" to "épèlent",

            // Futur Simple
            "épellerai" to "épèlerai",
            "épelleras" to "épèleras",
            "épellera" to "épèlera",
            "épellerons" to "épèlerons",
            "épellerez" to "épèlerez",
            "épelleront" to "épèleront",

            // Conditionnel Présent
            "épellerais" to "épèlerais",
            "épellerait" to "épèlerait",
            "épellerions" to "épèlerions",
            "épelleriez" to "épèleriez",
            "épelleraient" to "épèleraient"
        )
        // Épinceler (Nettoyer un tissu en enlevant les nœuds ou les corps étrangers)
        val epincelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "épincelle" to "épincèle",
            "épincelles" to "épincèles",
            "épincellent" to "épincèlent",

            // Futur Simple
            "épincellerai" to "épincèlerai",
            "épincelleras" to "épincèleras",
            "épincellera" to "épincèlera",
            "épincellerons" to "épincèlerons",
            "épincellerez" to "épincèlerez",
            "épincelleront" to "épincèleront",

            // Conditionnel Présent
            "épincellerais" to "épincèlerais",
            "épincellerait" to "épincèlerait",
            "épincellerions" to "épincèlerions",
            "épincelleriez" to "épincèleriez",
            "épincelleraient" to "épincèleraient"
        )

        // Étinceler (Briller d'un vif éclat, jeter des étincelles)
        val etincelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "étincelle" to "étincèle",
            "étincelles" to "étincèles",
            "étincellent" to "étincèlent",

            // Futur Simple
            "étincellerai" to "étincèlerai",
            "étincelleras" to "étincèleras",
            "étincellera" to "étincèlera",
            "étincellerons" to "étincèlerons",
            "étincellerez" to "étincèlerez",
            "étincelleront" to "étincèleront",

            // Conditionnel Présent
            "étincellerais" to "étincèlerais",
            "étincellerait" to "étincèlerait",
            "étincellerions" to "étincèlerions",
            "étincelleriez" to "étincèleriez",
            "étincelleraient" to "étincèleraient"
        )

        // Fardeler (Emballer, mettre en fardeau)
        val fardelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "fardelle" to "fardèle",
            "fardelles" to "fardèles",
            "fardellent" to "fardèlent",

            // Futur Simple
            "fardellerai" to "fardèlerai",
            "fardelleras" to "fardèleras",
            "fardellera" to "fardèlera",
            "fardellerons" to "fardèlerons",
            "fardellerez" to "fardèlerez",
            "fardelleront" to "fardèleront",

            // Conditionnel Présent
            "fardellerais" to "fardèlerais",
            "fardellerait" to "fardèlerait",
            "fardellerions" to "fardèlerions",
            "fardelleriez" to "fardèleriez",
            "fardelleraient" to "fardèleraient"
        )

        // Ficeler (Attacher avec de la ficelle)
        val ficelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "ficelle" to "ficèle",
            "ficelles" to "ficèles",
            "ficellent" to "ficèlent",

            // Futur Simple
            "ficellerai" to "ficèlerai",
            "ficelleras" to "ficèleras",
            "ficellera" to "ficèlera",
            "ficellerons" to "ficèlerons",
            "ficellerez" to "ficèlerez",
            "ficelleront" to "ficèleront",

            // Conditionnel Présent
            "ficellerais" to "ficèlerais",
            "ficellerait" to "ficèlerait",
            "ficellerions" to "ficèlerions",
            "ficelleriez" to "ficèleriez",
            "ficelleraient" to "ficèleraient"
        )


        // Friseler (Friser légèrement)
        val friselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "friselle" to "frisèle",
            "friselles" to "frisèles",
            "frisellent" to "frisèlent",
            // Futur Simple
            "frisellerai" to "frisèlerai",
            "friselleras" to "frisèleras",
            "frisellera" to "frisèlera",
            "frisellerons" to "frisèlerons",
            "frisellerez" to "frisèlerez",
            "friselleront" to "frisèleront",
            // Conditionnel Présent
            "frisellerais" to "frisèlerais",
            "frisellerait" to "frisèlerait",
            "frisellerions" to "frisèlerions",
            "friselleriez" to "frisèleriez",
            "friselleraient" to "frisèleraient"
        )


        // Fuseler (Donner une forme allongée et amincie, comme un fuseau)
        val fuselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "fuselle" to "fusèle",
            "fuselles" to "fusèles",
            "fusellent" to "fusèlent",

            // Futur Simple
            "fusellerai" to "fusèlerai",
            "fuselleras" to "fusèleras",
            "fusellera" to "fusèlera",
            "fusellerons" to "fusèlerons",
            "fusellerez" to "fusèlerez",
            "fuselleront" to "fusèleront",

            // Conditionnel Présent
            "fusellerais" to "fusèlerais",
            "fusellerait" to "fusèlerait",
            "fusellerions" to "fusèlerions",
            "fuselleriez" to "fusèleriez",
            "fuselleraient" to "fusèleraient"
        )

        // Ganteler (Garnir de gants / Héraldique)
        val gantelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "gantelle" to "gantèle",
            "gantelles" to "gantèles",
            "gantellent" to "gantèlent",
            // Futur Simple
            "gantellerai" to "gantèlerai",
            "gantelleras" to "gantèleras",
            "gantellera" to "gantèlera",
            "gantellerons" to "gantèlerons",
            "gantellerez" to "gantèlerez",
            "gantelleront" to "gantèleront",
            // Conditionnel Présent
            "gantellerais" to "gantèlerais",
            "gantellerait" to "gantèlerait",
            "gantellerions" to "gantèlerions",
            "gantelleriez" to "gantèleriez",
            "gantelleraient" to "gantèleraient"
        )

        // Goutteler (Tomber par petites gouttes)
        val gouttelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "gouttelle" to "gouttèle",
            "gouttelles" to "gouttèles",
            "gouttellent" to "gouttèlent",
            // Futur Simple
            "gouttellerai" to "gouttèlerai",
            "gouttelleras" to "gouttèleras",
            "gouttellera" to "gouttèlera",
            "gouttellerons" to "gouttèlerons",
            "gouttellerez" to "gouttèlerez",
            "gouttelleront" to "gouttèleront",
            // Conditionnel Présent
            "gouttellerais" to "gouttèlerais",
            "gouttellerait" to "gouttèlerait",
            "gouttellerions" to "gouttèlerions",
            "gouttelleriez" to "gouttèleriez",
            "gouttelleraient" to "gouttèleraient"
        )

        // Grabeler (Trier minutieusement)
        val grabelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "grabelle" to "grabèle",
            "grabelles" to "grabèles",
            "grabellent" to "grabèlent",
            // Futur Simple
            "grabellerai" to "grabèlerai",
            "grabelleras" to "grabèleras",
            "grabellera" to "grabèlera",
            "grabellerons" to "grabèlerons",
            "grabellerez" to "grabèlerez",
            "grabelleront" to "grabèleront",
            // Conditionnel Présent
            "grabellerais" to "grabèlerais",
            "grabellerait" to "grabèlerait",
            "grabellerions" to "grabèlerions",
            "grabelleriez" to "grabèleriez",
            "grabelleraient" to "grabèleraient"
        )

        // Gratteler (Gratter légèrement la terre)
        val grattelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "grattelle" to "grattèle",
            "grattelles" to "grattèles",
            "grattellent" to "grattèlent",
            // Futur Simple
            "grattellerai" to "grattèlerai",
            "grattelleras" to "grattèleras",
            "grattellera" to "grattèlera",
            "grattellerons" to "grattèlerons",
            "grattellerez" to "grattèlerez",
            "grattelleront" to "grattèleront",
            // Conditionnel Présent
            "grattellerais" to "grattèlerais",
            "grattellerait" to "grattèlerait",
            "grattellerions" to "grattèlerions",
            "grattelleriez" to "grattèleriez",
            "grattelleraient" to "grattèleraient"
        )

        // Graveler (Couvrir de gravier)
        val gravelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "gravelle" to "gravèle",
            "gravelles" to "gravèles",
            "gravellent" to "gravèlent",
            // Futur Simple
            "gravellerai" to "gravèlerai",
            "gravelleras" to "gravèleras",
            "gravellera" to "gravèlera",
            "gravellerons" to "gravèlerons",
            "gravellerez" to "gravèlerez",
            "gravelleront" to "gravèleront",
            // Conditionnel Présent
            "gravellerais" to "gravèlerais",
            "gravellerait" to "gravèlerait",
            "gravellerions" to "gravèlerions",
            "gravelleriez" to "gravèleriez",
            "gravelleraient" to "gravèleraient"
        )

        // Interpeler (Adresser la parole de façon brusque)
        val interpelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "interpelle" to "interpèle",
            "interpelles" to "interpèles",
            "interpellent" to "interpèlent",
            // Futur Simple
            "interpellerai" to "interpèlerai",
            "interpelleras" to "interpèleras",
            "interpellera" to "interpèlera",
            "interpellerons" to "interpèlerons",
            "interpellerez" to "interpèlerez",
            "interpelleront" to "interpèleront",
            // Conditionnel Présent
            "interpellerais" to "interpèlerais",
            "interpellerait" to "interpèlerait",
            "interpellerions" to "interpèlerions",
            "interpelleriez" to "interpèleriez",
            "interpelleraient" to "interpèleraient"
        )

        // Poteler (Rendre potelé)
        val potelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "potelle" to "potèle",
            "potelles" to "potèles",
            "potellent" to "potèlent",
            // Futur Simple
            "potellerai" to "potèlerai",
            "potelleras" to "potèleras",
            "potellera" to "potèlera",
            "potellerons" to "potèlerons",
            "potellerez" to "potèlerez",
            "potelleront" to "potèleront",
            // Conditionnel Présent
            "potellerais" to "potèlerais",
            "potellerait" to "potèlerait",
            "potellerions" to "potèlerions",
            "potelleriez" to "potèleriez",
            "potelleraient" to "potèleraient"
        )

        // Reficeler (Ficeler de nouveau)
        val reficelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "reficelle" to "reficèle",
            "reficelles" to "reficèles",
            "reficellent" to "reficèlent",
            // Futur Simple
            "reficellerai" to "reficèlerai",
            "reficelleras" to "reficèleras",
            "reficellera" to "reficèlera",
            "reficellerons" to "reficèlerons",
            "reficellerez" to "reficèlerez",
            "reficelleront" to "reficèleront",
            // Conditionnel Présent
            "reficellerais" to "reficèlerais",
            "reficellerait" to "reficèlerait",
            "reficellerions" to "reficèlerions",
            "reficelleriez" to "reficèleriez",
            "reficelleraient" to "reficèleraient"
        )

        // Reniveler (Niveler de nouveau)
        val renivelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "renivelle" to "renivèle",
            "renivelles" to "renivèles",
            "renivellent" to "renivèlent",
            // Futur Simple
            "renivellerai" to "renivèlerai",
            "renivelleras" to "renivèleras",
            "renivellera" to "renivèlera",
            "renivellerons" to "renivèlerons",
            "renivellerez" to "renivèlerez",
            "renivelleront" to "renivèleront",
            // Conditionnel Présent
            "renivellerais" to "renivèlerais",
            "renivellerait" to "renivèlerait",
            "renivellerions" to "renivèlerions",
            "renivelleriez" to "renivèleriez",
            "renivelleraient" to "renivèleraient"
        )

        // Greneler (Donner un grain à la surface d'un cuir)
        val grenelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "grenelle" to "grenèle",
            "grenelles" to "grenèles",
            "grenellent" to "grenèlent",

            // Futur Simple
            "grenellerai" to "grenèlerai",
            "grenelleras" to "grenèleras",
            "grenellera" to "grenèlera",
            "grenellerons" to "grenèlerons",
            "grenellerez" to "grenèlerez",
            "grenelleront" to "grenèleront",

            // Conditionnel Présent
            "grenellerais" to "grenèlerais",
            "grenellerait" to "grenèlerait",
            "grenellerions" to "grenèlerions",
            "grenelleriez" to "grenèleriez",
            "grenelleraient" to "grenèleraient"
        )

        // Griveler (Faire de petits profits illicites)
        val grivelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "grivelle" to "grivèle",
            "grivelles" to "grivèles",
            "grivellent" to "grivèlent",

            // Futur Simple
            "grivellerai" to "grivèlerai",
            "grivelleras" to "grivèleras",
            "grivellera" to "grivèlera",
            "grivellerons" to "grivèlerons",
            "grivellerez" to "grivèlerez",
            "grivelleront" to "grivèleront",

            // Conditionnel Présent
            "grivellerais" to "grivèlerais",
            "grivellerait" to "grivèlerait",
            "grivellerions" to "grivèlerions",
            "grivelleriez" to "grivèleriez",
            "grivelleraient" to "grivèleraient"
        )

        // Grommeler (Exprimer son mécontentement entre ses dents)
        val grommelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "grommelle" to "grommèle",
            "grommelles" to "grommèles",
            "grommellent" to "grommèlent",

            // Futur Simple
            "grommellerai" to "grommèlerai",
            "grommelleras" to "grommèleras",
            "grommellera" to "grommèlera",
            "grommellerons" to "grommèlerons",
            "grommellerez" to "grommèlerez",
            "grommelleront" to "grommèleront",

            // Conditionnel Présent
            "grommellerais" to "grommèlerais",
            "grommellerait" to "grommèlerait",
            "grommellerions" to "grommèlerions",
            "grommelleriez" to "grommèleriez",
            "grommelleraient" to "grommèleraient"
        )

        // Grumeler (Se réduire en grumeaux)
        val grumelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "grumelle" to "grumèle",
            "grumelles" to "grumèles",
            "grumellent" to "grumèlent",

            // Futur Simple
            "grummellerai" to "grumèlerai",
            "grummelleras" to "grumèleras",
            "grummellera" to "grumèlera",
            "grummellerons" to "grumèlerons",
            "grummellerez" to "grumèlerez",
            "grummelleront" to "grumèleront",

            // Conditionnel Présent
            "grummellerais" to "grumèlerais",
            "grummellerait" to "grumèlerait",
            "grummellerions" to "grumèlerions",
            "grummelleriez" to "grumèleriez",
            "grummelleraient" to "grumèleraient"
        )

        // Harceler (Tourmenter par des attaques répétées)
        val harcelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "harcelle" to "harcèle",
            "harcelles" to "harcèles",
            "harcellent" to "harcèlent",

            // Futur Simple
            "harcellerai" to "harcèlerai",
            "harcelleras" to "harcèleras",
            "harcellera" to "harcèlera",
            "harcellerons" to "harcèlerons",
            "harcellerez" to "harcèlerez",
            "harcelleront" to "harcèleront",

            // Conditionnel Présent
            "harcellerais" to "harcèlerais",
            "harcellerait" to "harcèlerait",
            "harcellerions" to "harcèlerions",
            "harcelleriez" to "harcèleriez",
            "harcelleraient" to "harcèleraient"
        )

        // Réatteler (Atteler de nouveau)
        val reattelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "réattelle" to "réattèle",
            "réattelles" to "réattèles",
            "réattellent" to "réattèlent",
            // Futur Simple
            "réattellerai" to "réattèlerai",
            "réattelleras" to "réattèleras",
            "réattellera" to "réattèlera",
            "réattellerons" to "réattèlerons",
            "réattellerez" to "réattèlerez",
            "réattelleront" to "réattèleront",
            // Conditionnel Présent
            "réattellerais" to "réattèlerais",
            "réattellerait" to "réattèlerait",
            "réattellerions" to "réattèlerions",
            "réattelleriez" to "réattèleriez",
            "réattelleraient" to "réattèleraient"
        )

        // Sauteler (Sauter légèrement)
        val sautelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "sautelle" to "sautèle",
            "sautelles" to "sautèles",
            "sautellent" to "sautèlent",
            // Futur Simple
            "sautellerai" to "sautèlerai",
            "sautelleras" to "sautèleras",
            "sautellera" to "sautèlera",
            "sautellerons" to "sautèlerons",
            "sautellerez" to "sautèlerez",
            "sautelleront" to "sautèleront",
            // Conditionnel Présent
            "sautellerais" to "sautèlerais",
            "sautellerait" to "sautèlerait",
            "sautellerions" to "sautèlerions",
            "sautelleriez" to "sautèleriez",
            "sautelleraient" to "sautèleraient"
        )

        // Tireler (Chanter comme l'alouette)
        val tirelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "tirelle" to "tirèle",
            "tirelles" to "tirèles",
            "tirellent" to "tirèlent",
            // Futur Simple
            "tirellerai" to "tirèlerai",
            "tirelleras" to "tirèleras",
            "tirellera" to "tirèlera",
            "tireellerons" to "tirèlerons",
            "tirellerez" to "tirèlerez",
            "tirelleront" to "tirèleront",
            // Conditionnel Présent
            "tirellerais" to "tirèlerais",
            "tirellerait" to "tirèlerait",
            "tirellerions" to "tirèlerions",
            "tirelleriez" to "tirèleriez",
            "tirelleraient" to "tirèleraient"
        )

        // Tonneler (Faire entrer le gibier dans un tonneau)
        val tonnelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "tonnelle" to "tonnèle",
            "tonnelles" to "tonnèles",
            "tonnellent" to "tonnèlent",
            // Futur Simple
            "tonnellerai" to "tonnèlerai",
            "tonnelleras" to "tonnèleras",
            "tonnellera" to "tonnèlera",
            "tonnellerons" to "tonnèlerons",
            "tonnellerez" to "tonnèlerez",
            "tonnelleront" to "tonnèleront",
            // Conditionnel Présent
            "tonnellerais" to "tonnèlerais",
            "tonnellerait" to "tonnèlerait",
            "tonnellerions" to "tonnèlerions",
            "tonnelleriez" to "tonnèleriez",
            "tonnelleraient" to "tonnèleraient"
        )

        // Videler (Former les bords d'une pâte)
        val videlerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "videlle" to "vidèle",
            "videlles" to "vidèles",
            "videllent" to "vidèlent",
            // Futur Simple
            "videllerai" to "vidèlerai",
            "videlleras" to "vidèleras",
            "videllera" to "vidèlera",
            "videllerons" to "vidèlerons",
            "videllerez" to "vidèlerez",
            "videlleront" to "vidèleront",
            // Conditionnel Présent
            "videllerais" to "vidèlerais",
            "videllerait" to "vidèlerait",
            "videllerions" to "vidèlerions",
            "videlleriez" to "vidèleriez",
            "videlleraient" to "vidèleraient"
        )

        // Écheler (Poser des échelles)
        val echelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "échelle" to "échèle",
            "échelles" to "échèles",
            "échellent" to "échèlent",
            // Futur Simple
            "échellerai" to "échèlerai",
            "échelleras" to "échèleras",
            "échellera" to "échèlera",
            "échellerons" to "échèlerons",
            "échellerez" to "échèlerez",
            "échelleront" to "échèleront",
            // Conditionnel Présent
            "échellerais" to "échèlerais",
            "échellait" to "échèlerait",
            "échellerions" to "échèlerions",
            "échelleriez" to "échèleriez",
            "échelleraient" to "échèleraient"
        )


        val helerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "hélerai" to "hèlerai",
            "héleras" to "hèleras",
            "hélera" to "hèlera",
            "hélerons" to "hèlerons",
            "hélerez" to "hèlerez",
            "héleront" to "hèleront",

            // Conditionnel Présent
            "hélerais" to "hèlerais",
            "hélerait" to "hèlerait",
            "hélerions" to "hèlerions",
            "héleriez" to "hèleriez",
            "héleraient" to "hèleraient"
        )
        // Javeler (Mettre les céréales coupées en javelles pour les faire sécher)
        val javelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "javelle" to "javèle",
            "javelles" to "javèles",
            "javellent" to "javèlent",

            // Futur Simple
            "javellerai" to "javèlerai",
            "javelleras" to "javèleras",
            "javellera" to "javèlera",
            "javellerons" to "javèlerons",
            "javellerez" to "javèlerez",
            "javelleront" to "javèleront",

            // Conditionnel Présent
            "javellerais" to "javèlerais",
            "javellerait" to "javèlerait",
            "javellerions" to "javèlerions",
            "javelleriez" to "javèleriez",
            "javelleraient" to "javèleraient"
        )

        // Jumeler (Réunir deux choses identiques ou complémentaires)
        val jumelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "jumelle" to "jumèle",
            "jumelles" to "jumèles",
            "jumellent" to "jumèlent",

            // Futur Simple
            "jumellerai" to "jumèlerai",
            "jumelleras" to "jumèleras",
            "jumellera" to "jumèlera",
            "jumellerons" to "jumèlerons",
            "jumellerez" to "jumèlerez",
            "jumelleront" to "jumèleront",

            // Conditionnel Présent
            "jumellerais" to "jumèlerais",
            "jumellerait" to "jumèlerait",
            "jumellerions" to "jumèlerions",
            "jumelleriez" to "jumèleriez",
            "jumelleraient" to "jumèleraient"
        )

        // Morceler (Diviser en plusieurs morceaux)
        val morcelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "morcelle" to "morcèle",
            "morcelles" to "morcèles",
            "morcellent" to "morcèlent",

            // Futur Simple
            "morcellerai" to "morcèlerai",
            "morcelleras" to "morcèleras",
            "morcellera" to "morcèlera",
            "morcellerons" to "morcèlerons",
            "morcellerez" to "morcèlerez",
            "morcelleront" to "morcèleront",

            // Conditionnel Présent
            "morcellerais" to "morcèlerais",
            "morcellerait" to "morcèlerait",
            "morcellerions" to "morcèlerions",
            "morcelleriez" to "morcèleriez",
            "morcelleraient" to "morcèleraient"
        )

        // Museler (Mettre une muselière ou empêcher quelqu'un de s'exprimer)
        val muselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "muselle" to "musèle",
            "muselles" to "musèles",
            "musellent" to "musèlent",

            // Futur Simple
            "musellerai" to "musèlerai",
            "muselleras" to "musèleras",
            "musellera" to "musèlera",
            "musellerons" to "musèlerons",
            "musellerez" to "musèlerez",
            "muselleront" to "musèleront",

            // Conditionnel Présent
            "musellerais" to "musèlerais",
            "musellerait" to "musèlerait",
            "musellerions" to "musèlerions",
            "muselleriez" to "musèleriez",
            "muselleraient" to "musèleraient"
        )

        // Nickeler (Recouvrir d'une couche de nickel)
        val nickelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "nickelle" to "nickèle",
            "nickelles" to "nickèles",
            "nickellent" to "nickèlent",

            // Futur Simple
            "nickellerai" to "nickèlerai",
            "nickelleras" to "nickèleras",
            "nickellera" to "nickèlera",
            "nickellerons" to "nickèlerons",
            "nickellerez" to "nickèlerez",
            "nickelleront" to "nickèleront",

            // Conditionnel Présent
            "nickellerais" to "nickèlerais",
            "nickellerait" to "nickèlerait",
            "nickellerions" to "nickèlerions",
            "nickelleriez" to "nickèleriez",
            "nickelleraient" to "nickèleraient"
        )

        // Niveler (Rendre une surface plane ou horizontale)
        val nivelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "nivelle" to "nivèle",
            "nivelles" to "nivèles",
            "nivellent" to "nivèlent",

            // Futur Simple
            "nivellerai" to "nivèlerai",
            "nivelleras" to "nivèleras",
            "nivellera" to "nivèlera",
            "nivellerons" to "nivèlerons",
            "nivellerez" to "nivèlerez",
            "nivelleront" to "nivèleront",

            // Conditionnel Présent
            "nivellerais" to "nivèlerais",
            "nivellerait" to "nivèlerait",
            "nivellerions" to "nivèlerions",
            "nivelleriez" to "nivèleriez",
            "nivelleraient" to "nivèleraient"
        )

        // Oiseler (Chasser avec des oiseaux ou dresser des oiseaux)
        val oiselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "oiselle" to "oisèle",
            "oiselles" to "oisèles",
            "oisellent" to "oisèlent",

            // Futur Simple
            "oisellerai" to "oisèlerai",
            "oiselleras" to "oisèleras",
            "oisellera" to "oisèlera",
            "oisellerons" to "oisèlerons",
            "oisellerez" to "oisèlerez",
            "oiselleront" to "oisèleront",

            // Conditionnel Présent
            "oisellerais" to "oisèlerais",
            "oisellerait" to "oisèlerait",
            "oisellerions" to "oisèlerions",
            "oiselleriez" to "oisèleriez",
            "oiselleraient" to "oisèleraient"
        )

        // Paisseler (Soutenir par des paisselles ou échalas)
        val paisselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "paisselle" to "paissèle",
            "paisselles" to "paissèles",
            "paissellent" to "paissèlent",

            // Futur Simple
            "paissellerai" to "paissèlerai",
            "paisselleras" to "paissèleras",
            "paissellera" to "paissèlera",
            "paissellerons" to "paissèlerons",
            "paissellerez" to "paissèlerez",
            "paisselleront" to "paissèleront",

            // Conditionnel Présent
            "paissellerais" to "paissèlerais",
            "paissellerait" to "paissèlerait",
            "paissellerions" to "paissèlerions",
            "paisselleriez" to "paissèleriez",
            "paisselleraient" to "paissèleraient"
        )

        // Panteler (Respirer avec peine, haleter)
        val pantelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "pantelle" to "pantèle",
            "pantelles" to "pantèles",
            "pantellent" to "pantèlent",

            // Futur Simple
            "pantellerai" to "pantèlerai",
            "pantelleras" to "pantèleras",
            "pantellera" to "pantèlera",
            "pantellerons" to "pantèlerons",
            "pantellerez" to "pantèlerez",
            "pantelleront" to "pantèleront",

            // Conditionnel Présent
            "pantellerais" to "pantèlerais",
            "pantellerait" to "pantèlerait",
            "pantellerions" to "pantèlerions",
            "pantelleriez" to "pantèleriez",
            "pantelleraient" to "pantèleraient"
        )

        // Pommeler (Couvrir de taches rondes comme des petites pommes)
        val pommelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "pommelle" to "pommèle",
            "pommelles" to "pommèles",
            "pommellent" to "pommèlent",

            // Futur Simple
            "pommellerai" to "pommèlerai",
            "pommelleras" to "pommèleras",
            "pommellera" to "pommèlera",
            "pommellerons" to "pommèlerons",
            "pommellerez" to "pommèlerez",
            "pommelleront" to "pommèleront",

            // Conditionnel Présent
            "pommellerais" to "pommèlerais",
            "pommellerait" to "pommèlerait",
            "pommellerions" to "pommèlerions",
            "pommelleriez" to "pommèleriez",
            "pommelleraient" to "pommèleraient"
        )

        // Râteler (Ramasser ou égaliser avec un râteau)
        val ratelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "râtelle" to "râtèle",
            "râtelles" to "râtèles",
            "râtellent" to "râtèlent",

            // Futur Simple
            "râtellerai" to "râtèlerai",
            "râtelleras" to "râtèleras",
            "râtellera" to "râtèlera",
            "râtellerons" to "râtèlerons",
            "râtellerez" to "râtèlerez",
            "râtelleront" to "râtèleront",

            // Conditionnel Présent
            "râtellerais" to "râtèlerais",
            "râtellerait" to "râtèlerait",
            "râtellerions" to "râtèlerions",
            "râtelleriez" to "râtèleriez",
            "râtelleraient" to "râtèleraient"
        )
        // Recarreler (Carreler de nouveau)
        val recarrelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "recarrelle" to "recarrèle",
            "recarrelles" to "recarrèles",
            "recarrellent" to "recarrèlent",

            // Futur Simple
            "recarrellerai" to "recarrèlerai",
            "recarrelleras" to "recarrèleras",
            "recarrellera" to "recarrèlera",
            "recarrellerons" to "recarrèlerons",
            "recarrellerez" to "recarrèlerez",
            "recarrelleront" to "recarrèleront",

            // Conditionnel Présent
            "recarrellerais" to "recarrèlerais",
            "recarrellerait" to "recarrèlerait",
            "recarrellerions" to "recarrèlerions",
            "recarrelleriez" to "recarrèleriez",
            "recarrelleraient" to "recarrèleraient"
        )
        // Recéler (Variante de receler avec accent aigu)
        val recelerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "recélerai" to "recèlerai",
            "recéleras" to "recèleras",
            "recélera" to "recèlera",
            "recélerons" to "recèlerons",
            "recélerez" to "recèlerez",
            "recéleront" to "recèleront",

            // Conditionnel Présent
            "recélerais" to "recèlerais",
            "recélerait" to "recèlerait",
            "recélerions" to "recèlerions",
            "recéleriez" to "recèleriez",
            "recéleraient" to "recèleraient"
        )

        // Renouveler (Remplacer par quelque chose de neuf ou de récent)
        val renouvelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "renouvelle" to "renouvèle",
            "renouvelles" to "renouvèles",
            "renouvellent" to "renouvèlent",

            // Futur Simple
            "renouvelerai" to "renouvèlerai",
            "renouveleras" to "renouvèleras",
            "renouvelera" to "renouvèlera",
            "renouvelerons" to "renouvèlerons",
            "renouvelerez" to "renouvèlerez",
            "renouveleront" to "renouvèleront",

            // Conditionnel Présent
            "renouvelerais" to "renouvèlerais",
            "renouvelerait" to "renouvèlerait",
            "renouvelerions" to "renouvèlerions",
            "renouveleriez" to "renouvèleriez",
            "renouveleraient" to "renouvèleraient"
        )

        // Ressemeler (Mettre des semelles neuves à des chaussures)
        val ressemelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "ressemelle" to "ressemèle",
            "ressemelles" to "ressemèles",
            "ressemellent" to "ressemèlent",

            // Futur Simple
            "ressemellerai" to "ressemèlerai",
            "ressemelleras" to "ressemèleras",
            "ressemellera" to "ressemèlera",
            "ressemellerons" to "ressemèlerons",
            "ressemellerez" to "ressemèlerez",
            "ressemelleront" to "ressemèleront",

            // Conditionnel Présent
            "ressemellerais" to "ressemèlerais",
            "ressemellerait" to "ressemèlerait",
            "ressemellerions" to "ressemèlerions",
            "ressemelleriez" to "ressemèleriez",
            "ressemelleraient" to "ressemèleraient"
        )

        // Reveler (Faire connaître ce qui était caché ou secret.)
        val revelerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "révélerai" to "révèlerai",
            "révéleras" to "révèleras",
            "révélera" to "révèlera",
            "révélerons" to "révèlerons",
            "révélerez" to "révèlerez",
            "révéleront" to "révèleront",
            // Conditionnel Présent
            "révélerais" to "révèlerais",
            "révélerait" to "révèlerait",
            "révélerions" to "révèlerions",
            "révéleriez" to "révèleriez",
            "révéleraient" to "révèleraient"
        )

        // Rousseler (Marquer de taches rousses)
        val rousselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "rousselle" to "roussèle",
            "rousselles" to "roussèles",
            "roussellent" to "roussèlent",

            // Futur Simple
            "roussellerai" to "roussèlerai",
            "rousselleras" to "roussèleras",
            "roussellera" to "roussèlera",
            "roussellerons" to "roussèlerons",
            "roussellerez" to "roussèlerez",
            "rousselleront" to "roussèleront",

            // Conditionnel Présent
            "roussellerais" to "roussèlerais",
            "roussellerait" to "roussèlerait",
            "roussellerions" to "roussèlerions",
            "rousselleriez" to "roussèleriez",
            "rousselleraient" to "roussèleraient"
        )

        // Ruisseler (Couler sans arrêt et en abondance)
        val ruisselerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "ruisselle" to "ruissèle",
            "ruisselles" to "ruissèles",
            "ruissellent" to "ruissèlent",

            // Futur Simple
            "ruissellerai" to "ruissèlerai",
            "ruisselleras" to "ruissèleras",
            "ruissellera" to "ruissèlera",
            "ruissellerons" to "ruissèlerons",
            "ruissellerez" to "ruissèlerez",
            "ruisselleront" to "ruissèleront",

            // Conditionnel Présent
            "ruissellerais" to "ruissèlerais",
            "ruissellerait" to "ruissèlerait",
            "ruissellerions" to "ruissèlerions",
            "ruisselleriez" to "ruissèleriez",
            "ruisselleraient" to "ruissèleraient"
        )
        val sphacelerModifAccent : Map<String, String> = mapOf(
            // Futur Simple
            "sphacélerai" to "sphacèlerai",
            "sphacéleras" to "sphacèleras",
            "sphacélera" to "sphacèdera",
            "sphacélerons" to "sphacèlerons",
            "sphacélerez" to "sphacèlerez",
            "sphacéleront" to "sphacèleront",

            // Conditionnel Présent
            "sphacélerais" to "sphacélerais",
            "sphacélerait" to "sphacèlerait",
            "sphacélerions" to "sphacèlerions",
            "sphacéleriez" to "sphacèleriez",
            "sphacéleraient" to "sphacèleraient"
        )
        // Taveler (Marquer de taches, de tavelures)
        val tavelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "tavelle" to "tavèle",
            "tavelles" to "tavèles",
            "tavellent" to "tavèlent",

            // Futur Simple
            "tavellerai" to "tavèlerai",
            "tavelleras" to "tavèleras",
            "tavellera" to "tavèlera",
            "tavellerons" to "tavèlerons",
            "tavellerez" to "tavèlerez",
            "tavelleront" to "tavèleront",

            // Conditionnel Présent
            "tavellerais" to "tavèlerais",
            "tavellerait" to "tavèlerait",
            "tavellerions" to "tavèlerions",
            "tavelleriez" to "tavèleriez",
            "tavelleraient" to "tavèleraient"
        )

        // Emmanteler (Recouvrir d'un manteau / Fortifier)
        val emmantelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "emmantelle" to "emmantèle",
            "emmantelles" to "emmantèles",
            "emmantellent" to "emmantèlent",
            // Futur Simple
            "emmantellerai" to "emmantèlerai",
            "emmantelleras" to "emmantèleras",
            "emmantellera" to "emmantèlera",
            "emmantellerons" to "emmantèlerons",
            "emmantellerez" to "emmantèlerez",
            "emmantelleront" to "emmantèleront",
            // Conditionnel Présent
            "emmantellerais" to "emmantèlerais",
            "emmantellerait" to "emmantèlerait",
            "emmantellerions" to "emmantèlerions",
            "emmantelleriez" to "emmantèleriez",
            "emmantelleraient" to "emmantèleraient"
        )

        // Décheveler (Mettre les cheveux en désordre)
        val dechevelerModifAccent : Map<String, String> = mapOf(
            // Indicatif et subjonctif présent
            "déchevelle" to "déchevèle",
            "déchevelles" to "déchevèles",
            "déchevellent" to "déchevèlent",
            // Futur Simple
            "déchevellerai" to "déchevèlerai",
            "déchevelleras" to "déchevèleras",
            "déchevellera" to "déchevèlera",
            "déchevellerons" to "déchevèlerons",
            "déchevellerez" to "déchevèlerez",
            "déchevelleront" to "déchevèleront",
            // Conditionnel Présent
            "déchevellerais" to "déchevèlerais",
            "déchevellerait" to "déchevèlerait",
            "déchevellerions" to "déchevèlerions",
            "déchevelleriez" to "déchevèleriez",
            "déchevelleraient" to "déchevèleraient"
        )


        val eler : Map<String, String> =
            aciselerModifAccent +
                    agnelerModifAccent +
                    amoncelerModifAccent +
                    anhelerModifAccent +
                    annelerModifAccent +
                    attelerModifAccent +
                    babelerModifAccent +
                    barbelerModifAccent +
                    batelerModifAccent +
                    bosselerModifAccent +
                    bottelerModifAccent +
                    bouelerModifAccent +
                    bourrelerModifAccent +
                    brelerModifAccent +
                    brettelerModifAccent +
                    broubelerModifAccent +
                    burelerModifAccent +
                    cannelerModifAccent +
                    capelerModifAccent +
                    carnelerModifAccent +
                    carrelerModifAccent +
                    chancelerModifAccent +
                    chapelerModifAccent +
                    cordelerModifAccent +
                    correlerModifAccent +
                    cotelerModifAccent +
                    coutelerModifAccent +
                    craquelerModifAccent +
                    crenelerModifAccent +
                    crepelerModifAccent +
                    crepelerCirconflexeModifAccent +
                    cretelerModifAccent +
                    crespelerModifAccent +
                    cuvelerModifAccent +
                    craquelerModifAccent +
                    crenelerModifAccent +
                    cuvelerModifAccent +
                    debosselerModifAccent +
                    debottelerModifAccent +
                    decrepelerModifAccent +
                    decapelerModifAccent +
                    decarrelerModifAccent +
                    decervelerModifAccent +
                    dechevelerModifAccent +
                    decorrelerModifAccent +
                    decuvelerModifAccent +
                    deficelerModifAccent +
                    degravelerModifAccent +
                    degouttelerModifAccent +
                    demuselerModifAccent +
                    denickelerModifAccent +
                    denivelerModifAccent +
                    dentelerModifAccent +
                    depaisselerModifAccent +
                    depucelerModifAccent +
                    dessemelerModifAccent +
                    desensorcelerModifAccent +
                    detelerModifAccent +
                    detonnelerModifAccent +
                    drapelerModifAccent +
                    ebiselerModifAccent +
                    echelerModifAccent +
                    echevelerModifAccent +
                    embottelerModifAccent +
                    embrelerModifAccent +
                    emmantelerModifAccent +
                    emmuselerModifAccent +
                    empennelerModifAccent +
                    enchantelerModifAccent +
                    enchatelerModifAccent +
                    engrumelerModifAccent +
                    enjavelerModifAccent +
                    ensorcelerModifAccent +
                    epannelerModifAccent +
                    epelerModifAccent +
                    epincelerModifAccent +
                    etincelerModifAccent +
                    fardelerModifAccent +
                    ficelerModifAccent +
                    friselerModifAccent +
                    fuselerModifAccent +
                    gantelerModifAccent +
                    gouttelerModifAccent +
                    grabelerModifAccent +
                    grattelerModifAccent +
                    gravelerModifAccent +
                    grenelerModifAccent +
                    grivelerModifAccent +
                    grommelerModifAccent +
                    grumelerModifAccent +
                    harcelerModifAccent +
                    helerModifAccent +
                    interpelerModifAccent +
                    javelerModifAccent +
                    jumelerModifAccent +
                    morcelerModifAccent +
                    muselerModifAccent +
                    nickelerModifAccent +
                    nivelerModifAccent +
                    oiselerModifAccent +
                    paisselerModifAccent +
                    pantelerModifAccent +
                    pommelerModifAccent +
                    potelerModifAccent +
                    ratelerModifAccent +
                    reattelerModifAccent +
                    recarrelerModifAccent +
                    recelerModifAccent +
                    reficelerModifAccent +
                    renivelerModifAccent +
                    renouvelerModifAccent +
                    ressemelerModifAccent +
                    revelerModifAccent +
                    rousselerModifAccent +
                    ruisselerModifAccent +
                    sautelerModifAccent +
                    sphacelerModifAccent +
                    tavelerModifAccent +
                    tirelerModifAccent +
                    tonnelerModifAccent +
                    videlerModifAccent

    }
}