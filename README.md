# 2021-03-05-GenericTrap


In my CountriesViewModel, the contructor is below.  This is due to the issue in this example.
When you think about it, I think it will make complete sense.

public class CountriesViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<ArrayList<Country>> countryList;

    public CountriesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");

        countryList = new MutableLiveData<>();
        countryList.setValue(new ArrayList<>());
    }

.
.
.
}
