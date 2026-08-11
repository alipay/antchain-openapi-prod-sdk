// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class Bound extends TeaModel {
    // 边界版本号；eKYT 范围匹配要求使用 x.y.z 数字版本格式。
    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version_no")
    public String versionNo;

    // 是否包含该边界；true 表示闭区间，false 表示开区间。
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("inclusive")
    public Boolean inclusive;

    public static Bound build(java.util.Map<String, ?> map) throws Exception {
        Bound self = new Bound();
        return TeaModel.build(map, self);
    }

    public Bound setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public Bound setInclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }
    public Boolean getInclusive() {
        return this.inclusive;
    }

}
