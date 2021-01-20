// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryWorkspaceResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 此应用下所有计算容器分组运维状态详情
        [NameInMap("groups")]
        [Validation(Required=false)]
        public List<OpsGroup> Groups { get; set; }

        // 查询结果，workspace列表
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<Workspace> Workspaces { get; set; }

    }

}
