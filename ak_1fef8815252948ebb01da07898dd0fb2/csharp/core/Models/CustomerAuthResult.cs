// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1fef8815252948ebb01da07898dd0fb2.Models
{
    // 客户认证结果
    public class CustomerAuthResult : TeaModel {
        // 账户ID
        [NameInMap("acc_id")]
        [Validation(Required=false)]
        public string AccId { get; set; }

        // 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 客户did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 验证状态
        [NameInMap("enterprise_status")]
        [Validation(Required=false)]
        public string EnterpriseStatus { get; set; }

        // 开业时间
        [NameInMap("open_time")]
        [Validation(Required=true)]
        public string OpenTime { get; set; }

        // 认证结果，是否通过
        [NameInMap("pass")]
        [Validation(Required=true)]
        public bool? Pass { get; set; }

        // 业务ID
        [NameInMap("dis_req_msg_id")]
        [Validation(Required=false)]
        public string DisReqMsgId { get; set; }

    }

}
