// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class RoyaltyEntity extends TeaModel {
    // 分账接收方类型
    /**
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 分账接收方账号
    /**
     * <strong>example:</strong>
     * <p>2088324168543</p>
     */
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 分账接收方真实姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    // 分账关系描述
    /**
     * <strong>example:</strong>
     * <p>分账给测试商户</p>
     */
    @NameInMap("memo")
    public String memo;

    public static RoyaltyEntity build(java.util.Map<String, ?> map) throws Exception {
        RoyaltyEntity self = new RoyaltyEntity();
        return TeaModel.build(map, self);
    }

    public RoyaltyEntity setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RoyaltyEntity setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public RoyaltyEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RoyaltyEntity setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
