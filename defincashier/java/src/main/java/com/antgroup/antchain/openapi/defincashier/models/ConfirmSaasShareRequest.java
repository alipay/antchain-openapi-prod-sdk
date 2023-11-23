// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class ConfirmSaasShareRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // JSON请求参数，示例字数限制，完整可见：
    // {"org_order_id": "","out_payer_id": {"reference_id_type": "","reference_id": ""},"outRequestId": "","confirmAmount": {"cent": "","currency": "","currencyValue": ""},"share_info": {"payee_account": {"inst_id": "","account_no": "","account_name": "","offical_name": "","offical_number": ""},"out_payee_id": {"reference_id_type": "","reference_id": ""},"share_amount": "","share_currency":"","info_id":"","state":""},"platform_member_id": ""}
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 版本号
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static ConfirmSaasShareRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSaasShareRequest self = new ConfirmSaasShareRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmSaasShareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmSaasShareRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmSaasShareRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ConfirmSaasShareRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
