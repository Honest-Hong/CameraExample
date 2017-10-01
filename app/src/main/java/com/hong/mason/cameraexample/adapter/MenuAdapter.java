package com.hong.mason.cameraexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hong.mason.cameraexample.activity.MenuController;
import com.hong.mason.cameraexample.adapter.holder.MenuVH;
import com.hong.mason.cameraexample.R;

/**
 * Created by HTJ_Home_PC on 2017-10-01.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuVH> {
    private Context context;
    private MenuController menuController;
    private String[] menus;

    public MenuAdapter(Context context, String[] menus) {
        this.context = context;
        this.menus = menus;
        menuController = (MenuController) context;
    }

    @Override
    public MenuVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MenuVH(LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false), menuController);
    }

    @Override
    public void onBindViewHolder(MenuVH holder, int position) {
        holder.setupView(position, menus[position]);
    }

    @Override
    public int getItemCount() {
        return menus.length;
    }
}
