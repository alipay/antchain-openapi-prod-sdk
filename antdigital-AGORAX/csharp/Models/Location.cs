// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 可信存证存证地点信息
    public class Location : TeaModel {
        // 所在城市
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 操作IMEI
        /// <summary>
        /// <b>Example:</b>
        /// <para>359426002899056</para>
        /// </summary>
        [NameInMap("imei")]
        [Validation(Required=false)]
        public string Imei { get; set; }

        // 操作IMSI
        /// <summary>
        /// <b>Example:</b>
        /// <para>460001357924680</para>
        /// </summary>
        [NameInMap("imsi")]
        [Validation(Required=false)]
        public string Imsi { get; set; }

        // 操作IP地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.0.0.0</para>
        /// </summary>
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>66.33</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>23.26</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 扩展属性
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;key&quot;:&quot;value&quot;}</para>
        /// </summary>
        [NameInMap("propertities")]
        [Validation(Required=false)]
        public string Propertities { get; set; }

        // 操作Wi-Fi物理地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>00-01-6C-06-A6-29</para>
        /// </summary>
        [NameInMap("wifi_mac")]
        [Validation(Required=false)]
        public string WifiMac { get; set; }

    }

}
