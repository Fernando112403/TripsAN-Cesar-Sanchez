package com.trips.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trips.models.Rol;

@Service
public class RolServiceImpl implements IRolService {

	List<Rol> lista = null;
	
	public RolServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
		
		lista = new LinkedList<Rol>();
		
		try {
			Rol rol1 = new Rol();
			rol1.setId(1);
			rol1.setNombre("Admin");
			rol1.setDescripcion("Este rol administra a todos los roles");
			rol1.setEstado(null);
			rol1.setFecha(sdf.parse("10-05-2022"));
		
			Rol rol2 = new Rol();
			rol2.setId(2);
			rol2.setNombre("Vendedor");
			rol2.setDescripcion("Este rol vende al usuario final");
			rol2.setEstado(null);
			rol2.setFecha(sdf.parse("10-06-2026"));
		
			Rol rol3 = new Rol();
			rol3.setId(3);
			rol3.setNombre("Admin de Marketing");
			rol3.setDescripcion("Este rol analiza el marketing digital");
			rol3.setEstado(null);
			rol3.setFecha(sdf.parse("21-05-2024"));
			
			
			lista.add(rol1);
			lista.add(rol2);
			lista.add(rol3);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

	}
	

	@Override
	public List<Rol> buscarTodo() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Rol buscarPorId(Integer idRol) {
		
		for (Rol rol : lista)
			if (rol.getId()==idRol)
				return rol;
		
		return null;
	}

}
