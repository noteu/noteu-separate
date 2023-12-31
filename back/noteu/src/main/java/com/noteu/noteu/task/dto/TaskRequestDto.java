package com.noteu.noteu.task.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * DTO for {@link com.noteu.noteu.task.entity.Task}
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskRequestDto {
    String taskTitle;
    String taskContent;
    LocalDateTime deadLine;

}