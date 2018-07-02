
public class Book 
{
	int BidNo;
	String Bname;
	double Bprice;
	Book(int BidNo ,String Bname,double Bprice)
	{
		this.BidNo=BidNo;
		this.Bname = Bname;
		this.Bprice = Bprice;
	}
	@Override
	public String toString()
	{
		return "Book [" + BidNo + "," + Bname + "," + Bprice + "]";
	}

	

		
	}


