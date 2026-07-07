// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 物流信息
    public class ExpressInfo : TeaModel {
        // 材料类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PAPER纸质，ELECTRIC电子</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 收件人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 收件人电话号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>13000000000</para>
        /// </summary>
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 邮箱地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:xxx@xx.com">xxx@xx.com</a></para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 快递名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>快递名称</para>
        /// </summary>
        [NameInMap("express_name")]
        [Validation(Required=true)]
        public string ExpressName { get; set; }

        // 快递单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>快递单号</para>
        /// </summary>
        [NameInMap("tracking_number")]
        [Validation(Required=true)]
        public string TrackingNumber { get; set; }

        // 材料发出时间戳
        [NameInMap("send_time")]
        [Validation(Required=true)]
        public long? SendTime { get; set; }

    }

}
