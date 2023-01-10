// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CountDubbridgeRepayReftrialResponse : TeaModel {
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

        // 还款计划试算结果
        [NameInMap("repay_trail_list")]
        [Validation(Required=false)]
        public List<RepayTrail> RepayTrailList { get; set; }

        // 还款日
        [NameInMap("repay_date")]
        [Validation(Required=false)]
        public string RepayDate { get; set; }

        // 还款账户
        [NameInMap("repay_account")]
        [Validation(Required=false)]
        public string RepayAccount { get; set; }

        // 总利息
        [NameInMap("total_interest")]
        [Validation(Required=false)]
        public long? TotalInterest { get; set; }

        // 授信信息
        [NameInMap("apply_info")]
        [Validation(Required=false)]
        public ApplyInfo ApplyInfo { get; set; }

    }

}
