// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTLCOMMONCENTER.Models
{
    public class ImportProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商业化状态
        [NameInMap("business_status")]
        [Validation(Required=true)]
        public string BusinessStatus { get; set; }

        // 是否已上架蚂蚁链官网
        [NameInMap("product_put_ant_official")]
        [Validation(Required=true)]
        public string ProductPutAntOfficial { get; set; }

        // 产品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 橡实立项code
        [NameInMap("xs_code")]
        [Validation(Required=true)]
        public string XsCode { get; set; }

        // 上线时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 产品经理
        [NameInMap("pd")]
        [Validation(Required=true)]
        public string Pd { get; set; }

        // 产品经理负责人
        [NameInMap("pd_leader")]
        [Validation(Required=true)]
        public string PdLeader { get; set; }

        // 产品研发负责人
        [NameInMap("dev_leader")]
        [Validation(Required=false)]
        public string DevLeader { get; set; }

        // 产品研发
        [NameInMap("dev")]
        [Validation(Required=false)]
        public string Dev { get; set; }

        // 产品描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 操作员
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 业务线id
        [NameInMap("business_line")]
        [Validation(Required=true)]
        public string BusinessLine { get; set; }

        // 产品线id
        [NameInMap("product_line")]
        [Validation(Required=true)]
        public string ProductLine { get; set; }

        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

    }

}
