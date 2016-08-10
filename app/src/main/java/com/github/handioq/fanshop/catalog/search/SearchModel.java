package com.github.handioq.fanshop.catalog.search;

import android.util.Log;

import com.github.handioq.fanshop.model.dto.ProductDTO;
import com.github.handioq.fanshop.net.NetworkService;

import java.util.List;

import rx.Subscriber;

public class SearchModel implements SearchMvp.Model {

    private static final String TAG = "SearchModel";

    private final NetworkService networkService;
    private SearchModel.Callback callback;

    public SearchModel(NetworkService networkService) {
        this.networkService = networkService;
    }

    @Override
    public void search(String query, int offset, int limit) {
        networkService.getApiService()
                .search(query, offset, limit)
                //.delay(3, TimeUnit.SECONDS)
                .compose(NetworkService.<List<ProductDTO>>applyScheduler())
                .subscribe(new Subscriber<List<ProductDTO>>() {
                    @Override
                    public void onCompleted() {
                        callback.onSearchCompleted();
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onSearchError(e);
                    }

                    @Override
                    public void onNext(List<ProductDTO> products) {
                        callback.onSearchSuccess(products);
                    }
                });

        Log.i(TAG, "search() " + query);
    }

    @Override
    public void setCallback(Callback callback) {
        this.callback = callback;

        Log.i(TAG, "setCallback()");
    }
}