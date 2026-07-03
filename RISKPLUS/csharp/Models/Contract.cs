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
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("relation_no")]
        [Validation(Required=true)]
        public string RelationNo { get; set; }

        // 合同编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 合同名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>用信合同</para>
        /// </summary>
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合同类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public string ContractType { get; set; }

        // 客户编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>PCM123xxxx</para>
        /// </summary>
        [NameInMap("custom_no")]
        [Validation(Required=true)]
        public string CustomNo { get; set; }

        // 合同存放目录
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://11111">https://11111</a></para>
        /// </summary>
        [NameInMap("save_path")]
        [Validation(Required=true)]
        public string SavePath { get; set; }

        // 合同金额
        [NameInMap("contract_amount")]
        [Validation(Required=true)]
        public long? ContractAmount { get; set; }

        // 用信合同编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("disburse_contract_no")]
        [Validation(Required=true)]
        public string DisburseContractNo { get; set; }

        // 授信合同编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("credit_contract_no")]
        [Validation(Required=true)]
        public string CreditContractNo { get; set; }

    }

}
