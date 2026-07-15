// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // VC分享的结果
    public class VcShareResult : TeaModel {
        // 目标分享的VC的id
        /// <summary>
        /// <b>Example:</b>
        /// <para>vc:mychain:dec9725c55bc7ad28b97340230f211b2ad96a35f5131ce9f77c1bd7b67f919451572244785477124</para>
        /// </summary>
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 分享给目标接受者的did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214 </para>
        /// </summary>
        [NameInMap("target_did")]
        [Validation(Required=true)]
        public string TargetDid { get; set; }

        // 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
        /// <summary>
        /// <b>Example:</b>
        /// <para>388d0822df016aa66c954344e22c36ec89e4a4573ef0491220bd80c1fe3469cb</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 分享是否成功，true：成功，false：失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>true，false</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public bool? Status { get; set; }

        // 失败的对应原因信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>“失败原因”</para>
        /// </summary>
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

    }

}
