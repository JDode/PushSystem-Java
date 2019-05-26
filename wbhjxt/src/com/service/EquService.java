package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.EquipmentDao;
import com.vo.Employee;
import com.vo.Equipment;



@Component("equService")
public class EquService {
	private EquipmentDao equDao;

	public EquipmentDao getEquDao() {
		return equDao;
	}

	@Resource(name="equDao")
	public void setEquDao(EquipmentDao equDao) {
		this.equDao = equDao;
	}
	
	//����
		public void add(Equipment Equipment){
			equDao.add(Equipment);
		}
		
		//ɾ��
		public void delete(Equipment Equipment){
			equDao.delete(Equipment);
		}
		
		//�޸�
		public void update(Equipment Equipment){
			equDao.update(Equipment);
		}
		
		//��ѯȫ��
		public List<Equipment > getAll(){
			return equDao.loadAll();
		}
		
		//����Ų�ѯ
		public Equipment getById(int id){
			return equDao.findById(id);
		}
		
		//��ҳ��ѯ
		public List<Equipment> getByPage(final int start,final int length){
			return equDao.getByPage(start, length);
		}
		
		//�ؼ��ַ�ҳ��ѯ
		public List<Equipment> queryProByKey(final int start,final int length,final String name){
			return equDao.queryEquByKey(start, length, name);
		}
		
		//�ؼ��ֲ�ѯ
		public List<Equipment> queryByKey(String name) {
			return equDao.queryByKey(name);
		}
		
	}

