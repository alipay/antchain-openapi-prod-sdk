// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 公司信息
    public class CompanyInfo : TeaModel {
        // 营业执照文件信息
        [NameInMap("business_license_file")]
        [Validation(Required=true)]
        public FileInfo BusinessLicenseFile { get; set; }

        // 证件是否长期有效  
        // true：长期，false：非长期
        // payChannel =JDPAY必填
        [NameInMap("business_license_cert_expire_flag")]
        [Validation(Required=false)]
        public bool? BusinessLicenseCertExpireFlag { get; set; }

        // 证件有效期开始日期(payChannel =JDPAY)
        // 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
        // 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
        [NameInMap("business_license_cert_effect_date")]
        [Validation(Required=false)]
        public string BusinessLicenseCertEffectDate { get; set; }

        // 证件有效期结束日期（payChannel =JDPAY选填参数）
        // certExpireFlag为false必填，时间格式：yyyy-MM-dd
        [NameInMap("business_license_cert_expire_date")]
        [Validation(Required=false)]
        public string BusinessLicenseCertExpireDate { get; set; }

        // 业务类型 枚举
        [NameInMap("product_main_class")]
        [Validation(Required=true)]
        public string ProductMainClass { get; set; }

        // 公司名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 公司别名
        [NameInMap("company_alias_name")]
        [Validation(Required=true)]
        public string CompanyAliasName { get; set; }

        // 公司数科租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户类型： 01：企业；07：个体工商户
        // 默认不填为01
        [NameInMap("merchant_type")]
        [Validation(Required=false)]
        public string MerchantType { get; set; }

        // 公司联系电话
        [NameInMap("company_mobile")]
        [Validation(Required=true)]
        public string CompanyMobile { get; set; }

        // 公司联系地址
        [NameInMap("company_address")]
        [Validation(Required=true)]
        public string CompanyAddress { get; set; }

        // 联系人姓名
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系人手机号码
        [NameInMap("contact_mobile")]
        [Validation(Required=true)]
        public string ContactMobile { get; set; }

        // 联系地址-省份code(payChannel =JDPAY必填)
        [NameInMap("contact_address_province_code")]
        [Validation(Required=false)]
        public string ContactAddressProvinceCode { get; set; }

        // 联系地址-省份名称（payChannel =JDPAY必填）
        [NameInMap("contact_address_province_name")]
        [Validation(Required=false)]
        public string ContactAddressProvinceName { get; set; }

        // 联系地址-市code（payChannel =JDPAY必填）
        // 
        [NameInMap("contact_address_city_code")]
        [Validation(Required=false)]
        public string ContactAddressCityCode { get; set; }

        // 联系人地址-市名称（payChannel =JDPAY必填）
        [NameInMap("contact_address_city_name")]
        [Validation(Required=false)]
        public string ContactAddressCityName { get; set; }

        // 联系人详细地址（payChannel =JDPAY必填）
        [NameInMap("contact_address_detail")]
        [Validation(Required=false)]
        public string ContactAddressDetail { get; set; }

        // 联系人邮箱（pay_channel=JDPAY必填）
        [NameInMap("contact_email")]
        [Validation(Required=false)]
        public string ContactEmail { get; set; }

        // 绑定企业支付宝账号（pay_channel=ALIPAY必填）
        [NameInMap("bind_alipay_no")]
        [Validation(Required=false)]
        public string BindAlipayNo { get; set; }

        // 结算企业支付宝账号（pay_channel=ALIPAY必填）
        [NameInMap("settle_alipay_no")]
        [Validation(Required=false)]
        public string SettleAlipayNo { get; set; }

        // 绑定支付宝uid（pay_channel=ALIPAY必填）
        [NameInMap("bind_alipay_uid")]
        [Validation(Required=false)]
        public string BindAlipayUid { get; set; }

        // 经营范围
        // payChannel =JDPAY必填
        [NameInMap("business_scope")]
        [Validation(Required=false)]
        public string BusinessScope { get; set; }

        // 开户许可证（payChannel =JDPAY必填）
        // 
        [NameInMap("bank_opening_license_file")]
        [Validation(Required=false)]
        public FileInfo BankOpeningLicenseFile { get; set; }

        // 商户和租赁平台合作协议图片（pay_channel=JDPAY必填）
        // 
        [NameInMap("cooperation_agreement_file")]
        [Validation(Required=false)]
        public FileInfo CooperationAgreementFile { get; set; }

    }

}
