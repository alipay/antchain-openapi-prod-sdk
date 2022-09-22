// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class GetHealthinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备SN
    // 
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 设备厂商
    // 
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 健康身份二维码
    @NameInMap("qr_code")
    @Validation(required = true)
    public String qrCode;

    // 防疫信息类型,枚举值如下： 健康信息 health , 疫苗信息 vaccination , 核酸信息 nucleicAcid , 行程信息 travel , 抗原信息 antigen , 场景信息 scene . 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
    @NameInMap("health_types")
    @Validation(required = true)
    public String healthTypes;

    // 通行记录ID
    // 
    @NameInMap("pass_id")
    public String passId;

    // 获取健康信息所需扩展参数列表：体温（temperature：36.5）
    @NameInMap("extension_info")
    public java.util.List<QueryHealthInfoExtendedArg> extensionInfo;

    public static GetHealthinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHealthinfoRequest self = new GetHealthinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetHealthinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetHealthinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetHealthinfoRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public GetHealthinfoRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public GetHealthinfoRequest setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

    public GetHealthinfoRequest setHealthTypes(String healthTypes) {
        this.healthTypes = healthTypes;
        return this;
    }
    public String getHealthTypes() {
        return this.healthTypes;
    }

    public GetHealthinfoRequest setPassId(String passId) {
        this.passId = passId;
        return this;
    }
    public String getPassId() {
        return this.passId;
    }

    public GetHealthinfoRequest setExtensionInfo(java.util.List<QueryHealthInfoExtendedArg> extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public java.util.List<QueryHealthInfoExtendedArg> getExtensionInfo() {
        return this.extensionInfo;
    }

}
