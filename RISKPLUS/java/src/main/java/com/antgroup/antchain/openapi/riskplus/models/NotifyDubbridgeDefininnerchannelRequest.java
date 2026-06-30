// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyDubbridgeDefininnerchannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用流水
    @NameInMap("seq_no")
    @Validation(required = true)
    public String seqNo;

    // 机构平台接口名
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 机构编号
    @NameInMap("inst_member_code")
    @Validation(required = true)
    public String instMemberCode;

    // 业务参数Json
    @NameInMap("biz_param")
    @Validation(required = true)
    public String bizParam;

    public static NotifyDubbridgeDefininnerchannelRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyDubbridgeDefininnerchannelRequest self = new NotifyDubbridgeDefininnerchannelRequest();
        return TeaModel.build(map, self);
    }

    public NotifyDubbridgeDefininnerchannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyDubbridgeDefininnerchannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyDubbridgeDefininnerchannelRequest setSeqNo(String seqNo) {
        this.seqNo = seqNo;
        return this;
    }
    public String getSeqNo() {
        return this.seqNo;
    }

    public NotifyDubbridgeDefininnerchannelRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public NotifyDubbridgeDefininnerchannelRequest setInstMemberCode(String instMemberCode) {
        this.instMemberCode = instMemberCode;
        return this;
    }
    public String getInstMemberCode() {
        return this.instMemberCode;
    }

    public NotifyDubbridgeDefininnerchannelRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

}
