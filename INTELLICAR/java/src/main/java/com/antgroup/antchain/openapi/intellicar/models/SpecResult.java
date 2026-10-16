// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class SpecResult extends TeaModel {
    // 下一页数据拉取传递的值
    /**
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("after_spec_id")
    @Validation(required = true)
    public String afterSpecId;

    // 车型Id列表
    @NameInMap("spec_list")
    @Validation(required = true)
    public java.util.List<SpecList> specList;

    public static SpecResult build(java.util.Map<String, ?> map) throws Exception {
        SpecResult self = new SpecResult();
        return TeaModel.build(map, self);
    }

    public SpecResult setAfterSpecId(String afterSpecId) {
        this.afterSpecId = afterSpecId;
        return this;
    }
    public String getAfterSpecId() {
        return this.afterSpecId;
    }

    public SpecResult setSpecList(java.util.List<SpecList> specList) {
        this.specList = specList;
        return this;
    }
    public java.util.List<SpecList> getSpecList() {
        return this.specList;
    }

}
