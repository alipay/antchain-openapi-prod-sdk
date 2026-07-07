// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    public class CreateDistributedeviceBydevicemulRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，由蚂蚁侧定义
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备注册信息集合, 数组长度不超过50
        [NameInMap("device_param_list")]
        [Validation(Required=true)]
        public List<RegByDeviceParm> DeviceParamList { get; set; }

    }

}
