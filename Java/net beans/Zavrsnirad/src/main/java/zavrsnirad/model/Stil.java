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
    @OneToMany
    public List<Tecaj> tecajevi = new ArrayList<>();

    public List<Tecaj> getTecajevi() {
        return tecajevi;
    }

    public void setTecajevi(List<Tecaj> tecajevi) {
        this.tecajevi = tecajevi;
    }
        @Column(nullable =false)
	private String naziv;
	private String opis;
	
      
public String toString() {
	return  naziv;
}
	

	
}
	

	

