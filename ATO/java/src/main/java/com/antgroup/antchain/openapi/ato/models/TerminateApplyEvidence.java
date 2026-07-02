// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TerminateApplyEvidence extends TeaModel {
    // 用户申请解约问题类型
    /**
     * <strong>example:</strong>
     * <p>操作复杂</p>
     */
    @NameInMap("terminate_apply_reason")
    public String terminateApplyReason;

    // 用户申请解约问题描述
    /**
     * <strong>example:</strong>
     * <p>具体描述</p>
     */
    @NameInMap("terminate_apply_refer")
    public String terminateApplyRefer;

    // 用户联系电话
    /**
     * <strong>example:</strong>
     * <p>15674433257</p>
     */
    @NameInMap("user_phone_num")
    public String userPhoneNum;

    // 用户申请解约证据（图片、视频）
    /**
     * <strong>example:</strong>
     * <p>[&quot;fileKey&quot;]</p>
     */
    @NameInMap("terminate_apply_evidences")
    public java.util.List<String> terminateApplyEvidences;

    // 用户申请提交材料时间
    /**
     * <strong>example:</strong>
     * <p>2025-01-01 12:00:00</p>
     */
    @NameInMap("terminate_operate_time")
    public String terminateOperateTime;

    public static TerminateApplyEvidence build(java.util.Map<String, ?> map) throws Exception {
        TerminateApplyEvidence self = new TerminateApplyEvidence();
        return TeaModel.build(map, self);
    }

    public TerminateApplyEvidence setTerminateApplyReason(String terminateApplyReason) {
        this.terminateApplyReason = terminateApplyReason;
        return this;
    }
    public String getTerminateApplyReason() {
        return this.terminateApplyReason;
    }

    public TerminateApplyEvidence setTerminateApplyRefer(String terminateApplyRefer) {
        this.terminateApplyRefer = terminateApplyRefer;
        return this;
    }
    public String getTerminateApplyRefer() {
        return this.terminateApplyRefer;
    }

    public TerminateApplyEvidence setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
        return this;
    }
    public String getUserPhoneNum() {
        return this.userPhoneNum;
    }

    public TerminateApplyEvidence setTerminateApplyEvidences(java.util.List<String> terminateApplyEvidences) {
        this.terminateApplyEvidences = terminateApplyEvidences;
        return this;
    }
    public java.util.List<String> getTerminateApplyEvidences() {
        return this.terminateApplyEvidences;
    }

    public TerminateApplyEvidence setTerminateOperateTime(String terminateOperateTime) {
        this.terminateOperateTime = terminateOperateTime;
        return this;
    }
    public String getTerminateOperateTime() {
        return this.terminateOperateTime;
    }

}
