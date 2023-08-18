package Person;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    private List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public People(PersonType...persons){
        this.personList = new ArrayList<>(List.of(persons));
    }

    public void add(PersonType person){
        this.personList.add(person);
    }

    public void remove(PersonType person){
        this.personList.remove(person);
    }
    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personType) {
        for (PersonType person : personType) {
            this.personList.add(person);
        }
    }
    public PersonType findById(Long id){
        for(PersonType person : personList){
            if (person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }



}
