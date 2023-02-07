// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryFeatureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // paas_region_id cafe的region_id，是一串数字
        [NameInMap("paas_region_id")]
        [Validation(Required=true)]
        public string PaasRegionId { get; set; }

        // project_id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 要查询的功能
        [NameInMap("feature_name")]
        [Validation(Required=false)]
        public string FeatureName { get; set; }

    }

}
