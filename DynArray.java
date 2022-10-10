public class DynArray  extends  DynArrayAbstract{

  Object[] tab;

  public DynArray(){
    this.tab=new Object[2];

  }
  @Override
  protected int size() {
    return this.tab.length ;
  }
  @Override

  protected void add(Object n) {

    int  s = this.size();
    //si larray est plein,
    if (this.tab[s-1]!=null){
      Object[] newtab = new Object[s*2+1];

      for (int i=0;i< ; i++){
        newtab[i]=this.tab[i];

      }
      this.tab=newtab;
    }
// on parcourr le tableu, si on rencontre une valeur et ajoute un element si on retrouve une valeur null
    for (int i=0 ;i<tab.length; i++){
      if(tab[i]==null){
        tab[i]=n;
        break;
      }
    }
  }



  @Override
  protected int capacity() {
    return 0;
  }
}

