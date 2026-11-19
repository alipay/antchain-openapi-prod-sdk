// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ContractSignContext extends TeaModel {
    // 合同名称
    /**
     * <strong>example:</strong>
     * <p>测试合同</p>
     */
    @NameInMap("sign_flow_title")
    @Validation(required = true)
    public String signFlowTitle;

    // 合同签署完成回跳地址
    /**
     * <strong>example:</strong>
     * <p><a href="https://m.taobao.com/rental/confirm?orderId=2026111200012345">https://m.taobao.com/rental/confirm?orderId=2026111200012345</a></p>
     */
    @NameInMap("signed_redirect_url")
    public String signedRedirectUrl;

    // 承租人证件类型, CRED_PSN_CH_IDCARD
    /**
     * <strong>example:</strong>
     * <p>CRED_PSN_CH_IDCARD</p>
     */
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // 承租人证件号
    /**
     * <strong>example:</strong>
     * <p>362202200000000000</p>
     */
    @NameInMap("user_id_number")
    @Validation(required = true)
    public String userIdNumber;

    // 承租人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 承租人手机号
    /**
     * <strong>example:</strong>
     * <p>13361610000</p>
     */
    @NameInMap("user_mobile")
    @Validation(required = true)
    public String userMobile;

    // 承租人 email
    /**
     * <strong>example:</strong>
     * <p>justemail@email</p>
     */
    @NameInMap("user_email")
    public String userEmail;

    // 承租人签章位标签
    /**
     * <strong>example:</strong>
     * <p>jiafang</p>
     */
    @NameInMap("user_tag")
    @Validation(required = true)
    public String userTag;

    // 商户企业证件号（统一社会信用代码）
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("merchant_id_number")
    @Validation(required = true)
    public String merchantIdNumber;

    // 商户企业签章位标签
    /**
     * <strong>example:</strong>
     * <p>yifang</p>
     */
    @NameInMap("merchant_tag")
    @Validation(required = true)
    public String merchantTag;

    // 落章顺序
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("merchant_sign_order")
    public Long merchantSignOrder;

    // 商户名称
    /**
     * <strong>example:</strong>
     * <p>测试公司</p>
     */
    @NameInMap("merchant_name")
    public String merchantName;

    // 三方企业信息
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("third_signer")
    public java.util.List<ContractSignThirdSignerModel> thirdSigner;

    // 签署的电子合同模板信息，JSONArray格式
    // 说明：
    // templateId：配置的模板id
    // templateArgs：模板配置，其中key=模板文本域中配置的名称
    // value=需要填充的值
    // 例如：
    // 模板f28038577d664015bfc1034c4a125121中的一个文本域字段叫textA，需要替换成“测试值”，则传入
    // [{"templateId":"f28038577d664015bfc1034c4a125121","templateArgs":{"textA":"测试值"}}]
    /**
     * <strong>example:</strong>
     * <p>[{&quot;templateId&quot;:&quot;f28038577d664015bfc1034c4a125121&quot;,&quot;templateArgs&quot;:{&quot;textA&quot;:&quot;测试值&quot;}}]</p>
     */
    @NameInMap("template_list")
    @Validation(required = true)
    public String templateList;

    public static ContractSignContext build(java.util.Map<String, ?> map) throws Exception {
        ContractSignContext self = new ContractSignContext();
        return TeaModel.build(map, self);
    }

    public ContractSignContext setSignFlowTitle(String signFlowTitle) {
        this.signFlowTitle = signFlowTitle;
        return this;
    }
    public String getSignFlowTitle() {
        return this.signFlowTitle;
    }

    public ContractSignContext setSignedRedirectUrl(String signedRedirectUrl) {
        this.signedRedirectUrl = signedRedirectUrl;
        return this;
    }
    public String getSignedRedirectUrl() {
        return this.signedRedirectUrl;
    }

    public ContractSignContext setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public ContractSignContext setUserIdNumber(String userIdNumber) {
        this.userIdNumber = userIdNumber;
        return this;
    }
    public String getUserIdNumber() {
        return this.userIdNumber;
    }

    public ContractSignContext setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ContractSignContext setUserMobile(String userMobile) {
        this.userMobile = userMobile;
        return this;
    }
    public String getUserMobile() {
        return this.userMobile;
    }

    public ContractSignContext setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public ContractSignContext setUserTag(String userTag) {
        this.userTag = userTag;
        return this;
    }
    public String getUserTag() {
        return this.userTag;
    }

    public ContractSignContext setMerchantIdNumber(String merchantIdNumber) {
        this.merchantIdNumber = merchantIdNumber;
        return this;
    }
    public String getMerchantIdNumber() {
        return this.merchantIdNumber;
    }

    public ContractSignContext setMerchantTag(String merchantTag) {
        this.merchantTag = merchantTag;
        return this;
    }
    public String getMerchantTag() {
        return this.merchantTag;
    }

    public ContractSignContext setMerchantSignOrder(Long merchantSignOrder) {
        this.merchantSignOrder = merchantSignOrder;
        return this;
    }
    public Long getMerchantSignOrder() {
        return this.merchantSignOrder;
    }

    public ContractSignContext setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public ContractSignContext setThirdSigner(java.util.List<ContractSignThirdSignerModel> thirdSigner) {
        this.thirdSigner = thirdSigner;
        return this;
    }
    public java.util.List<ContractSignThirdSignerModel> getThirdSigner() {
        return this.thirdSigner;
    }

    public ContractSignContext setTemplateList(String templateList) {
        this.templateList = templateList;
        return this;
    }
    public String getTemplateList() {
        return this.templateList;
    }

}
