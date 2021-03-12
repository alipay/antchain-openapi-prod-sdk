// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云合约工程信息查询
    public class ALiYunContractProjects : TeaModel {
        // pagination
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

        // contract_projects
        [NameInMap("contract_projects")]
        [Validation(Required=false)]
        public List<ALiYunContractProject> ContractProjects { get; set; }

    }

}
