// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryDeepsecTsbmrqResponse : TeaModel {
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

        // 设备信息
        [NameInMap("device_info")]
        [Validation(Required=false)]
        public string DeviceInfo { get; set; }

        // 风险信息标签
        [NameInMap("risk_info")]
        [Validation(Required=false)]
        public string RiskInfo { get; set; }

        // 业务message
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
