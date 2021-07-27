// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SendCollectorSummarydataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 汇总所属的场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 汇总的业务类型，同一个scene下可以有不同的业务类型，此字段用于区分业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 汇总所属的日期
        [NameInMap("summary_date")]
        [Validation(Required=true)]
        public string SummaryDate { get; set; }

        // 汇总数据的数据模型ID
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // 汇总数据的内容，格式遵循data_model_id制定的格式
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
