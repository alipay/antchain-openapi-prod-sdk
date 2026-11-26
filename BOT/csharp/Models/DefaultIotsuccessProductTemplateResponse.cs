// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class DefaultIotsuccessProductTemplateResponse : TeaModel {
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

        // 枚举:NEW_TEMPLATE_SELECTIONS
        [NameInMap("effective_for")]
        [Validation(Required=true)]
        public string EffectiveFor { get; set; }

        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

    }

}
