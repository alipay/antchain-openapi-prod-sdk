// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户资产入驻商户信息
    public class MaoMerchantInfo : TeaModel {
        // 营业执照登记名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>营业执照登记名称</para>
        /// </summary>
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 简称
        /// <summary>
        /// <b>Example:</b>
        /// <para>简称</para>
        /// </summary>
        [NameInMap("merchant_short_name")]
        [Validation(Required=true)]
        public string MerchantShortName { get; set; }

        // 企业类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>ENTERPRISE</para>
        /// </summary>
        [NameInMap("enter_type")]
        [Validation(Required=true)]
        public string EnterType { get; set; }

        // 商户角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>SI_STORE</para>
        /// </summary>
        [NameInMap("merchant_role")]
        [Validation(Required=true)]
        public string MerchantRole { get; set; }

        // 法人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人姓名</para>
        /// </summary>
        [NameInMap("legal_person")]
        [Validation(Required=true)]
        public string LegalPerson { get; set; }

        // 法人身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人身份证号</para>
        /// </summary>
        [NameInMap("legal_person_id_card")]
        [Validation(Required=true)]
        public string LegalPersonIdCard { get; set; }

        // 法人手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人手机号</para>
        /// </summary>
        [NameInMap("legal_person_phone")]
        [Validation(Required=true)]
        public string LegalPersonPhone { get; set; }

        // 经营地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("operate_address")]
        [Validation(Required=true)]
        public MaoOperateAddress OperateAddress { get; set; }

        // 图片
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("images")]
        [Validation(Required=true)]
        public MaoImages Images { get; set; }

        // 结算账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("settle_account")]
        [Validation(Required=true)]
        public MaoSettleAccount SettleAccount { get; set; }

        // 联系人列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("contacts")]
        [Validation(Required=true)]
        public List<MaoContact> Contacts { get; set; }

        // 行业资质
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("industry_fields")]
        [Validation(Required=false)]
        public List<MaoQualification> IndustryFields { get; set; }

        // 执照有效期
        [NameInMap("license_valid_period")]
        [Validation(Required=false)]
        public MaoLicenseValidPeriod LicenseValidPeriod { get; set; }

        // 是否连锁企业
        /// <summary>
        /// <b>Example:</b>
        /// <para>是否连锁企业</para>
        /// </summary>
        [NameInMap("is_chain")]
        [Validation(Required=false)]
        public string IsChain { get; set; }

        // 门店经营模式
        /// <summary>
        /// <b>Example:</b>
        /// <para>门店经营模式</para>
        /// </summary>
        [NameInMap("store_type")]
        [Validation(Required=false)]
        public string StoreType { get; set; }

        // 扩展字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>扩展字段</para>
        /// </summary>
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 门店经营范围
        /// <summary>
        /// <b>Example:</b>
        /// <para>门店经营范围</para>
        /// </summary>
        [NameInMap("business_scope")]
        [Validation(Required=true)]
        public string BusinessScope { get; set; }

        // 特殊行业许可证名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>特殊行业许可证名称</para>
        /// </summary>
        [NameInMap("special_industry_license_name")]
        [Validation(Required=false)]
        public string SpecialIndustryLicenseName { get; set; }

        // 特殊行业许可证有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>特殊行业许可证有效期</para>
        /// </summary>
        [NameInMap("special_industry_license_valid_period")]
        [Validation(Required=false)]
        public MaoLicenseValidPeriod SpecialIndustryLicenseValidPeriod { get; set; }

    }

}
