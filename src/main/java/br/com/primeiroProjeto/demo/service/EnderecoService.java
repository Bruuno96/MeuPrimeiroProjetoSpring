package br.com.primeiroProjeto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeiroProjeto.demo.model.Endereco;
import br.com.primeiroProjeto.demo.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco create(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
}
