// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 授权信息
    public class AuthInfo : TeaModel {
        // 授权权利项
        /// <summary>
        /// <b>Example:</b>
        /// <para>授权权利项</para>
        /// </summary>
        [NameInMap("right_code")]
        [Validation(Required=true)]
        public string RightCode { get; set; }

        // 许可地域，默认中国境内，不包括香港等
        /// <summary>
        /// <b>Example:</b>
        /// <para>全世界</para>
        /// </summary>
        [NameInMap("region_code")]
        [Validation(Required=false)]
        public string RegionCode { get; set; }

        // 许可方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>广播</para>
        /// </summary>
        [NameInMap("usage_code")]
        [Validation(Required=true)]
        public string UsageCode { get; set; }

        // 许可终端
        /// <summary>
        /// <b>Example:</b>
        /// <para>电视</para>
        /// </summary>
        [NameInMap("terminal_code")]
        [Validation(Required=true)]
        public string TerminalCode { get; set; }

        // 传播媒介，默认互联网
        /// <summary>
        /// <b>Example:</b>
        /// <para>互联网</para>
        /// </summary>
        [NameInMap("media_code")]
        [Validation(Required=false)]
        public string MediaCode { get; set; }

        // 是否独占,默认 普通专有 GENERAL
        /// <summary>
        /// <b>Example:</b>
        /// <para>GENERAL</para>
        /// </summary>
        [NameInMap("right_item_character")]
        [Validation(Required=false)]
        public string RightItemCharacter { get; set; }

        // 是否可转让,默认不可转让
        /// <summary>
        /// <b>Example:</b>
        /// <para>ENABLE</para>
        /// </summary>
        [NameInMap("transfer_status")]
        [Validation(Required=false)]
        public string TransferStatus { get; set; }

    }

}
