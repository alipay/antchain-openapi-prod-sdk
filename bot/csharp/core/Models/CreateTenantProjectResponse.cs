// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateTenantProjectResponse : TeaModel {
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

        // 返回租户唯一的项目id，可以用以管理不同业务。
        [NameInMap("project_uid")]
        [Validation(Required=false)]
        public string ProjectUid { get; set; }

        // 交易唯一ID
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

    }

}
