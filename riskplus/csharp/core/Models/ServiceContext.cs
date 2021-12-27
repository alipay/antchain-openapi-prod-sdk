// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 服务上下文包括环境信息和用户信息
    public class ServiceContext : TeaModel {
        // 客户端IP
        [NameInMap("client_ip")]
        [Validation(Required=false)]
        public string ClientIp { get; set; }

        // 客户端UMID
        [NameInMap("client_pcidguid")]
        [Validation(Required=false)]
        public string ClientPcidguid { get; set; }

        // 服务器名
        [NameInMap("server_name")]
        [Validation(Required=false)]
        public string ServerName { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
