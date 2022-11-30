package zkb.graphql.test.demo.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import zkb.graphql.test.demo.model.Post;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {


    @QueryMapping
    public List<Post> recentPosts(@Argument int count, @Argument int offset) {
        Post post = new Post("345", "title", "text");
        List list = new ArrayList<>();
        list.add(post);
        return list;
    }
}
