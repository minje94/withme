package com.withme.service;

import java.util.List;

import com.withme.vo.HashtagVO;
import com.withme.vo.PartyVO;
import com.withme.vo.PartylistVO;
import com.withme.vo.PickJoinListVO;
import com.withme.vo.SearchCriteria;

public interface PartyService {

	// 게시글 작성
	public void write(PartyVO partyVO) throws Exception;
	
	// 게시글 조회
	public List<PartylistVO> list(SearchCriteria scri) throws Exception;
	
	// 게시글 총 갯수
	public int listCount(SearchCriteria scri) throws Exception;
	
	// 게시물 목록 조회
	public PartyVO read(int party_id) throws Exception;
	
	// 해쉬태그 개수
	public int hashCount(HashtagVO hashtagVO) throws Exception;
	
	// 파티생성시 host1인에 pickjoin테이블에 생성
	public void pjHost(PartylistVO partylistVO) throws Exception;
	
	// 파티 생성시의 party_id 가져오기 완전 불안정함
	public int getpid() throws Exception;
	
	// 가장 핫한 파티 찾기
	public PartylistVO partyHot(SearchCriteria scri) throws Exception;
	
	// 가장 인싸인 파티 찾기
	public PartylistVO partyInsa(SearchCriteria scri) throws Exception;
	
	// pick, join한 목록조회
	public List<PickJoinListVO> pickjoinlist(PickJoinListVO pickjoinlistVO) throws Exception;
	
	// 마이페이지 일정 조회
	public List<PartyVO> mylist(String userID) throws Exception;
}
