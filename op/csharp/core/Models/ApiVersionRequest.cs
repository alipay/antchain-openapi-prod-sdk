// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api版本请求体
    public class ApiVersionRequest : TeaModel {
        // 产品名称
        [NameInMap("provider_name")]
        [Validation(Required=true)]
        public string ProviderName { get; set; }

        // 套件版本
        [NameInMap("suite_version")]
        [Validation(Required=true)]
        public string SuiteVersion { get; set; }

        // API名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // api版本名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // api版本描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // api转发方式
        [NameInMap("dispatch_type")]
        [Validation(Required=true)]
        public string DispatchType { get; set; }

        // unique id
        [NameInMap("uniqu_id")]
        [Validation(Required=true)]
        public string UniquId { get; set; }

        // 测试url
        [NameInMap("test_url")]
        [Validation(Required=false)]
        public string TestUrl { get; set; }

        // 转发路径
        [NameInMap("path")]
        [Validation(Required=false)]
        public string Path { get; set; }

        // api状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public StatusEnum Status { get; set; }

        // 1000
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public long? Timeout { get; set; }

        // 请求uri模式
        [NameInMap("request_uri_pattern")]
        [Validation(Required=false)]
        public string RequestUriPattern { get; set; }

        // 请求路径参数
        [NameInMap("request_path_params")]
        [Validation(Required=false)]
        public string RequestPathParams { get; set; }

        // 方法名称
        [NameInMap("request_method")]
        [Validation(Required=true)]
        public string RequestMethod { get; set; }

        // 支持特性
        [NameInMap("feature")]
        [Validation(Required=false)]
        public string Feature { get; set; }

    }

}
