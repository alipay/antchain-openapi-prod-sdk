// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiModelVO
    public class ApiModelVO : TeaModel {
        // 绑定的api数量
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // 模板id(全局唯一)
        [NameInMap("api_model_id")]
        [Validation(Required=false)]
        public string ApiModelId { get; set; }

        // 是否可以删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // API模型描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 	
        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 模型配置
        [NameInMap("model_config")]
        [Validation(Required=false)]
        public string ModelConfig { get; set; }

        // 模型名称
        [NameInMap("model_name")]
        [Validation(Required=false)]
        public string ModelName { get; set; }

        // 数据模型参数
        [NameInMap("model_params")]
        [Validation(Required=false)]
        public List<ApiModelParamVO> ModelParams { get; set; }

        // 创建人
        // 
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // children
        [NameInMap("children")]
        [Validation(Required=false)]
        public string Children { get; set; }

        // option 表示模型是多参数
        [NameInMap("model_type")]
        [Validation(Required=false)]
        public string ModelType { get; set; }

    }

}
