// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryFeeEvidTypeData extends TeaModel {
    // 证据类型描述
    /**
     * <strong>example:</strong>
     * <p>网页取证</p>
     */
    @NameInMap("evid_type_desc")
    @Validation(required = true)
    public String evidTypeDesc;

    // 证据分类及数量详情
    /**
     * <strong>example:</strong>
     * <p>10条，11张截图</p>
     */
    @NameInMap("evid_type_detail")
    @Validation(required = true)
    public String evidTypeDetail;

    public static NotaryFeeEvidTypeData build(java.util.Map<String, ?> map) throws Exception {
        NotaryFeeEvidTypeData self = new NotaryFeeEvidTypeData();
        return TeaModel.build(map, self);
    }

    public NotaryFeeEvidTypeData setEvidTypeDesc(String evidTypeDesc) {
        this.evidTypeDesc = evidTypeDesc;
        return this;
    }
    public String getEvidTypeDesc() {
        return this.evidTypeDesc;
    }

    public NotaryFeeEvidTypeData setEvidTypeDetail(String evidTypeDetail) {
        this.evidTypeDetail = evidTypeDetail;
        return this;
    }
    public String getEvidTypeDetail() {
        return this.evidTypeDetail;
    }

}
