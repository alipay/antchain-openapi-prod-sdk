// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class CreateRecoveryConfigurationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // actionMode取值：1代表TCC模式，2是FMT模式
        [NameInMap("action_mode")]
        [Validation(Required=false)]
        public long? ActionMode { get; set; }

        // activityMode取值：1是同库模式，2是异库模式，3是Saga模式
        [NameInMap("activity_mode")]
        [Validation(Required=true)]
        public long? ActivityMode { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 业务码
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 应用描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 环境的唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 如果修改biztype，要穿老的bizType
        [NameInMap("old_biztype")]
        [Validation(Required=false)]
        public string OldBiztype { get; set; }

        // role取值：1是发起方，2是参与者
        [NameInMap("role")]
        [Validation(Required=true)]
        public long? Role { get; set; }

        // split_rule
        [NameInMap("split_rule")]
        [Validation(Required=false)]
        public SplitRule SplitRule { get; set; }

        // Saga状态机的json定义
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
