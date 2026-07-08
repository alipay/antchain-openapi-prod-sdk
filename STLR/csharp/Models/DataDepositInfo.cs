// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 数据存证信息
    public class DataDepositInfo : TeaModel {
        // 存证字段值
        [NameInMap("data_value")]
        [Validation(Required=true)]
        public List<DepositFieldValue> DataValue { get; set; }

        // 数据存证区块链交易ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>c5fcc677a0b04c62973c2dbc72jcus83271</para>
        /// </summary>
        [NameInMap("tx_id")]
        [Validation(Required=false)]
        public string TxId { get; set; }

        // 数据存证操作用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>user_001</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 存证数据内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>待补充</para>
        /// </summary>
        [NameInMap("deposit_content")]
        [Validation(Required=true)]
        public string DepositContent { get; set; }

        // 存证执行状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>status</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 存证执行(发起)时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
