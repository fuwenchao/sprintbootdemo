package me.wenchaofu.demospringboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄查询女生
    public Girl findByAge(Integer age);
}
