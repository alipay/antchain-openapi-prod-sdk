// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiflowTestReqVO
    public class ApiflowTestReqVO : TeaModel {
        // api_id
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // machine_name
        [NameInMap("machine_name")]
        [Validation(Required=false)]
        public string MachineName { get; set; }

        // params
        [NameInMap("input_params")]
        [Validation(Required=false)]
        public List<ApiTestParamVO> InputParams { get; set; }

        // output_params
        [NameInMap("output_params")]
        [Validation(Required=false)]
        public List<ApiflowOutputVO> OutputParams { get; set; }

    }

}
