// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UpdateNotarizationOrderResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 状态是否更新成功
        [NameInMap("accepted")]
        [Validation(Required=false)]
        public bool? Accepted { get; set; }

        // 如更新失败，返回失败原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

    }

}
