// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ff57c3b0e36d40419ee97697bacb6c79.Models
{
    // 核身信息, 授权时传入
    public class CertificationInfo : TeaModel {
        // 是否授权
        [NameInMap("certification_flag")]
        [Validation(Required=false)]
        public bool? CertificationFlag { get; set; }

        // 实人认证唯一标识
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

    }

}
