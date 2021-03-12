// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 复制阿里云合约工程信息
    public class ALiYunContractProjectDuplicate : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
