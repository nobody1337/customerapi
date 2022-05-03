package com.example.customerapi.repository;

import com.example.customerapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
/*Das Repository ist ein Interface, was uns einige Methoden bereitstellt damit
  wir Queries an die Datenbank schicken können.
*/
                                                        //<Entität ,PrimaryKey>
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
