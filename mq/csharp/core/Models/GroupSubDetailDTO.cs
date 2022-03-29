// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 返回 Data 对象
    // 
    public class GroupSubDetailDTO : TeaModel {
        // Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 部署模型
        [NameInMap("message_model")]
        [Validation(Required=true)]
        public string MessageModel { get; set; }

        // 是否在线
        [NameInMap("online")]
        [Validation(Required=true)]
        public bool? Online { get; set; }

        // 订阅信息列表
        [NameInMap("subscription_data_list")]
        [Validation(Required=true)]
        public List<SubscriptionTopicDTO> SubscriptionDataList { get; set; }

    }

}
