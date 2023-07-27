// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class CreateOauthServiceaccountResponse : TeaModel {
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

        // 服务账号ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 服务账号描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 服务账号别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

    }

}
