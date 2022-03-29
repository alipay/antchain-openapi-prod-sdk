// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api版本信息
    public class ApiVersion : TeaModel {
        // 版本名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // api版本描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // apimeta数据id
        [NameInMap("api_meta_id")]
        [Validation(Required=true)]
        public string ApiMetaId { get; set; }

        // api状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // api请求参数
        [NameInMap("request_params")]
        [Validation(Required=false)]
        public List<ParamModal> RequestParams { get; set; }

        // api响应参数
        [NameInMap("response_params")]
        [Validation(Required=true)]
        public List<ParamModal> ResponseParams { get; set; }

        // api uri模式
        [NameInMap("request_uri_pattern")]
        [Validation(Required=false)]
        public string RequestUriPattern { get; set; }

        // 请求参数路径
        [NameInMap("request_path_params")]
        [Validation(Required=false)]
        public string RequestPathParams { get; set; }

        // 请求方法
        [NameInMap("request_method")]
        [Validation(Required=true)]
        public string RequestMethod { get; set; }

        // 具体API请求时，解析出来的路径参数与其对应的值
        // eg. /sofa/mq/msgtype/{id}，如果实际请求为/sofa/mq/msgtype/1，那么返回的map就是 id => 1
        [NameInMap("request_path_values")]
        [Validation(Required=true)]
        public List<KeyValuePair> RequestPathValues { get; set; }

        // 请求分发方法
        [NameInMap("dispatch_type")]
        [Validation(Required=true)]
        public string DispatchType { get; set; }

        // 分发内容
        [NameInMap("dispatch_context")]
        [Validation(Required=false)]
        public string DispatchContext { get; set; }

        // 接口特性
        [NameInMap("feature")]
        [Validation(Required=false)]
        public string Feature { get; set; }

    }

}
