package br.com.phamtecnologia.repositories;

import br.com.phamtecnologia.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, UUID> {

    @Query("""
            SELECT 
                p
            FROM 
                Profile p
            WHERE 
                p.name = :name
            """)
    Profile findByName(@Param("name") String name);
}
