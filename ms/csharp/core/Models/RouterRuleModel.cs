// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 路由规则
    public class RouterRuleModel : TeaModel {
        // [
        //                     {
        //                         "type":"system",
        //                         "field":"app.kubernetes.io/version",
        //                         "operation":"equal",
        //                         "value":[
        //                             "22"
        //                         ]
        //                     }
        //                 ]
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<BaseConditionModel> Conditions { get; set; }

        // [
        //             {
        //                 "weight":100,
        //                 "destination":[
        //                     {
        //                         "type":"system",
        //                         "field":"app.kubernetes.io/version",
        //                         "operation":"equal",
        //                         "value":[
        //                             "22"
        //                         ]
        //                     }
        //                 ]
        //             }
        //         ]
        [NameInMap("destinations")]
        [Validation(Required=false)]
        public List<RouterDestinationModel> Destinations { get; set; }

        // 是否生效，1 生效，0 未生效。默认未生效
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public long? Enabled { get; set; }

        // fallback
        [NameInMap("fallback")]
        [Validation(Required=false)]
        public long? Fallback { get; set; }

        // faultProtection
        [NameInMap("fault_protection")]
        [Validation(Required=false)]
        public long? FaultProtection { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // TreeSet<BaseConditionModel>
        [NameInMap("grays")]
        [Validation(Required=false)]
        public List<BaseConditionModel> Grays { get; set; }

        // 规则名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 优先级
        [NameInMap("order_num")]
        [Validation(Required=false)]
        public long? OrderNum { get; set; }

        // 唯一UUID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
