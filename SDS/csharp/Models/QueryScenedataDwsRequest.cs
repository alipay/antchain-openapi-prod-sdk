// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class QueryScenedataDwsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务批次号
        [NameInMap("batch_no")]
        [Validation(Required=true)]
        public string BatchNo { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 维度列表
        [NameInMap("dimension_list")]
        [Validation(Required=true)]
        public List<string> DimensionList { get; set; }

        // 度量列表
        [NameInMap("metric_list")]
        [Validation(Required=true)]
        public List<Metric> MetricList { get; set; }

        // 过滤条件列表
        [NameInMap("filter_condition_list")]
        [Validation(Required=false)]
        public List<FilterCondition> FilterConditionList { get; set; }

        // 页码,默认1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页数量,默认50
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
