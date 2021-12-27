// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCompanyRiskyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据时间
        [NameInMap("data_time")]
        [Validation(Required=true)]
        public string DataTime { get; set; }

        // 全局态势中的列表 类型
        [NameInMap("list_type")]
        [Validation(Required=true)]
        public string ListType { get; set; }

        // 当前是第几页
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // 每一页的记录条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 全局动态类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 用户属地
        [NameInMap("user_place")]
        [Validation(Required=true)]
        public string UserPlace { get; set; }

        // 用户所在地类型
        [NameInMap("user_place_type")]
        [Validation(Required=true)]
        public string UserPlaceType { get; set; }

    }

}
