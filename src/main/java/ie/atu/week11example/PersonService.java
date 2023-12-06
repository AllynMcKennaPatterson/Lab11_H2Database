package ie.atu.week11example;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    // Placeholder method to save a person (add to Db in the next two weeks)
    private final PersonRespository personRepository;

    public PersonService(PersonRespository personRespository){
        this.personRepository = personRespository;
    }
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return new Person();
    }
}
