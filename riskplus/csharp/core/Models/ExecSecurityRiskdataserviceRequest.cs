// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ExecSecurityRiskdataserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 风险数据服务请求事件属性详情
        [NameInMap("event_info")]
        [Validation(Required=true)]
        public string EventInfo { get; set; }

        // 反欺诈数据服务查询请求唯一凭证，为申请成功后得到，当请求类型是query时必填
        [NameInMap("risk_data_serviace_apply_id")]
        [Validation(Required=false)]
        public string RiskDataServiaceApplyId { get; set; }

        // 反欺诈风险数据服务请求类型（query or apply）
        [NameInMap("risk_data_service_type")]
        [Validation(Required=true)]
        public string RiskDataServiceType { get; set; }

    }

}
