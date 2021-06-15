// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 核身信息, 授权时传入
    public class CertificationInfo : TeaModel {
        // 是否授权
        [NameInMap("certification_flag")]
        [Validation(Required=false)]
        public bool? CertificationFlag { get; set; }

    }

}
