// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class SyncSgServicesubscribersRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 进程ID
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

        // 服务唯一ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 分组
        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

        // 金融云实例ID
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 逻辑机房
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // 订阅者IP
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 订阅维度
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 数据产生时间戳
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

    }

}
