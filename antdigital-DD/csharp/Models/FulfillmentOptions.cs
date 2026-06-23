// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 履约选项
    public class FulfillmentOptions : TeaModel {
        // 是否延迟履约，默认false
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("deplay")]
        [Validation(Required=false)]
        public bool? Deplay { get; set; }

        // 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
        /// <summary>
        /// <b>Example:</b>
        /// <para>true,false</para>
        /// </summary>
        [NameInMap("spi_skip")]
        [Validation(Required=false)]
        public bool? SpiSkip { get; set; }

    }

}
