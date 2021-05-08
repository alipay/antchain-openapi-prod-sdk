// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 核身初始化请求信息
    public class CertificationRequest : TeaModel {
        // 认证模式
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

    }

}
