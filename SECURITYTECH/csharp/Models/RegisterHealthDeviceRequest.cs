// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class RegisterHealthDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品牌方渠道标识
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

        // 设备唯一id  与sn不可同时为空
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 设备sn号 与tuid不可同时为空
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // 是否清除设备历史数据 true-清除/false-保留
        [NameInMap("clear_history")]
        [Validation(Required=true)]
        public bool? ClearHistory { get; set; }

        // 预留可扩展字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
