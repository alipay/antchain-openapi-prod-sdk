// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链用途申报结构体
    public class AntChainPurposeResponse : TeaModel {
        // 用户申报用途状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 已申报的用途，比如供应链金融
        [NameInMap("purpose")]
        [Validation(Required=false)]
        public string Purpose { get; set; }

        // 申报时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 简短说明用途
        [NameInMap("chain_purpose_item")]
        [Validation(Required=false)]
        public string ChainPurposeItem { get; set; }

        // 用途详情
        [NameInMap("chain_purpose_extend")]
        [Validation(Required=false)]
        public string ChainPurposeExtend { get; set; }

        // 申请用途列表
        [NameInMap("record_list")]
        [Validation(Required=false)]
        public List<ChainPurpose> RecordList { get; set; }

    }

}
