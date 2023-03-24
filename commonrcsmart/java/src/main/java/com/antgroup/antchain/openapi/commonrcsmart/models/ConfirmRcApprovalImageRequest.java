// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class ConfirmRcApprovalImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 审核场景列表
    @NameInMap("scenes")
    @Validation(required = true)
    public java.util.List<String> scenes;

    // 审核文件内容
    @NameInMap("data_vo")
    @Validation(required = true)
    public DataVo dataVo;

    // 登录账号；默认使用主账号
    @NameInMap("login_name")
    public String loginName;

    public static ConfirmRcApprovalImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRcApprovalImageRequest self = new ConfirmRcApprovalImageRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmRcApprovalImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmRcApprovalImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmRcApprovalImageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmRcApprovalImageRequest setScenes(java.util.List<String> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<String> getScenes() {
        return this.scenes;
    }

    public ConfirmRcApprovalImageRequest setDataVo(DataVo dataVo) {
        this.dataVo = dataVo;
        return this;
    }
    public DataVo getDataVo() {
        return this.dataVo;
    }

    public ConfirmRcApprovalImageRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
