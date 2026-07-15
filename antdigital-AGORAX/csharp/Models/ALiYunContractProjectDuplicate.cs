// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 复制阿里云合约工程信息
    public class ALiYunContractProjectDuplicate : TeaModel {
        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>id</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // consortium_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>consortium_id</para>
        /// </summary>
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // gmt_create
        /// <summary>
        /// <b>Example:</b>
        /// <para>21312312312</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // gmt_modified
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123212</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // name
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // version
        /// <summary>
        /// <b>Example:</b>
        /// <para>version</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // description
        /// <summary>
        /// <b>Example:</b>
        /// <para>description</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
