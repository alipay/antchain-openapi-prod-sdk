// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 用户开票信息
    public class UserInvoiceInfo : TeaModel {
        // 公司标题（发票抬头）
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx Group Limited</para>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 纳税人类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>03</para>
        /// </summary>
        [NameInMap("tax_payer_qualification")]
        [Validation(Required=true)]
        public string TaxPayerQualification { get; set; }

        // 注册国家编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>HK</para>
        /// </summary>
        [NameInMap("register_country")]
        [Validation(Required=true)]
        public string RegisterCountry { get; set; }

        // 公司注册地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 纳税人识别号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("tax_no")]
        [Validation(Required=false)]
        public string TaxNo { get; set; }

        // 公司注册电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>17797768855</para>
        /// </summary>
        [NameInMap("telephone")]
        [Validation(Required=false)]
        public string Telephone { get; set; }

        // 开户行
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国人民银行</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 银行账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>12312312</para>
        /// </summary>
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

    }

}
