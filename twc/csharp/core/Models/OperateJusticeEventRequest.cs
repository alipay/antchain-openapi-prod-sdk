// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class OperateJusticeEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件Id,创建案件返回的id
        [NameInMap("case_id")]
        [Validation(Required=true)]
        public long? CaseId { get; set; }

        // 维权记录id,发起维权返回的Id
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public long? RecordId { get; set; }

        // 事件类型(目前仅支持司法调解类):
        // 司法调解-JUDICIAL_MEDIATION
        // 仲裁-ARBITRATION
        // 执行-CARRIED_OUT
        // 补证-SUPPLEMENT
        [NameInMap("event_type")]
        [Validation(Required=true)]
        public string EventType { get; set; }

        // 针对事件响应的信息
        [NameInMap("operate_info")]
        [Validation(Required=true)]
        public JudicialEventOperateInfo OperateInfo { get; set; }

    }

}
