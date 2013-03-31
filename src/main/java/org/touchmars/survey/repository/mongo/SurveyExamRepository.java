/**
 * 
 */
package org.touchmars.survey.repository.mongo;

import java.math.BigInteger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.touchmars.survey.model.mongo.SurveyExam;

/**
 * @author John.Cao
 *
 */
public interface SurveyExamRepository extends
		MongoRepository<SurveyExam, BigInteger> {

	public Page<SurveyExam> findByOwnerId(BigInteger ownerId, Pageable pageable);
	
}
