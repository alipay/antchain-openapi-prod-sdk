// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云账户信息
    public class ALiYunAccount : TeaModel {
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

        // account_public_key
        /// <summary>
        /// <b>Example:</b>
        /// <para>account_public_key</para>
        /// </summary>
        [NameInMap("account_public_key")]
        [Validation(Required=false)]
        public string AccountPublicKey { get; set; }

        // account_recovery_key
        /// <summary>
        /// <b>Example:</b>
        /// <para>account_recovery_key</para>
        /// </summary>
        [NameInMap("account_recovery_key")]
        [Validation(Required=false)]
        public string AccountRecoveryKey { get; set; }

        // account_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>account_status</para>
        /// </summary>
        [NameInMap("account_status")]
        [Validation(Required=false)]
        public string AccountStatus { get; set; }

        // 机构信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>uid-11321313131</para>
        /// </summary>
        [NameInMap("member_name")]
        [Validation(Required=false)]
        public string MemberName { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>112313123</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

    }

}
