// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryWithholdAgreementurlResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 成功
        [NameInMap("result_message")]
        [Validation(Required=false)]
        public string ResultMessage { get; set; }

        // 代扣协议签署的入口
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
