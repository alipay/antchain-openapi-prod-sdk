// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 开票申请项
    public class InvoiceApplyItem : TeaModel {
        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("item_name")]
        [Validation(Required=true)]
        public string ItemName { get; set; }

        // 不含税金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>5520</para>
        /// </summary>
        [NameInMap("excluding_tax_of_amount")]
        [Validation(Required=true)]
        public string ExcludingTaxOfAmount { get; set; }

        // 商品CODE
        /// <summary>
        /// <b>Example:</b>
        /// <para>001</para>
        /// </summary>
        [NameInMap("item_code")]
        [Validation(Required=false)]
        public string ItemCode { get; set; }

        // 含税金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>3452</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 关联单据号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("invoice_rcpt_no")]
        [Validation(Required=false)]
        public string InvoiceRcptNo { get; set; }

    }

}
