// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class CreateAppsConfigsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起方配置
        [NameInMap("initiator")]
        [Validation(Required=false)]
        public Initiator Initiator { get; set; }

        // 参与者列表
        [NameInMap("participators")]
        [Validation(Required=false)]
        public List<Participator> Participators { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用的描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 1：同库模式，事务记录表在业务侧； 2：异库模式。
        [NameInMap("activity_mode")]
        [Validation(Required=true)]
        public long? ActivityMode { get; set; }

        // 分表分表规则
        [NameInMap("sharding_rule")]
        [Validation(Required=false)]
        public SplitRule ShardingRule { get; set; }

    }

}
