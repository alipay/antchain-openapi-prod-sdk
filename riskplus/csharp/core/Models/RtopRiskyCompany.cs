// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 全局动态中的企业
    public class RtopRiskyCompany : TeaModel {
        // 企业ID
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 异动分数
        [NameInMap("change_score")]
        [Validation(Required=true)]
        public string ChangeScore { get; set; }

        // 异动程度
        [NameInMap("change_level")]
        [Validation(Required=true)]
        public string ChangeLevel { get; set; }

        // 新增企业的时间
        [NameInMap("new_added_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string NewAddedTime { get; set; }

        // 总公司注册地
        [NameInMap("head_register_place")]
        [Validation(Required=true)]
        public string HeadRegisterPlace { get; set; }

        // 数据的时间
        [NameInMap("data_time")]
        [Validation(Required=true)]
        public string DataTime { get; set; }

    }

}
