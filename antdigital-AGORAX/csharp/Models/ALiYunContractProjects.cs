// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云合约工程信息查询
    public class ALiYunContractProjects : TeaModel {
        // pagination
        /// <summary>
        /// <b>Example:</b>
        /// <para>pagination</para>
        /// </summary>
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

        // contract_projects
        /// <summary>
        /// <b>Example:</b>
        /// <para>contract_projects</para>
        /// </summary>
        [NameInMap("contract_projects")]
        [Validation(Required=false)]
        public List<ALiYunContractProject> ContractProjects { get; set; }

    }

}
