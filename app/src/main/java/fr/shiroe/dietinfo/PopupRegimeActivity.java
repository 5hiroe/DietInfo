package fr.shiroe.dietinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import fr.shiroe.dietinfo.adapters.RegimePopupAdapter;

public class PopupRegimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_regime_layout);

        String regimeName = getIntent().getStringExtra("REGIME_NAME");

        ArrayList<String> titres = new ArrayList<>();
        ArrayList<String> contenus = new ArrayList<>();


        switch (regimeName) {
            case "B.Y.C (Bouillon/Yaourt/Compote)":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Compléments");
                contenus.add("Interdits");
                contenus.add("Collation");
                contenus.add("Informations Diverses");

                titres.add("1er stade de ré-alimentation post-opératoire digestif \n Ré-alimentation de patients fragiles");
                titres.add("Régime de réintroduction");
                titres.add("Bouillon de légume \n Yaourt nature \n Compote de pommes");
                titres.add("Si patient diabétique, préciser mention S/SUCRE (compote sera sans sucre ajouté, et pas de sachet de sucre avec le yaourt nature)");
                titres.add("TOUS LES AUTRES");
                titres.add("Aucune");
                titres.add("Si problème de hernier hiatale ou de gastrectomie : ré-alimentation avec yaourt/compote sans bouillon pour évoter un bol alimentaire trop important");
                break;
            case "P.Y.C (Potage/Yaourt/Compote)":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Compléments");
                contenus.add("Interdits");
                contenus.add("Collation");
                contenus.add("Informations Diverses");

                titres.add("2e stade de ré-alimentation post-opératoire digestif \n Alimentation légère pour patients fragiles");
                titres.add("Régime de réintroduction");
                titres.add("Potage de pates \n Yaourt \n Compote");
                titres.add("Si patient diabétique, préciser mention S/SUCRE (compote sera sans sucre ajouté, et pas de sachet de sucre avec le yaourt nature)");
                titres.add("TOUS LES AUTRES");
                titres.add("Aucune");
                titres.add("Si problème de hernier hiatale ou de gastrectomie : fractionnement du repas (potage éloigné de yaourt/compote)");
                break;
            case "Sans Résidus Strinct":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");
                contenus.add("Informations Diverses");

                titres.add("3e stade de ré-alimentation post-opératoire digestif \n MICI (Crohn, Rectocolite) \n Préparation aux examens endoscopiques coliques \n Colite aiguëe");
                titres.add("Alimentation sans fibres, stricte et sans lait, sans yaourt, sans petit-suisses, sans fromage-blanc");
                titres.add("Bouillon ou Potage de pates \n Viandes ou Poissons ou oeufs maigres NON ASSAISONNES (sans matière grasses ajoutées) \n Féculents (pates, riz, semoule) avec matière grasse \n Fromage à pate dure ou fondue (gruyere, vache qui rit...) \n Biscottes \n Pates de fruits et biscuits secs/gelée de fruits");
                titres.add("Pas de légumes (même en potage) \n Pas de légumes secs \n Pas de fruits \n Pas de produits laitiers autres que ceux autorisés \n Pas de pain");
                titres.add("Si collation prescrite par le médecin : \n Bases : biscottes ou biscuits secs, pates de fruits, fromage pate dure ou fondue");
                titres.add("PREPARATION COLIQUE : Dernier repas avant examen : \n BOUILLON + 2 fromages à pate dure");
                break;
            case "Sans Résidus Standart":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");
                contenus.add("Informations Diverses");

                titres.add("4e stade de ré-alimentation post-opératoire digestif \n Occlusion ou sub-occlusion \n Diverticulite \n Fin de crise de Crohn ou Rectocolite");
                titres.add("Alimentation sans fibres");
                titres.add("Bouillon de légumes ou Potage de pates \n Viandes ou Poissons ou oeufs maigres NON ASSAISONNES (sans matière grasses ajoutées) \n Féculents (pates, riz, semoule) avec matière grasse \n Fromage à pate dure ou fondue (gruyere, vache qui rit...) \n Lait, yaourt, fromage blanc, entremet, flan SELON TOLERANCE \n Compote de Pomme \n Biscottes \n Pates de fruits et biscuits secs");
                titres.add("Pas de légumes \n Pas de légumes secs \n Pas de fruits crus \n Pas de fromage fermenté (les autres selon tolérance) \n Pas de pain");
                titres.add("Si collation prescrite par le médecin : \n Bases : biscottes ou biscuits secs, pates de fruits, fromage pate dure ou fondue ou laitage si tolérance");
                break;
            case "Epargne Digestive Sans Gras":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");
                contenus.add("Informations Diverses");

                titres.add("5e stade de ré-alimentation post-opératoire digestif (appendicectomie...) \n Inconfort Digestif");
                titres.add("Alimentation controlée en fibres selon tolérance");
                titres.add("Potage selon tolérance (seulement le soir) \n Viandes ou Poissons ou oeufs maigres NON ASSAISONNES (sans matière grasses ajoutées) \n Féculents (pates, riz, semoule) NATURE \n Légumes peu fibreux NATURE : Betteraves, carottes, courgettes, haricots verts, endives \n Fromage à pate dure ou fondue (gruyere, vache qui rit...) \n Lait, yaourt, fromage blanc SELON TOLERANCE \n Compote ou fruit cuit sans peau, banane mure \n Biscottes \n Entremet, flan SELON TOLERANCE");
                titres.add("Pas de viande ou poisson cuisiné en sauce \n Pas de friture, panure ou épices fortes \n Pas de légumes crus ou trop fibreux (choux, blettes, poireaux...) introduction selon tolérance \n Pas de légumes secs \n Pas de fruits crus \n Pas de fromage fermenté : bleu, chèvre \n Pas de viennoiserie, pate feuilletée, confiture avec morceaux");
                titres.add("Si collation : laitage, biscottes, entremet selon tolérance");
                titres.add("Epargne Digestive : Petit volume, Enlever l'entrée");
                break;
            case "Epargne Digestive":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");

                titres.add("6e stade de ré-alimentation post-opératoire \n Confort Digestif \n Oesophagites \n Diverticulites");
                titres.add("Alimentation facile à digérer et controlée en assaisonnement (épice, matières grasses ...)");
                titres.add("Potage selon tolérance \n Viandes ou Poissons ou oeufs maigres NON ASSAISONNES (sans matière grasses ajoutées) \n Féculents (pates, riz, semoule) \n Légumes selon tolérance nature + MICROBEURRE \n Fromage à pate dure, frais ou fondue (gruyere, vache qui rit, St Moret...) \n Lait, yaourt, fromage blanc SELON TOLERANCE \n Compote ou fruit cuit sans peau, banane mure \n Biscottes \n Entremet, flan, gateaux secs, miel, cacao, confiture, chou à la crème, glace, liégois, tarte aux pommes, ile flottante");
                titres.add("Pas de friture, panure ou plats épicés (curry, safran, cornichon, vinaigre) ou trop aillé \n Pas de légumes trop fibreux (choux, blettes, poireaux, navets...) et cuits de préférence au début \n Pas de légumes secs (lentilles, pois chiches...) \n Pas de sauce au vin, aux piments, mayonnaise \n Pas de fruits crus ou alors très murs \n Pas de fromage fermenté (camembert, brie, bleu, chèvre...) \n Pas de grasses cuites (lard, saindoux, fritures)");
                titres.add("Si collation : laitage, biscottes, entremet...");
                break;
            case "Lacte Froid":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Elargissement");
                contenus.add("Collation");

                titres.add("Ré-alimentation précoce après hemorragie digestive dont l'hémostase a été obtenue \n Intervention ORL (végétation, amygdales, thyroïdectomie...)");
                titres.add("Alimentation froide et à base de produits laitiers avec texture lisse");
                titres.add("Purée au lait ou semoule au lait froide \n Yaourt, flan, fromage frais \n Compote de pomme");
                titres.add("Pas de légumes, pas de légumes secs \n Pas de féculents autres que purée ou semoule au lait \n Pas de fruits ou compotes autre que pomme \n Pas de fromage fermentatif \n Pas de viande, poisson, oeuf");
                titres.add("Alimentation mixée (VPO mixés, purée de pommes de terre ou légumes à température tiède");
                titres.add("Sur prescription médicale");
                break;
            case "Sans Gras":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Elargissement");

                titres.add("Pancréatite \n Hypercholestérolémie \n Hyperlipidémie mixte (ajouter le s/sucre) \n Pathologie vésiculaire \n Certains troubles fonctionnels intestinaux");
                titres.add("Alimentation sans graisse cuite ni aliments gras");
                titres.add("Pain \n Potage ou crudités + vinaigrette \n Viande ou poisson grillé \n Légumes sans assaisonnement \n Féculents sans assaisonnement \n Laitages ou fromages frais \n Fruit / Compote");
                titres.add("VPO gras en sauce \n Fromage gras, fermentés \n Légumes assaisonnés \n Féculents assaisonnés \n Entremets \n Alcool et compote sucrée si triglycérides élevés");
                titres.add("Favoriser les assaisonnements à base de graisses d'origine végétale (huiles)");
                break;
            case "Sans Lait":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("ALLERGIQUE aux protéines de lait de vache");
                titres.add("Alimentation sans protéine de lait de vache");
                titres.add("Potage ou crudités \n Viande ou poisson ou oeufs natures rotis \n Légumes NATURES + HUILE \n Féculents NATURES + HUILE \n Compote / Fruits \n Pate de fruits, gelée, confiture \n Pain \n Biscotte (voir composition : si matière grasse végétale = OK)");
                titres.add("Aucune purée ou semoule au lait \n Aucun produit laitier \n Aucun fromage \n Aucun entremet \n Aucune patisserie");
                break;
            case "Sans Gluten":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patient souffrant d'une intolérance au gluten (maladie coeliaque)");
                titres.add("Alimentation sans gluten (sans blé, seigle, orge, avoine, malt)");
                titres.add("Potage ou crudités + HUILE \n Viande ou poisson au naturel roti, poché, grillé... \n Légumes cuits \n Féculents : Riz, légumes secs, pomme de terre, maïs, polenta, soja, pates sans gluten (voir service diététique) \n Compote / Fruits \n Laitage nature ou fromage à pate pressée \n Sucre, miel, confiture pur fruit");
                titres.add("Fromages à moisissures : bleu, chèvre, aux herbes \n Yaourt aux fruits, laits parfumés, produits laitiers allégés, desserts lactés, entremets \n Viandes cuisinées, panées, quenelles, raviolis, tarte, quiche \n Poisson pané, surimi \n Féculents : TOUS sauf autorisés ci-dessus \n Fruits : figues sèches, oléagineux grillés \n Pain, biscottes, biscuits et toute préparation contenant du blé \n Sucre glace, sucre vanillé, poudre instantanée \n Matières grasses allégées, vinaigrette du commerce");
                break;
            case "Riche en Fibres":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");


                titres.add("Problème de transit (constipation)");
                titres.add("Enrichissement des repas pour accélérer le transit");
                titres.add("Potage ou crudités \n Viandes, poissons, oeufs \n Légumes cuits assaisonnés \n Féculents ou légumes secs \n Compote / Fruits / Entremet \n Laitage ou fromage \n Pain \n \n On favoriuse les légumes crus, cuits et les fruits et une hydrataion importante");
                break;
            case "Anti-Diarrheique":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patient en diarrhée");
                titres.add("Alimentation pauvre en fibres mais enrichie en pectines");
                titres.add("BOUILLON possible et Potagede pates \n Viandes ou poissons non assaisonnés maigres \n Légumes cuits : carottes sans gras \n Féculents (riz, semoule, pommes de terre, purée ou semoule sans lait, pates) assaisonnés \n Fromage pate dure ou fondue \n Compote de pomme ou banane \n Biscotte \n Gateaux secs, sucre, miel, confiture");
                titres.add("POTAGE de légumes ou vermicelles \n Fromages fermentés en forts : bleu, chèvre aux herbes \n Viandes grasses en sauce \n Poisson pané, à l'huile \n Légumes verts crus et cuits \n Légumes secs \n Fruits (sauf autorisés ci-dessus) \n Fruits secs, fruits oléagineux \n Friture, matières grasses cuites \n Viennoiseries, pate feuilletée \n Epices, ail, capres...");
                break;
            case "Régime Riche en Fer":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patient ayant un déficit en fer ou des besoins supplémentaires en fer");
                titres.add("Alimentation enrichie en fer : on privilégiera les VPO à chaque repas et les fruits crus en dessert \n (la vitamine C favorisant l'absorption de fer)");
                titres.add("Potage ou crudités \n Viandes ou poissons ou oeufs MIDI et SOIR \n Féculents (pates, riz, semoule, pomme de terre) et/ou légumes assaisonnés \n Fromage ou laitage \n FRUITS CRUS en priorité \n Pain");
                titres.add("Pas d'interdits particuliers");
                break;
            case "Hyperprotidique":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");

                titres.add("Syndrome néphrotique (fuite protidique) sans insuffisance rénal chronique associée \n Dénutrition \n Femme enceinte alitée sur une longue durée \n Femme allaitante");
                titres.add("Enrichissement des repas en protéines");
                titres.add("Potage ou crudités \n Viandes ou poissons ou oeufs \n Légumes cuits assaisonnés et/ou féculents ou légumes secs \n Laitage et fromage x2 (en favorisant les fromages pate dure) \n Fruit ou compote ou entremet ou patisserie \n Pain");
                break;
            case "Sans Histamine":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patients avec un terrain allergique");
                titres.add("Repas sans aliment allergisant");
                titres.add("Potage/Crudité \n Viandes grillées \n Féculents (pates, riz, semoule, pomme de terre) et/ou légumes assaisonnés \n Fromage ou laitage \n Fruit, compote, entremet, patisserie \n Pain");
                titres.add("Fraises, bananes \n Chocolat \n Oeufs \n Poissons, coquillages, crustacés \n Tomates \n Fromages fermentés \n Boissons fermentés (vin, bière, vinaigre) \n Agrumes, kiwis, pamplemousses \n Arachides \n Charcuterie (sauf jambon)");
                break;
            case "Diabétique 160 Hypocalorique":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");

                titres.add("Personnes diabétiques, en surpoids ou obèses");
                titres.add("Alimentation controlée en sucres et hypocalorique");
                titres.add("Crudité + vinaigrette \n Viandes ou poissons ou oeufs maigres NON ASSAISONNES (sans Matières grasses ajoutées) \n Légumes vapeur \n Pain 50g à chaque repas \n Produits laitiers maigres (yaourt, fromages blanc, fromages maigres) \n Fruit ou compote sans sucre ajouté");
                titres.add("FECULENTS (pates, riz, semoule, pomme de terre) sauf si prescription diabétique (dans ce cas PAS DE PAIN!) \n Légumes cuisinés sauf prescription siabétique \n Pas de VPO ens auce \n Pas de compote sucrée, d'entremet ou flan \n Pas de charcuterie");
                titres.add("AUCUNE sauf prescription médicale");
                break;
            case "Diabétique 200 et +":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");

                titres.add("Personnes diabétiques évaluées par médecin puis diététiciens");
                titres.add("Alimentation controlée en sucres lents et rapides");
                titres.add("Crudité + vinaigrette \n Viandes ou poissons ou oeufs maigres NON ASSAISONNES (sans Matières grasses ajoutées) \n Légumes assaisonnés \n Féculents 100g (ou plus si supérieur DB 180) \n Pain 50g à chaque repas (ou plus si supérieur à 180) \n Produits laitiers (yaourt, fromages blanc, fromages, fromages fondus, petits suisses) \n Fruit ou compote sans sucre ajouté");
                titres.add("Pas de compote sucrée, d'entremet ou flan \n Pas de charcuterie \n Pas de viandes grasses, en sauce \n Aucune sucrerie ou biscuit");
                titres.add("AUCUNE sauf prescription médicale \n  \n Si collation :  \n Bases : produits laitiers et biscottes ou pain \n PAS DE COMPOTE ou FRUIT en collation");
                break;
            case "Sans Sucre":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patients ayant une hypertriglycéridémie \n Pancréatite avec atteinte du pancréas endocrine \n Diabétique avec un régime associé (sans résidus...)");
                titres.add("Repas sans sucre rapide");
                titres.add("Potage ou crudité \n Viandes ou poissons ou oeufs\n Féculents (pates, riz, semoule, pommes de terre) et/ou légumes assaisonnés \n Fromage ou laitage sans sucre \n Fruit crus, compote sans sucre ajouté \n Pain");
                titres.add("Compote sucrée \n Entremet, patisserie \n Laitage sucré (yaourt au fruits...)");
                break;
            case "Sans Sel inférieur à 4g NACL":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");

                titres.add("Hypertension artérielle - cardiopathies décompensées \n Syndrome néphrotique - insuffisance rénale chronique \n Corticothérapie \n Cirrhose décompensée");
                titres.add("Alimentation restreinte en sel");
                titres.add("Potage ou crudités SANS SEL (vinaigrette sans sel) \n Viandes, poissons rotis SANS SEL \n Légumes assaisonés sans sel (ail/persil...) et/ou féculents SANS SEL \n Laitages ou crème de gruyère \n Pain ou biscottes SANS SEL \n Fruit ou compote, entremet");
                titres.add("Fromages : tous sauf crème de gruyère \n Charcuterie \n Conserves légumes/viandes/poissons \n Plats cuisinés du commerce \n Viennoiserie \n Beurre salé \n Gateaux du commerce ou biscuits \n Sauces du commerce \n Sel de cuisine \n Boissons gazeuses");
                titres.add("Laitage + pain ou biscotte sans sel, confiture, pate de fruit");
                break;
            case "Sans Sel Strict inférieur à 1g NACL":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");
                contenus.add("Collation");

                titres.add("Hypertension artérielle aigue \n Néphropathie aigue \n Syndrome néphrotique de l'enfant");
                titres.add("Alimentation totalement controlée en sodium : prise en charge service diététique");
                titres.add("Potage ou crudités SANS SEL (vinaigrette sans sel) \n Viande, Poisson SANS SEL SEULEMENT 1 FOIS PAR JOUR \n Légumes assaisonnés sans sel (ail/persil...) et/ou féculents SANS SEL \n Laitages ou crème de gruyère \n Pain ou biscottes SANS SEL \n Fruit ou compote");
                titres.add("LEGUMES : Carottes, épinards, choucroute, blettes à éviter \n LAIT HYPOSODE \n Fromage : tous sauf crème de gruyère \n Charcuterie et abats \n Conserves légumes/viandes/poissons \n Plats cuisinés du commerce \n Viennoiserie \n Beurre salé \n gateaux du commerce \n Sel de cuisine \n Boissons gazeuses : Vals, Badoit, Vichy...");
                titres.add("Laitage + pain ou biscotte sans sel, confiture, pate de fruits");
                break;
            case "Sous A.V.K":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patients suivant un traitement anti-vitaminique K");
                titres.add("Repas équilibrés en excluant les aliments interdits");
                titres.add("Potage ou crudités \n Viandes ou poissons ou oeufs \n Féculents (pates, riz, semoule, pommes de terre) et/ou légumes assaisonnés \n Fromage ou laitage \n Fruit, compote, entremet, patisserie \n Pain");
                titres.add("Tous les choux (crus et cuits) \n Epinards");
                break;
            case "Hypoprotidique":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");

                titres.add("Insuffisance rénale aigue ou chronique (avec créatinémie supérieure à 150ymol/L)");
                titres.add("Restriction des apports en protéines sur la journée");
                titres.add("Potage/crudité \n Viandes ou Poissons ou Oeuf 1 FOIS PAR JOUR \n Légumes cuits assaisonnés \n Féculents ou légumes secs \n Laitage ou fromage 1 FOIS PAR JOUR \n Fruit/Compote \n Pain \n  \n Ex : Midi VPO et pas de laitage, SOIR : Pas de VPO et un laitage ou fromage");
                break;
            case "Normal":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Collation");

                titres.add("Pas de prescription de régime thérapeutique particulier");
                titres.add("Alimentation équilibrée");
                titres.add("Potage légumes / Potage vermicelles / crudités + vge / charcuteries... \n Viandes ou poissons ou oeufs rotis ou en sauce \n Légumes cuits assaisonnés ou féculents assaisonnés \n Laitage ou fromage \n Fruit / Compote / Entremet / Patisserie  \n  Pain");
                titres.add("Boisson : Thé, Café, Cacao... \n Laitage, Compote, Biscotte");
                break;
            case "Sans Porc":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patients ne consommant aucune préparation à base de porc");
                titres.add("Repas sans porc");
                titres.add("Potage / crudité \n Poissons ou oeufs ou viandes (sans porc) \n  Féculents (pates, riz, semoule, pomme de terre) et/ou légumes assaisonnés \n Fromage ou laitage \n  Fruit, compote, entremet, patisserie \n Pain");
                titres.add("Viande de porc (sauté, roti, escalope, échine...) \n Jambon, charcuterie \n Saucisse et chair à saucisse \n Préparation farcies (tomates, courgettes, raviolis...) \n Etc...");
                break;
            case "Végétarien":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patients végétariens \n Patients de culture musulmane ou mangeant casher");
                titres.add("Repas sans viande ou préparation à base de viande");
                titres.add("Potage ou crudité \n Poissons ou oeufs \n Féculents (pates, riz, semoule, pommes de terre) et/ou légumes assaisonnés \n Fromages ou laitage \n Fruit, compote, entremet, patisserie \n Pain");
                titres.add("Tourtes les viandes ou volailles, le jambon, charcuterie \n Les farces, les hachis Parmentier \n Le potage de vermicelle (cube de bouillon de viande) \n Les fonds de sauce");
                break;
            case "Sans Alcool":
                contenus.add("Public Concerné");
                contenus.add("Bases du Régime");
                contenus.add("Autorisés à Chaque Repas à l'Hopital");
                contenus.add("Interdits");

                titres.add("Patients en cure de désintoxication alcoolique");
                titres.add("Aucun apport en alcool dans les préparations (sauce au vin, patisseries alcoolisées...)");
                titres.add("Potage / crudités \n Viandes ou poissons ou oeufs sans sauce au vin \n Féculents (pates, riz, semoule, pommes de terre) et/ou légumes assaisonnés \n Fromage ou laitage \n Fruit, compote, entremet, patisserie sans apport en alcool \n Pain");
                titres.add("AUCUNE PREPARATION A BASE D'ALCOOL \n  \n Viande en sauce au vin : bourguignon, sauce au vin \n Poisson sauce au vin blanc \n Patisserie au rhum...");
                break;
        }

        RecyclerView popupRegimeRecyclerView = findViewById(R.id.regime_recycler_view);
        popupRegimeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        RegimePopupAdapter popupAdapter = new RegimePopupAdapter(regimeName, contenus, titres);
        popupRegimeRecyclerView.setAdapter(popupAdapter);

        ImageButton homeButton = findViewById(R.id.icon_home_regime);
        ImageButton backButton = findViewById(R.id.icon_back_regime);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRmActivity();
            }
        });

        TextView title = findViewById(R.id.title_regime_popup);
        title.setText(regimeName);
    }

    private void startMainActivity(){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }

    private void startRmActivity(){
        Intent myIntent = new Intent(this, RMActivity.class);
        this.startActivity(myIntent);
    }
}