package services;

import repositories.ProfesseurRepository;
import entities.Professeur;

import java.util.List;

public class ProfesseurService {
    ProfesseurRepository professeurRepository = new ProfesseurRepository();

    public void ajouterProfesseur(Professeur professeur) {
        professeurRepository.insert(professeur);
    }

    public Professeur getProfesseurById(int id) {
        return professeurRepository.selectProfesseurById(id);
    }

    public List<Professeur> listerProfesseurs() {
        return professeurRepository.listerProfesseurs();
    }
}
