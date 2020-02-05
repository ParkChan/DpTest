package com.moaplanet.dptest;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by jiwun on 2020-02-05.
 */
public class DpTestAdapter extends ListAdapter<String, DpTestAdapter.DpTestHolder> {

    @NonNull
    @Override
    public DpTestHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_text_dp, parent, false);
        return new DpTestHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DpTestHolder holder, int position) {
        holder.init(position);
    }

    protected DpTestAdapter(@NonNull DiffUtil.ItemCallback<String> diffCallback) {
        super(diffCallback);
    }

    public class DpTestHolder extends RecyclerView.ViewHolder {

        private TextView tvContent;

        public DpTestHolder(@NonNull View itemView) {
            super(itemView);
            tvContent = itemView.findViewById(R.id.tv_item_text_dp);
        }

        private void init(int pos) {
            tvContent.setText(itemView.getContext().getString(R.string.item_string_dp_content, (pos+1)));
            tvContent.setTextSize(TypedValue.COMPLEX_UNIT_DIP, (pos+1));
        }

    }
}
