package com.example.demo.Spotbustersongscollection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class SpotBusterSongsController {
	@Autowired
	SpotBusterSongDao spotBusterSongDao;

	@RequestMapping("getSpotBusterSongs")
	public List getSongs() {

		List list = null;

		list = spotBusterSongDao.findAll();
		System.err.println(list);

		return !list.isEmpty() ? list : new ArrayList();

	}

}
