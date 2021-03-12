// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 可信存证存证地点信息
    public class Location : TeaModel {
        // 所在城市
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 操作IMEI
        [NameInMap("imei")]
        [Validation(Required=false)]
        public string Imei { get; set; }

        // 操作IMSI
        [NameInMap("imsi")]
        [Validation(Required=false)]
        public string Imsi { get; set; }

        // 操作IP地址
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

        // 扩展属性
        [NameInMap("propertities")]
        [Validation(Required=false)]
        public string Propertities { get; set; }

        // 操作Wi-Fi物理地址
        [NameInMap("wifi_mac")]
        [Validation(Required=false)]
        public string WifiMac { get; set; }

    }

}
