// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SMARTPROMOTION.Models
{
    public class QueryAntchainAtoPromotionUserunvisitedappidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝用户uid
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 订阅的appid列表，不支持的appid会自动忽略
        [NameInMap("app_id_list")]
        [Validation(Required=true)]
        public List<string> AppIdList { get; set; }

        // 默认appid，无法判断推荐结果时返回此默认值
        [NameInMap("default_app_id")]
        [Validation(Required=true)]
        public string DefaultAppId { get; set; }

    }

}
