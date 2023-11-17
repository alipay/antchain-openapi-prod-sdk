// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSubSignResult extends TeaModel {
    // 子业务流水号
    @NameInMap("sub_biz_no")
    public String subBizNo;

    // 子任务id
    @NameInMap("sign_task_id")
    public String signTaskId;

    // 我方签署方id
    @NameInMap("our_user_id")
    public String ourUserId;

    // 是否关联业务 true:关联 false：不关联
    @NameInMap("related_business")
    public Boolean relatedBusiness;

    // 签署链接结果列表
    @NameInMap("ca_sign_url_result_list")
    public java.util.List<CaSignUrlResult> caSignUrlResultList;

    public static CaSubSignResult build(java.util.Map<String, ?> map) throws Exception {
        CaSubSignResult self = new CaSubSignResult();
        return TeaModel.build(map, self);
    }

    public CaSubSignResult setSubBizNo(String subBizNo) {
        this.subBizNo = subBizNo;
        return this;
    }
    public String getSubBizNo() {
        return this.subBizNo;
    }

    public CaSubSignResult setSignTaskId(String signTaskId) {
        this.signTaskId = signTaskId;
        return this;
    }
    public String getSignTaskId() {
        return this.signTaskId;
    }

    public CaSubSignResult setOurUserId(String ourUserId) {
        this.ourUserId = ourUserId;
        return this;
    }
    public String getOurUserId() {
        return this.ourUserId;
    }

    public CaSubSignResult setRelatedBusiness(Boolean relatedBusiness) {
        this.relatedBusiness = relatedBusiness;
        return this;
    }
    public Boolean getRelatedBusiness() {
        return this.relatedBusiness;
    }

    public CaSubSignResult setCaSignUrlResultList(java.util.List<CaSignUrlResult> caSignUrlResultList) {
        this.caSignUrlResultList = caSignUrlResultList;
        return this;
    }
    public java.util.List<CaSignUrlResult> getCaSignUrlResultList() {
        return this.caSignUrlResultList;
    }

}
