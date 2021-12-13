package edu.neu.khoury.madsea.parks.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.neu.khoury.madsea.parks.R;
import edu.neu.khoury.madsea.parks.model.Images;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ImageSlider> {
    private List<Images> imagesList;

    public ViewPagerAdapter(List<Images> imagesList) {
        this.imagesList = imagesList;
    }

    @NonNull
    @Override
    public ImageSlider onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_pager_row, parent, false);
        return new ImageSlider(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageSlider holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ImageSlider extends RecyclerView.ViewHolder{
        public ImageSlider(@NonNull View itemView) {
            super(itemView);
        }
    }
}
