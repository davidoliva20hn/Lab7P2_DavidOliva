
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 */

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class AdminProdutos {
    private ArrayList<Producto> listaUsuarios = new ArrayList();
    private File archivo = null;
    
    public AdminProdutos() {
    }
    
    public AdminProdutos(String Path) {
        archivo = new File(Path);
    }

    public ArrayList<Producto> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void setListaUsuarios(ArrayList<Producto> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    @Override
    public String toString() {
        return "listaUsuarios:" + listaUsuarios;
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto t : listaUsuarios) {
                bw.write(t.getId() + ";");
                bw.write(t.getName() + ";");
                bw.write(t.getCategory() + ";");
                bw.write(t.getPrice() + ";");
                bw.write(t.getAisle() + ";");
                bw.write(t.getBin() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsuarios.add(new Producto(sc.nextInt(), sc.nextLine(), sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
