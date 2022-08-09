// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Eb193ab60ccc42ddb781f570a741c3fa.Models
{
    // 键值对
    public class XNameValuePair : TeaModel {
        // 键名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 键值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
