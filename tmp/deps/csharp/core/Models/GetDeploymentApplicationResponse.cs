// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetDeploymentApplicationResponse : TeaModel {
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

        // 应用（服务）当前运维状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；
        //                             EXECUTING：执行中；SUCCESS：执行成功；FAILED：执行失败
        //                         
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
