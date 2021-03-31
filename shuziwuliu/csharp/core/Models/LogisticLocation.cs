// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 物流轨迹位置
    public class LogisticLocation : TeaModel {
        // 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 行政区划代码
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 纬度
        // 
        [NameInMap("lat")]
        [Validation(Required=true)]
        public string Lat { get; set; }

        // 经度
        [NameInMap("lon")]
        [Validation(Required=true)]
        public string Lon { get; set; }

        // 轨迹时间戳
        [NameInMap("track_time")]
        [Validation(Required=true)]
        public long? TrackTime { get; set; }

    }

}
