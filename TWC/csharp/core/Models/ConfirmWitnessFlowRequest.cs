// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ConfirmWitnessFlowRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署确认数据
        [NameInMap("confirm_datas")]
        [Validation(Required=true)]
        public List<WitnessConfirmData> ConfirmDatas { get; set; }

        // 证据id列表，内部用户必传
        [NameInMap("evidence_ids")]
        [Validation(Required=false)]
        public List<string> EvidenceIds { get; set; }

        // 签署记录id列表，外部用户必传
        [NameInMap("signlog_ids")]
        [Validation(Required=false)]
        public List<string> SignlogIds { get; set; }

        // 签署票证
        [NameInMap("sign_ticket")]
        [Validation(Required=true)]
        public string SignTicket { get; set; }

        // 见证流程id
        [NameInMap("witness_flow_id")]
        [Validation(Required=true)]
        public string WitnessFlowId { get; set; }

        // 发起请求的实例应用ID
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 发起请求的鉴权token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
