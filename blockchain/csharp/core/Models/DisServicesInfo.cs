// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // DidDoc中service的信息
    public class DisServicesInfo : TeaModel {
        // did doc service扩展字段
        [NameInMap("extesion")]
        [Validation(Required=false)]
        public string Extesion { get; set; }

        // did doc service id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 服务endpoint
        [NameInMap("service_endpoint")]
        [Validation(Required=true)]
        public string ServiceEndpoint { get; set; }

        // service type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // EXIST
        // CONFLICT
        // VALID
        // INVALID
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
