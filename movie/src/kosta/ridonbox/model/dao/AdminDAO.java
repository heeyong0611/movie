package kosta.ridonbox.model.dao;

import java.sql.SQLException;

import kosta.ridonbox.model.dto.BranchDTO;
import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public interface AdminDAO {
	
	/**
	 * �̺�Ʈ ���
	 * @param evetDAO 
	 * @return boolean : true - ����, false - ����
	 */
	public boolean evetInsert(EventDTO evetDTO) throws SQLException;
	
	/**
	 * �̺�Ʈ ������Ʈ
	 * @param evetNo (pk)
	 * @return EventDTO (������ dto�� �Ѱܹ޾� ���)
	 */
	public EventDTO evetUpdate(int evetNo) throws SQLException;

	/**
	 * �̺�Ʈ ����
	 * @param evetNo (pk)
	 * @return boolean : true - ����, false - ����
	 */
	public boolean evetDelete(int evetNo) throws SQLException;

	/**
	 * ��ȭ ���
	 * @param MovieDTO
	 * @return boolean : true - ����, false - ����
	 */
	public boolean movieInsert(MovieDTO movieDTO) throws SQLException;

	/**
	 * ��ȭ ����
	 * @param movieNo (pk)
	 * @return boolean : true - ����, false - ����
	 */
	public boolean movieUpdate(int movieNo) throws SQLException;

	/**
	 * �� �ð�ǥ ���� ���
	 * @param BranchDTO 
	 * @return boolean : true - ����, false - ����
	 */
	public boolean branchInsert(BranchDTO branchDTO) throws SQLException;

	/**
	 * �� �ð�ǥ ���� ����
	 * @param branchNo (pk) //����Ű�� �����ϴ°� ����
	 * @return boolean : true - ����, false - ����
	 */
	public BranchDTO branchUpdate(int branchNo) throws SQLException;


}
