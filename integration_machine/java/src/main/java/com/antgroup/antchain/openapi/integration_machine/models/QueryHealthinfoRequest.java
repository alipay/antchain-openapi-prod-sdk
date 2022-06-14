// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryHealthinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备SN
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 设备厂商
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 被查询人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 被查询人身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 防疫信息类型,枚举值如下：
    // 健康信息 health ,
    // 疫苗信息 vaccination ,
    // 核酸信息 nucleicAcid ,
    // 行程信息 travel ,
    // 抗原信息 antigen ,
    // 场景信息  scene .
    // 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
    @NameInMap("health_types")
    @Validation(required = true)
    public String healthTypes;

    // 通行记录ID
    @NameInMap("pass_id")
    public String passId;

    public static QueryHealthinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthinfoRequest self = new QueryHealthinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryHealthinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHealthinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryHealthinfoRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public QueryHealthinfoRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryHealthinfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryHealthinfoRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryHealthinfoRequest setHealthTypes(String healthTypes) {
        this.healthTypes = healthTypes;
        return this;
    }
    public String getHealthTypes() {
        return this.healthTypes;
    }

    public QueryHealthinfoRequest setPassId(String passId) {
        this.passId = passId;
        return this;
    }
    public String getPassId() {
        return this.passId;
    }

}
