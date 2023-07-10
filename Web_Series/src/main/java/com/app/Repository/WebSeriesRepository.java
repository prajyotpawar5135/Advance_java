package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dto.WebSeriesDTO;
import com.app.entities.WebSeries;

public interface WebSeriesRepository extends JpaRepository<WebSeries, Long>{


}
