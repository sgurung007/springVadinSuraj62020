package com.example.demo;

import com.example.demo.backend.Person;
import com.example.demo.backend.RepositoryPerson;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route
public class MainView extends VerticalLayout {
    private final RepositoryPerson repo;
    final Grid<Person> grid;

    public MainView(RepositoryPerson repo) {
        this.repo = repo;
        this.grid = new Grid<>(Person.class);
        listCustomers();


        TextField write_your_name = new TextField("What is your name.");
        Button button = new Button("click me");
        button.addClickListener(click -> Notification.show("Click is clicked!!"));
        Label label = new Label("where is the love");
        Label label1 = new Label("hello");
        TextField firstName = new TextField("firstName");
        TextField lastName = new TextField("lastName");
        Button button1 = new Button("Add to database");
        button1.addClickListener(e->addToDateBase());

        add(write_your_name, button, label, label1, grid);
    }

    private void addToDateBase() {
    }


    private void listCustomers() {
        grid.setItems(repo.findAll());
    }
}
