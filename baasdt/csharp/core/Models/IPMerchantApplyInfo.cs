// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权服务-商家进件信息
    public class IPMerchantApplyInfo : TeaModel {
        // 链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 支付宝的登陆用户名(必须实名制)
        [NameInMap("alipay_login_name")]
        [Validation(Required=true)]
        public string AlipayLoginName { get; set; }

        // 商户别名, 会展示在账单以及支付结果页中
        [NameInMap("merchant_alias_name")]
        [Validation(Required=true)]
        public string MerchantAliasName { get; set; }

        // 商户类型(本期仅支持: 1:企业, 6:个人商户)
        [NameInMap("merchant_type")]
        [Validation(Required=true)]
        public long? MerchantType { get; set; }

        // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证) 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
        [NameInMap("merchant_cert_type")]
        [Validation(Required=true)]
        public long? MerchantCertType { get; set; }

        // 商户证件编号(企业提供营业执照),本期人工审核
        [NameInMap("merchant_cert_number")]
        [Validation(Required=true)]
        public string MerchantCertNumber { get; set; }

        // 商户营业执照的图片地址,本期人工审核
        [NameInMap("merchant_cert_image")]
        [Validation(Required=true)]
        public string MerchantCertImage { get; set; }

        // 税务登记证明的图片,本期人工审核
        [NameInMap("merchant_sign_image")]
        [Validation(Required=true)]
        public string MerchantSignImage { get; set; }

        // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
        [NameInMap("mcc")]
        [Validation(Required=true)]
        public string Mcc { get; set; }

        // 商户法人名称, merchant_type = 01时必填
        // 
        [NameInMap("legal_name")]
        [Validation(Required=true)]
        public string LegalName { get; set; }

        // 商户法人身份证号码, merchant_type = 1时必填
        // 
        [NameInMap("legal_cert_no")]
        [Validation(Required=true)]
        public string LegalCertNo { get; set; }

        // 商户经营地址
        // 
        [NameInMap("address_info")]
        [Validation(Required=true)]
        public IPAddressInfo AddressInfo { get; set; }

        // 默认结算规则
        // 
        [NameInMap("settle_rule")]
        [Validation(Required=true)]
        public IPSettleRule SettleRule { get; set; }

        // 商户联系人信息
        // 
        [NameInMap("contact_info")]
        [Validation(Required=true)]
        public IPContactInfo ContactInfo { get; set; }

        // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
        // 
        [NameInMap("card_info")]
        [Validation(Required=true)]
        public IPCardInfo CardInfo { get; set; }

    }

}
