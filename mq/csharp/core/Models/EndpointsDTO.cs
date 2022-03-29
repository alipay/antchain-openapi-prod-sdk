// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 接入点信息
    public class EndpointsDTO : TeaModel {
        // HTTP 内网接入点
        [NameInMap("http_internal_endpoint")]
        [Validation(Required=true)]
        public string HttpInternalEndpoint { get; set; }

        // HTTP 公网接入点
        [NameInMap("http_internet_endpoint")]
        [Validation(Required=true)]
        public string HttpInternetEndpoint { get; set; }

        // HTTPS 公网接入点
        [NameInMap("http_internet_secure_endpoint")]
        [Validation(Required=true)]
        public string HttpInternetSecureEndpoint { get; set; }

        // TCP 协议接入点
        [NameInMap("tcp_endpoint")]
        [Validation(Required=true)]
        public string TcpEndpoint { get; set; }

    }

}
