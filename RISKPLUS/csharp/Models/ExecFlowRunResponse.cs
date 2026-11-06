// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ExecFlowRunResponse : TeaModel {
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

        // 生成的 Flow 执行单号，用于后续内部执行和问题排查。
        [NameInMap("run_no")]
        [Validation(Required=false)]
        public string RunNo { get; set; }

        // 本次执行对应的已发布 Flow 编码。
        [NameInMap("flow_code")]
        [Validation(Required=false)]
        public string FlowCode { get; set; }

        // 创建完成后的执行状态，固定返回 RUNNING。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 用户须知，用于展示本平台的使用须知。
        [NameInMap("user_notice")]
        [Validation(Required=false)]
        public string UserNotice { get; set; }

        // 平台生成的计费业务订单号，用于计费查询、对账和问题排查。同一次执行的启动与查询接口返回相同值；与调用方传入的 client_order_no、执行单号 run_no 不同。未生成计费单时可能为空。
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

    }

}
