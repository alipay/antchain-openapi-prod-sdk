// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链小程序交易二维码生成
    public class ALiYunChainMiniAppCodeCreate : TeaModel {
        // ant_chain_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_id</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // transaction_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>transaction_hash</para>
        /// </summary>
        [NameInMap("transaction_hash")]
        [Validation(Required=false)]
        public string TransactionHash { get; set; }

        // base64_q_r_code_p_n_g
        /// <summary>
        /// <b>Example:</b>
        /// <para>base64_q_r_code_p_n_g</para>
        /// </summary>
        [NameInMap("base64_q_r_code_p_n_g")]
        [Validation(Required=false)]
        public string Base64QRCodePNG { get; set; }

        // q_r_code_content
        /// <summary>
        /// <b>Example:</b>
        /// <para>q_r_code_content</para>
        /// </summary>
        [NameInMap("q_r_code_content")]
        [Validation(Required=false)]
        public string QRCodeContent { get; set; }

    }

}
