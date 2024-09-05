package dk.tec.todolistapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoitem")
public class TodoItemController {

    TodoItemRepository repository;

    TodoItemController(TodoItemRepository repository){
        this.repository = repository;
    }

    @PostMapping()
    int create(@RequestBody TodoItem todoItem){
        repository.save(todoItem);
        return todoItem == null ? -1 : todoItem.getId();
    }

    @GetMapping("/{id}")
    TodoItem read(@PathVariable int id){
        return repository.findById(id).get();
    }

    @GetMapping()
    List<TodoItem> getAll(){
        return repository.findAll();
    }

    @PutMapping()
    void update(@RequestBody TodoItem todoItem){
        repository.save(todoItem);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
