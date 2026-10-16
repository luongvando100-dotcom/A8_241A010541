package vn.edu.vhu.ltdd.a8_241a010541;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private final MutableLiveData<String> lastReadNews = new MutableLiveData<>("Chưa đọc tin nào.");
    private final MutableLiveData<String> userName = new MutableLiveData<>("Lương Văn Đô");
    private final MutableLiveData<String> userMssv = new MutableLiveData<>("241A010541");

    public LiveData<String> getLastReadNews() {
        return lastReadNews;
    }

    public void setLastReadNews(String news) {
        lastReadNews.setValue(news);
    }

    public LiveData<String> getUserName() {
        return userName;
    }

    public LiveData<String> getUserMssv() {
        return userMssv;
    }
}
