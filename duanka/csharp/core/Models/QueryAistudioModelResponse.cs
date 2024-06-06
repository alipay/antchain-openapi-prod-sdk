// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class QueryAistudioModelResponse : TeaModel {
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

        // 业务唯一id
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 压测报告
        [NameInMap("pressure_report")]
        [Validation(Required=false)]
        public string PressureReport { get; set; }

        // 运行态报告
        [NameInMap("runtime_report")]
        [Validation(Required=false)]
        public string RuntimeReport { get; set; }

        // 安全报告
        [NameInMap("safety_report")]
        [Validation(Required=false)]
        public string SafetyReport { get; set; }

    }

}
