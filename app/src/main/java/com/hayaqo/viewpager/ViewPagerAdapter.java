package com.hayaqo.viewpager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

public class ViewPagerAdapter extends PagerAdapter {

    private int[] arrImg;
    private Context context;

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }

    public ViewPagerAdapter(int[] arrImg, Context context) {
        this.arrImg = arrImg;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrImg.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        Picasso.get().load(arrImg[position]).into(imageView);
//        kita butuh libbrari buat nampilin gambar

        container.addView(imageView);

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
