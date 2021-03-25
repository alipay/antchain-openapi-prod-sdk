// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 鉴权结果
    public class Judgement : TeaModel {
        // 唯一ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 是否通过
        [NameInMap("pass")]
        [Validation(Required=true)]
        public bool? Pass { get; set; }

        // 失败原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 解决方案
        [NameInMap("solution")]
        [Validation(Required=false)]
        public string Solution { get; set; }

    }

}
