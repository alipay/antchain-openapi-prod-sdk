// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 通过controller注册用户
    public class VcControllerAddUserRegisterPayload : TeaModel {
        // 注册用户did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxxx</para>
        /// </summary>
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 用户did对应的授权公钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 业务区块连的bizid
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("vc_channel")]
        [Validation(Required=false, MaxLength=32)]
        public string VcChannel { get; set; }

    }

}
