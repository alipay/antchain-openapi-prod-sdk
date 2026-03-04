// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryAgentFinancialRiskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户基础信息
        [NameInMap("user_profile")]
        [Validation(Required=false)]
        public UserProfile UserProfile { get; set; }

        // 交易明细信息
        [NameInMap("transaction_details")]
        [Validation(Required=false)]
        public TransactionDetails TransactionDetails { get; set; }

        // 风险评估因子列表
        [NameInMap("risk_factors")]
        [Validation(Required=false)]
        public List<RiskFactorDetail> RiskFactors { get; set; }

        // 业务上下文信息
        [NameInMap("business_context")]
        [Validation(Required=false)]
        public NameValuePair BusinessContext { get; set; }

        // 风险等级标识（LOW/MEDIUM/HIGH/URGENT）
        [NameInMap("risk_level")]
        [Validation(Required=false)]
        public string RiskLevel { get; set; }

        // 接口超时时间（毫秒）
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

    }

}
