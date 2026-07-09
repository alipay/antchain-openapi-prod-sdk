// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class GetDeviceBydeviceidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备id列表（推荐使用该参数，deviceIdList不为空时，componentIdList不用填）
        [NameInMap("device_id_list")]
        [Validation(Required=false)]
        public List<string> DeviceIdList { get; set; }

        // 模组ID(IMEI/SN/MAC)列表，当没有设备id时，可以用该字段查询设备
        [NameInMap("component_id_list")]
        [Validation(Required=false)]
        public List<string> ComponentIdList { get; set; }

    }

}
