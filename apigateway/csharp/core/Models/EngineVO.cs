// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 入参
    public class EngineVO : TeaModel {
        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 流程编排标识
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 内嵌模式、云端模式
        [NameInMap("engine_type")]
        [Validation(Required=false)]
        public string EngineType { get; set; }

        // add_request
        [NameInMap("add_request")]
        [Validation(Required=false)]
        public bool? AddRequest { get; set; }

        // add_timestamp
        [NameInMap("add_timestamp")]
        [Validation(Required=false)]
        public bool? AddTimestamp { get; set; }

        // save_to_db
        [NameInMap("save_to_db")]
        [Validation(Required=false)]
        public bool? SaveToDb { get; set; }

        // 流程编排  （内嵌模式）初始化的入参
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

    }

}
