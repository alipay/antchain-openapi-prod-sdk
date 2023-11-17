// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSignTaskResult extends TeaModel {
    // 子任务流水号
    @NameInMap("sub_biz_no")
    @Validation(required = true)
    public String subBizNo;

    // 签署子任务id
    @NameInMap("sign_task_id")
    @Validation(required = true)
    public String signTaskId;

    // 签署子任务的状态
    @NameInMap("sign_task_status")
    public String signTaskStatus;

    // 签署完成的文件列表
    @NameInMap("sign_file_result_list")
    public java.util.List<CaSignFileResult> signFileResultList;

    // 签署人状态列表
    @NameInMap("sign_operator_result_list")
    public java.util.List<CaSignOperatorResult> signOperatorResultList;

    public static CaSignTaskResult build(java.util.Map<String, ?> map) throws Exception {
        CaSignTaskResult self = new CaSignTaskResult();
        return TeaModel.build(map, self);
    }

    public CaSignTaskResult setSubBizNo(String subBizNo) {
        this.subBizNo = subBizNo;
        return this;
    }
    public String getSubBizNo() {
        return this.subBizNo;
    }

    public CaSignTaskResult setSignTaskId(String signTaskId) {
        this.signTaskId = signTaskId;
        return this;
    }
    public String getSignTaskId() {
        return this.signTaskId;
    }

    public CaSignTaskResult setSignTaskStatus(String signTaskStatus) {
        this.signTaskStatus = signTaskStatus;
        return this;
    }
    public String getSignTaskStatus() {
        return this.signTaskStatus;
    }

    public CaSignTaskResult setSignFileResultList(java.util.List<CaSignFileResult> signFileResultList) {
        this.signFileResultList = signFileResultList;
        return this;
    }
    public java.util.List<CaSignFileResult> getSignFileResultList() {
        return this.signFileResultList;
    }

    public CaSignTaskResult setSignOperatorResultList(java.util.List<CaSignOperatorResult> signOperatorResultList) {
        this.signOperatorResultList = signOperatorResultList;
        return this;
    }
    public java.util.List<CaSignOperatorResult> getSignOperatorResultList() {
        return this.signOperatorResultList;
    }

}
