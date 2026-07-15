// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class WitnessSignResult extends TeaModel {
    // 签名结果，外部用户签署返回
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sign_result")
    public String signResult;

    // 签署日志id，外部用户签署返回
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("signlog_id")
    public String signlogId;

    // 第三方文档id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("third_doc_id")
    public String thirdDocId;

    public static WitnessSignResult build(java.util.Map<String, ?> map) throws Exception {
        WitnessSignResult self = new WitnessSignResult();
        return TeaModel.build(map, self);
    }

    public WitnessSignResult setSignResult(String signResult) {
        this.signResult = signResult;
        return this;
    }
    public String getSignResult() {
        return this.signResult;
    }

    public WitnessSignResult setSignlogId(String signlogId) {
        this.signlogId = signlogId;
        return this;
    }
    public String getSignlogId() {
        return this.signlogId;
    }

    public WitnessSignResult setThirdDocId(String thirdDocId) {
        this.thirdDocId = thirdDocId;
        return this;
    }
    public String getThirdDocId() {
        return this.thirdDocId;
    }

}
