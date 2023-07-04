// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class SQLMigration extends TeaModel {
    // 变更名称
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 产品升级变更sql
    @NameInMap("upgrade")
    @Validation(required = true)
    public String upgrade;

    // 回滚变更sql
    @NameInMap("downgrade")
    public String downgrade;

    public static SQLMigration build(java.util.Map<String, ?> map) throws Exception {
        SQLMigration self = new SQLMigration();
        return TeaModel.build(map, self);
    }

    public SQLMigration setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SQLMigration setUpgrade(String upgrade) {
        this.upgrade = upgrade;
        return this;
    }
    public String getUpgrade() {
        return this.upgrade;
    }

    public SQLMigration setDowngrade(String downgrade) {
        this.downgrade = downgrade;
        return this;
    }
    public String getDowngrade() {
        return this.downgrade;
    }

}
