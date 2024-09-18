package framework.demo;

import javax.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter

public class Thing {
   private int grape;
   private String robot;
   private String Shark; 
}
