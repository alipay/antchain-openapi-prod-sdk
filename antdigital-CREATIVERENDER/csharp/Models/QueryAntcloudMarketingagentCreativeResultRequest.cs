// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class QueryAntcloudMarketingagentCreativeResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 消息ID
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 是否返回基金长图的子图列表，默认 false。为 true 时，在长图生成完成后返回 assistant_extra.sub_images；不影响长图生成流程。
        [NameInMap("return_sub_images")]
        [Validation(Required=false)]
        public bool? ReturnSubImages { get; set; }

    }

}
