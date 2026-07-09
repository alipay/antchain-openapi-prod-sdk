// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryLabelTraceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 第几页，默认值为1
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 单页记录数，默认为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 场景码 , 使用asset_id 查询时，scene也必须传入
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 标签Id
        [NameInMap("label_id")]
        [Validation(Required=false)]
        public string LabelId { get; set; }

        // 标签状态
        [NameInMap("label_status")]
        [Validation(Required=false)]
        public string LabelStatus { get; set; }

        // 资产Id
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 操作员
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 标签拥有者
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 标签所处流程
        [NameInMap("process")]
        [Validation(Required=false)]
        public string Process { get; set; }

        // 标签操作
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

    }

}
