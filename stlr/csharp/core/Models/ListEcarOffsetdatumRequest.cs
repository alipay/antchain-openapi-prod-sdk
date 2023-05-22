// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class ListEcarOffsetdatumRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 碳补偿项目编码
        [NameInMap("project_no")]
        [Validation(Required=false)]
        public string ProjectNo { get; set; }

        // 账户DID
        [NameInMap("account_did")]
        [Validation(Required=false)]
        public string AccountDid { get; set; }

        // 发生开始时间
        [NameInMap("occurrent_start_time")]
        [Validation(Required=false)]
        public string OccurrentStartTime { get; set; }

        // 数据发生截止时间
        [NameInMap("occurrent_end_time")]
        [Validation(Required=false)]
        public string OccurrentEndTime { get; set; }

        // 碳普惠平台编码
        [NameInMap("carbon_offset_platform_no")]
        [Validation(Required=false)]
        public string CarbonOffsetPlatformNo { get; set; }

        // 发生场景编码，需指定相关碳普惠平台的场景编码，可以指定多个场景
        [NameInMap("scenario_code")]
        [Validation(Required=false)]
        public List<string> ScenarioCode { get; set; }

        // 分页查询数据时的页码，从1开始，不传入时默认值为1
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // 每页数据量，默认值为20，取值范围为[10,100]
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
