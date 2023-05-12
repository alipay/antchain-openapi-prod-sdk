// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class CreateRecoveryInitiatorsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // action_mode
        [NameInMap("action_mode")]
        [Validation(Required=false)]
        public long? ActionMode { get; set; }

        // activity_mode
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

        // Client 版本
        [NameInMap("client_version")]
        [Validation(Required=true)]
        public string ClientVersion { get; set; }

        // 应用描述
        // 
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 是否异步化
        [NameInMap("is_asyn")]
        [Validation(Required=true)]
        public bool? IsAsyn { get; set; }

        // 是否压测任务
        [NameInMap("is_load_test")]
        [Validation(Required=true)]
        public bool? IsLoadTest { get; set; }

        // 是否混合模式
        [NameInMap("is_mix")]
        [Validation(Required=true)]
        public bool? IsMix { get; set; }

        // 发起方数据源
        [NameInMap("recovery_datasources")]
        [Validation(Required=true)]
        public List<InitiatorDatasource> RecoveryDatasources { get; set; }

        // 恢复条数/分/表
        [NameInMap("recovery_limit")]
        [Validation(Required=true)]
        public long? RecoveryLimit { get; set; }

        // 恢复线程数
        [NameInMap("recovery_thread_num")]
        [Validation(Required=true)]
        public long? RecoveryThreadNum { get; set; }

        // SINGLE：单库单表 SPLIT：分库分表
        // 
        [NameInMap("split_mode")]
        [Validation(Required=false)]
        public string SplitMode { get; set; }

        // 分库分表规则
        // 
        [NameInMap("split_rule")]
        [Validation(Required=false)]
        public SplitRule SplitRule { get; set; }

    }

}
