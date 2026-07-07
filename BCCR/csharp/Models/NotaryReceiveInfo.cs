// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证出证送达信息
    public class NotaryReceiveInfo : TeaModel {
        // 公证书类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PAPER:纸质公证书 E-PAPER:电子公证书 BOTH:纸质+电子公证书</para>
        /// </summary>
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 公证书送达信息
        [NameInMap("receive_info")]
        [Validation(Required=true)]
        public ReceiveInfo ReceiveInfo { get; set; }

        // 开票信息
        [NameInMap("invoice_info")]
        [Validation(Required=false)]
        public NotaryInvoiceInfo InvoiceInfo { get; set; }

    }

}
