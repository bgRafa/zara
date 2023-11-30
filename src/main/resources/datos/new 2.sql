INSERT INTO PRICES (BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRODUCT_ID,PRIORITY,PRICE,CURR)
 VALUES (1, '2020-06-14 00.00.00', '2020-12-31 23.59.59',1,35455,0,35.50,'EUR');
INSERT INTO PRICES (BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRODUCT_ID,PRIORITY,PRICE,CURR)
 VALUES (1, '2020-06-14 15.00.00', '2020-06-14 18.30.00',2,35455,1,25.45,'EUR');
INSERT INTO PRICES (BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRODUCT_ID,PRIORITY,PRICE,CURR)
 VALUES (1, '2020-06-15 00.00.00', '2020-06-15 11.00.00',3,35455,1,30.50,'EUR');
INSERT INTO PRICES (BRAND_ID,START_DATE,END_DATE,PRICE_LIST,PRODUCT_ID,PRIORITY,PRICE,CURR)
 VALUES (1, '2020-06-15 16.00.00', '2020-12-31 23.59.59',4,35455,1,38.95,'EUR');
 
 
 
 
 PRICES
-------
 
BRAND_ID         START_DATE                                    END_DATE                        PRICE_LIST                   PRODUCT_ID  PRIORITY                 PRICE           CURR
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1         2020-06-14-00.00.00                        2020-12-31-23.59.59                        1                        35455                0                        35.50            EUR
1         2020-06-14-15.00.00                        2020-06-14-18.30.00                        2                        35455                1                        25.45            EUR
1         2020-06-15-00.00.00                        2020-06-15-11.00.00                        3                        35455                1                        30.50            EUR
1         2020-06-15-16.00.00                        2020-12-31-23.59.59                        4                        35455                1                        38.95            EUR
 
 -          Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
-          Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
-          Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
-          Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
-          Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)

 Test1
 SELECT P.* FROM PRICES P
 where 1=1   
 AND P.START_DATE  <= '2020-06-14 10.00.00' 
 AND P.END_DATE  >= '2020-06-14 10.00.00'  
 AND P.BRAND_ID = 1
 AND P.PRODUCT_ID = 35455   
 ORDER BY P.PRIORITY DESC 
 
35.50	1	2020-12-31 23:59:59	1	0	35455	2020-06-14 00:00:00	EUR
 
 
  Test2
 SELECT P.* FROM PRICES P
 where 1=1   
 AND P.START_DATE  <= '2020-06-14 16.00.00' 
 AND P.END_DATE  >= '2020-06-14 16.00.00' 
 AND P.BRAND_ID = 1
 AND P.PRODUCT_ID = 35455   
 ORDER BY P.PRIORITY DESC  
 
25.45	1	2020-06-14 18:30:00	2	1	35455	2020-06-14 15:00:00	EUR
35.50	1	2020-12-31 23:59:59	1	0	35455	2020-06-14 00:00:00	EUR
 
 Test3
 SELECT P.* FROM PRICES P
 where 1=1   
 AND P.START_DATE  <= '2020-06-14 21.00.00' 
 AND P.END_DATE  >= '2020-06-14 21.00.00'   
 AND P.BRAND_ID = 1
 AND P.PRODUCT_ID = 35455   
 ORDER BY P.PRIORITY DESC  
 
 35.50	1	2020-12-31 23:59:59	1	0	35455	2020-06-14 00:00:00	EUR
 
 
  Test4
 SELECT P.* FROM PRICES P
 where 1=1   
 AND P.START_DATE  <= '2020-06-15 10.00.00' 
 AND P.END_DATE  >= '2020-06-15 10.00.00'  
 AND P.BRAND_ID = 1
 AND P.PRODUCT_ID = 35455   
 ORDER BY P.PRIORITY DESC  
 
30.50	1	2020-06-15 11:00:00	3	1	35455	2020-06-15 00:00:00	EUR
35.50	1	2020-12-31 23:59:59	1	0	35455	2020-06-14 00:00:00	EUR

  Test5
 SELECT P.* FROM PRICES P
 where 1=1   
 AND P.START_DATE  <= '2020-06-16 21.00.00' 
 AND P.END_DATE  >= '2020-06-16 21.00.00'  
 AND P.BRAND_ID = 1
 AND P.PRODUCT_ID = 35455   
 ORDER BY P.PRIORITY DESC 
 
38.95	1	2020-12-31 23:59:59	4	1	35455	2020-06-15 16:00:00	EUR
35.50	1	2020-12-31 23:59:59	1	0	35455	2020-06-14 00:00:00	EUR