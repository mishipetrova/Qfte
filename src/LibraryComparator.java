import java.util.Comparator;
import java.util.HashSet;

public class LibraryComparator implements Comparator<Library> {

    @Override
    public int compare(Library l1, Library l2) {

        HashSet<Book> l1BookSet = new HashSet<>();
        HashSet<Book> common = new HashSet<>();
        l1BookSet.addAll(l1.getBooks());
        for(Book b : l2.getBooks()){
            if(l1BookSet.contains(b)){
                common.add(b);
            }
        }
        int l1Final = 0;
        int l2Final = 0;
        int l1Score = l1.getDays() * 3 + l1.getBooksPerDay() * 7;
        int l2Score = l2.getDays() * 3 + l2.getBooksPerDay() * 7;
        if(l1Score > l2Score){
            for(Book b : l1.getBooks()){
                if(common.contains(b)){
                    l1Final += b.getScore();
                }
            }
        }
        else{
            for(Book b : l2.getBooks()){
                if(common.contains(b)){
                    l2Final += b.getScore();
                }
            }
        }

        // add unique
        for(Book b : l1.getBooks()){
            if(!common.contains(b)){
                l1Final += b.getScore();
            }
        }

        for(Book b : l2.getBooks()){
            if(!common.contains(b)){
                l2Final += b.getScore();
            }
        }

        return l1Final - l2Final;




    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
