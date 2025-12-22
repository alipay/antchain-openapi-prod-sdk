// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AntSignTaskResult extends TeaModel {
    // 子任务流水号
    /**
     * <strong>example:</strong>
     * <p>子任务流水号</p>
     */
    @NameInMap("sub_biz_no")
    public String subBizNo;

    // 签署子任务id
    /**
     * <strong>example:</strong>
     * <p>签署子任务id</p>
     */
    @NameInMap("sign_task_id")
    public String signTaskId;

    // 签署子任务状态:
    // INIT-初始化
    // SIGNING-签署中
    // SIGNED-已签署
    // REJECTED-已拒绝
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("sign_task_status")
    public String signTaskStatus;

    // 上下游透传参数
    /**
     * <strong>example:</strong>
     * <p>上下游透传参数</p>
     */
    @NameInMap("extra_param")
    public String extraParam;

    // 签署子任务完成的文件里表
    @NameInMap("ant_sign_file_result_list")
    public java.util.List<AntSignFileResult> antSignFileResultList;

    // 签署人状态列表
    @NameInMap("ant_sign_operator_result_list")
    public java.util.List<AntSignOperatorResult> antSignOperatorResultList;

    public static AntSignTaskResult build(java.util.Map<String, ?> map) throws Exception {
        AntSignTaskResult self = new AntSignTaskResult();
        return TeaModel.build(map, self);
    }

    public AntSignTaskResult setSubBizNo(String subBizNo) {
        this.subBizNo = subBizNo;
        return this;
    }
    public String getSubBizNo() {
        return this.subBizNo;
    }

    public AntSignTaskResult setSignTaskId(String signTaskId) {
        this.signTaskId = signTaskId;
        return this;
    }
    public String getSignTaskId() {
        return this.signTaskId;
    }

    public AntSignTaskResult setSignTaskStatus(String signTaskStatus) {
        this.signTaskStatus = signTaskStatus;
        return this;
    }
    public String getSignTaskStatus() {
        return this.signTaskStatus;
    }

    public AntSignTaskResult setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public AntSignTaskResult setAntSignFileResultList(java.util.List<AntSignFileResult> antSignFileResultList) {
        this.antSignFileResultList = antSignFileResultList;
        return this;
    }
    public java.util.List<AntSignFileResult> getAntSignFileResultList() {
        return this.antSignFileResultList;
    }

    public AntSignTaskResult setAntSignOperatorResultList(java.util.List<AntSignOperatorResult> antSignOperatorResultList) {
        this.antSignOperatorResultList = antSignOperatorResultList;
        return this;
    }
    public java.util.List<AntSignOperatorResult> getAntSignOperatorResultList() {
        return this.antSignOperatorResultList;
    }

}
