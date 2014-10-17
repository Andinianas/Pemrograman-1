class London{
	String negara;
	String ibukota;
	String ratu;
	String wisata;
	
	public String getnegara(){
		return negara;
	}
	public String getibukota(){
		return ibukota;
	}
	public String getratu(){
		return ratu;
	}
	public String getwisata(){
		return wisata;
	}
	
	public void setnegara(String x){
		this.negara=x;
	}
	public void setibukota(String y){
		this.ibukota=y;
	}
	public void setratu(String z){
		this.ratu=z;
	}
	public void setwisata(String a){
		this.wisata=a;
	}
	

	public static void main(String[]args){
		London negaraPertama=new London();
		negaraPertama.setnegara("Andini Putri");
		System.out.print("Negara yang anda pilih adalah: ");
		System.out.println(negaraPertama.getnegara());
	
		negaraPertama.setibukota("London");
		System.out.print("Ibukota Inggris adalah: ");
		System.out.println(negaraPertama.getibukota());
		
		negaraPertama.setratu("Elizabeth");
		System.out.print("Nama Ratu Inggris adalah: ");
		System.out.println(negaraPertama.getratu());
	
		negaraPertama.setwisata("London eye");
		System.out.print("Tempat wisata yang keren adalah: ");
		System.out.println(negaraPertama.getwisata());
	}
}