// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QuerySidecaropsAllservicesResponse : TeaModel {
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

        // 根据wsglabel换到的wsgname
        [NameInMap("workspace_group_name")]
        [Validation(Required=false)]
        public string WorkspaceGroupName { get; set; }

        // 所属命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 应用服务详细配置信息，主要为sidecar当前在用的参数信息
        [NameInMap("services_sidecar_info")]
        [Validation(Required=false)]
        public List<AppServiceSidecarReleaseInfo> ServicesSidecarInfo { get; set; }

        // 不满足升级条件的服务信息，包含服务不唯一应用及正在升级的应用。
        [NameInMap("unsatisfied_services_info")]
        [Validation(Required=false)]
        public List<AppServiceSidecarReleaseInfo> UnsatisfiedServicesInfo { get; set; }

    }

}
