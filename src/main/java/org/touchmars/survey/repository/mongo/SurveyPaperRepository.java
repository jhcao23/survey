/**
 * 
 */
package org.touchmars.survey.repository.mongo;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.touchmars.survey.model.mongo.SurveyPaper;

/**
 * @author John.Cao
 *
 */
public interface SurveyPaperRepository extends
		MongoRepository<SurveyPaper, BigInteger> {

}
