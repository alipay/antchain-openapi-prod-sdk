// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    public class QueryMessageFailedRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 消息事件编码
        [NameInMap("msg_key")]
        [Validation(Required=true)]
        public string MsgKey { get; set; }

        // 消费方id，例如appId，tenantId 只支持单个传入
        [NameInMap("consumer_id")]
        [Validation(Required=false)]
        public string ConsumerId { get; set; }

        // 消费者类型，例如TENANT, APP
        [NameInMap("consumer_type")]
        [Validation(Required=false)]
        public string ConsumerType { get; set; }

        // 每页条数，最大支持100条
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public string PageSize { get; set; }

        // 第几页
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public string PageNum { get; set; }

    }

}
