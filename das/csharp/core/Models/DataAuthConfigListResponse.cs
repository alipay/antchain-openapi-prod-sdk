// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 授权配置列表响应
    public class DataAuthConfigListResponse : TeaModel {
        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 数据源连接器空间id
        [NameInMap("source_space_id")]
        [Validation(Required=true)]
        public string SourceSpaceId { get; set; }

        // 被授权方企业信用代码
        [NameInMap("auth_enterprise_code")]
        [Validation(Required=true)]
        public string AuthEnterpriseCode { get; set; }

        // 接入方企业名称
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // 被授权应用名称
        [NameInMap("auth_app_name")]
        [Validation(Required=true)]
        public string AuthAppName { get; set; }

        // 数据产品服务简称列表
        [NameInMap("product_abbr_list")]
        [Validation(Required=true)]
        public List<string> ProductAbbrList { get; set; }

        // 授权次数
        [NameInMap("auth_count")]
        [Validation(Required=true)]
        public long? AuthCount { get; set; }

        // 授权状态
        [NameInMap("auth_status")]
        [Validation(Required=true)]
        public bool? AuthStatus { get; set; }

    }

}
