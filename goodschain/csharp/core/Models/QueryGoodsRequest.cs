// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class QueryGoodsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品id
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 溯源信息枚举：ASSET_ONLY，只返回物权信息；LIST_ROAM_TRACE，转让溯源信息；LIST_TRACE，所有溯源信息；ASSET_ALL，返回以上所有信息（默认）
        [NameInMap("trace_type")]
        [Validation(Required=false)]
        public string TraceType { get; set; }

        // 当前页（默认为1）
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页大小（默认为10）
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
