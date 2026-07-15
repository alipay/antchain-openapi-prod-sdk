// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 可验证声明相关的事件
    public class VCEvent : TeaModel {
        // 事件对应的合约方法
        /// <summary>
        /// <b>Example:</b>
        /// <para>add</para>
        /// </summary>
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 本次事件的触发者
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 事件在区块的高度
        /// <summary>
        /// <b>Example:</b>
        /// <para>6300</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // 该VC的颁发者
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychian:xxxxx</para>
        /// </summary>
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 有效，或者无效
        /// <summary>
        /// <b>Example:</b>
        /// <para>valid</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 该vc的接受者
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash256(did:mychain:xxxxx)</para>
        /// </summary>
        [NameInMap("subjec")]
        [Validation(Required=true)]
        public string Subjec { get; set; }

        // 交易hash
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易在区块中的index
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("tx_index")]
        [Validation(Required=true)]
        public long? TxIndex { get; set; }

        // 可验证声明Hash值
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash256(可验证声明)</para>
        /// </summary>
        [NameInMap("vc_hash")]
        [Validation(Required=true)]
        public string VcHash { get; set; }

        // vcid
        /// <summary>
        /// <b>Example:</b>
        /// <para>vc:mychain:XXXX</para>
        /// </summary>
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

    }

}
