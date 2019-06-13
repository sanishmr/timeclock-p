package com.sanish.timeclock.repository;

import com.sanish.timeclock.model.Punch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("punchRepository")
public interface PunchRepository extends JpaRepository<Punch, Integer> {


}
