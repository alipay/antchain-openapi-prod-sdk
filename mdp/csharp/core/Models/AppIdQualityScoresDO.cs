// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDP.Models
{
    // AppIdQualityScoresDO
    public class AppIdQualityScoresDO : TeaModel {
        // 模型id
        [NameInMap("modelid")]
        [Validation(Required=true)]
        public string Modelid { get; set; }

        // 分数
        [NameInMap("qualityscore")]
        [Validation(Required=true)]
        public string Qualityscore { get; set; }

    }

}
