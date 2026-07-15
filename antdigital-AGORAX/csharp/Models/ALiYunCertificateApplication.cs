// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云蚂蚁区块链证书信息
    public class ALiYunCertificateApplication : TeaModel {
        // ant_chain_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ant_chain_id</para>
        /// </summary>
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // username
        /// <summary>
        /// <b>Example:</b>
        /// <para>username</para>
        /// </summary>
        [NameInMap("username")]
        [Validation(Required=false)]
        public string Username { get; set; }

        // createtime
        /// <summary>
        /// <b>Example:</b>
        /// <para>createtime</para>
        /// </summary>
        [NameInMap("createtime")]
        [Validation(Required=false)]
        public long? Createtime { get; set; }

        // updatetime
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231231231231</para>
        /// </summary>
        [NameInMap("updatetime")]
        [Validation(Required=false)]
        public long? Updatetime { get; set; }

        // bid
        /// <summary>
        /// <b>Example:</b>
        /// <para>bid</para>
        /// </summary>
        [NameInMap("bid")]
        [Validation(Required=false)]
        public string Bid { get; set; }

        // status
        /// <summary>
        /// <b>Example:</b>
        /// <para>status</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
