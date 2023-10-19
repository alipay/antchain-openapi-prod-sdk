// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    // eKYT风险标签
    public class RiskModel : TeaModel {
        // 标签名称
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 风险值
        [NameInMap("model_value")]
        [Validation(Required=true)]
        public string ModelValue { get; set; }

        // 风险标签描述
        [NameInMap("model_comment")]
        [Validation(Required=true)]
        public string ModelComment { get; set; }

    }

}
