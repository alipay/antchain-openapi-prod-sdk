// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class GrantDeviceEmpowerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备ID 列表
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 授权操作: ACCEPTED(接受)/REVOKED(撤销)
        [NameInMap("auth_status")]
        [Validation(Required=true)]
        public string AuthStatus { get; set; }

        // 授权时间戳（毫秒）
        [NameInMap("auth_time")]
        [Validation(Required=true)]
        public long? AuthTime { get; set; }

        // 场景码   与科技所属人-统一社会信用代码 （technology_owner_id ）不能同时为空
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 科技所属人-统一社会信用代码  与场景码（scene ）不能同时为空
        [NameInMap("technology_owner_id")]
        [Validation(Required=false)]
        public string TechnologyOwnerId { get; set; }

        // 科技所属人-公司名称
        [NameInMap("technology_owner_name")]
        [Validation(Required=false)]
        public string TechnologyOwnerName { get; set; }

    }

}
