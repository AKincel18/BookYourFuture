package polsl.project.pp.BookYourFuture.services.interfaces;

import polsl.project.pp.BookYourFuture.entities.Service;
import polsl.project.pp.BookYourFuture.entities.Timetable;

import java.util.List;

public interface TimetableService {
    public List<Timetable> findAll();

    public Timetable findById(int theId);

    public List<Timetable> findByService(Service service);

    public void save(Timetable theTimetable);

    public void deleteById(int theId);
}
