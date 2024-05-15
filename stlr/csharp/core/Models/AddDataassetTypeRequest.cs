// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddDataassetTypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据类型编码
        [NameInMap("data_type_no")]
        [Validation(Required=true)]
        public string DataTypeNo { get; set; }

        // 数据类型名称
        [NameInMap("data_type_name")]
        [Validation(Required=true)]
        public string DataTypeName { get; set; }

        // 数据类型配置
        [NameInMap("data_type_config")]
        [Validation(Required=true)]
        public string DataTypeConfig { get; set; }

        // 数据JSON格式检查
        [NameInMap("data_json_schema")]
        [Validation(Required=true)]
        public string DataJsonSchema { get; set; }

    }

}
