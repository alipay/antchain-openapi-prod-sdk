// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 标签流转上链返回txHash
    public class LabelChainResult : TeaModel {
        // 标签ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>86F000001A51C02000000010</para>
        /// </summary>
        [NameInMap("label_id")]
        [Validation(Required=true)]
        public string LabelId { get; set; }

        // 业务资产ID，接入方自行定义
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 标签最近一次上链的txHash
        /// <summary>
        /// <b>Example:</b>
        /// <para>855e7ba37a0f227e384691e250f90bb2240adf11839016cf08506c9aa5c11cef</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXXX</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("error_msg")]
        [Validation(Required=true)]
        public string ErrorMsg { get; set; }

    }

}
