// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ExecFlowRunRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要执行的任务唯一 code
        [NameInMap("flow_code")]
        [Validation(Required=true)]
        public string FlowCode { get; set; }

        // 调用方生成的业务订单号，用于请求幂等。同一云租户内必须唯一；请求重试时须使用相同订单号。可使用调用方已有业务单号或 UUID。大小写敏感，建议统一使用大写。
        [NameInMap("client_order_no")]
        [Validation(Required=true)]
        public string ClientOrderNo { get; set; }

        // Flow 执行入参，使用 JSON 字符串传递，顶层必须为 JSON Object。具体字段、类型和必填要求由已发布 Flow 的输入定义决定。无入参的 Flow 可不传或传 {}，未传时服务端按 {} 处理；如果 Flow 定义了必填字段但实际未提供，将返回参数校验错误。
        [NameInMap("input_json")]
        [Validation(Required=false)]
        public string InputJson { get; set; }

    }

}
