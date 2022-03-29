// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 客户端信息
    // 
    public class ClientInfoDTO : TeaModel {
        // 客户端ID
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 客户端地址
        [NameInMap("client_addr")]
        [Validation(Required=true)]
        public string ClientAddr { get; set; }

        // 订阅详情
        [NameInMap("subscriptions")]
        [Validation(Required=true)]
        public List<SubscriptionDTO> Subscriptions { get; set; }

    }

}
