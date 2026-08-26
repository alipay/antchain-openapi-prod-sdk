// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 退换票信息
    public class ReturnInvoiceInfo : TeaModel {
        // 发票ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>33445566556</para>
        /// </summary>
        [NameInMap("invoice_id")]
        [Validation(Required=true)]
        public string InvoiceId { get; set; }

        // 退换票类型,01:退票 02:换票
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("return_order_type")]
        [Validation(Required=true)]
        public string ReturnOrderType { get; set; }

        // 退换票原因类型, 01：发票介质修改  02：发票类型修改  03：发票信息修改 05：其他 06：不需要发票
        /// <summary>
        /// <b>Example:</b>
        /// <para>06</para>
        /// </summary>
        [NameInMap("return_reason_type")]
        [Validation(Required=true)]
        public string ReturnReasonType { get; set; }

        // 备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>备注</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 快递单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>3444</para>
        /// </summary>
        [NameInMap("tracking_no")]
        [Validation(Required=false)]
        public string TrackingNo { get; set; }

        // 快递公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX快递</para>
        /// </summary>
        [NameInMap("express_company_name")]
        [Validation(Required=false)]
        public string ExpressCompanyName { get; set; }

        // 是否认证，1：已认证抵扣 0：未认证抵扣
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("auth")]
        [Validation(Required=false)]
        public string Auth { get; set; }

    }

}
