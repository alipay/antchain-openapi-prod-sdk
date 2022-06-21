// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeSearchContractResponse : TeaModel {
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

        // 关联编号（授信/用信）
        [NameInMap("relation_no")]
        [Validation(Required=false)]
        public string RelationNo { get; set; }

        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=false)]
        public string ContractNo { get; set; }

        // 合同名称
        [NameInMap("contract_name")]
        [Validation(Required=false)]
        public string ContractName { get; set; }

        // 合同类型：0:电子合同签署授权协议 1:借款合同 2:抵押合同 3:担保合同 4:用信合同 5:通用合同 6:征信授权书
        [NameInMap("contract_type")]
        [Validation(Required=false)]
        public string ContractType { get; set; }

        // 客户编号
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 下载地址
        [NameInMap("save_path")]
        [Validation(Required=false)]
        public string SavePath { get; set; }

        // 合同金额
        [NameInMap("contract_amount")]
        [Validation(Required=false)]
        public long? ContractAmount { get; set; }

    }

}
