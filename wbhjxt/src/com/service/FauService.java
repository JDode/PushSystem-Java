package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.EquipmentDao;
import com.dao.FaultDao;
import com.vo.Equipment;
import com.vo.Fault;

@Component("fauService")
public class FauService {
	private FaultDao fauDao;

	public FaultDao getFaultDao() {
		return fauDao;
	}

	@Resource(name="fauDao")
	public void setEquDao(FaultDao fauDao) {
		this.fauDao = fauDao;
	}
	//����
			public void add(Fault Fault){
				fauDao.add(Fault);
			}
			
			//ɾ��
			public void delete(Fault Fault){
				fauDao.delete(Fault);
			}
			
			//�޸�
			public void update(Fault Fault){
				fauDao.update(Fault);
			}
			
			//��ѯȫ��
			public List<Fault > getAll(){
				return fauDao.loadAll();
			}
			
			//����Ų�ѯ
			public Fault getById(int id){
				return fauDao.findById(id);
			}
			
			//��ҳ��ѯ
			public List<Fault> getByPage(final int start,final int length){
				return fauDao.getByPage(start, length);
			}
			
			//�ؼ��ַ�ҳ��ѯ
			public List<Fault> queryProByKey(final int start,final int length,final String name){
				return fauDao.queryFauByKey(start, length, name);
			}
			
			//�ؼ��ֲ�ѯ
			public List<Fault> queryByKey(String name) {
				return fauDao.queryByKey(name);
			}
			
		}
