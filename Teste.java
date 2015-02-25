package demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value="/teste")
public class TesteController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(){
		return "Hello World!"
	}
        @RequestMapping(value="/alunos/{ra}",method=RequestMethod.GET)
        public Aluno getAluno(@PathVariable Integer ra){
                Aluno novo = new Aluno("Aluno Jr. "+ System.currentTimeMillis(), ra);
                return novo;	
	}
	@RequestMapping(value="/alunos",method=RequestMethod.POST)
        public String criarAluno(@RequestBody(required=true) Aluno novo) {
                return "Aluno de nome [" + novo.getNome() + "] recebido com imenso sucesso!";
	}
	
}