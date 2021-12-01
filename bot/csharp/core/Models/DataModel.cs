// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 数据模型
    public class DataModel : TeaModel {
        //  数据模型Id
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // 数据模型名称
        [NameInMap("data_model_name")]
        [Validation(Required=false)]
        public string DataModelName { get; set; }

        // 数据模型
        [NameInMap("data_model")]
        [Validation(Required=true)]
        public string DataModel_ { get; set; }

        // 数据模型类别
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

    }

}
