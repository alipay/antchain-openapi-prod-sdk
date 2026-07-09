// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecDeviceCustomerthingserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备sn
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

        // 设备厂商
        [NameInMap("corp")]
        [Validation(Required=true)]
        public string Corp { get; set; }

        // 设备所属用户
        [NameInMap("user")]
        [Validation(Required=true)]
        public string User { get; set; }

        // 服务调用标识符
        [NameInMap("service_identifier")]
        [Validation(Required=true)]
        public string ServiceIdentifier { get; set; }

        // 服务调用参数 key-value，json字符串
        [NameInMap("service_args")]
        [Validation(Required=false)]
        public string ServiceArgs { get; set; }

    }

}
