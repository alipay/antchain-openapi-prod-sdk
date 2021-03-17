// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CallbackArbitrationStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件文书号
        [NameInMap("acceptance_number")]
        [Validation(Required=false)]
        public string AcceptanceNumber { get; set; }

        // 案件编号
        [NameInMap("case_no")]
        [Validation(Required=true)]
        public string CaseNo { get; set; }

        // 确认时间时间戳
        [NameInMap("confirm_time")]
        [Validation(Required=false)]
        public long? ConfirmTime { get; set; }

        // 预处理案号
        [NameInMap("preacceptance_number")]
        [Validation(Required=false)]
        public string PreacceptanceNumber { get; set; }

        // 发送时间时间戳
        [NameInMap("send_time")]
        [Validation(Required=false)]
        public long? SendTime { get; set; }

        // 案件状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
