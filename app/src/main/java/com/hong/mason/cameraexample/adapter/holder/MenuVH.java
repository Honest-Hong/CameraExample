package com.hong.mason.cameraexample.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.hong.mason.cameraexample.R;
import com.hong.mason.cameraexample.activity.MenuController;

/**
 * Created by HTJ_Home_PC on 2017-10-01.
 */

public class MenuVH extends RecyclerView.ViewHolder {
    private int menuNum;
    private String menuText;
    private Button button;

    public MenuVH(View itemView, final MenuController menuController) {
        super(itemView);
        button = itemView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuController.onClickMenu(menuNum);
            }
        });
    }

    public void setupView(int menuNum, String menuText) {
        this.menuNum = menuNum;
        this.menuText = menuText;
        button.setText(menuText);
    }
}
