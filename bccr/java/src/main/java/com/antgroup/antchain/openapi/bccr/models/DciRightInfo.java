// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DciRightInfo extends TeaModel {
    // 作品权利范围
    /**
     * <strong>example:</strong>
     * <p>PUBLICATION</p>
     */
    @NameInMap("right_scope")
    @Validation(required = true)
    public String rightScope;

    // 权利取得方式
    /**
     * <strong>example:</strong>
     * <p>ORIGINAL</p>
     */
    @NameInMap("right_obtain_way")
    @Validation(required = true)
    public String rightObtainWay;

    // 权利归属方式
    /**
     * <strong>example:</strong>
     * <p>PERSONAL</p>
     */
    @NameInMap("ownership_way")
    @Validation(required = true)
    public String ownershipWay;

    public static DciRightInfo build(java.util.Map<String, ?> map) throws Exception {
        DciRightInfo self = new DciRightInfo();
        return TeaModel.build(map, self);
    }

    public DciRightInfo setRightScope(String rightScope) {
        this.rightScope = rightScope;
        return this;
    }
    public String getRightScope() {
        return this.rightScope;
    }

    public DciRightInfo setRightObtainWay(String rightObtainWay) {
        this.rightObtainWay = rightObtainWay;
        return this;
    }
    public String getRightObtainWay() {
        return this.rightObtainWay;
    }

    public DciRightInfo setOwnershipWay(String ownershipWay) {
        this.ownershipWay = ownershipWay;
        return this;
    }
    public String getOwnershipWay() {
        return this.ownershipWay;
    }

}
