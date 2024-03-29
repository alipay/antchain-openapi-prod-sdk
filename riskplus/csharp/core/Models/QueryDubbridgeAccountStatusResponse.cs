// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAccountStatusResponse : TeaModel {
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

        // 授信申请状态
        [NameInMap("data")]
        [Validation(Required=false)]
        public CustomStatus Data { get; set; }

        // 支付账户签约结果
        [NameInMap("pay_method_lock_result")]
        [Validation(Required=false)]
        public PayMethodLockResult PayMethodLockResult { get; set; }

        // 支付账户锁定结果
        [NameInMap("fund_chain_lock_result")]
        [Validation(Required=false)]
        public List<FundChainLockResult> FundChainLockResult { get; set; }

    }

}
