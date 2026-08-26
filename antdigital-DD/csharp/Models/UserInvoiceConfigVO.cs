// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 客户的开票配置信息
    public class UserInvoiceConfigVO : TeaModel {
        // 租户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 企业电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>0571-877776</para>
        /// </summary>
        [NameInMap("company_phone_no")]
        [Validation(Required=false)]
        public string CompanyPhoneNo { get; set; }

        // 公司地址(详细地址)
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海市黄浦区外马路</para>
        /// </summary>
        [NameInMap("company_address")]
        [Validation(Required=false)]
        public string CompanyAddress { get; set; }

        // 银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>招商银行</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 银行账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>34355565</para>
        /// </summary>
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

        // 税号
        /// <summary>
        /// <b>Example:</b>
        /// <para>35556T5</para>
        /// </summary>
        [NameInMap("tax_no")]
        [Validation(Required=false)]
        public string TaxNo { get; set; }

        // 是否是一般纳税人
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("general_taxpayer")]
        [Validation(Required=true)]
        public bool? GeneralTaxpayer { get; set; }

    }

}
