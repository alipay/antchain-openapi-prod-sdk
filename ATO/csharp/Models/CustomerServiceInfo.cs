// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 客服信息
    public class CustomerServiceInfo : TeaModel {
        // 公司社会统一信息代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx公司</para>
        /// </summary>
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 处理类型:
        // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        /// <summary>
        /// <b>Example:</b>
        /// <para>MERCHANT_PROCESS</para>
        /// </summary>
        [NameInMap("process_type")]
        [Validation(Required=false)]
        public string ProcessType { get; set; }

    }

}
