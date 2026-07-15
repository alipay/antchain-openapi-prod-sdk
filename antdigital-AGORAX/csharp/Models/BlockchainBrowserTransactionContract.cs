// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链浏览器合约链交易内容
    public class BlockchainBrowserTransactionContract : TeaModel {
        // data
        /// <summary>
        /// <b>Example:</b>
        /// <para>asdfasdfsadfsdafasd</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // from
        /// <summary>
        /// <b>Example:</b>
        /// <para>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // to
        /// <summary>
        /// <b>Example:</b>
        /// <para>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // gas
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("gas")]
        [Validation(Required=true)]
        public long? Gas { get; set; }

        // hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // nonce
        /// <summary>
        /// <b>Example:</b>
        /// <para>395460146568219584</para>
        /// </summary>
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // period
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // signature_list
        /// <summary>
        /// <b>Example:</b>
        /// <para>signature_list</para>
        /// </summary>
        [NameInMap("signature_list")]
        [Validation(Required=true)]
        public List<string> SignatureList { get; set; }

        // timestamp
        /// <summary>
        /// <b>Example:</b>
        /// <para>1604565299516</para>
        /// </summary>
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // transaction_type
        /// <summary>
        /// <b>Example:</b>
        /// <para>TX_DEPOSIT_DATA</para>
        /// </summary>
        [NameInMap("transaction_type")]
        [Validation(Required=true)]
        public string TransactionType { get; set; }

        // value
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

    }

}
