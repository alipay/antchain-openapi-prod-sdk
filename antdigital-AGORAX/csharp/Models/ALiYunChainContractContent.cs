// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云合约内容
    public class ALiYunChainContractContent : TeaModel {
        // content
        /// <summary>
        /// <b>Example:</b>
        /// <para>content</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // content_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>content_id</para>
        /// </summary>
        [NameInMap("content_id")]
        [Validation(Required=false)]
        public string ContentId { get; set; }

        // content_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>content_name</para>
        /// </summary>
        [NameInMap("content_name")]
        [Validation(Required=false)]
        public string ContentName { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>create_time</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // is_directory
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("is_directory")]
        [Validation(Required=false)]
        public bool? IsDirectory { get; set; }

        // parent_content_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>parent_content_id</para>
        /// </summary>
        [NameInMap("parent_content_id")]
        [Validation(Required=false)]
        public string ParentContentId { get; set; }

        // project_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>project_id</para>
        /// </summary>
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

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
