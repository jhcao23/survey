package org.touchmars.survey.repository.mongo;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.touchmars.survey.model.mongo.EventLog;

public interface EventLogRepository extends MongoRepository<EventLog, BigInteger> {

}
