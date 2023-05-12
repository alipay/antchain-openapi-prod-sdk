// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class DebugInitiatorsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主事务记录表
        [NameInMap("activity_table_name")]
        [Validation(Required=true)]
        public string ActivityTableName { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 数据源名称
        [NameInMap("ds_name")]
        [Validation(Required=true)]
        public string DsName { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 记录id
        [NameInMap("recovery_id")]
        [Validation(Required=true)]
        public long? RecoveryId { get; set; }

    }

}
