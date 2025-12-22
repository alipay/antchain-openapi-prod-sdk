// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SubAntSignResult extends TeaModel {
    // 子业务流水号
    /**
     * <strong>example:</strong>
     * <p>subBizNo12345678901</p>
     */
    @NameInMap("sub_biz_no")
    @Validation(required = true)
    public String subBizNo;

    // 子任务流水号
    /**
     * <strong>example:</strong>
     * <p>子任务流水号</p>
     */
    @NameInMap("sign_task_id")
    public String signTaskId;

    // 我方userId
    /**
     * <strong>example:</strong>
     * <p>我方userId</p>
     */
    @NameInMap("our_user_id")
    public String ourUserId;

    // 是否关联业务
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("related_business")
    public Boolean relatedBusiness;

    // 签署链接
    @NameInMap("ant_sign_url_result_list")
    @Validation(required = true)
    public java.util.List<AntSignUrlResult> antSignUrlResultList;

    public static SubAntSignResult build(java.util.Map<String, ?> map) throws Exception {
        SubAntSignResult self = new SubAntSignResult();
        return TeaModel.build(map, self);
    }

    public SubAntSignResult setSubBizNo(String subBizNo) {
        this.subBizNo = subBizNo;
        return this;
    }
    public String getSubBizNo() {
        return this.subBizNo;
    }

    public SubAntSignResult setSignTaskId(String signTaskId) {
        this.signTaskId = signTaskId;
        return this;
    }
    public String getSignTaskId() {
        return this.signTaskId;
    }

    public SubAntSignResult setOurUserId(String ourUserId) {
        this.ourUserId = ourUserId;
        return this;
    }
    public String getOurUserId() {
        return this.ourUserId;
    }

    public SubAntSignResult setRelatedBusiness(Boolean relatedBusiness) {
        this.relatedBusiness = relatedBusiness;
        return this;
    }
    public Boolean getRelatedBusiness() {
        return this.relatedBusiness;
    }

    public SubAntSignResult setAntSignUrlResultList(java.util.List<AntSignUrlResult> antSignUrlResultList) {
        this.antSignUrlResultList = antSignUrlResultList;
        return this;
    }
    public java.util.List<AntSignUrlResult> getAntSignUrlResultList() {
        return this.antSignUrlResultList;
    }

}
