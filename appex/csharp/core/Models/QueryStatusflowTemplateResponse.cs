// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class QueryStatusflowTemplateResponse : TeaModel {
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

        // 联盟ID
        [NameInMap("union_id")]
        [Validation(Required=false)]
        public string UnionId { get; set; }

        // 状态流模版名称
        [NameInMap("flow_name")]
        [Validation(Required=false)]
        public string FlowName { get; set; }

        // 自定义流程返回DTO
        [NameInMap("list_template_process")]
        [Validation(Required=false)]
        public List<FlowTemplate> ListTemplateProcess { get; set; }

    }

}
