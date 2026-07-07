// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证书送达信息
    public class ReceiveInfo : TeaModel {
        // 纸质公证书份数
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("copies")]
        [Validation(Required=false)]
        public long? Copies { get; set; }

        // 公证书类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PAPER:纸质公证书 E-PAPER:电子公证书 BOTH:纸质+电子公证书</para>
        /// </summary>
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 收件人信息
        [NameInMap("delivery_info")]
        [Validation(Required=true)]
        public DeliveryInfo DeliveryInfo { get; set; }

    }

}
