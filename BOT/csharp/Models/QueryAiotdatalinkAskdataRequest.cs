// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryAiotdatalinkAskdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 场景编码
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 问数的问题
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 会话ID
        [NameInMap("conversation_id")]
        [Validation(Required=true)]
        public string ConversationId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 序列号，用于表示同一时间请求序号
        [NameInMap("caller")]
        [Validation(Required=false)]
        public string Caller { get; set; }

    }

}
