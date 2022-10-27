// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 客户产品签约结果
    public class AgreementQueryResult : TeaModel {
        // 会员所属业务平台在智能科技的会员ID
        [NameInMap("platform_member_id")]
        [Validation(Required=true)]
        public string PlatformMemberId { get; set; }

        // 外部业务平台的用户ID
        [NameInMap("out_member_id")]
        [Validation(Required=true)]
        public string OutMemberId { get; set; }

        // 签约产品的产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 签约产品的产品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 签约的产品类型
        // 
        [NameInMap("product_type")]
        [Validation(Required=false)]
        public string ProductType { get; set; }

        // 签约时间
        // 
        [NameInMap("signing_time")]
        [Validation(Required=false)]
        public string SigningTime { get; set; }

        // 到期时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 是否有效
        // 
        [NameInMap("active_flag")]
        [Validation(Required=false)]
        public bool? ActiveFlag { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
