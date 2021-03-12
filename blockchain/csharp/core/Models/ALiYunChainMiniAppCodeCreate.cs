// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链小程序交易二维码生成
    public class ALiYunChainMiniAppCodeCreate : TeaModel {
        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // transaction_hash
        [NameInMap("transaction_hash")]
        [Validation(Required=false)]
        public string TransactionHash { get; set; }

        // base64_q_r_code_p_n_g
        [NameInMap("base64_q_r_code_p_n_g")]
        [Validation(Required=false)]
        public string Base64QRCodePNG { get; set; }

        // q_r_code_content
        [NameInMap("q_r_code_content")]
        [Validation(Required=false)]
        public string QRCodeContent { get; set; }

    }

}
