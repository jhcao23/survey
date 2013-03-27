/**
 * 
 */
package org.touchmars.survey.repository.mongo;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.touchmars.survey.model.mongo.SurveyAnswer;

/**
 * @author John.Cao
 *
 */
public interface SurveyAnswerRepository extends
		MongoRepository<SurveyAnswer, BigInteger> {

}
