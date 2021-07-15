package com.gcdata.internship.Service.Implementation;

import com.gcdata.internship.Model.CustomSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class SequenceService {
    @Autowired
    private MongoOperations mongoOperations;
    /*
        This method is for auto increment the id of the user collection
     */
    public long getNextSequence(String sequenceName) {
       // fetch the old id an increment it by 1
        CustomSequence counter = mongoOperations.findAndModify(
                query(where("_id").is(sequenceName)),
                new Update().inc("sequence", 1),
                options().returnNew(true).upsert(true),
                CustomSequence.class);
        return counter.getSequence();
    }
}
