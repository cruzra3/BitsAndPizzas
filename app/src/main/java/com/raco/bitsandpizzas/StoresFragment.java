package com.raco.bitsandpizzas;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class StoresFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        RecyclerView storeRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_store, container, false);

        String[] storeNames = new String[Store.stores.length];
        for (int i = 0; i < storeNames.length; i++) {
            storeNames[i] = Store.stores[i].getName();
        }

        int[] storeImages = new int[Store.stores.length];
        for (int i = 0; i < storeImages.length; i++) {
            storeImages[i] = Store.stores[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(storeNames, storeImages);
        storeRecycler.setAdapter(adapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        storeRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), StoreDetailActivity.class);
                intent.putExtra(StoreDetailActivity.EXTRA_STORE_ID, position);
                getActivity().startActivity(intent);
            }
        });

        return storeRecycler;
    }
}