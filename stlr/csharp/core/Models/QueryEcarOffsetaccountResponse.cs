// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryEcarOffsetaccountResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 碳普惠项目编码
        [NameInMap("project_no")]
        [Validation(Required=false)]
        public string ProjectNo { get; set; }

        // 账户DID
        [NameInMap("account_did")]
        [Validation(Required=false)]
        public string AccountDid { get; set; }

        // 账户减碳量余额
        [NameInMap("offset_balance")]
        [Validation(Required=false)]
        public string OffsetBalance { get; set; }

    }

}
