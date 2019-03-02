package com.example.demo.Spotbustersongscollection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotBusterSongDao extends JpaRepository<SpotBusterSongsPojo, Long>  {

}
