// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.medisaas.models;

import com.aliyun.tea.*;

public class Errors extends TeaModel {
    // 在 dataList 中的位置（0-based），方便定位是哪条数据出了问题
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("index")
    @Validation(required = true)
    public Long index;

    // 被拒绝数据的 dataId
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("dataid")
    @Validation(required = true)
    public String dataid;

    // 拒绝原因
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    public static Errors build(java.util.Map<String, ?> map) throws Exception {
        Errors self = new Errors();
        return TeaModel.build(map, self);
    }

    public Errors setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public Errors setDataid(String dataid) {
        this.dataid = dataid;
        return this;
    }
    public String getDataid() {
        return this.dataid;
    }

    public Errors setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
