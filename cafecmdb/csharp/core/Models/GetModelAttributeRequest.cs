// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class GetModelAttributeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 字段所属模型的唯一标识
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 要获取的字段的唯一标识
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

    }

}
