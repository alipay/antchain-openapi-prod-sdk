// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // DidDoc中service的信息
    public class DisServicesInfo : TeaModel {
        // did doc service扩展字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("extesion")]
        [Validation(Required=false)]
        public string Extesion { get; set; }

        // did doc service id
        /// <summary>
        /// <b>Example:</b>
        /// <para>didauth-1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 服务endpoint
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://auth.mydid.agent.com">http://auth.mydid.agent.com</a></para>
        /// </summary>
        [NameInMap("service_endpoint")]
        [Validation(Required=true)]
        public string ServiceEndpoint { get; set; }

        // service type
        /// <summary>
        /// <b>Example:</b>
        /// <para>DidAuthService</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // EXIST
        // CONFLICT
        // VALID
        // INVALID
        /// <summary>
        /// <b>Example:</b>
        /// <para>描述</para>
        /// </summary>
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
