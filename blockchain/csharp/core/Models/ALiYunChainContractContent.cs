// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云合约内容
    public class ALiYunChainContractContent : TeaModel {
        // content
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // content_id
        [NameInMap("content_id")]
        [Validation(Required=false)]
        public string ContentId { get; set; }

        // content_name
        [NameInMap("content_name")]
        [Validation(Required=false)]
        public string ContentName { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // is_directory
        [NameInMap("is_directory")]
        [Validation(Required=false)]
        public bool? IsDirectory { get; set; }

        // parent_content_id
        [NameInMap("parent_content_id")]
        [Validation(Required=false)]
        public string ParentContentId { get; set; }

        // project_id
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // update_time
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

    }

}
