// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // NameValuePair
    public class NameValuePair : TeaModel {
        // 字段名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 字段值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
