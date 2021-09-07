// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class CreateGoodstemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商品定义描述，格式如示例
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 联盟id
        [NameInMap("league_id")]
        [Validation(Required=true)]
        public string LeagueId { get; set; }

    }

}
