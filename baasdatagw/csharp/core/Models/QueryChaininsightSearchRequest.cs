// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class QueryChaininsightSearchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟ID
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public string UnionId { get; set; }

        // 需要搜索的链ID列表，为空是表示搜索联盟内的所有链
        [NameInMap("biz_ids")]
        [Validation(Required=false)]
        public List<string> BizIds { get; set; }

        // 搜索请求
        [NameInMap("request")]
        [Validation(Required=true)]
        public ChainInsightSearchRequest Request { get; set; }

    }

}
