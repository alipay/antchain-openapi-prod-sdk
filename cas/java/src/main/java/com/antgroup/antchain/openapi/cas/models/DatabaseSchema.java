// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DatabaseSchema extends TeaModel {
    // 字符集
    @NameInMap("char_set")
    @Validation(required = true)
    public String charSet;

    // 数量
    @NameInMap("count")
    public Long count;

    // 是否自动生成名称。默认为 true
    @NameInMap("is_auto_name")
    public Boolean isAutoName;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 序列号是否连续。默认为 false
    @NameInMap("is_serial")
    public Boolean isSerial;

    public static DatabaseSchema build(java.util.Map<String, ?> map) throws Exception {
        DatabaseSchema self = new DatabaseSchema();
        return TeaModel.build(map, self);
    }

    public DatabaseSchema setCharSet(String charSet) {
        this.charSet = charSet;
        return this;
    }
    public String getCharSet() {
        return this.charSet;
    }

    public DatabaseSchema setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DatabaseSchema setIsAutoName(Boolean isAutoName) {
        this.isAutoName = isAutoName;
        return this;
    }
    public Boolean getIsAutoName() {
        return this.isAutoName;
    }

    public DatabaseSchema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DatabaseSchema setIsSerial(Boolean isSerial) {
        this.isSerial = isSerial;
        return this;
    }
    public Boolean getIsSerial() {
        return this.isSerial;
    }

}
