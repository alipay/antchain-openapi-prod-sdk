// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // eKYT可信签约录入准备数据
    public class TrustSignInitData : TeaModel {
        // 请求唯一标识Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 签约秘钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>g9y47yjs</para>
        /// </summary>
        [NameInMap("sign_unique_id")]
        [Validation(Required=true)]
        public string SignUniqueId { get; set; }

    }

}
