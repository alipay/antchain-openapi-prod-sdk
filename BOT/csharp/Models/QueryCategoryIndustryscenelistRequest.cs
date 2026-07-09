// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryCategoryIndustryscenelistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品类类型
        // 标准品类：standard
        // 自定义品类：custom
        [NameInMap("category_type")]
        [Validation(Required=true)]
        public string CategoryType { get; set; }

    }

}
