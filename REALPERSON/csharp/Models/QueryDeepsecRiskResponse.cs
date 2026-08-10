// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryDeepsecRiskResponse : TeaModel {
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

        // 是否调用成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 业务返回码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // message	返回信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 设备风险标签
        [NameInMap("risk_info")]
        [Validation(Required=false)]
        public string RiskInfo { get; set; }

        // 设备染色风险标签
        [NameInMap("dc_risk")]
        [Validation(Required=false)]
        public string DcRisk { get; set; }

        // 业务风险标签
        [NameInMap("biz_risk")]
        [Validation(Required=false)]
        public string BizRisk { get; set; }

        // 设备元数据
        [NameInMap("device_info")]
        [Validation(Required=false)]
        public string DeviceInfo { get; set; }

    }

}
