// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    // 【消费金可用地域】 消费金可用地域
    public class AvailableRegion : TeaModel {
        // 【类型】 消费金可用地域的类型，COUNTRY表示国家级别可用，PROVINCE表示省级可用，CITY表示市级可用，DISTRICT表示区级可用。
        // 可选取值
        // PROVINCE:  地域信息精确到省级
        // CITY:  地域信息精确到市级
        // DISTRICT:  地域信息精确到区级
        // COUNTRY:  地域信息精确到国家级
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 【省】 消费金可用省
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 【市】 消费金可用
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 【区】 消费金可用区
        [NameInMap("district")]
        [Validation(Required=false)]
        public string District { get; set; }

        // 【国家】 消费金可用国家
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

    }

}
