// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢合同
    public class Contract : TeaModel {
        // 关联编号
        [NameInMap("relation_no")]
        [Validation(Required=true)]
        public string RelationNo { get; set; }

        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 合同名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合同类型
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public string ContractType { get; set; }

        // 客户编号
        [NameInMap("custom_no")]
        [Validation(Required=true)]
        public string CustomNo { get; set; }

        // 合同存放目录
        [NameInMap("save_path")]
        [Validation(Required=true)]
        public string SavePath { get; set; }

        // 合同金额
        [NameInMap("contract_amount")]
        [Validation(Required=true)]
        public long? ContractAmount { get; set; }

        // 用信合同编号
        [NameInMap("disburse_contract_no")]
        [Validation(Required=true)]
        public string DisburseContractNo { get; set; }

        // 授信合同编号
        [NameInMap("credit_contract_no")]
        [Validation(Required=true)]
        public string CreditContractNo { get; set; }

    }

}
