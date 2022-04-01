// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    public class QueryCommodityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 关键词，模糊查询商品名称、商品code、商品格式化编码
        [NameInMap("keyword")]
        [Validation(Required=true)]
        public string Keyword { get; set; }

        // 搜索返回条数限制
        [NameInMap("limit")]
        [Validation(Required=false)]
        public long? Limit { get; set; }

    }

}
