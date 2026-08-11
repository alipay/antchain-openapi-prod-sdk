// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetTenantDingtokenResponse : TeaModel {
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

        // 钉钉企业授权token
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 	钉钉企业授权应用ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 钉钉企业ID
        [NameInMap("corp_id")]
        [Validation(Required=true)]
        public string CorpId { get; set; }

        // 创建时间，ISO8601格式
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 前端授权ticket
        [NameInMap("js_ticket")]
        [Validation(Required=true)]
        public string JsTicket { get; set; }

        // 最近一次修改时间，ISO8601格式
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public string UpdateTime { get; set; }

    }

}
