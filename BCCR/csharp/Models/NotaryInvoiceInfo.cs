// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 出证开票信息
    public class NotaryInvoiceInfo : TeaModel {
        // 开票类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PAPER纸质，ELECTRIC电子</para>
        /// </summary>
        [NameInMap("billing_type")]
        [Validation(Required=true)]
        public string BillingType { get; set; }

        // 发票类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL增值税普通发票、SPECIAL增值税专用发票 个人只能开具普通发票</para>
        /// </summary>
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 主体类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>个人PERSON，机构ENTERPRISE</para>
        /// </summary>
        [NameInMap("subject_type")]
        [Validation(Required=true)]
        public string SubjectType { get; set; }

        // 发票抬头
        /// <summary>
        /// <b>Example:</b>
        /// <para>姓名/单位名称</para>
        /// </summary>
        [NameInMap("invoice_name")]
        [Validation(Required=true)]
        public string InvoiceName { get; set; }

        // 纳税人识别号
        /// <summary>
        /// <b>Example:</b>
        /// <para>发票抬头为机构时必填</para>
        /// </summary>
        [NameInMap("ratepayer_code")]
        [Validation(Required=false)]
        public string RatepayerCode { get; set; }

        // 开户行
        /// <summary>
        /// <b>Example:</b>
        /// <para>发票抬头为机构时必填</para>
        /// </summary>
        [NameInMap("bank_type")]
        [Validation(Required=false)]
        public string BankType { get; set; }

        // 开户行账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>发票抬头为机构时必填</para>
        /// </summary>
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

        // 单位地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>发票抬头为机构时必填</para>
        /// </summary>
        [NameInMap("unit_address")]
        [Validation(Required=false)]
        public string UnitAddress { get; set; }

        // 单位电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>发票抬头为机构时必填</para>
        /// </summary>
        [NameInMap("unit_phone")]
        [Validation(Required=false)]
        public string UnitPhone { get; set; }

        // 发票收件信息
        [NameInMap("delivery")]
        [Validation(Required=false)]
        public DeliveryInfo Delivery { get; set; }

    }

}
