// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryAgentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // agent部署类型：容器CONTAINER、经典MACHINE
        [NameInMap("deploy_type")]
        [Validation(Required=false)]
        public string DeployType { get; set; }

        // 模糊搜索关键字
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // app 模糊搜索关键字
        [NameInMap("app_keyword")]
        [Validation(Required=false)]
        public string AppKeyword { get; set; }

        // 服务 IP 模糊搜索关键字
        [NameInMap("service_ip_keyword")]
        [Validation(Required=false)]
        public string ServiceIpKeyword { get; set; }

        // 主机 IP 模糊搜索关键字
        [NameInMap("host_ip_keyword")]
        [Validation(Required=false)]
        public string HostIpKeyword { get; set; }

        // agent 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
