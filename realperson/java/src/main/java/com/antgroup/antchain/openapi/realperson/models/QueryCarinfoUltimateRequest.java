// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCarinfoUltimateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 入参加密模式：
    // NONE：不加密；
    // MD5：手机号码字段以MD5加密后的字符串传输
    @NameInMap("req_enc_type")
    public String reqEncType;

    // 手机号支持明文和 MD5
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 扩展信息，预留字段
    // 
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryCarinfoUltimateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarinfoUltimateRequest self = new QueryCarinfoUltimateRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarinfoUltimateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCarinfoUltimateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCarinfoUltimateRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryCarinfoUltimateRequest setReqEncType(String reqEncType) {
        this.reqEncType = reqEncType;
        return this;
    }
    public String getReqEncType() {
        return this.reqEncType;
    }

    public QueryCarinfoUltimateRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryCarinfoUltimateRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
