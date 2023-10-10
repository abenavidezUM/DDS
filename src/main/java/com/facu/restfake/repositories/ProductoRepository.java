package com.facu.restfake.repositories;



import com.facu.restfake.entities.Product;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface ProductoRepository extends BaseRepository<Product, Long>{
    //Puedes crear una consulta personalizada en tu repositorio ProductoRepository para buscar y
    // filtrar por el campo price en la base de datos,buscando los productos cuyo precio sea mayor
    // a 1000. Puedes hacerlo utilizando la anotación @Query y JPQL de la siguiente manera:


    @Query("SELECT p FROM Product p WHERE p.price > :precioMinimo")
    List<Product> buscarPorPrecioMayorA(@Param("precioMinimo") Double precioMinimo);

    @Query(value = "SELECT * FROM Product WHERE Product.precio_compra > :precioMinimo", nativeQuery = true)
    List<Product> buscarPorPrecioMayorA1(@Param("precioMinimo") Double precioMinimo);



    //Puedes crear una consulta personalizada en tu repositorio ProductoRepository para buscar y
    //filtrar por el campo price en la base de datos, buscando los productos cuyo precio sea mayor a 1000 y menor que 5000.
    // Puedes hacerlo utilizando la anotación @Query y JPQL de la siguiente manera:

    @Query("SELECT p FROM Product p WHERE p.price > :precioMinimo AND p.price < :precioMaximo")
    List<Product> buscarPorPrecioEntre(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);
    @Query(value = "SELECT * FROM Product WHERE Product.precio_compra > :precioMinimo AND Product.precio_compra < :precioMaximo", nativeQuery = true)
    List<Product> buscarPorPrecioEntre1(@Param("precioMinimo") Double precioMinimo, @Param("precioMaximo") Double precioMaximo);
}

