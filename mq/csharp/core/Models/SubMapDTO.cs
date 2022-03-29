// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消息的消费轨迹列表
    public class SubMapDTO : TeaModel {
        // cell name
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 该 Group ID 客户端消费记录的明细列表
        // 
        // 
        [NameInMap("client_list")]
        [Validation(Required=true)]
        public List<SubClientInfoDTO> ClientList { get; set; }

        // 该 Group ID 消费失败次数统计
        [NameInMap("fail_count")]
        [Validation(Required=true)]
        public long? FailCount { get; set; }

        // 消费方 Group ID
        [NameInMap("sub_group_name")]
        [Validation(Required=true)]
        public string SubGroupName { get; set; }

        // 该 Group ID 消费成功次数统计
        [NameInMap("success_count")]
        [Validation(Required=true)]
        public long? SuccessCount { get; set; }

    }

}
