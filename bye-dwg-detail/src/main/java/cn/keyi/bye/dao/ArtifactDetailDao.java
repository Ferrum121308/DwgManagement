package cn.keyi.bye.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import cn.keyi.bye.model.ArtifactDetail;

public interface ArtifactDetailDao extends JpaRepository<ArtifactDetail, Long> {
	
	// 根据指定的工件ID查询其包含的下层（单层）工件组成明细
	List<ArtifactDetail> findByMasterArtifactId(Long masterId);	
	// 根据指定的工件ID以分页的形式查询其包含的下层（单层）工件组成明细
	Page<ArtifactDetail> findByMasterArtifactId(Long masterId, Pageable pageable);	
	// 根据parentArtifactId和artifactId查询明细记录
	List<ArtifactDetail> findByMasterArtifactIdAndSlaveArtifactId(Long masterId, Long slaveId);
	// 根据parentArtifactCode和artifactCode查询明细记录
	List<ArtifactDetail> findByMasterArtifactCodeAndSlaveArtifactCode(String masterCode, String slaveCode);
	
}
