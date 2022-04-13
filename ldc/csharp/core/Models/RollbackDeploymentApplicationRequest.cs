// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class RollbackDeploymentApplicationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 部署单id
        [NameInMap("operation_id")]
        [Validation(Required=true)]
        public string OperationId { get; set; }

        // 待回滚的应用名称，必须是部署单中包含的应用
        [NameInMap("application_name")]
        [Validation(Required=true)]
        public string ApplicationName { get; set; }

        // 应用的回滚版本，如果不指定，默认回滚到最近一次发布成功的版本
        [NameInMap("version_no")]
        [Validation(Required=false)]
        public string VersionNo { get; set; }

        // 回滚时的分组策略，取值为：
        //                              QUICK：快速分组；
        //                              EACH_ONE：每台一组；
        //                              UNIT：按逻辑单元分组；
        //                              CELL：按部署单元分组；
        //                              默认为QUICK
        //                 
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

        // 分组数，默认为3
        [NameInMap("group_count")]
        [Validation(Required=false)]
        public int? GroupCount { get; set; }

        // 回滚原因
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // 操作人
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

    }

}
