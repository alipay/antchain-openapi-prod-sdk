// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 代扣服务返回对象
    public class AntdigitalWithHoldResponse : TeaModel {
        // 网关返回码
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 网关返回码描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>Business Failed</para>
        /// </summary>
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        // 务返回码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACQ.TRADE_HAS_SUCCESS</para>
        /// </summary>
        [NameInMap("sub_code")]
        [Validation(Required=true)]
        public string SubCode { get; set; }

        // 业务返回码描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>交易已被支付</para>
        /// </summary>
        [NameInMap("sub_msg")]
        [Validation(Required=true)]
        public string SubMsg { get; set; }

        // 结果返回内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{__}</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 响应签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>DZXh8eeTuAHoYE3w1J+POiPhfDxOYBfUNn1lkeT/V7P4zJdyojWEa6IZs6Hz0yDW5Cp/viufUb5I0/V5WENS3OYR8zRedqo6D+fUTdLHdc+EFyCkiQhBxIzgngPdPdfp1PIS7BdhhzrsZHbRqb7o4k3Dxc+AAnFauu4V6Zdwczo=</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
