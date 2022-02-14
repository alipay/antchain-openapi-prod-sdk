// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ExecContractCourtdeductResponse : TeaModel {
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

        // 是否执行成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 扣款金额，单位：分
        [NameInMap("pay_money")]
        [Validation(Required=false)]
        public long? PayMoney { get; set; }

        // 扣款详情信息
        [NameInMap("pay_detail_msg")]
        [Validation(Required=false)]
        public string PayDetailMsg { get; set; }

    }

}
