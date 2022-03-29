// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 列值翻译
    public class Translate : TeaModel {
        // 列值翻译的默认值
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // 列值翻译映射关系
        [NameInMap("mappings")]
        [Validation(Required=false)]
        public List<TranslateMapping> Mappings { get; set; }

    }

}
