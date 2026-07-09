// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicDictionaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 设备品类编码
        [NameInMap("device_category")]
        [Validation(Required=false)]
        public string DeviceCategory { get; set; }

        // 字典数据类型
        [NameInMap("dictionary_type")]
        [Validation(Required=false)]
        public string DictionaryType { get; set; }

        // 字典数据名称
        [NameInMap("dictionary_name")]
        [Validation(Required=false)]
        public string DictionaryName { get; set; }

        // 字典数据值
        [NameInMap("dictionary_value")]
        [Validation(Required=false)]
        public string DictionaryValue { get; set; }

        // 硬件模块参数
        [NameInMap("dictionary_param")]
        [Validation(Required=false)]
        public string DictionaryParam { get; set; }

        // 选择操作
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 参数签名校验
        [NameInMap("param_sign")]
        [Validation(Required=false)]
        public string ParamSign { get; set; }

    }

}
