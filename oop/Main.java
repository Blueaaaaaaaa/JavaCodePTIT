SELECT 
    customers.customer_id,
    customers.first_name,
    customers.last_name,
    orders.order_id,
    orders.order_date,
    order_items.product_id,
    products.product_name,
    order_items.quantity,
    order_items.unit_price
FROM customers
INNER JOIN orders 
    ON customers.customer_id = orders.customer_id
INNER JOIN order_items
    ON orders.order_id = order_items.order_id 
INNER JOIN products
    ON order_items.product_id = products.product_id
WHERE orders.order_date >= '2023-01-01'
ORDER BY orders.order_date DESC;
