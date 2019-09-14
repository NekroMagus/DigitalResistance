package com.digital.resistance.dao;

import com.digital.resistance.domain.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommodityDao extends JpaRepository<Commodity, Long> {
}
