// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS_SECURITY.Models
{
    // 键值对
    public class KeyContentPropertyPair : TeaModel {
        // 123
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 123
        [NameInMap("value")]
        [Validation(Required=true)]
        public ContentProperty Value { get; set; }

    }

}
