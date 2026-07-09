// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 收集数据返回的上链结果
    public class SendCollectorResult : TeaModel {
        // 数据的链上哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 原入参的数组索引
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("original_index")]
        [Validation(Required=true)]
        public long? OriginalIndex { get; set; }

        // 失败数据对应的异常码，成功时该字段为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>params.invalid</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 异常信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>可信设备与DEVICE-ID不匹配</para>
        /// </summary>
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 返回的扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;assetId&quot;:&quot;Q02GYQGAY5&quot;,&quot;labelId&quot;:&quot;86F000001A51A01000003836&quot;}</para>
        /// </summary>
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
