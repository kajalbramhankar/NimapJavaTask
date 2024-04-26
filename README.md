About Nimap Task Project

NP is Project I have uploaded on git as my submission for task

In this project there is a project architecture like

model                     Category                          Product
|                            |                                |
Dao                      CategoryDAo                      ProductDao
|                            |                                |
Service                  CategoryService                ProductService
|                            |                                |
Controller               CategoryServiceImpl            ProductServiceImpl
                              |                                |
                         CategoryController              ProductController


Category:->
1) Insert: 
  To insert a new record there is link   :    http://localhost:8080/api/categories
    (It takes whole category object eg. cname, cid as parameter through request body)
2) Find All:
   To show all records there is link    :     http://localhost:8080/api/categories/page=3

3) delete:
   To delete a record there is link     :    http://localhost:8080/api/categories
  (It takes category id i.e cid into request param    eg. http://localhost:8080/api/categories?a=2 )

4) update:
   To update a record there is link  :     http://localhost:8080/api/categories
   (It takes cid as request param and whole category object as request body  eg. http://localhost:8080/api/categories?a=2
   {
    "cname": "cosmetic",
    "id": 2
}
)

Product:->
1) To insert a new record there is link     :     http://localhost:8080/api/products

 2) Find All:
   To show all records there is link    :     http://localhost:8080/api/products/page=2

3) delete:
   To delete a record there is link     :    http://localhost:8080/api/products
  (It takes products id i.e pid into request param    eg. http://localhost:8080/api/products?a=1 )

4) update:
   To update a record there is link  :     http://localhost:8080/api/products
