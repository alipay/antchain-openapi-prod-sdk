// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 数据模型参数VO
    public class ApiModelParamVO : TeaModel {
        // 默认值
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 模型id
        [NameInMap("model_id")]
        [Validation(Required=false)]
        public string ModelId { get; set; }

        // 模型提交 操作
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // 模型参数id（唯一标识）
        [NameInMap("param_id")]
        [Validation(Required=false)]
        public string ParamId { get; set; }

        // 参数名
        [NameInMap("param_name")]
        [Validation(Required=false)]
        public string ParamName { get; set; }

        // 参数类型
        [NameInMap("param_type")]
        [Validation(Required=false)]
        public string ParamType { get; set; }

        // 引用模型id
        [NameInMap("ref_model_id")]
        [Validation(Required=false)]
        public string RefModelId { get; set; }

        // 工作空间标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // model_description
        [NameInMap("model_description")]
        [Validation(Required=false)]
        public string ModelDescription { get; set; }

    }

}
