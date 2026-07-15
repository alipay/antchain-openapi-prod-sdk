// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云蚂蚁区块链账户创建信息
    public class ALiYunChainAccount : TeaModel {
        // account_private_key
        /// <summary>
        /// <b>Example:</b>
        /// <para>account_private_key</para>
        /// </summary>
        [NameInMap("account_private_key")]
        [Validation(Required=false)]
        public string AccountPrivateKey { get; set; }

        // account_public_key
        /// <summary>
        /// <b>Example:</b>
        /// <para>account_public_key</para>
        /// </summary>
        [NameInMap("account_public_key")]
        [Validation(Required=false)]
        public string AccountPublicKey { get; set; }

        // account_recover_private_key
        /// <summary>
        /// <b>Example:</b>
        /// <para>account_recover_private_key</para>
        /// </summary>
        [NameInMap("account_recover_private_key")]
        [Validation(Required=false)]
        public string AccountRecoverPrivateKey { get; set; }

        // account_recover_public_key
        /// <summary>
        /// <b>Example:</b>
        /// <para>account_recover_public_key</para>
        /// </summary>
        [NameInMap("account_recover_public_key")]
        [Validation(Required=false)]
        public string AccountRecoverPublicKey { get; set; }

        // ant_chain_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_id</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // account
        /// <summary>
        /// <b>Example:</b>
        /// <para>account</para>
        /// </summary>
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

    }

}
