package polsl.project.pp.BookYourFuture.services.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import polsl.project.pp.BookYourFuture.dao.interfaces.CompanyDAO;
import polsl.project.pp.BookYourFuture.entities.Company;
import polsl.project.pp.BookYourFuture.services.interfaces.CompanyService;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyDAO companyDAO;

    @Autowired
    public CompanyServiceImpl(CompanyDAO thsCompanyDAO) {companyDAO = thsCompanyDAO;}
    @Override
    public List<Company> findAll() {
        return companyDAO.findAll();
    }

    @Override
    public Company findById(int theId) {
        return companyDAO.findById(theId);
    }

    @Override
    public void save(Company theCompany) {
        companyDAO.save(theCompany);
    }

    @Override
    public void deleteById(int theId) {
        companyDAO.deleteById(theId);
    }
}
