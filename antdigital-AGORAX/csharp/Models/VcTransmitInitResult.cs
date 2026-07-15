// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // vc传输初始化结果
    public class VcTransmitInitResult : TeaModel {
        // 初始化成功与否
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_success")]
        [Validation(Required=true)]
        public bool? IsSuccess { get; set; }

        // 失败时返回的额外信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>附属消息</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 接受者did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxx</para>
        /// </summary>
        [NameInMap("target_verifier")]
        [Validation(Required=true)]
        public string TargetVerifier { get; set; }

        // 待签名的交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("need_signature_tx_hash")]
        [Validation(Required=true)]
        public string NeedSignatureTxHash { get; set; }

    }

}
