// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d55db67c8e5a4e799ff51ac9e5bcede3.Models
{
    // 阿里云合约工程信息查询
    public class ALiYunContractProjects : TeaModel {
        // contract_projects
        [NameInMap("contract_projects")]
        [Validation(Required=false)]
        public List<ALiYunContractProject> ContractProjects { get; set; }

        // pagination
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

    }

}
