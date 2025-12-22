// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class JudicialEventOperateInfo extends TeaModel {
    // 响应类型:
    // 司法调解
    //   延期确认: DELAY_CONFIRM
    //   回款确认: CASH_CONFIRM
    // 
    /**
     * <strong>example:</strong>
     * <p>DELAY_CONFIRM</p>
     */
    @NameInMap("operate_type")
    @Validation(required = true)
    public String operateType;

    // 响应内容
    // 延期确认
    //   确认-CONFIRM
    //   否认-DENY
    // 回款确认:
    //   确认-CONFIRM
    //   有异议-DISSENT
    /**
     * <strong>example:</strong>
     * <p>CONFIRM</p>
     */
    @NameInMap("operate_opinion")
    @Validation(required = true)
    public String operateOpinion;

    // 当延期申请不同意,回款确认有异议时填写原因
    /**
     * <strong>example:</strong>
     * <p>请求延期,请批准</p>
     */
    @NameInMap("operate_reason")
    public String operateReason;

    // 回款记录编号,回款确认时必填
    /**
     * <strong>example:</strong>
     * <p>202243243234a</p>
     */
    @NameInMap("req_biz_no")
    public String reqBizNo;

    public static JudicialEventOperateInfo build(java.util.Map<String, ?> map) throws Exception {
        JudicialEventOperateInfo self = new JudicialEventOperateInfo();
        return TeaModel.build(map, self);
    }

    public JudicialEventOperateInfo setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public JudicialEventOperateInfo setOperateOpinion(String operateOpinion) {
        this.operateOpinion = operateOpinion;
        return this;
    }
    public String getOperateOpinion() {
        return this.operateOpinion;
    }

    public JudicialEventOperateInfo setOperateReason(String operateReason) {
        this.operateReason = operateReason;
        return this;
    }
    public String getOperateReason() {
        return this.operateReason;
    }

    public JudicialEventOperateInfo setReqBizNo(String reqBizNo) {
        this.reqBizNo = reqBizNo;
        return this;
    }
    public String getReqBizNo() {
        return this.reqBizNo;
    }

}
