// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class UpdateModelcategoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要更新的模型分组的唯一标识
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

        // 名称（全局唯一）
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
