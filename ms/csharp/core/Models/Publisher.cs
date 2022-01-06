// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务提供者信息
    public class Publisher : TeaModel {
        // 订阅端是否存活，默认1-存活，订阅端下线标记为0，默认1
        [NameInMap("alive")]
        [Validation(Required=false)]
        public bool? Alive { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // appVersion
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // 校验值
        [NameInMap("check_sum")]
        [Validation(Required=false)]
        public string CheckSum { get; set; }

        // 注册的内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // IP
        [NameInMap("host_ip")]
        [Validation(Required=false)]
        public string HostIp { get; set; }

        // 服务id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // mosn
        [NameInMap("mosn")]
        [Validation(Required=false)]
        public bool? Mosn { get; set; }

        // 进程ID
        // 
        [NameInMap("process_id")]
        [Validation(Required=false)]
        public string ProcessId { get; set; }

        // 协议
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        // 服务ip
        [NameInMap("service_ip")]
        [Validation(Required=false)]
        public string ServiceIp { get; set; }

        // 服务端口
        [NameInMap("service_port")]
        [Validation(Required=false)]
        public long? ServicePort { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public bool? Status { get; set; }

        // 超时时间
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

        // 是否是虚拟机模式
        [NameInMap("vm_mode")]
        [Validation(Required=false)]
        public bool? VmMode { get; set; }

        // 权重
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // 逻辑机房
        // 
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // 修改过的权重
        [NameInMap("config_weight")]
        [Validation(Required=false)]
        public string ConfigWeight { get; set; }

    }

}
