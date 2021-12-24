// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIALEXTERNAL.Models
{
    // 已售规格实例详细信息(用于开发商查询)
    public class SoldSpecInstance : TeaModel {
        // 规格码
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // 规格实例id
        [NameInMap("spec_instance_id")]
        [Validation(Required=true)]
        public string SpecInstanceId { get; set; }

        // 规格实例运行状态. 
        // STARTED 正常有效、STOPPED 停服、STAETED_IN_ARR 欠费运行中......
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 实例生效时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 实例计划停服时间
        [NameInMap("plan_stop_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PlanStopTime { get; set; }

        // 实例实际停服时间
        [NameInMap("actual_stop_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ActualStopTime { get; set; }

        // 购买规格实例的商户id(商业中台用来唯一标识商户的id)
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

    }

}
