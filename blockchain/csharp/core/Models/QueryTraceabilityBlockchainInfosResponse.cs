// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryTraceabilityBlockchainInfosResponse : TeaModel {
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

        // 异常的节点数
        [NameInMap("abnormal_nodes")]
        [Validation(Required=false)]
        public long? AbnormalNodes { get; set; }

        // 区块链id
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // 区块高度
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // 链的状态，是否正常
        [NameInMap("is_normal")]
        [Validation(Required=false)]
        public bool? IsNormal { get; set; }

        // 是否为管理员权限
        [NameInMap("is_role")]
        [Validation(Required=false)]
        public bool? IsRole { get; set; }

        // 链的名字
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 节点信息
        [NameInMap("node_info_list")]
        [Validation(Required=false)]
        public List<NodeInfo> NodeInfoList { get; set; }

        // 节点数
        [NameInMap("node_number")]
        [Validation(Required=false)]
        public long? NodeNumber { get; set; }

        // 链上交易数
        [NameInMap("transaction_sum")]
        [Validation(Required=false)]
        public long? TransactionSum { get; set; }

        // 链的版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
