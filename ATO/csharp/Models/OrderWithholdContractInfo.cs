// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单代扣协议信息
    public class OrderWithholdContractInfo : TeaModel {
        // 支付宝外部代扣协议号
        /// <summary>
        /// <b>Example:</b>
        /// <para>ATO_P007_0_0_11</para>
        /// </summary>
        [NameInMap("withholding_contract_id")]
        [Validation(Required=false)]
        public string WithholdingContractId { get; set; }

        // 用户代扣协议状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>TERMINATION</para>
        /// </summary>
        [NameInMap("contract_status")]
        [Validation(Required=false)]
        public string ContractStatus { get; set; }

    }

}
