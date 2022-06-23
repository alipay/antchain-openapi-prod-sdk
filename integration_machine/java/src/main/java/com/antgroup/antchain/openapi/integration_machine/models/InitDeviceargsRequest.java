// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class InitDeviceargsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备sn
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 设备厂商
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 设备参数名称/key/value列表
    @NameInMap("args_name_value_list")
    @Validation(required = true)
    public java.util.List<ArgsNameValue> argsNameValueList;

    public static InitDeviceargsRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDeviceargsRequest self = new InitDeviceargsRequest();
        return TeaModel.build(map, self);
    }

    public InitDeviceargsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitDeviceargsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitDeviceargsRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public InitDeviceargsRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public InitDeviceargsRequest setArgsNameValueList(java.util.List<ArgsNameValue> argsNameValueList) {
        this.argsNameValueList = argsNameValueList;
        return this;
    }
    public java.util.List<ArgsNameValue> getArgsNameValueList() {
        return this.argsNameValueList;
    }

}
