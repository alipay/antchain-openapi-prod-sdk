// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryXdatasourceSearchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        //  
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        //  
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        //  
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        //  
        [NameInMap("target_resource_kind")]
        [Validation(Required=false)]
        public string TargetResourceKind { get; set; }

        //  
        [NameInMap("target_resource_name")]
        [Validation(Required=false)]
        public string TargetResourceName { get; set; }

        //  
        [NameInMap("rule_type")]
        [Validation(Required=false)]
        public string RuleType { get; set; }

        //  
        [NameInMap("created_by")]
        [Validation(Required=false)]
        public string CreatedBy { get; set; }

        //  
        [NameInMap("parent_uuid")]
        [Validation(Required=false)]
        public string ParentUuid { get; set; }

        //  
        [NameInMap("datasource_type")]
        [Validation(Required=false)]
        public string DatasourceType { get; set; }

    }

}
