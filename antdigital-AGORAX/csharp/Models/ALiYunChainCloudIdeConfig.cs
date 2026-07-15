// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云CloudIde的配置
    public class ALiYunChainCloudIdeConfig : TeaModel {
        // bizid
        /// <summary>
        /// <b>Example:</b>
        /// <para>bizid</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // name
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // trial_account
        /// <summary>
        /// <b>Example:</b>
        /// <para>trial_account</para>
        /// </summary>
        [NameInMap("trial_account")]
        [Validation(Required=false)]
        public string TrialAccount { get; set; }

        // trial_account_private_key
        /// <summary>
        /// <b>Example:</b>
        /// <para>trial_account_private_key</para>
        /// </summary>
        [NameInMap("trial_account_private_key")]
        [Validation(Required=false)]
        public string TrialAccountPrivateKey { get; set; }

        // ant_chain_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_id</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // ant_chain_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_name</para>
        /// </summary>
        [NameInMap("ant_chain_name")]
        [Validation(Required=false)]
        public string AntChainName { get; set; }

        // version
        /// <summary>
        /// <b>Example:</b>
        /// <para>version</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
