// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 可信存证存证地点信息
    public class Location : TeaModel {
        // 所在城市
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 使用设备的IMEI号
        [NameInMap("imei")]
        [Validation(Required=false)]
        public string Imei { get; set; }

        // 使用设备的IMSI号
        [NameInMap("imsi")]
        [Validation(Required=false)]
        public string Imsi { get; set; }

        // 使用设备的IP地址
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 使用设备的Wi-Fi物理地址
        [NameInMap("mac_addr")]
        [Validation(Required=false)]
        public string MacAddr { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
