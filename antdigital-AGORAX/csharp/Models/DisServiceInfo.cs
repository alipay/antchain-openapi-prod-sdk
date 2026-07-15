// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // dis服务发现对象
    public class DisServiceInfo : TeaModel {
        // 提供服务的did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxxxxxxx</para>
        /// </summary>
        [NameInMap("controller")]
        [Validation(Required=true)]
        public string Controller { get; set; }

        // 服务地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.xxxx.com/xxxx">www.xxxx.com/xxxx</a></para>
        /// </summary>
        [NameInMap("end_point")]
        [Validation(Required=true)]
        public string EndPoint { get; set; }

        // 服务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:service:xxxxxx</para>
        /// </summary>
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 服务类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

    }

}
