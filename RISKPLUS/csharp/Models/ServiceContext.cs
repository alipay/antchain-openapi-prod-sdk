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
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.214.138.14</para>
        /// </summary>
        [NameInMap("client_ip")]
        [Validation(Required=false)]
        public string ClientIp { get; set; }

        // 客户端UMID
        /// <summary>
        /// <b>Example:</b>
        /// <para>WV1bz5927da956db072d3001792dcc67e</para>
        /// </summary>
        [NameInMap("client_pcidguid")]
        [Validation(Required=false)]
        public string ClientPcidguid { get; set; }

        // 服务器名
        /// <summary>
        /// <b>Example:</b>
        /// <para>server</para>
        /// </summary>
        [NameInMap("server_name")]
        [Validation(Required=false)]
        public string ServerName { get; set; }

        // 会话ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>RZ1 2cz9oSg1GTGtGp9CwYtBbZMcD8DmobilecashierRZ12</para>
        /// </summary>
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088522384403582</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
