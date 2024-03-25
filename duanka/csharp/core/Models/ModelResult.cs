// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // 模型结果
    public class ModelResult : TeaModel {
        // 分数
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

        // 模型id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

    }

}
