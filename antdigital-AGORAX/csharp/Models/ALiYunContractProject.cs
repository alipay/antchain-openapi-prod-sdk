// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云合约工程信息
    public class ALiYunContractProject : TeaModel {
        // consortium_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>consortium_id</para>
        /// </summary>
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123123</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // project_description
        /// <summary>
        /// <b>Example:</b>
        /// <para>project_description</para>
        /// </summary>
        [NameInMap("project_description")]
        [Validation(Required=false)]
        public string ProjectDescription { get; set; }

        // project_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>project_id</para>
        /// </summary>
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // project_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>project_name</para>
        /// </summary>
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // project_version
        /// <summary>
        /// <b>Example:</b>
        /// <para>project_version</para>
        /// </summary>
        [NameInMap("project_version")]
        [Validation(Required=false)]
        public string ProjectVersion { get; set; }

        // update_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>update_time</para>
        /// </summary>
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

    }

}
