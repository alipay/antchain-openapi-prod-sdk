// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktScenestrategyTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 查询模版
        [NameInMap("query_template")]
        [Validation(Required=false)]
        public string QueryTemplate { get; set; }

        // 用户查询凭证列表
        // 
        [NameInMap("customer_keys")]
        [Validation(Required=true)]
        public List<string> CustomerKeys { get; set; }

        // 业务方流水号
        [NameInMap("biz_serial_no")]
        [Validation(Required=true)]
        public string BizSerialNo { get; set; }

        // 伪装租户id
        [NameInMap("pretend_tenant")]
        [Validation(Required=true)]
        public string PretendTenant { get; set; }

    }

}
