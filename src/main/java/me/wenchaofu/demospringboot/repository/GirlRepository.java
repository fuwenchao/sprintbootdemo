package me.wenchaofu.demospringboot.repository;

import me.wenchaofu.demospringboot.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄查询女生
    public Girl findByAge(Integer age);
}
