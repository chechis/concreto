package silicato_gris.myapplication.apoyo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import silicato_gris.myapplication.R;

public class AdapterProporcion extends RecyclerView.Adapter<AdapterProporcion.ConcretoHolder> {

    private ProporcionListener proporcionListener;

    public interface ProporcionListener{
        void deleteProporcion(int position);
        void editProporcion (int position);
    }

    private List<Concreto> concretos;

    public AdapterProporcion (List<Concreto> concretos) { this.concretos = concretos;}

                                    

    public class ConcretoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtAguaCemento, txtAsentamiento, txtPropUnitaria, txtPropVol;
        ImageButton btnEditar, btnBorrar;

        public ConcretoHolder (View itemView){
            super(itemView);
            txtAguaCemento = (TextView) itemView.findViewById(R.id.txt_proporcion_ac);
            txtAsentamiento = (TextView) itemView.findViewById(R.id.txt_proporcion_asentamiento);
            txtPropUnitaria = (TextView) itemView.findViewById(R.id.txt_proporcion_unitaria);
            txtPropVol = (TextView) itemView.findViewById(R.id.txt_proporcion_volumetrica);

            btnEditar = (ImageButton) itemView.findViewById(R.id.btn_proporcion_edit);
            btnEditar.setOnClickListener();

        }

        @Override
        public void onClick(View view) {

        }
    }

    @NonNull
    @Override
    public AdapterProporcion.ConcretoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProporcion.ConcretoHolder concretoHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
