package dev.rvent.movies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

public interface MovieRepository extends MongoRepository<Movies, ObjectId> {
}
