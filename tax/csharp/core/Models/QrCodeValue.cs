// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 二维码
    public class QrCodeValue : TeaModel {
        // 二维码链接
        [NameInMap("qr_code_url")]
        [Validation(Required=true)]
        public string QrCodeUrl { get; set; }

        // 二维码描述信息。例如：请使用 xxx app 扫码登录
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 二维码在多长时间后失效，单位：秒
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public long? Timeout { get; set; }

    }

}
