// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class DeploySolutionContractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 链操作者信息
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 提交记录ID
        [NameInMap("commit_id")]
        [Validation(Required=true)]
        public string CommitId { get; set; }

        // 当前分支
        [NameInMap("branch")]
        [Validation(Required=true)]
        public string Branch { get; set; }

        // 合约仓库路径
        [NameInMap("git_repo")]
        [Validation(Required=true)]
        public string GitRepo { get; set; }

    }

}
