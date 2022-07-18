package com.mysite.sbb.Reply.Repository;

import com.mysite.sbb.Reply.domain.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
}
