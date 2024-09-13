package com.kodcore.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;
/**
 *
 * ID
 * Usuário (ID Usuário)
 * Descrição
 * Título
 * Data de inicio
 * Data de término
 * Prioridade
 */

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id, idUser;
    private String description, priority;

    @Column(length = 40)
    private String title;
    private LocalDateTime startAt, endAt;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
