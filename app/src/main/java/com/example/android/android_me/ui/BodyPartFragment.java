package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class BodyPartFragment extends Fragment {

    private final static String TAG = BodyPartFragment.class.getSimpleName();
    private List<Integer> mImageIds;
    private int mListIndex;

    public void setImageIds(List<Integer> imageIds) {
        mImageIds = imageIds;
    }

    public void setListIndex(int listIndex) {
        mListIndex = listIndex;
    }

    public BodyPartFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView imageView = rootView.findViewById(R.id.body_part_image_view);

        if (mImageIds != null) {
            imageView.setImageResource(mImageIds.get(mListIndex));
        }else{
            Log.v(TAG, "This fragment has null list of image id's");
        }

        return rootView;
    }
}
