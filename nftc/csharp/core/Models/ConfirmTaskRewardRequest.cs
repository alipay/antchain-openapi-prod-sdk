// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class ConfirmTaskRewardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 鲸探用户唯一标识
        [NameInMap("open_user_id")]
        [Validation(Required=true)]
        public string OpenUserId { get; set; }

        // 前置通过消息获取的任务Id(可用作幂等键，详情看下文的奖励消息通知)
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

    }

}
