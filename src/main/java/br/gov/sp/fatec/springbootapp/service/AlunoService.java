package br.gov.sp.fatec.springbootapp.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springbootapp.entity.Aluno;
import br.gov.sp.fatec.springbootapp.repository.AlunoRepository;

@Service
public class AlunoService {

@Autowired
private AlunoRepository alunoRepository;

public Aluno cadastrarAluno(Aluno aluno) {
    return alunoRepository.save(aluno);
}

public List<Aluno> listarTodosAlunos() {
    return alunoRepository.findAll();
}


public List<Aluno> buscarAlunosPorPalavraChaveOuData(String keyword, LocalDateTime maxDate) {
    return alunoRepository.findByKeywordOrDataMatriculaBefore(keyword.toLowerCase(), maxDate);
}


    
}
