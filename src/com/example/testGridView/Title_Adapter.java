package com.example.testGridView;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MAHDI on 2/9/14.
 */
public class Title_Adapter extends ArrayAdapter<TblTitle> {

    private static class ViewHolder {
        TextView title;
        TextView id;
        TextView idparent;

    }
//    private static class SetFont{
//        public static Typeface GetTypeface_Font(Context context) {
//
//                Typeface FONT_HEADINGS = Typeface.createFromAsset(context.getAssets(), "fonts/IRBadrBold.ttf");
//            return FONT_HEADINGS;
//        }
//    }
    Context mContext;
    public Title_Adapter(Context context, ArrayList<TblTitle> users) {
        super(context, R.layout.rows_gridview, users);
        mContext=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position

        TblTitle user = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.rows_gridview, null);

            viewHolder.id = (TextView) convertView.findViewById(R.id.txt_row_Id);
            viewHolder.idparent = (TextView) convertView.findViewById(R.id.txt_row_Id_parent);
            viewHolder.title = (TextView) convertView.findViewById(R.id.txt_row_Title);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        String ids = Integer.toString(user.get_Id());
        String idparent = Integer.toString(user.get_Id_parent());

        viewHolder.title.setText(user.get_Title());
        //viewHolder.title.setTypeface(SetFont.GetTypeface_Font(mContext));
        viewHolder.title.setTextSize(18);
        viewHolder.title.setSelected(true);

        viewHolder.id.setText(ids);
        viewHolder.idparent.setText(idparent);

//        viewHolder.id.setVisibility(0);
//        viewHolder.idparent.setVisibility(0);
        // Return the completed view to render on screen
        //System.out.println("-------------5"+user.get_Title());
        return convertView;
    }


}
