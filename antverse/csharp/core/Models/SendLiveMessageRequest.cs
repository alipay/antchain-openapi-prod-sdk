// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ANTVERSE.Models
{
    public class SendLiveMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 问题
        [NameInMap("question")]
        [Validation(Required=false)]
        public string Question { get; set; }

        // 回答文本
        [NameInMap("answer")]
        [Validation(Required=true)]
        public string Answer { get; set; }

        // 插播类型(QA-问答插播,REAL_TIME-实时消息插播)
        [NameInMap("intercut_type")]
        [Validation(Required=true)]
        public string IntercutType { get; set; }

    }

}
