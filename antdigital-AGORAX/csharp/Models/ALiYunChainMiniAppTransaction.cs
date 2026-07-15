// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链小程序交易查询信息
    public class ALiYunChainMiniAppTransaction : TeaModel {
        // authorized
        /// <summary>
        /// <b>Example:</b>
        /// <para>true,false</para>
        /// </summary>
        [NameInMap("authorized")]
        [Validation(Required=false)]
        public bool? Authorized { get; set; }

        // transaction_response
        /// <summary>
        /// <b>Example:</b>
        /// <para>transaction_response</para>
        /// </summary>
        [NameInMap("transaction_response")]
        [Validation(Required=false)]
        public string TransactionResponse { get; set; }

        // transaction_receipt
        /// <summary>
        /// <b>Example:</b>
        /// <para>transaction_receipt</para>
        /// </summary>
        [NameInMap("transaction_receipt")]
        [Validation(Required=false)]
        public string TransactionReceipt { get; set; }

    }

}
