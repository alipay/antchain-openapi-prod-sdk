// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseRiskResponse : TeaModel {
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

        // 风控结果
        // SUCCESS：通过
        // FAIL：不通过
        [NameInMap("paas")]
        [Validation(Required=false)]
        public string Paas { get; set; }

        // 风控识别id，与订单id对应
        [NameInMap("risk_id")]
        [Validation(Required=false)]
        public string RiskId { get; set; }

        // 风控规则对应的版本号
        [NameInMap("risk_version")]
        [Validation(Required=false)]
        public string RiskVersion { get; set; }

    }

}
