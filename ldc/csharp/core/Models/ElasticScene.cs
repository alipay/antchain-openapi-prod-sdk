// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性场景
    public class ElasticScene : TeaModel {
        // 场景名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 弹性场景状态，有效值（VALID，INVALID）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 弹性场景ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

    }

}
