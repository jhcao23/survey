/**
 * 
 */
package org.touchmars.survey.repository.mongo;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.touchmars.survey.model.mongo.SurveyExam;

/**
 * @author John.Cao
 *
 */
public interface SurveyExamRepository extends
		MongoRepository<SurveyExam, BigInteger> {

}
