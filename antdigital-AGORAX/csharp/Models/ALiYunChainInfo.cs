// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云链信息
    public class ALiYunChainInfo : TeaModel {
        // abnormal_nodes
        /// <summary>
        /// <b>Example:</b>
        /// <para>4</para>
        /// </summary>
        [NameInMap("abnormal_nodes")]
        [Validation(Required=false)]
        public long? AbnormalNodes { get; set; }

        // ant_chain_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_id</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // block_height
        /// <summary>
        /// <b>Example:</b>
        /// <para>2131</para>
        /// </summary>
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>123131212312</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // is_role
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("is_role")]
        [Validation(Required=false)]
        public bool? IsRole { get; set; }

        // node_number
        /// <summary>
        /// <b>Example:</b>
        /// <para>4</para>
        /// </summary>
        [NameInMap("node_number")]
        [Validation(Required=false)]
        public long? NodeNumber { get; set; }

        // normal
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("normal")]
        [Validation(Required=false)]
        public bool? Normal { get; set; }

        // transaction_sum
        /// <summary>
        /// <b>Example:</b>
        /// <para>312312</para>
        /// </summary>
        [NameInMap("transaction_sum")]
        [Validation(Required=false)]
        public long? TransactionSum { get; set; }

        // Version
        /// <summary>
        /// <b>Example:</b>
        /// <para>Version</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // node_infos
        /// <summary>
        /// <b>Example:</b>
        /// <para>node_infos</para>
        /// </summary>
        [NameInMap("node_infos")]
        [Validation(Required=false)]
        public List<ALiYunChainNodeInfo> NodeInfos { get; set; }

    }

}
