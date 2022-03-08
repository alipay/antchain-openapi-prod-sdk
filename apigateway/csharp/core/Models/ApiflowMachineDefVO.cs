// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiflowMachineDefVO
    public class ApiflowMachineDefVO : TeaModel {
        // 	
        // api数
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // can_delete
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // comment
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // ver
        [NameInMap("ver")]
        [Validation(Required=false)]
        public string Ver { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // recover_strategy
        [NameInMap("recover_strategy")]
        [Validation(Required=false)]
        public string RecoverStrategy { get; set; }

        // content
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // machine_status
        [NameInMap("machine_status")]
        [Validation(Required=false)]
        public string MachineStatus { get; set; }

        // field_mapping
        [NameInMap("field_mapping")]
        [Validation(Required=false)]
        public string FieldMapping { get; set; }

    }

}
