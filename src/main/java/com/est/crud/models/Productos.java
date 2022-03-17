package com.est.crud.models;

import com.mongodb.client.MongoClient;
import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Empty;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
@Data
@Document("productos")
public class Productos{

    private String id;

    private String name;

    private LocalDate expiry_date;

}
