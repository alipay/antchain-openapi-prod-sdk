// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyPfWaybillfinancingResponse : TeaModel {
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

        // 融资支用Id
        [NameInMap("financing_id")]
        [Validation(Required=false)]
        public string FinancingId { get; set; }

        // 申请状态，
        // 融资申请失败 IN_VALID
        // 融资申请失败 F_APPLY_FAIL
        // 融资申请成功 F_APPLY_SUC
        // 融资申请成功 COMMIT
        // 融资核验中 VERIFYING
        // 融资核验失败 VERIFY_FAILURE
        // 融资订单生成成功 P_WITHDRAW
        // 融资成功 A_WITHDRAW
        // 融资失败 EXPIRED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
