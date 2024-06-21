// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class AcesProduct extends TeaModel {
    //  
    @NameInMap("cn_name")
    @Validation(required = true)
    public String cnName;

    //  
    @NameInMap("en_name")
    public String enName;

    //  
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 产品owner
    @NameInMap("owner")
    public String owner;

    // 产品创建时间
    @NameInMap("create_time")
    @Validation(required = true)
    public String createTime;

    // 产品修改时间
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    //  
    @NameInMap("description")
    public String description;

    //  
    @NameInMap("l1")
    public String l1;

    //  
    @NameInMap("l2")
    public String l2;

    public static AcesProduct build(java.util.Map<String, ?> map) throws Exception {
        AcesProduct self = new AcesProduct();
        return TeaModel.build(map, self);
    }

    public AcesProduct setCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }
    public String getCnName() {
        return this.cnName;
    }

    public AcesProduct setEnName(String enName) {
        this.enName = enName;
        return this;
    }
    public String getEnName() {
        return this.enName;
    }

    public AcesProduct setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AcesProduct setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public AcesProduct setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AcesProduct setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public AcesProduct setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AcesProduct setL1(String l1) {
        this.l1 = l1;
        return this;
    }
    public String getL1() {
        return this.l1;
    }

    public AcesProduct setL2(String l2) {
        this.l2 = l2;
        return this;
    }
    public String getL2() {
        return this.l2;
    }

}
