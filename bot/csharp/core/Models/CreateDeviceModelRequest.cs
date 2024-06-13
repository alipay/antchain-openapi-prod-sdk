// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDeviceModelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品类类型
        // 标准品类：standard
        // 自定义品类：custom
        [NameInMap("category_type")]
        [Validation(Required=true)]
        public string CategoryType { get; set; }

        // 品类编码
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 属性列表，与固定属性列表不能同时为空
        [NameInMap("attribute_info_list")]
        [Validation(Required=false)]
        public List<IotbasicDeviceModelAttributeInfo> AttributeInfoList { get; set; }

        // 固定属性列表，与属性列表不能同时为空
        [NameInMap("fixed_attribute_info_list")]
        [Validation(Required=false)]
        public List<IotbasicDeviceModelFixedAttributeInfo> FixedAttributeInfoList { get; set; }

    }

}
