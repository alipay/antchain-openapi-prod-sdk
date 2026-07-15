// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 物流金融信用凭证信息
    public class IssueInfo : TeaModel {
        // 信用流转批次号
        /// <summary>
        /// <b>Example:</b>
        /// <para>001abc</para>
        /// </summary>
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 合同编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8888888</para>
        /// </summary>
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 信用凭证额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>1898.98</para>
        /// </summary>
        [NameInMap("credit_limit")]
        [Validation(Required=false)]
        public string CreditLimit { get; set; }

        // 失败原因信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>发行额度不足</para>
        /// </summary>
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

        // 信用凭证到期时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>20191212</para>
        /// </summary>
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

        // 信用凭证发起时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>20190101</para>
        /// </summary>
        [NameInMap("issue_date")]
        [Validation(Required=false)]
        public string IssueDate { get; set; }

        // 信用流转凭证
        /// <summary>
        /// <b>Example:</b>
        /// <para>002abc</para>
        /// </summary>
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 发行结果状态 
        // -1:发行失败状态， 0:未完成状态， 1:已发行状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 发行信用流转的运单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>003abc</para>
        /// </summary>
        [NameInMap("waybill_id")]
        [Validation(Required=false)]
        public string WaybillId { get; set; }

    }

}
