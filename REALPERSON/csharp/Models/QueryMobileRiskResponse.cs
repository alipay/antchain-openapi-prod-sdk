// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryMobileRiskResponse : TeaModel {
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

        // 设备相关数据，默认只返回apdid，由Map<String,String>序列化
        [NameInMap("device_info")]
        [Validation(Required=false)]
        public string DeviceInfo { get; set; }

        // 设备风险标签，由Map<String,String>序列化
        [NameInMap("risk_info")]
        [Validation(Required=false)]
        public string RiskInfo { get; set; }

    }

}
