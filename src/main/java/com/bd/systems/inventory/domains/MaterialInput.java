package com.bd.systems.inventory.domains;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "material_input")
public class MaterialInput {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDate date;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ItemReceived> items;

    private int numberNote;

    private boolean deleted;

    public MaterialInput() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<ItemReceived> getItems() {
        return items;
    }

    public void setItems(List<ItemReceived> items) {
        this.items = items;
    }

    public int getNumberNote() {
        return numberNote;
    }

    public void setNumberNote(int numberNote) {
        this.numberNote = numberNote;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
