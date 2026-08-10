// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryCutpaymentsubBalanceResponse : TeaModel {
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

        // 账簿可用余额，单位：元；可用于提现，整数部分最长10位数，保留两位小数
        [NameInMap("available_amount")]
        [Validation(Required=false)]
        public string AvailableAmount { get; set; }

        // 账簿余额，单位：元；整数部分最长10位数，保留两位小数
        [NameInMap("curr_amount")]
        [Validation(Required=false)]
        public string CurrAmount { get; set; }

        // 扩展信息，预留字段
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

    }

}
