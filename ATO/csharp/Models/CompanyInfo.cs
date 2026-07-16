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
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("business_license_cert_expire_flag")]
        [Validation(Required=false)]
        public bool? BusinessLicenseCertExpireFlag { get; set; }

        // 证件有效期开始日期(payChannel =JDPAY)
        // 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
        // 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17</para>
        /// </summary>
        [NameInMap("business_license_cert_effect_date")]
        [Validation(Required=false)]
        public string BusinessLicenseCertEffectDate { get; set; }

        // 证件有效期结束日期（payChannel =JDPAY选填参数）
        // certExpireFlag为false必填，时间格式：yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-10-17</para>
        /// </summary>
        [NameInMap("business_license_cert_expire_date")]
        [Validation(Required=false)]
        public string BusinessLicenseCertExpireDate { get; set; }

        // 业务类型 枚举
        /// <summary>
        /// <b>Example:</b>
        /// <para>业务类型</para>
        /// </summary>
        [NameInMap("product_main_class")]
        [Validation(Required=true)]
        public string ProductMainClass { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 公司别名
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司别名</para>
        /// </summary>
        [NameInMap("company_alias_name")]
        [Validation(Required=true)]
        public string CompanyAliasName { get; set; }

        // 公司数科租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ASSDDDAS</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>9121asd231231231231</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户类型： 01：企业；07：个体工商户
        // 默认不填为01
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("merchant_type")]
        [Validation(Required=false)]
        public string MerchantType { get; set; }

        // 公司联系电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231xx2322</para>
        /// </summary>
        [NameInMap("company_mobile")]
        [Validation(Required=false)]
        public string CompanyMobile { get; set; }

        // 公司联系地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx市xx区</para>
        /// </summary>
        [NameInMap("company_address")]
        [Validation(Required=false)]
        public string CompanyAddress { get; set; }

        // 联系人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>李xx</para>
        /// </summary>
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 联系人手机号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>132xx2312312</para>
        /// </summary>
        [NameInMap("contact_mobile")]
        [Validation(Required=true)]
        public string ContactMobile { get; set; }

        // 联系地址-省份code(payChannel =JDPAY必填)
        /// <summary>
        /// <b>Example:</b>
        /// <para>430000</para>
        /// </summary>
        [NameInMap("contact_address_province_code")]
        [Validation(Required=false)]
        public string ContactAddressProvinceCode { get; set; }

        // 联系地址-省份名称（payChannel =JDPAY必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省</para>
        /// </summary>
        [NameInMap("contact_address_province_name")]
        [Validation(Required=false)]
        public string ContactAddressProvinceName { get; set; }

        // 联系地址-市code（payChannel =JDPAY必填）
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>403100</para>
        /// </summary>
        [NameInMap("contact_address_city_code")]
        [Validation(Required=false)]
        public string ContactAddressCityCode { get; set; }

        // 联系人地址-市名称（payChannel =JDPAY必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("contact_address_city_name")]
        [Validation(Required=false)]
        public string ContactAddressCityName { get; set; }

        // 联系人详细地址（payChannel =JDPAY必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市余杭区xxx</para>
        /// </summary>
        [NameInMap("contact_address_detail")]
        [Validation(Required=false)]
        public string ContactAddressDetail { get; set; }

        // 联系人邮箱（pay_channel=JDPAY必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:123123122134@163.com">123123122134@163.com</a></para>
        /// </summary>
        [NameInMap("contact_email")]
        [Validation(Required=false)]
        public string ContactEmail { get; set; }

        // 绑定企业支付宝账号（pay_channel=ALIPAY必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>绑定企业支付宝账号</para>
        /// </summary>
        [NameInMap("bind_alipay_no")]
        [Validation(Required=false)]
        public string BindAlipayNo { get; set; }

        // 结算企业支付宝账号（pay_channel=ALIPAY必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>结算企业支付宝账号</para>
        /// </summary>
        [NameInMap("settle_alipay_no")]
        [Validation(Required=false)]
        public string SettleAlipayNo { get; set; }

        // 绑定支付宝uid（pay_channel=ALIPAY必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>绑定支付宝uid</para>
        /// </summary>
        [NameInMap("bind_alipay_uid")]
        [Validation(Required=false)]
        public string BindAlipayUid { get; set; }

        // 经营范围
        // payChannel =JDPAY必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>经营租赁等业务</para>
        /// </summary>
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
