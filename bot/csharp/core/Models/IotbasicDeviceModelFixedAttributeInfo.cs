// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic设备模型固定属性
    public class IotbasicDeviceModelFixedAttributeInfo : TeaModel {
        // 属性说明
        [NameInMap("attribute_name")]
        [Validation(Required=true)]
        public string AttributeName { get; set; }

        // 属性名称
        [NameInMap("attribute_value")]
        [Validation(Required=true)]
        public string AttributeValue { get; set; }

        // 数据值类型
        // 字符串：string
        // 数字：long
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // dataType为string时，表示数据长度最小值
        // dataType为long时，表示数据范围最小值
        [NameInMap("data_range_min")]
        [Validation(Required=true)]
        public long? DataRangeMin { get; set; }

        // dataType为string时，表示数据长度最大值
        // dataType为long时，表示数据范围最大值
        [NameInMap("data_range_max")]
        [Validation(Required=true)]
        public long? DataRangeMax { get; set; }

    }

}
