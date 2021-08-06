// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class TdmVerifyLogVO extends TeaModel {
    // 1:核身创建成功 2:核身验证通过 3:核身验证失败
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 核身结果描述信息
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static TdmVerifyLogVO build(java.util.Map<String, ?> map) throws Exception {
        TdmVerifyLogVO self = new TdmVerifyLogVO();
        return TeaModel.build(map, self);
    }

    public TdmVerifyLogVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TdmVerifyLogVO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
