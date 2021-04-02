// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备实体请求结构体，应用在注册/更新API的ThingsExtraParams
    public class DeviceRegisterReqModel : TeaModel {
        // 保留
        [NameInMap("auth_level")]
        [Validation(Required=false)]
        public long? AuthLevel { get; set; }

        // 设备属性字符串，
        // 阿里云设备类型，填入三元组
        [NameInMap("device_attribute")]
        [Validation(Required=false)]
        public string DeviceAttribute { get; set; }

        // 物模型ID，参考其他文档
        [NameInMap("device_model_id")]
        [Validation(Required=false)]
        public string DeviceModelId { get; set; }

        // 可传入自定义信息
        [NameInMap("other_info")]
        [Validation(Required=false)]
        public string OtherInfo { get; set; }

        // 业务自定义，可以传入该实体的w3c服务节点
        [NameInMap("service_endpoint")]
        [Validation(Required=false)]
        public string ServiceEndpoint { get; set; }

        // 保留，默认
        //     STATUS_REGISTERED(3)
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
