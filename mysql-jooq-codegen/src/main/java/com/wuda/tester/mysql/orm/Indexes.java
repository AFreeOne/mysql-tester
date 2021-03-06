/*
 * This file is generated by jOOQ.
 */
package com.wuda.tester.mysql.orm;


import com.wuda.tester.mysql.orm.tables.Item;
import com.wuda.tester.mysql.orm.tables.ItemDescription;
import com.wuda.tester.mysql.orm.tables.ItemGeneral;
import com.wuda.tester.mysql.orm.tables.Store;
import com.wuda.tester.mysql.orm.tables.StoreGeneral;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>mysql_tester</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ITEM_FK_STORE_ID = Indexes0.ITEM_FK_STORE_ID;
    public static final Index ITEM_DESCRIPTION_FK_ITEM_ID = Indexes0.ITEM_DESCRIPTION_FK_ITEM_ID;
    public static final Index ITEM_DESCRIPTION_FK_ITEM_VARIATION_ID = Indexes0.ITEM_DESCRIPTION_FK_ITEM_VARIATION_ID;
    public static final Index ITEM_GENERAL_FK_ITEM_ID = Indexes0.ITEM_GENERAL_FK_ITEM_ID;
    public static final Index ITEM_GENERAL_FK_ITEM_VARIATION_ID = Indexes0.ITEM_GENERAL_FK_ITEM_VARIATION_ID;
    public static final Index STORE_FK_USER_ID = Indexes0.STORE_FK_USER_ID;
    public static final Index STORE_GENERAL_FK_STORE_ID = Indexes0.STORE_GENERAL_FK_STORE_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ITEM_FK_STORE_ID = Internal.createIndex("fk_store_id", Item.ITEM, new OrderField[] { Item.ITEM.STORE_ID }, false);
        public static Index ITEM_DESCRIPTION_FK_ITEM_ID = Internal.createIndex("fk_item_id", ItemDescription.ITEM_DESCRIPTION, new OrderField[] { ItemDescription.ITEM_DESCRIPTION.ITEM_ID }, false);
        public static Index ITEM_DESCRIPTION_FK_ITEM_VARIATION_ID = Internal.createIndex("fk_item_variation_id", ItemDescription.ITEM_DESCRIPTION, new OrderField[] { ItemDescription.ITEM_DESCRIPTION.ITEM_VARIATION_ID }, false);
        public static Index ITEM_GENERAL_FK_ITEM_ID = Internal.createIndex("fk_item_id", ItemGeneral.ITEM_GENERAL, new OrderField[] { ItemGeneral.ITEM_GENERAL.ITEM_ID }, false);
        public static Index ITEM_GENERAL_FK_ITEM_VARIATION_ID = Internal.createIndex("fk_item_variation_id", ItemGeneral.ITEM_GENERAL, new OrderField[] { ItemGeneral.ITEM_GENERAL.ITEM_VARIATION_ID }, false);
        public static Index STORE_FK_USER_ID = Internal.createIndex("fk_user_id", Store.STORE, new OrderField[] { Store.STORE.USER_ID }, false);
        public static Index STORE_GENERAL_FK_STORE_ID = Internal.createIndex("fk_store_id", StoreGeneral.STORE_GENERAL, new OrderField[] { StoreGeneral.STORE_GENERAL.STORE_ID }, false);
    }
}
