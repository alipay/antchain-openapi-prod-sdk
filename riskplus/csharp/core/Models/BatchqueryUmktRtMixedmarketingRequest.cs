// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class BatchqueryUmktRtMixedmarketingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景策略id列表
        [NameInMap("scene_strategy_ids")]
        [Validation(Required=true)]
        public List<long?> SceneStrategyIds { get; set; }

        // 场景策略集合code，对标场景策略id列表，一般不可变
        [NameInMap("scene_strategy_set_code")]
        [Validation(Required=false)]
        public string SceneStrategySetCode { get; set; }

        // 查询协议模版
        [NameInMap("query_template")]
        [Validation(Required=true)]
        public string QueryTemplate { get; set; }

        // 查询的用户凭证列表
        [NameInMap("customer_keys")]
        [Validation(Required=true)]
        public List<string> CustomerKeys { get; set; }

        // 业务流水号，uuid
        [NameInMap("biz_serial_no")]
        [Validation(Required=true)]
        public string BizSerialNo { get; set; }

    }

}
