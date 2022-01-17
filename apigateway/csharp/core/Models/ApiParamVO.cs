// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiParamVO
    public class ApiParamVO : TeaModel {
        // API标识
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // default_value
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // failure_demo
        [NameInMap("failure_demo")]
        [Validation(Required=false)]
        public string FailureDemo { get; set; }

        // location
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 引用的模型类型	
        [NameInMap("ref_type")]
        [Validation(Required=false)]
        public string RefType { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=false)]
        public bool? Required { get; set; }

        // rsp_code_list
        [NameInMap("rsp_code_list")]
        [Validation(Required=false)]
        public List<ApiRspCodeVO> RspCodeList { get; set; }

        // success_demo
        [NameInMap("success_demo")]
        [Validation(Required=false)]
        public string SuccessDemo { get; set; }

        // 数据类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // upstreamLocation
        [NameInMap("upstream_location")]
        [Validation(Required=false)]
        public string UpstreamLocation { get; set; }

        // upstream_name
        [NameInMap("upstream_name")]
        [Validation(Required=false)]
        public string UpstreamName { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
