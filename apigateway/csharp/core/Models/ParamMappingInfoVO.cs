// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ParamMappingInfoVO
    public class ParamMappingInfoVO : TeaModel {
        // api_count
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // can_delete
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // 配置模板
        [NameInMap("config_template")]
        [Validation(Required=false)]
        public string ConfigTemplate { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 映射类型
        [NameInMap("mapping_type")]
        [Validation(Required=false)]
        public string MappingType { get; set; }

        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // param_mapping_id
        [NameInMap("param_mapping_id")]
        [Validation(Required=false)]
        public string ParamMappingId { get; set; }

        // 参数映射名称
        [NameInMap("param_mapping_name")]
        [Validation(Required=false)]
        public string ParamMappingName { get; set; }

        // 脚本配置
        [NameInMap("script_config")]
        [Validation(Required=false)]
        public string ScriptConfig { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 配置模板名称
        [NameInMap("config_template_name")]
        [Validation(Required=false)]
        public string ConfigTemplateName { get; set; }

    }

}
