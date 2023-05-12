// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 批量添加发起方 DO
    public class RecoveryDTO : TeaModel {
        // 客户端版本
        // 
        [NameInMap("client_version")]
        [Validation(Required=false)]
        public string ClientVersion { get; set; }

        // 发起方组编号
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        // 主键id，更新时需要
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 是否异步化
        [NameInMap("is_asyn")]
        [Validation(Required=false)]
        public bool? IsAsyn { get; set; }

        // 是否压测任务
        [NameInMap("is_load_test")]
        [Validation(Required=false)]
        public bool? IsLoadTest { get; set; }

        // 是否混合模式
        [NameInMap("is_mix")]
        [Validation(Required=false)]
        public bool? IsMix { get; set; }

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
