// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 应用服务
    public class ApplicationServiceDTO : TeaModel {
        // 应用服务id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 应用serviceid
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 应用服务名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public long? AppId { get; set; }

        // 区分客户端的serviceid和服务端的service_id
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
