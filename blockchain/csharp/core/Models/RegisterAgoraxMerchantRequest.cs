// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class RegisterAgoraxMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户别名。支付宝收银台及账单中的商户名称会展示此处设置的别名。如果涉及支付宝APP内的支付，支付结果页也会展示该别名；如果涉及线下当面付场景，请填写线下店铺名称
        [NameInMap("alias_name")]
        [Validation(Required=true)]
        public string AliasName { get; set; }

        // 进件的二级商户名称，需与收款支付宝账户名称一致
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用授权码
        [NameInMap("app_auth_token")]
        [Validation(Required=true)]
        public string AppAuthToken { get; set; }

        // 商家类型。01：企业，07：个体工商户，06：个人商户
        [NameInMap("merchant_type")]
        [Validation(Required=true)]
        public string MerchantType { get; set; }

        // 联系人信息
        [NameInMap("contact_infos")]
        [Validation(Required=true)]
        public ContactInfo ContactInfos { get; set; }

        // 默认结算规则
        [NameInMap("default_settle_rule")]
        [Validation(Required=true)]
        public DefaultSettleRule DefaultSettleRule { get; set; }

        // 使用服务，当面付: 当面付，jsapi支付: jsapi支付
        [NameInMap("service")]
        [Validation(Required=true)]
        public List<string> Service { get; set; }

        // 商户类别码
        [NameInMap("mcc")]
        [Validation(Required=true)]
        public string Mcc { get; set; }

        // 商户证件编号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 商户证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 个体工商户营业执照上的名称
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 营业执照图片，file_id
        [NameInMap("cert_image")]
        [Validation(Required=false)]
        public string CertImage { get; set; }

        // 法人名称
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 法人身份证号
        [NameInMap("legal_cert_no")]
        [Validation(Required=false)]
        public string LegalCertNo { get; set; }

        // 商户支付宝账号，用作结算账号
        [NameInMap("alipay_logon_id")]
        [Validation(Required=false)]
        public string AlipayLogonId { get; set; }

        // 二级商户支付宝账户，用于签约、协议确认
        [NameInMap("binding_alipay_logon_id")]
        [Validation(Required=false)]
        public string BindingAlipayLogonId { get; set; }

        // 结算银行卡信息
        [NameInMap("biz_cards")]
        [Validation(Required=false)]
        public SettleCardInfo BizCards { get; set; }

        // 经营地址
        [NameInMap("business_address")]
        [Validation(Required=false)]
        public AddressInfo BusinessAddress { get; set; }

        // 门头照
        [NameInMap("out_door_images")]
        [Validation(Required=false)]
        public string OutDoorImages { get; set; }

        // 内景照
        [NameInMap("in_door_images")]
        [Validation(Required=false)]
        public string InDoorImages { get; set; }

        // 授权函（图片）
        [NameInMap("license_auth_letter_image")]
        [Validation(Required=false)]
        public string LicenseAuthLetterImage { get; set; }

        // 商户站点信息
        [NameInMap("sites")]
        [Validation(Required=false)]
        public SiteInfo Sites { get; set; }

        // 商户行业资质
        [NameInMap("qualifications")]
        [Validation(Required=false)]
        public List<IndustryQualificationInfo> Qualifications { get; set; }

        // 法人身份证正面图
        [NameInMap("legal_cert_front_image")]
        [Validation(Required=false)]
        public string LegalCertFrontImage { get; set; }

        // 法人身份证反面图
        [NameInMap("legal_cert_back_image")]
        [Validation(Required=false)]
        public string LegalCertBackImage { get; set; }

        // 信息关联的openId
        [NameInMap("info_source_open_id")]
        [Validation(Required=false)]
        public string InfoSourceOpenId { get; set; }

    }

}
