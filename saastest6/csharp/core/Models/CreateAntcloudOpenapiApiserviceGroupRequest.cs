// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SaasTest6.Models
{
    public class CreateAntcloudOpenapiApiserviceGroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属产品
        [NameInMap("provider_name")]
        [Validation(Required=true)]
        public string ProviderName { get; set; }

        // 套件版本
        [NameInMap("suite_version")]
        [Validation(Required=true)]
        public string SuiteVersion { get; set; }

        // 分组描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 分组名称
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

        // 分组类型
        [NameInMap("api_group_type")]
        [Validation(Required=false)]
        public string ApiGroupType { get; set; }

    }

}
