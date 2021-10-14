package android.example.newapp_final;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Date;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = listItemView.findViewById(R.id.title_text);

        String title = currentNews.getTitle();

        titleView.setText(title);

        TextView timeView = listItemView.findViewById(R.id.DateAndTime);

        String time = currentNews.getTime();

        timeView.setText(time);

        TextView sectionView = listItemView.findViewById(R.id.section_text);

        String section = currentNews.getSection();

        sectionView.setText(section);

        TextView authorView = listItemView.findViewById(R.id.AuthorName_text);

        String author = currentNews.getAuthor();

        authorView.setText(author);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}