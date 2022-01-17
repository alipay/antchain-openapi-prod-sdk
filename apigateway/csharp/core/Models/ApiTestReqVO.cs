// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiTestReqVO
    public class ApiTestReqVO : TeaModel {
        // API标识
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // 应用标识
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // params
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<ApiTestParamVO> Params { get; set; }

        // payload
        [NameInMap("payload")]
        [Validation(Required=false)]
        public string Payload { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
