// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class TransferBrokerUserdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据的唯一id，支持数字、大小写字母或下划线
        [NameInMap("data_id")]
        [Validation(Required=true, MaxLength=20)]
        public string DataId { get; set; }

        // 枚举，数据类型
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 数据内容,使用JSONArray结构
        [NameInMap("data_content")]
        [Validation(Required=true)]
        public string DataContent { get; set; }

        // DIRECT直推;ROUND_ROBIN轮询;BROADCAST广播
        [NameInMap("push_mode")]
        [Validation(Required=false)]
        public string PushMode { get; set; }

    }

}
