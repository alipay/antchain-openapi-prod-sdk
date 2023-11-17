// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class AuthAntchainPdcpProjectDatasetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 数据集配置参数，若授权的数据集归属于云上的节点，则参考结构体AuthSaasDatasetConfig，若授权的数据集归属于线下的节点，则参考结构体AuthFateDatasetConfig
        [NameInMap("config")]
        [Validation(Required=true)]
        public string Config { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
        [NameInMap("visible_type")]
        [Validation(Required=false)]
        public string VisibleType { get; set; }

    }

}
