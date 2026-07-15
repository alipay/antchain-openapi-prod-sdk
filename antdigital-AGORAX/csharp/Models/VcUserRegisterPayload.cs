// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // VC Repo用户注册结构体
    public class VcUserRegisterPayload : TeaModel {
        // 用户did对应的授权公钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户did对应的授权公钥</para>
        /// </summary>
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // 业务区块连的bizid
        /// <summary>
        /// <b>Example:</b>
        /// <para>业务区块连的bizid</para>
        /// </summary>
        [NameInMap("vc_channel")]
        [Validation(Required=false, MaxLength=32)]
        public string VcChannel { get; set; }

    }

}
