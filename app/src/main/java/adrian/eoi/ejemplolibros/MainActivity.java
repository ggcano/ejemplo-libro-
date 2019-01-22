package adrian.eoi.ejemplolibros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvLibros;
    ArrayList<Book> booksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvLibros = findViewById(R.id.lvLibros);

        addBooks();
        BooksAdapter adapter = new BooksAdapter(MainActivity.this, R.layout.book_list_item, booksList);
        lvLibros.setAdapter(adapter);
    }

    private void addBooks() {
        booksList = new ArrayList<>();
        Book book1 = new Book();
        book1.setTitulo("La piedra filosofal");
        book1.setAutor("JK rowling");
        book1.setTapaUrl("https://images-na.ssl-images-amazon.com/images/I/51lEw8wGCPL._SX312_BO1,204,203,200_.jpg");

        Book book2 = new Book();
        book2.setTitulo("El misterio del principe");
        book2.setAutor("JK Rowling");
        book2.setTapaUrl("https://sgfm.elcorteingles.es/SGFM/dctm/MEDIA02/CONTENIDOS/201506/01/00106539566858____2__640x640.jpg");

        Book book3 = new Book();
        book3.setTitulo("La orden del fenix");
        book3.setAutor("JK Rowling");
        book3.setTapaUrl("https://imagessl1.casadellibro.com/a/l/t0/21/9788498383621.jpg");

        for (int i = 0; i < 10; i++) {
            booksList.add(book1);
            booksList.add(book2);
            booksList.add(book3);
        }
    }
}
