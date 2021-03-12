// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryCreditTransferApplyResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 查询结果信息，失败时为失败原因信息
        [NameInMap("query_msg")]
        [Validation(Required=false)]
        public string QueryMsg { get; set; }

        // 查询结果状态   
        // -1:注册失败， 0:注册中， 1:注册完成
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
