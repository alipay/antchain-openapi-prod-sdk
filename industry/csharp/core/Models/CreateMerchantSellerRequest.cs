// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class CreateMerchantSellerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // source, 由中台为业务方分配, 作为业务来源标识
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 平台方下的用户id, 唯一， 跟merchant_login_name不能同时为空
        [NameInMap("merchant_user_id")]
        [Validation(Required=false)]
        public string MerchantUserId { get; set; }

        // 商户登录账号, 跟merchant_user_id不能同时为空
        [NameInMap("merchant_login_name")]
        [Validation(Required=false)]
        public string MerchantLoginName { get; set; }

        // 商户别名, 会展示在账单以及支付结果页中
        [NameInMap("merchant_alias_name")]
        [Validation(Required=true)]
        public string MerchantAliasName { get; set; }

        // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
        [NameInMap("mcc")]
        [Validation(Required=true)]
        public string Mcc { get; set; }

        // 法人姓名，merchant_type = 01时必填
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 默认可不填，认为legal_cert_no是大陆身份证。类型包括：100 大陆身份证；105 港澳居民往来内地通行证；106 台湾同胞往来大陆通行证；108 外国人居留证
        [NameInMap("legal_cert_type")]
        [Validation(Required=false)]
        public string LegalCertType { get; set; }

        // 商户法人身份证号码, merchant_type = 01时必填
        [NameInMap("legal_cert_no")]
        [Validation(Required=false)]
        public string LegalCertNo { get; set; }

        // 商户经营地址
        [NameInMap("business_address")]
        [Validation(Required=true)]
        public AddressInfo BusinessAddress { get; set; }

        // 商户联系人信息
        [NameInMap("contact_infos")]
        [Validation(Required=true)]
        public List<ContactInfo> ContactInfos { get; set; }

        // 商户使用服务 当面付、app支付、wap支付、电脑支付
        [NameInMap("service")]
        [Validation(Required=true)]
        public List<string> Service { get; set; }

        // 默认结算规则
        [NameInMap("default_settle_rule")]
        [Validation(Required=true)]
        public SettleRule DefaultSettleRule { get; set; }

        // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
        [NameInMap("biz_cards")]
        [Validation(Required=false)]
        public CardInfo BizCards { get; set; }

        // 请求单据号，32位。
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 商户证件图片，如果是特殊行业必填
        [NameInMap("cert_image")]
        [Validation(Required=false)]
        public string CertImage { get; set; }

        // 法人身份证正面图片 ，如果是特殊行业必填
        [NameInMap("legal_cert_front_image")]
        [Validation(Required=false)]
        public string LegalCertFrontImage { get; set; }

        // 法人身份证反面图片，如果是特殊行业必填
        [NameInMap("legal_cert_back_image")]
        [Validation(Required=false)]
        public string LegalCertBackImage { get; set; }

        // 商户行业资质, 如果是特殊行业必填
        [NameInMap("qualifications")]
        [Validation(Required=false)]
        public List<QualificationInfo> Qualifications { get; set; }

        // 授权函图片。当商户名与结算卡户名不一致（模板参考https://gw.alipayobjects.com/os/skylark-tools/public/files/d5fcbe7463d7159a0d362da417d157ed.docx），或涉及外籍法人（这种情况上传任意能证明身份的图片）时必填
        [NameInMap("license_auth_letter_image")]
        [Validation(Required=false)]
        public string LicenseAuthLetterImage { get; set; }

    }

}
