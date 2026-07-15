// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云合约链信息
    public class ALiYunContractBlockchain : TeaModel {
        // name
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // bizid
        /// <summary>
        /// <b>Example:</b>
        /// <para>bizid</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // chain_type
        /// <summary>
        /// <b>Example:</b>
        /// <para>chain_type</para>
        /// </summary>
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // node_num
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("node_num")]
        [Validation(Required=false)]
        public long? NodeNum { get; set; }

        // member_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>member_status</para>
        /// </summary>
        [NameInMap("member_status")]
        [Validation(Required=false)]
        public string MemberStatus { get; set; }

        // block_height
        /// <summary>
        /// <b>Example:</b>
        /// <para>4</para>
        /// </summary>
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // transactions
        /// <summary>
        /// <b>Example:</b>
        /// <para>121</para>
        /// </summary>
        [NameInMap("transactions")]
        [Validation(Required=false)]
        public long? Transactions { get; set; }

        // network
        /// <summary>
        /// <b>Example:</b>
        /// <para>network</para>
        /// </summary>
        [NameInMap("network")]
        [Validation(Required=false)]
        public string Network { get; set; }

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
