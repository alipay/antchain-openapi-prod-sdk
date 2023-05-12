// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 应用列表，发起方 view object
    public class AppRecoveryVO : TeaModel {
        // app
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 客户端模式
        [NameInMap("client_version")]
        [Validation(Required=true)]
        public string ClientVersion { get; set; }

        // 数据源数组
        [NameInMap("ds_array")]
        [Validation(Required=true)]
        public List<ActivityDsVO> DsArray { get; set; }

        // 唯一id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 是否异步化
        [NameInMap("is_asyn")]
        [Validation(Required=true)]
        public bool? IsAsyn { get; set; }

        // 数据源配置是否在dds中
        [NameInMap("is_dds")]
        [Validation(Required=true)]
        public bool? IsDds { get; set; }

        // 压测
        [NameInMap("is_load_test")]
        [Validation(Required=true)]
        public bool? IsLoadTest { get; set; }

        // 是否混合模式 
        [NameInMap("is_mix")]
        [Validation(Required=true)]
        public bool? IsMix { get; set; }

        // 单条恢复数
        [NameInMap("recovery_limit")]
        [Validation(Required=true)]
        public long? RecoveryLimit { get; set; }

        // 恢复任务线程数
        [NameInMap("recovery_thread_num")]
        [Validation(Required=true)]
        public long? RecoveryThreadNum { get; set; }

        // 是否被使用
        [NameInMap("used")]
        [Validation(Required=true)]
        public bool? Used { get; set; }

    }

}
