// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class CreateProductActionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 操作点ID
        [NameInMap("action_id")]
        [Validation(Required=true)]
        public string ActionId { get; set; }

        // 操作点所属功能分类ID
        [NameInMap("category_id")]
        [Validation(Required=false)]
        public string CategoryId { get; set; }

        // 操作点描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 操作点名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 操作点所属产品
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

    }

}
