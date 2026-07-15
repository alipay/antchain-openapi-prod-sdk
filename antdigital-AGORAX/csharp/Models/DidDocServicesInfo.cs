// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // Did Doc中的服务字段描述
    public class DidDocServicesInfo : TeaModel {
        // 服务的扩展字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>json string</para>
        /// </summary>
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
        // DidAuthService， 有且只能有一个，并且id必须为didauth-1；
        // VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
        /// <summary>
        /// <b>Example:</b>
        /// <para>service-id1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 服务的可访问地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://example.com">http://example.com</a></para>
        /// </summary>
        [NameInMap("service_endpoint")]
        [Validation(Required=true)]
        public string ServiceEndpoint { get; set; }

        // 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>KYBServiceType</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
