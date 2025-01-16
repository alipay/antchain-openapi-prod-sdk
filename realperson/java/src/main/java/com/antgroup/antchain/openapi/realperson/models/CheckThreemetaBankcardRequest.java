// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CheckThreemetaBankcardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 要素入参模式： 1：银行卡号+姓名+证件号 2：银行卡号+姓名+手机号 3：银行卡号+证件号+手机号，默认为1
    @NameInMap("meta_mode")
    public String metaMode;

    // 银行卡号
    @NameInMap("bank_card")
    @Validation(required = true)
    public String bankCard;

    // 姓名
    @NameInMap("cert_name")
    public String certName;

    // 身份证号
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型： 1：居民身份证（默认值） 2：军官证 3：护照 4：回乡证 5：台胞证 6：警官证 7：士兵证 99：其他
    @NameInMap("cert_type")
    public String certType;

    // 手机号码
    @NameInMap("mobile")
    public String mobile;

    // 扩展信息，Map的json格式
    @NameInMap("extern_param")
    public String externParam;

    public static CheckThreemetaBankcardRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckThreemetaBankcardRequest self = new CheckThreemetaBankcardRequest();
        return TeaModel.build(map, self);
    }

    public CheckThreemetaBankcardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckThreemetaBankcardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckThreemetaBankcardRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CheckThreemetaBankcardRequest setMetaMode(String metaMode) {
        this.metaMode = metaMode;
        return this;
    }
    public String getMetaMode() {
        return this.metaMode;
    }

    public CheckThreemetaBankcardRequest setBankCard(String bankCard) {
        this.bankCard = bankCard;
        return this;
    }
    public String getBankCard() {
        return this.bankCard;
    }

    public CheckThreemetaBankcardRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public CheckThreemetaBankcardRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CheckThreemetaBankcardRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CheckThreemetaBankcardRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CheckThreemetaBankcardRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
