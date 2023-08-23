// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryDeepsecRiskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区分不同应用
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // app_key
        [NameInMap("app_key")]
        [Validation(Required=false)]
        public string AppKey { get; set; }

        // 业务数据集合，包括业务数据如zimId，Map<String,String>
        [NameInMap("biz_data")]
        [Validation(Required=true)]
        public string BizData { get; set; }

        // 风险数据集合，包括加密的R风险数据、设备染色数据，Map<String, String>
        [NameInMap("risk_data")]
        [Validation(Required=true)]
        public string RiskData { get; set; }

    }

}
