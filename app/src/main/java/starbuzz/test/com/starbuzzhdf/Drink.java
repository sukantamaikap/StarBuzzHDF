package starbuzz.test.com.starbuzzhdf;

/**
 * Created by smaikap on 11/14/15.
 */
public class Drink {

    private String _name;
    private String _description;
    private int _imageResourceId;

    public static final Drink[] drink = {new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
                                        new Drink("Cappuccino","Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
                                        new Drink("Filter","High quality beans, roasted and b", R.drawable.filter)};

    private Drink (String _name, String _description, int _imageResourceId) {
        this._name = _name;
        this._description = _description;
        this._imageResourceId = _imageResourceId;
    }

    public String get_name () {
        return this._name;
    }

    public String get_description () {
        return this._description;
    }

    public int get_imageResourceId () {
        return this._imageResourceId;
    }

    public String toString() {
        return this._name;
    }
}
