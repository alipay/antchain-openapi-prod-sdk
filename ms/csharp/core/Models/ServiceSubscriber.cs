// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务信息记录
    public class ServiceSubscriber : TeaModel {
        // 实例标识
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 服务标识
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 服务提供方客户端IP
        [NameInMap("host_ip")]
        [Validation(Required=false)]
        public string HostIp { get; set; }

        // 逻辑机房
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

    }

}
