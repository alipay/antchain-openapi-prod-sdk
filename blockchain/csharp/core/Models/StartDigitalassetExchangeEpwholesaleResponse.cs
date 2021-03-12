// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDigitalassetExchangeEpwholesaleResponse : TeaModel {
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

        // 失败账户列表
        [NameInMap("fail_list")]
        [Validation(Required=false)]
        public List<string> FailList { get; set; }

        // 失败原因 0:成功 1:执行失败 2:线下配额数量不足
        [NameInMap("reason")]
        [Validation(Required=false)]
        public long? Reason { get; set; }

        // 成功账户列表
        [NameInMap("success_list")]
        [Validation(Required=false)]
        public List<string> SuccessList { get; set; }

    }

}
