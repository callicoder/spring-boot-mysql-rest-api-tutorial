package com.notesapp.repository;

import com.notesapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
public interface NoteRepository extends JpaRepository<Note, Long> {

}
