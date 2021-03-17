// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateInternalTransResponse : TeaModel {
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

        // 返回事务ID，全局唯一
        [NameInMap("transaction_id")]
        [Validation(Required=false)]
        public string TransactionId { get; set; }

        // 可信时间信息
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public TsrResponse Tsr { get; set; }

    }

}
