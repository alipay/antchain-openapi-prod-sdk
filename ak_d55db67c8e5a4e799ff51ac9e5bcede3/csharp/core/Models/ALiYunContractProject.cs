// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d55db67c8e5a4e799ff51ac9e5bcede3.Models
{
    // 阿里云合约工程信息
    public class ALiYunContractProject : TeaModel {
        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // project_description
        [NameInMap("project_description")]
        [Validation(Required=false)]
        public string ProjectDescription { get; set; }

        // project_id
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // project_name
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // project_version
        [NameInMap("project_version")]
        [Validation(Required=false)]
        public string ProjectVersion { get; set; }

        // update_time
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

    }

}
