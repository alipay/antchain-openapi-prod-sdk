// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // SwitchVO
    public class SwitchVO : TeaModel {
        // 唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 键值
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 开关
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
