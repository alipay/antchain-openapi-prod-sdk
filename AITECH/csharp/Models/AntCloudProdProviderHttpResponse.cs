// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 网关响应模型
    public class AntCloudProdProviderHttpResponse : TeaModel {
        // maya返回结果
        [NameInMap("response")]
        [Validation(Required=true)]
        public MayaStreamResult Response { get; set; }

        // 签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>5Okl4F2SNc9L2zrWCF8xZ+QPUyA=</para>
        /// </summary>
        [NameInMap("sign")]
        [Validation(Required=true)]
        public string Sign { get; set; }

    }

}
