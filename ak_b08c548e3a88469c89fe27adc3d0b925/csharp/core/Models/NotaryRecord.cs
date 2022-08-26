// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b08c548e3a88469c89fe27adc3d0b925.Models
{
    // 存证记录
    public class NotaryRecord : TeaModel {
        // 存证记录
        [NameInMap("attributes")]
        [Validation(Required=true)]
        public List<NameValuePair> Attributes { get; set; }

        // 二维码链接
        [NameInMap("qr_code_url")]
        [Validation(Required=true)]
        public string QrCodeUrl { get; set; }

    }

}
