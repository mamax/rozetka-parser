package com.parser.rozetka.categories;

import lombok.Data;

import java.util.Date;

public @Data class Product {

    private int id_product;
    private int id_supplier;
    private int id_manufacturer;
    private int id_category_default;
    private int id_shop_default;
    private int id_tax_rules_group;
    private boolean on_sale;
    private boolean online_only;
    private String ean13;
    private String upc;
    private long ecotax;
    private int quantity;
    private int minimal_quantity;
    private long price;
    private long wholesale_price;
    private String unity;
    private long unit_price_ratio;
    private long additional_shipping_cost;
    private String reference;
    private String location;
    private long width;
    private long height;
    private long depth;
    private long weight;
    private int out_of_stock;
    private boolean quantity_discount;
    private boolean customizable;
    private boolean uploadable_files;
    private boolean text_fields;
    private boolean active;
    private RedirectType redirect_type;
    private int id_product_redirected;
    private boolean avaliable_for_order;
    private Date avaliable_date;
    private Condition condition;
    private boolean show_price;
    private boolean indexed;
    private Visibility visibility;
    private boolean cache_is_pack;
    private boolean cache_has_attachments;
    private boolean is_virtual;
    private int cache_default_attribute;
    private Date date_add;
    private Date date_upd;
    private boolean advanced_stock_management;

    public Product(int id_product, int id_supplier, int id_manufacturer, int id_category_default, int id_shop_default, int id_tax_rules_group, boolean on_sale, boolean online_only, String ean13, String upc, long ecotax, int quantity, int minimal_quantity, long price, long wholesale_price, String unity, long unit_price_ratio, long additional_shipping_cost, String reference, String location, long width, long height, long depth, long weight, int out_of_stock, boolean quantity_discount, boolean customizable, boolean uploadable_files, boolean text_fields, boolean active, RedirectType redirect_type, int id_product_redirected, boolean avaliable_for_order, Date avaliable_date, Condition condition, boolean show_price, boolean indexed, Visibility visibility, boolean cache_is_pack, boolean cache_has_attachments, boolean is_virtual, int cache_default_attribute, Date date_add, Date date_upd, boolean advanced_stock_management) {
        this.id_product = id_product;
        this.id_supplier = id_supplier;
        this.id_manufacturer = id_manufacturer;
        this.id_category_default = id_category_default;
        this.id_shop_default = id_shop_default;
        this.id_tax_rules_group = id_tax_rules_group;
        this.on_sale = on_sale;
        this.online_only = online_only;
        this.ean13 = ean13;
        this.upc = upc;
        this.ecotax = ecotax;
        this.quantity = quantity;
        this.minimal_quantity = minimal_quantity;
        this.price = price;
        this.wholesale_price = wholesale_price;
        this.unity = unity;
        this.unit_price_ratio = unit_price_ratio;
        this.additional_shipping_cost = additional_shipping_cost;
        this.reference = reference;
        this.location = location;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.out_of_stock = out_of_stock;
        this.quantity_discount = quantity_discount;
        this.customizable = customizable;
        this.uploadable_files = uploadable_files;
        this.text_fields = text_fields;
        this.active = active;
        this.redirect_type = redirect_type;
        this.id_product_redirected = id_product_redirected;
        this.avaliable_for_order = avaliable_for_order;
        this.avaliable_date = avaliable_date;
        this.condition = condition;
        this.show_price = show_price;
        this.indexed = indexed;
        this.visibility = visibility;
        this.cache_is_pack = cache_is_pack;
        this.cache_has_attachments = cache_has_attachments;
        this.is_virtual = is_virtual;
        this.cache_default_attribute = cache_default_attribute;
        this.date_add = date_add;
        this.date_upd = date_upd;
        this.advanced_stock_management = advanced_stock_management;
    }

    private String name;


}
