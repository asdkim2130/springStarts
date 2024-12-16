package crud;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @GetMapping("/comments")
    String hello(){

        return "Hello Spring!";
    }

    @PostMapping("/comments")
    String goodBye(){

        return "Bye Spring!";
    }

    @PostMapping("/products")
    String postProduct(){

        return "상품생성";
    }

    @GetMapping("/products")
    String getProducts (){

        return "상품조회";
    }

//    @PostMapping("/products/321")
//    String putProducts(){
//
//        return "상품수정";
//    }

    @PutMapping("/products/{productID}")  //321대신 변수처리 해서 중괄호
    String putProducts(@PathVariable(name = "productId") Long id){

        return "상품수정 ID" + id;
    }

    //url에서 들어오는 값을 파라미터에 넣는 것



    @DeleteMapping("/products/125")
    String deleteMapping(){

        return "상품제거";
    }


}

