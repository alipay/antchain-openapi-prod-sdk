// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class BaseAuthRequest extends TeaModel {
    // 租户号
    /**
     * <strong>example:</strong>
     * <p>OCRGDSFD</p>
     */
    @NameInMap("inst_code")
    @Validation(required = true)
    public String instCode;

    // 授权类型
    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // xdsadsfsdf
    /**
     * <strong>example:</strong>
     * <p>订单号</p>
     */
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 扩展信息
    /**
     * <strong>example:</strong>
     * <p>扩展信息</p>
     */
    @NameInMap("extend_info")
    @Validation(required = true)
    public StandardAuthExtendInfoRequest extendInfo;

    public static BaseAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        BaseAuthRequest self = new BaseAuthRequest();
        return TeaModel.build(map, self);
    }

    public BaseAuthRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public BaseAuthRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public BaseAuthRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public BaseAuthRequest setExtendInfo(StandardAuthExtendInfoRequest extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public StandardAuthExtendInfoRequest getExtendInfo() {
        return this.extendInfo;
    }

}
