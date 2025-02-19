package com.lib.library_management.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.library_management.Repository.BooksEntityRepo;
import com.lib.library_management.Entity.BooksEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksEntityService {

    @Autowired
    BooksEntityRepo booksRepo;

    BooksEntity booksEntity;

    public long countTotalBooks(Integer bookCode) {
        return booksRepo.countTotalBooks(bookCode);
    }

    public long countAvailableBooks(Integer bookCode) {
        return booksRepo.countAvailableBooks(bookCode);
    }

    public long countBorrowedBooks(Integer bookCode) {
        return booksRepo.countBorrowedBooks(bookCode);
    }

    public ArrayList<String> getBookIds(Integer bookCode) {
        return booksRepo.getBookIds(bookCode);
    }

    public ArrayList<String> getBorrowedStudents(Integer bookCode) {
        return booksRepo.getBorrowedStudents(bookCode);
    }

    public List<BooksEntity> getBooksFromStudentRollNo(String RollNo){
        return booksRepo.findBooksEntitiesByStudent_StudentRollNo(RollNo);
        // booksRepository.f
    }

    public void addBooks(ArrayList<BooksEntity> booksToAdd){
        booksRepo.saveAll(booksToAdd);
    }

    public void saveReturningBook(BooksEntity booksEntity){
        booksRepo.save(booksEntity);
    }

}
