// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 配置项
    public class ConfigEntity : TeaModel {
        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 英文描述
        [NameInMap("desc_en")]
        [Validation(Required=true)]
        public string DescEn { get; set; }

        // 中文描述
        [NameInMap("desc_cn")]
        [Validation(Required=true)]
        public string DescCn { get; set; }

    }

}
