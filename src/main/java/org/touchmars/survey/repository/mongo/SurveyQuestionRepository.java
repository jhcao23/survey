/**
 * 
 */
package org.touchmars.survey.repository.mongo;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.touchmars.survey.model.mongo.SurveyQuestion;

/**
 * @author John.Cao
 *
 */
public interface SurveyQuestionRepository extends
		MongoRepository<SurveyQuestion, BigInteger> {

}
