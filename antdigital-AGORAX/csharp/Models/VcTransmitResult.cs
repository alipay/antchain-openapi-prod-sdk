// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // VC链上传输结果
    public class VcTransmitResult : TeaModel {
        // 成功或者失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_success")]
        [Validation(Required=true)]
        public bool? IsSuccess { get; set; }

        // 失败信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>失败信息</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 验证verifier did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychian:xxxxx</para>
        /// </summary>
        [NameInMap("target_verifier")]
        [Validation(Required=true)]
        public string TargetVerifier { get; set; }

        // 交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
