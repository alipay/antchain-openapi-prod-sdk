// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CheckAiidentificationGoodspointRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户调用标识
        [NameInMap("app_key")]
        [Validation(Required=true)]
        public string AppKey { get; set; }

        // 品类
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 品牌
        [NameInMap("brand")]
        [Validation(Required=true)]
        public string Brand { get; set; }

        // 款式
        [NameInMap("style")]
        [Validation(Required=true)]
        public string Style { get; set; }

        // 鉴定点信息
        [NameInMap("point_info")]
        [Validation(Required=true)]
        public BaiGoodsPoint PointInfo { get; set; }

    }

}
