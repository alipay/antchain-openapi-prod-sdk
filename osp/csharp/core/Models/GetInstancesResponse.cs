// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class GetInstancesResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // instance id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 之所以不叫tenant是为了防止和openapi内置的tenant字段冲突.
        [NameInMap("middleware_tenant")]
        [Validation(Required=false)]
        public string MiddlewareTenant { get; set; }

        // 之所以不叫workspace是为了防止和openapi内置的workspace字段冲突.
        [NameInMap("middleware_workspace")]
        [Validation(Required=false)]
        public string MiddlewareWorkspace { get; set; }

    }

}
