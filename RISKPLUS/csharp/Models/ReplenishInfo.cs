// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 补充信息
    public class ReplenishInfo : TeaModel {
        // 客户姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("custom_name")]
        [Validation(Required=false)]
        public string CustomName { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>13800000000</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 省份
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省</para>
        /// </summary>
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 城市
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 地区名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>滨江区</para>
        /// </summary>
        [NameInMap("area")]
        [Validation(Required=false)]
        public string Area { get; set; }

    }

}
