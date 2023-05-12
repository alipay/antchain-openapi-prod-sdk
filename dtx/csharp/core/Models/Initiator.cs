// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 发起方信息
    public class Initiator : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 客户端版本
        [NameInMap("client_version")]
        [Validation(Required=true)]
        public string ClientVersion { get; set; }

        // 记录id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

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
        [Validation(Required=false)]
        public long? RecoveryLimit { get; set; }

        // 恢复线程数
        [NameInMap("recovery_thread_num")]
        [Validation(Required=false)]
        public long? RecoveryThreadNum { get; set; }

    }

}
