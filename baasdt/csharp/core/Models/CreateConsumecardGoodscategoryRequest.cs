// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateConsumecardGoodscategoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 商品类别描述
        [NameInMap("category_description")]
        [Validation(Required=true)]
        public string CategoryDescription { get; set; }

        // 商品分类id（ffaaaaabbbbbbcccccc，如果存在返回失败）
        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        // 商品类别名称
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

    }

}
