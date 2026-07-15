// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractRegisterzftRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 地址。商户详细经营地址或人员所在地点
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 代理商户的账户。如为isv商家入驻，需要传agent_account_id字段，agent_account_id是isv为商家用户注册返回的机构id
    @NameInMap("agent_account_id")
    public String agentAccountId;

    // 商户别名
    @NameInMap("alias_name")
    @Validation(required = true)
    public String aliasName;

    // 商户支付宝账户
    @NameInMap("alipay_logon_id")
    @Validation(required = true)
    public String alipayLogonId;

    // 申请时间
    @NameInMap("apply_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String applyTime;

    // 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
    @NameInMap("binding_alipay_logon_id")
    @Validation(required = true)
    public String bindingAlipayLogonId;

    // 结算卡id
    @NameInMap("card_alias_no")
    public String cardAliasNo;

    // 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
    @NameInMap("cert_image")
    @Validation(required = true)
    public String certImage;

    // 商户社会信用码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
    // （参考资料：
    // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 电子邮箱
    @NameInMap("contact_email")
    @Validation(required = true)
    public String contactEmail;

    // 商户联系人信息
    @NameInMap("contact_mobile")
    @Validation(required = true)
    public String contactMobile;

    // 联系人名字	
    @NameInMap("contact_name")
    @Validation(required = true)
    public String contactName;

    // 商户联系人电话信息
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

    // 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
    @NameInMap("contact_tag")
    @Validation(required = true)
    public String contactTag;

    // 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
    @NameInMap("contact_type")
    @Validation(required = true)
    public String contactType;

    // 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
    // （参考资料：
    // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
    @NameInMap("district_code")
    @Validation(required = true)
    public String districtCode;

    // 返回申请单相关参数。当前返回内容有cardAliasNo，smid	
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
    @NameInMap("ip_role_id")
    @Validation(required = true)
    public String ipRoleId;

    // 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
    @NameInMap("legal_cert_back_image")
    @Validation(required = true)
    public String legalCertBackImage;

    // 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
    @NameInMap("legal_cert_front_image")
    @Validation(required = true)
    public String legalCertFrontImage;

    // 法人身份证号
    @NameInMap("legal_cert_no")
    @Validation(required = true)
    public String legalCertNo;

    // 法人名称
    @NameInMap("legal_name")
    @Validation(required = true)
    public String legalName;

    // 商户类别码mcc，参见附件描述中的“类目code” https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx 如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
    @NameInMap("mcc")
    @Validation(required = true)
    public String mcc;

    // 蚂蚁金服（杭*****术有限公司
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
    @NameInMap("merchant_type")
    @Validation(required = true)
    public String merchantType;

    // 商户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 申请单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
    @NameInMap("out_door_image")
    @Validation(required = true)
    public String outDoorImage;

    // 商户在智能合同平台唯一id
    @NameInMap("platform_tuid")
    @Validation(required = true)
    public String platformTuid;

    // 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
    // （参考资料：
    // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
    @NameInMap("province_code")
    @Validation(required = true)
    public String provinceCode;

    // 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
    @NameInMap("service")
    @Validation(required = true)
    public String service;

    // 客服电话	
    @NameInMap("service_phone")
    @Validation(required = true)
    public String servicePhone;

    // 二级商户与服务商的签约时间
    @NameInMap("sign_time_with_isv")
    @Validation(required = true)
    public String signTimeWithIsv;

    // 站点名称
    @NameInMap("site_name")
    @Validation(required = true)
    public String siteName;

    // 网站：01
    // APP : 02
    // 服务窗:03
    // 公众号:04
    // 其他:05
    // 支付宝小程序:06
    @NameInMap("site_type")
    @Validation(required = true)
    public String siteType;

    // 站点地址
    @NameInMap("site_url")
    @Validation(required = true)
    public String siteUrl;

    // 二级商户id
    @NameInMap("smid")
    @Validation(required = true)
    public String smid;

    // 申请单状态。99:已完结;-1:失败;031:已提交审核
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 0表示不更新，1表示强制更新
    @NameInMap("update")
    @Validation(required = true)
    public Long update;

    public static CreateContractRegisterzftRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractRegisterzftRequest self = new CreateContractRegisterzftRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractRegisterzftRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractRegisterzftRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractRegisterzftRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateContractRegisterzftRequest setAgentAccountId(String agentAccountId) {
        this.agentAccountId = agentAccountId;
        return this;
    }
    public String getAgentAccountId() {
        return this.agentAccountId;
    }

    public CreateContractRegisterzftRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateContractRegisterzftRequest setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public CreateContractRegisterzftRequest setApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public String getApplyTime() {
        return this.applyTime;
    }

    public CreateContractRegisterzftRequest setBindingAlipayLogonId(String bindingAlipayLogonId) {
        this.bindingAlipayLogonId = bindingAlipayLogonId;
        return this;
    }
    public String getBindingAlipayLogonId() {
        return this.bindingAlipayLogonId;
    }

    public CreateContractRegisterzftRequest setCardAliasNo(String cardAliasNo) {
        this.cardAliasNo = cardAliasNo;
        return this;
    }
    public String getCardAliasNo() {
        return this.cardAliasNo;
    }

    public CreateContractRegisterzftRequest setCertImage(String certImage) {
        this.certImage = certImage;
        return this;
    }
    public String getCertImage() {
        return this.certImage;
    }

    public CreateContractRegisterzftRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateContractRegisterzftRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateContractRegisterzftRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public CreateContractRegisterzftRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public CreateContractRegisterzftRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public CreateContractRegisterzftRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateContractRegisterzftRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public CreateContractRegisterzftRequest setContactTag(String contactTag) {
        this.contactTag = contactTag;
        return this;
    }
    public String getContactTag() {
        return this.contactTag;
    }

    public CreateContractRegisterzftRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public CreateContractRegisterzftRequest setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public CreateContractRegisterzftRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateContractRegisterzftRequest setIpRoleId(String ipRoleId) {
        this.ipRoleId = ipRoleId;
        return this;
    }
    public String getIpRoleId() {
        return this.ipRoleId;
    }

    public CreateContractRegisterzftRequest setLegalCertBackImage(String legalCertBackImage) {
        this.legalCertBackImage = legalCertBackImage;
        return this;
    }
    public String getLegalCertBackImage() {
        return this.legalCertBackImage;
    }

    public CreateContractRegisterzftRequest setLegalCertFrontImage(String legalCertFrontImage) {
        this.legalCertFrontImage = legalCertFrontImage;
        return this;
    }
    public String getLegalCertFrontImage() {
        return this.legalCertFrontImage;
    }

    public CreateContractRegisterzftRequest setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
        return this;
    }
    public String getLegalCertNo() {
        return this.legalCertNo;
    }

    public CreateContractRegisterzftRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public CreateContractRegisterzftRequest setMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }
    public String getMcc() {
        return this.mcc;
    }

    public CreateContractRegisterzftRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateContractRegisterzftRequest setMerchantType(String merchantType) {
        this.merchantType = merchantType;
        return this;
    }
    public String getMerchantType() {
        return this.merchantType;
    }

    public CreateContractRegisterzftRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContractRegisterzftRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateContractRegisterzftRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CreateContractRegisterzftRequest setOutDoorImage(String outDoorImage) {
        this.outDoorImage = outDoorImage;
        return this;
    }
    public String getOutDoorImage() {
        return this.outDoorImage;
    }

    public CreateContractRegisterzftRequest setPlatformTuid(String platformTuid) {
        this.platformTuid = platformTuid;
        return this;
    }
    public String getPlatformTuid() {
        return this.platformTuid;
    }

    public CreateContractRegisterzftRequest setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public CreateContractRegisterzftRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public CreateContractRegisterzftRequest setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
        return this;
    }
    public String getServicePhone() {
        return this.servicePhone;
    }

    public CreateContractRegisterzftRequest setSignTimeWithIsv(String signTimeWithIsv) {
        this.signTimeWithIsv = signTimeWithIsv;
        return this;
    }
    public String getSignTimeWithIsv() {
        return this.signTimeWithIsv;
    }

    public CreateContractRegisterzftRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public CreateContractRegisterzftRequest setSiteType(String siteType) {
        this.siteType = siteType;
        return this;
    }
    public String getSiteType() {
        return this.siteType;
    }

    public CreateContractRegisterzftRequest setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }
    public String getSiteUrl() {
        return this.siteUrl;
    }

    public CreateContractRegisterzftRequest setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

    public CreateContractRegisterzftRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateContractRegisterzftRequest setUpdate(Long update) {
        this.update = update;
        return this;
    }
    public Long getUpdate() {
        return this.update;
    }

}
