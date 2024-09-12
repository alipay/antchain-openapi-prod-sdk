// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNITYCS.Models
{
    // 元数据属性
    public class MetaDataAttr : TeaModel {
        // 元数据属性编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 元数据属性值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
