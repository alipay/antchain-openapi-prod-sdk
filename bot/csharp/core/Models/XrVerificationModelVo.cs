// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 线下场设备元素
    public class XrVerificationModelVo : TeaModel {
        // 核销资源生成的实例，xr设备对应设备did
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 生成的实例名称，xr设备就的对应的具体设备sn
        [NameInMap("instance_name")]
        [Validation(Required=true)]
        public string InstanceName { get; set; }

        // 线下场有效期
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
        [NameInMap("sevice_status")]
        [Validation(Required=true)]
        public string SeviceStatus { get; set; }

        // 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
        [NameInMap("device_status")]
        [Validation(Required=true)]
        public string DeviceStatus { get; set; }

        // 唯一ID，对应线下场code
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 对应线下场名称
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 核销类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
