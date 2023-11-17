// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class QueryAntsaasStaffingcContractCaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署流程ID,传值默认查询签署流程下全部任务状态
        [NameInMap("sign_flow_id")]
        [Validation(Required=true)]
        public string SignFlowId { get; set; }

        // 签署任务id
        [NameInMap("sign_task_id")]
        [Validation(Required=true)]
        public string SignTaskId { get; set; }

        // 业务唯一流水号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

    }

}
