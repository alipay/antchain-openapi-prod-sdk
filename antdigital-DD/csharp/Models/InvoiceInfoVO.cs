// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票信息
    public class InvoiceInfoVO : TeaModel {
        // 发票ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>233445656676</para>
        /// </summary>
        [NameInMap("invoice_id")]
        [Validation(Required=true)]
        public string InvoiceId { get; set; }

        // 发票编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>FULL_ELECTRONIC_INVOICE</para>
        /// </summary>
        [NameInMap("invoice_code")]
        [Validation(Required=false)]
        public string InvoiceCode { get; set; }

        // 发票号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>3455666767777</para>
        /// </summary>
        [NameInMap("invoice_no")]
        [Validation(Required=false)]
        public string InvoiceNo { get; set; }

        // 发票金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>220.09</para>
        /// </summary>
        [NameInMap("invoice_amt")]
        [Validation(Required=true)]
        public string InvoiceAmt { get; set; }

        // 发票类型,01专票 02普票 03营业税发票 04国际形式发票 05其它发票
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 发票的业务状态, 待开票: TO_INV, 开票中: INV_ING, 已开票: INVED, 退票中: INV_RETURN, 换票中: INV_REPLACE, 已失效: INV_DEP
        /// <summary>
        /// <b>Example:</b>
        /// <para>INVED</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发票介质，01：电子，02：纸质
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("invoice_material")]
        [Validation(Required=false)]
        public string InvoiceMaterial { get; set; }

        // 发票行信息
        [NameInMap("invoice_lines")]
        [Validation(Required=false)]
        public List<InvoiceLineVO> InvoiceLines { get; set; }

        // 开票日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("invoice_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InvoiceDate { get; set; }

    }

}
