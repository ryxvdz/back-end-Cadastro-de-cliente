package controller;


import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAllClientes(){
        return clienteRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Cliente> getCLienteById(@PathVariable Long id){
        return clienteRepository.findById(id);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails){
        Cliente cliente = clienteRepository.findById(id).orElseThrow();
        cliente.setNome(clienteDetails.getNome());
        cliente.setEmail(clienteDetails.getEmail());
        cliente.setTelefone(cliente.getTelefone());

        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
    }

}
