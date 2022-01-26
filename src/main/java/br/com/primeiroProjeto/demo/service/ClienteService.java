package br.com.primeiroProjeto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeiroProjeto.demo.exception.ResourceNotFoundException;
import br.com.primeiroProjeto.demo.model.Cliente;
import br.com.primeiroProjeto.demo.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository; 
	
	public Cliente create(Cliente c) {
		return clienteRepository.save(c); 
	}
	
	public Cliente update(Cliente c, Long id) throws ResourceNotFoundException {
//		Cliente cliente = new Cliente();
		Cliente found =  clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente nao encontrado"));
		found.setEmail(c.getEmail());
		found.setNome(c.getNome());
		found.setDataNascimento(c.getDataNascimento());
		found.setProdutos(c.getProdutos());
		return clienteRepository.save(c);
	}
	
	
	
}
