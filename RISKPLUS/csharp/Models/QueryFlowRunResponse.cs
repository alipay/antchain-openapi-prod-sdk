// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryFlowRunResponse : TeaModel {
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

        // 内部 flow 执行单号，Flow 执行单号，问题定位时使用。
        [NameInMap("run_no")]
        [Validation(Required=false)]
        public string RunNo { get; set; }

        // 本次执行对应的 Flow code。
        [NameInMap("flow_code")]
        [Validation(Required=false)]
        public string FlowCode { get; set; }

        // Flow 状态，仅支持 RUNNING、SUCCESS、FAILED。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // Flow 执行产出列表，每个元素为 FlowRunOutput 结构。仅当 status=SUCCESS 时返回产出内容；可包含文本、数字、布尔值、JSON 和文件。FILE 类型的 value 为短期有效的 HTTPS 下载地址。存在多个产出或多个文件时返回多个列表元素；RUNNING 或 FAILED 状态下返回空列表。
        [NameInMap("outputs")]
        [Validation(Required=false)]
        public List<FlowRunOutput> Outputs { get; set; }

    }

}
