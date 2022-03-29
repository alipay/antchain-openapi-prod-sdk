// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // 渠道API
    public class ChannelApi : TeaModel {
        // 渠道名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 外部产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 外部服务码
        [NameInMap("service_code")]
        [Validation(Required=false)]
        public string ServiceCode { get; set; }

        // 外部API名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 外部API版本
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

        // 鉴权模式
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

        // 鉴权资源表达式
        [NameInMap("auth_expression")]
        [Validation(Required=false)]
        public string AuthExpression { get; set; }

        // 内部产品码
        [NameInMap("inner_provider_name")]
        [Validation(Required=true)]
        public string InnerProviderName { get; set; }

        // 内部API名称
        [NameInMap("inner_api_name")]
        [Validation(Required=false)]
        public string InnerApiName { get; set; }

        // 内部API版本
        [NameInMap("inner_api_version")]
        [Validation(Required=false)]
        public string InnerApiVersion { get; set; }

    }

}
