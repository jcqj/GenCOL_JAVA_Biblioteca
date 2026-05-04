import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaBiblioteca {
    Map<String, Material> catalogo = new HashMap<>();

    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo() ,m );
    }

    public Material buscarMaterial(String codigo){
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo(){
        for(Map.Entry<String, Material> e : catalogo.entrySet()){
            String codigo = e.getKey();
            Material material = e.getValue();

            System.out.println("Codigo: " + codigo);
            System.out.println(material);
        }
    }

    Map<String, List<String>> listaEspera = new HashMap<>();

    //! AgregarEspera(String codigoMaterial, String usuario);
    public void agregarEspera(String codigoMaterial, String usuario){
        //? Sí no exite la lista, la crea.
        if ( !listaEspera.containsKey(codigoMaterial))
        {
            listaEspera.put(codigoMaterial , new ArrayList<>());
        }
        //? Agregar usuario al final.
        listaEspera.get(codigoMaterial).add(usuario);
    }

    //! siguienteEnEspera(String codigoMaterial);
    public String siguienteEnEspera(String codigoMaterial)
    {
        List<String> lista = listaEspera.get(codigoMaterial);
        if(lista == null || lista.isEmpty())
        {
            return null;
        }
        //? Eliminamos y retornamos el primero.
        return lista.removeFirst();
    }
}
