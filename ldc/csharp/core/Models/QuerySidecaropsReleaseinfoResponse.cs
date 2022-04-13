// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QuerySidecaropsReleaseinfoResponse : TeaModel {
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

        // 所查询版本的实际sidecarConfig信息
        [NameInMap("sidecar_config")]
        [Validation(Required=false)]
        public SidecarConfig SidecarConfig { get; set; }

        // 应用服务名
        [NameInMap("container_service_name")]
        [Validation(Required=false)]
        public string ContainerServiceName { get; set; }

        // sidecar模板的版本号，与应用无关
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

        // 发布相关的应用参数，如feature等
        [NameInMap("param")]
        [Validation(Required=false)]
        public string Param { get; set; }

        // 发布所处状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 以时间戳生成的发布版本号
        [NameInMap("release_version")]
        [Validation(Required=false)]
        public string ReleaseVersion { get; set; }

        // 上一个版本号
        [NameInMap("last_release_version")]
        [Validation(Required=false)]
        public string LastReleaseVersion { get; set; }

        // 执行单号，调用方唯一确定一次发布的单号；
        [NameInMap("order_num")]
        [Validation(Required=false)]
        public string OrderNum { get; set; }

    }

}
