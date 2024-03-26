package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "car")
public class Car implements Serializable {
   @OneToOne()
   @JoinColumn(name = "id")
   @MapsId
   private User user;
   @Column(name = "model")
   private String model;
   @Column(name = "series")
   private int series;
   @Id
   private Long id;

   public Car() {
   }

   public Car(String model, int series) {
      this.model = model;
      this.series = series;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public void setSeries(int series) {
      this.series = series;
   }

   public User getUser() {
      return user;
   }

   public String getModel() {
      return model;
   }

   public int getSeries() {
      return series;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return id;
   }
}
