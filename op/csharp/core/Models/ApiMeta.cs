// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api元数据
    public class ApiMeta : TeaModel {
        // api名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // api简介
        [NameInMap("summary")]
        [Validation(Required=true)]
        public string Summary { get; set; }

        // api负责人
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 为true时，不签约的情况下也可以调用
        [NameInMap("activation_disabled")]
        [Validation(Required=true)]
        public bool? ActivationDisabled { get; set; }

        // 是否对外展示
        [NameInMap("internal")]
        [Validation(Required=true)]
        public bool? Internal { get; set; }

        // unique_id
        [NameInMap("default_unique_id")]
        [Validation(Required=false)]
        public string DefaultUniqueId { get; set; }

        // 调用路径
        [NameInMap("default_http_path")]
        [Validation(Required=false)]
        public string DefaultHttpPath { get; set; }

        // 允许使用的用户类型
        [NameInMap("allowed_user_type")]
        [Validation(Required=false)]
        public string AllowedUserType { get; set; }

        // 是否是第三方授权
        [NameInMap("third_party_auth")]
        [Validation(Required=true)]
        public bool? ThirdPartyAuth { get; set; }

        // 动作名称
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // 角色名称
        [NameInMap("role_name")]
        [Validation(Required=false)]
        public string RoleName { get; set; }

        // api描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // api状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 产品码
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 分组id
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 套件id
        [NameInMap("api_suite_id")]
        [Validation(Required=true)]
        public string ApiSuiteId { get; set; }

        // 扩展参数
        [NameInMap("ext_attribute")]
        [Validation(Required=false)]
        public string ExtAttribute { get; set; }

    }

}
