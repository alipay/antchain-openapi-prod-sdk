// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class GetMiddlewareMetaResponse : TeaModel {
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

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // instanceId
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // acvip 连接地址
        [NameInMap("acvip_endpoint")]
        [Validation(Required=false)]
        public string AcvipEndpoint { get; set; }

    }

}
