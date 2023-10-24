package zavrsnirad.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Stil extends Entitet {
    @Column(nullable = false)
    private String naziv;
    private String opis;
    @OneToMany(mappedBy = "stil")
    private List<Tecaj> Tecajevi = new ArrayList<>();
    
    private Integer brojTecaj;

    @Override
    public String toString() {
        return naziv;
    }
   
}
	

	

	
	

	

	

	

	

