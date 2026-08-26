// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票购方信息
    public class ApplyInvoiceBuyer : TeaModel {
        // 购方地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海市黄浦区</para>
        /// </summary>
        [NameInMap("buyer_address")]
        [Validation(Required=false)]
        public string BuyerAddress { get; set; }

        // 银行账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>23355434</para>
        /// </summary>
        [NameInMap("buyer_bank_account")]
        [Validation(Required=false)]
        public string BuyerBankAccount { get; set; }

        // 银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>招商银行</para>
        /// </summary>
        [NameInMap("buyer_bank_name")]
        [Validation(Required=false)]
        public string BuyerBankName { get; set; }

        // 抬头
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx公司</para>
        /// </summary>
        [NameInMap("buyer_invoice_title")]
        [Validation(Required=true)]
        public string BuyerInvoiceTitle { get; set; }

        // 税号
        /// <summary>
        /// <b>Example:</b>
        /// <para>3344555</para>
        /// </summary>
        [NameInMap("buyer_tax_no")]
        [Validation(Required=false)]
        public string BuyerTaxNo { get; set; }

        // 电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>0571-94848</para>
        /// </summary>
        [NameInMap("buyer_telephone")]
        [Validation(Required=false)]
        public string BuyerTelephone { get; set; }

        // 纳税人资格类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("tax_payer_qualification")]
        [Validation(Required=true)]
        public string TaxPayerQualification { get; set; }

        // 客户开票配置ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2344</para>
        /// </summary>
        [NameInMap("buyer_config_id")]
        [Validation(Required=false)]
        public string BuyerConfigId { get; set; }

    }

}
