package pl.allegro.finance.tradukisto.internal.languages.romanian // todo: change it to your language
//done

import spock.lang.Specification
import spock.lang.Unroll

// todo: below import your language container, it will be red because file does not exist yet, but dont worry about it now
import static pl.allegro.finance.tradukisto.internal.Container.romanianContainer 
//done

class RomanianValuesTest extends Specification {

    static intConverter = romanianContainer().getIntegerConverter() 
    static longConverter = romanianContainer().getLongConverter() 
    //container done

    @Unroll
    def "should convert #value to '#words' in Romanian"() { 
        expect:
        intConverter.asWords(value) == words

        where:
        value         | words
        0             | "zero"
        1             | "unu"
        2             | "doi"
        3             | "trei"
        4             | "patru"
        5             | "cinci"
        6             | "șase"
        7             | "șapte"
        8             | "opt"
        9             | "nouă"

        11            | "unsprezece"
        12            | "doisprezece"
        13            | "treisprezece"
        14            | "paisprezece"
        15            | "cincisprezece"
        16            | "șaisprezece"
        17            | "șaptesprezece"
        18            | "optsprezece"
        19            | "nouăsprezece"

        10            | "zece"
        20            | "douăzeci"
        30            | "treizeci"
        40            | "patruzeci"
        50            | "cincizeci"
        60            | "șaizeci"
        70            | "șaptezeci"
        80            | "optzeci"
        90            | "nouăzeci"

        21            | "douăzeci și unu"
        37            | "treizeci și șapte"
        43            | "patruzeci și trei"
        58            | "cincizeci și opt"
        69            | "șaizeci și nouă"
        76            | "șaptezeci și șase"
        82            | "optzeci și doi"
        95            | "nouăzeci și cinci"

        100           | "o sută"
        200           | "două sute"
        300           | "trei sute"
        400           | "patru sute"
        500           | "cinci sute"
        600           | "șase sute"
        700           | "șapte sute"
        800           | "opt sute"
        900           | "nouă sute"

        111           | "o sută unsprezece"
        272           | "două sute șaptezeci și doi"
        387           | "trei sute optzeci și șapte"
        448           | "patru sute patruzeci și opt"
        569           | "cinci sute șaizeci și nouă"
        625           | "șase sute douăzeci și cinci"
        782           | "șapte sute optzeci și doi"
        895           | "opt sute nouăzeci și cinci"
        999           | "nouă sute nouăzeci și nouă"


        1_000         | "o mie"
        2_000         | "două mii"
        3_000         | "trei mii"
        4_000         | "patru mii"
        5_000         | "cinci mii"
        7_634         | "șapte mii șase sute treizeci și patru"
        11_000        | "unsprezece mii"
        15_000        | "cincisprezece mii"
        21_000        | "douăzeci și una de mii"
        24_190        | "douăzeci și patru de mii o sută nouăzeci"
        653_000       | "șase sute cincizeci și trei de mii"
        123_454       | "o sută douăzeci și trei de mii patru sute cincizeci și patru"
        700_000       | "șapte sute de mii"
        999_999       | "nouă sute nouăzeci și nouă de mii nouă sute nouăzeci și nouă"

        1_000_000     | "un milion"
        2_000_000     | "doi milioane"
        5_000_000     | "cinci milioane"
        23_437_219    | "douăzeci și trei de milioane patru sute treizeci și șapte de mii două sute nouăsprezece"
        100_000_000   | "o sută de milioane"
        123_456_789   | "o sută douăzeci și trei de milioane patru sute cincizeci și șase de mii șapte sute optzeci și nouă"
        322_089_890   | "trei sute douăzeci și două de milioane optzeci și nouă de mii opt sute nouăzeci"

        1_000_000_000 | "un miliard"
        2_147_483_647 | "doi miliarde o sută patruzeci și șapte de milioane patru sute optzeci și trei de mii șase sute patruzeci și șapte"

    }

    @Unroll
    def "should convert long #value to '#words' in Romanian"() {
        expect:
        longConverter.asWords(value) == words

        where:
        value                     | words
        5_000_000_000             | "cinci miliarde"
        1_000_000_000_000         | "un trilion"
        2_000_000_000_000         | "două trilioane"
        5_000_000_000_000         | "cinci trilioane"

        1_000_000_000_000_000     | "un quadrilion"
        2_000_000_000_000_000     | "două quadrilioane"
        5_000_000_000_000_000     | "cinci quadrilioane"

        1_000_000_000_000_000_000 | "un quintilion"
        2_000_000_000_000_000_000 | "două quintilioane"
        Long.MAX_VALUE            | "nouă quintilioane două sute douăzeci și trei quadrilioane trei sute șaptezeci și două trilioane        treizeci și șase de miliarde opt sute cincizeci și patru de milioane șapte sute șaptezeci și cinci de mii opt sute șapte"

        //done in romanian
    }
}