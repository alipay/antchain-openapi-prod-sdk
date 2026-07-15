// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云蚂蚁链相关下载链接
    public class ALiYunDownloadPath : TeaModel {
        // client_crt_url
        /// <summary>
        /// <b>Example:</b>
        /// <para>client_crt_url</para>
        /// </summary>
        [NameInMap("client_crt_url")]
        [Validation(Required=false)]
        public string ClientCrtUrl { get; set; }

        // trust_ca_url
        /// <summary>
        /// <b>Example:</b>
        /// <para>trust_ca_url</para>
        /// </summary>
        [NameInMap("trust_ca_url")]
        [Validation(Required=false)]
        public string TrustCaUrl { get; set; }

        // ca_crt_url
        /// <summary>
        /// <b>Example:</b>
        /// <para>ca_crt_url</para>
        /// </summary>
        [NameInMap("ca_crt_url")]
        [Validation(Required=false)]
        public string CaCrtUrl { get; set; }

        // sdk_url
        /// <summary>
        /// <b>Example:</b>
        /// <para>sdk_url</para>
        /// </summary>
        [NameInMap("sdk_url")]
        [Validation(Required=false)]
        public string SdkUrl { get; set; }

    }

}
