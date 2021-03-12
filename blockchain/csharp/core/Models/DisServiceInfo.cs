// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // dis服务发现对象
    public class DisServiceInfo : TeaModel {
        // 提供服务的did
        [NameInMap("controller")]
        [Validation(Required=true)]
        public string Controller { get; set; }

        // 服务地址
        [NameInMap("end_point")]
        [Validation(Required=true)]
        public string EndPoint { get; set; }

        // 服务id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 服务类型
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

    }

}
