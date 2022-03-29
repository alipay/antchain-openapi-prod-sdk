// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // datasource query
    public class XDatasourceQuery : TeaModel {
        //  
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

        //  
        [NameInMap("parent_uuid")]
        [Validation(Required=false)]
        public string ParentUuid { get; set; }

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

    }

}
