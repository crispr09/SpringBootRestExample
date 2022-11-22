package com.sachinkumar.repository;

import java.util.List;

import com.sachinkumar.entity.Library;

public interface LibraryRepositoryCustom {
	
	List<Library> findAllByAuthor(String authorName);

}
