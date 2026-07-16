// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    //  公司信息修改
    public class CompanyInfoUpdate : TeaModel {
        // 营业执照文件信息
        [NameInMap("business_license_file")]
        [Validation(Required=false)]
        public FileInfo BusinessLicenseFile { get; set; }

        // 业务类型 枚举
        /// <summary>
        /// <b>Example:</b>
        /// <para>业务类型</para>
        /// </summary>
        [NameInMap("product_main_class")]
        [Validation(Required=false)]
        public string ProductMainClass { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 公司别名
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司别名</para>
        /// </summary>
        [NameInMap("company_alias_name")]
        [Validation(Required=false)]
        public string CompanyAliasName { get; set; }

        // 公司数科租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ASSDDDAS</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

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
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 联系人手机号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>132xx2312312</para>
        /// </summary>
        [NameInMap("contact_mobile")]
        [Validation(Required=false)]
        public string ContactMobile { get; set; }

        // 商户类型： 01：企业；07：个体工商户 默认不填为01
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("merchant_type")]
        [Validation(Required=false)]
        public string MerchantType { get; set; }

    }

}
