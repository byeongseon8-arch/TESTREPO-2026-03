package Ch07;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Board implements Serializable 	// 직렬화
{

	private static final long seialVErsionUID = 1L;
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;	// java.utill.Date
	
	
	//디폴트 생성자
	public Board() {
		
	}
	//모든 인자 생성자

	public Board(int bno, String title, String content, String writer, Date date) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}

	
	//getter and setter
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	//toString 재정의
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}

public class C04ObjectStramMain {

	public static void main(String[] args) throws IOException {
		Board board1 = new Board(1,"제목1","내용1","작성자1",new Date());
		Board board2 = new Board(2,"제목2","내용2","작성자2",new Date());
		Board board3 = new Board(3,"제목3","내용3","작성자3",new Date());
		
		FileOutputStream out = new FileOutputStream("C:\\IOTEST\\board.db");
		ObjectOutputStream oout = new ObjectOutputStream(out);
		oout.writeObject(board1);
		oout.writeObject(board2);
		oout.writeObject(board3);
		oout.flush();
		oout.close();
		out.close();
		
	}

}
