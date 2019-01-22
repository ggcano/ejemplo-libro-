package adrian.eoi.ejemplolibros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BooksAdapter extends ArrayAdapter<Book> {

    Context context;
    ArrayList<Book> booksList;

    public BooksAdapter(Context context, int resource, ArrayList<Book> booksList) {
        super(context, resource, booksList);

        this.context = context;
        this.booksList = booksList;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View cell = inflater.inflate(R.layout.book_list_item, null);

        ImageView imgBook = cell.findViewById(R.id.ivCover);
        Glide.with(context).load(booksList.get(position).getTapaUrl()).into(imgBook);
        TextView txtTitle = cell.findViewById(R.id.tvTitle);
        txtTitle.setText(booksList.get(position).getTitulo());
        TextView txtAuthor = cell.findViewById(R.id.tvAutor);
        txtAuthor.setText(booksList.get(position).getAutor());


        return cell;


    }
}
