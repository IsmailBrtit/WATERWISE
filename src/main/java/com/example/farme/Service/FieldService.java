package com.example.farme.Service;

import com.example.farme.model.Field;
import com.example.farme.model.IrrigationScheduleResponse;

import java.util.List;

public interface FieldService {

    Field getFieldById(Long id);
    Field saveField(Field field);
    Field deleteField(Long id);
    Field updateField(Field field);
    List<Field> getAllFields();

    IrrigationScheduleResponse generateIrrigationSchedule(Long fieldId);

}
