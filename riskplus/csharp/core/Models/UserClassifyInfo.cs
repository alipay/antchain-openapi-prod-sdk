// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户分层信息
    public class UserClassifyInfo : TeaModel {
        // 版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 流量分层
        [NameInMap("rate_classify")]
        [Validation(Required=true)]
        public string RateClassify { get; set; }

        // 流量扩展分层1
        [NameInMap("classify_ext1")]
        [Validation(Required=false)]
        public string ClassifyExt1 { get; set; }

        // 流量扩展分层2
        [NameInMap("classify_ext2")]
        [Validation(Required=false)]
        public string ClassifyExt2 { get; set; }

    }

}
