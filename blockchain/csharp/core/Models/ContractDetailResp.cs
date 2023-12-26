// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约详情
    public class ContractDetailResp : TeaModel {
        // 合约服务ID
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 合约服务名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 创建人
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 订购产品
        [NameInMap("ordering_products")]
        [Validation(Required=false)]
        public string OrderingProducts { get; set; }

        // 关联区块链id
        [NameInMap("chan_id")]
        [Validation(Required=false)]
        public string ChanId { get; set; }

        // 合约状态
        [NameInMap("contract_status")]
        [Validation(Required=false)]
        public string ContractStatus { get; set; }

        // 合约部署进度当前状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 合约部署进度
        [NameInMap("progress_info_list")]
        [Validation(Required=false)]
        public List<InstanceProgressInfo> ProgressInfoList { get; set; }

        // 实例最近调用记录(暂缓，先不做)
        [NameInMap("record_info_list")]
        [Validation(Required=false)]
        public List<InstanceRecordInfo> RecordInfoList { get; set; }

    }

}
