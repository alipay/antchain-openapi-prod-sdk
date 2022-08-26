// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
{
    // 阿里云子链结构体
    public class ALiYunChainSubnet : TeaModel {
        // 子链id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // 子链名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 子链节点数
        [NameInMap("node_sum")]
        [Validation(Required=false)]
        public long? NodeSum { get; set; }

        // 子链监控状态
        [NameInMap("monitor")]
        [Validation(Required=false)]
        public bool? Monitor { get; set; }

        // 子链的块高
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public string BlockHeight { get; set; }

        // 子链的业务总数
        [NameInMap("transaction_sum")]
        [Validation(Required=false)]
        public long? TransactionSum { get; set; }

        // 子链的创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 子链的状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 子链的权限
        [NameInMap("consortium_member")]
        [Validation(Required=false)]
        public bool? ConsortiumMember { get; set; }

        // 主链id
        [NameInMap("main_chain_id")]
        [Validation(Required=false)]
        public string MainChainId { get; set; }

        // rest申请状态
        [NameInMap("rest")]
        [Validation(Required=false)]
        public string Rest { get; set; }

        // 子链序号
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

    }

}
