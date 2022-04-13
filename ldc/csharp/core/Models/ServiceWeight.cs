// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 流量权重定义
    public class ServiceWeight : TeaModel {
        // 统一接入名称
        [NameInMap("ingress_name")]
        [Validation(Required=true)]
        public string IngressName { get; set; }

        // 蓝区流量权重，取值0-100
        [NameInMap("blue")]
        [Validation(Required=true)]
        public long? Blue { get; set; }

        // 绿区流量权重，取值0-100
        [NameInMap("green")]
        [Validation(Required=true)]
        public long? Green { get; set; }

        // 状态：succeed、updating、fail
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
