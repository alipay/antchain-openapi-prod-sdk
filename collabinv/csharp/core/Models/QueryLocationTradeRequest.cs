// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryLocationTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // md5加密的身份证号
        [NameInMap("id_number")]
        [Validation(Required=false, MaxLength=32)]
        public string IdNumber { get; set; }

        // md5加密的手机号
        [NameInMap("phone_no")]
        [Validation(Required=false, MaxLength=32)]
        public string PhoneNo { get; set; }

        // 调用者用户ID（或外部系统业务ID）
        [NameInMap("caller_id")]
        [Validation(Required=true, MaxLength=128)]
        public string CallerId { get; set; }

        // 定位时间范围开始时间
        [NameInMap("start_time")]
        [Validation(Required=true, MaxLength=19)]
        public string StartTime { get; set; }

        // 定位时间范围结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, MaxLength=19)]
        public string EndTime { get; set; }

        // 核查中心位置（经度,纬度）
        [NameInMap("center_position")]
        [Validation(Required=false, MaxLength=64)]
        public string CenterPosition { get; set; }

        // 核查省市区县范围
        [NameInMap("distinct_county")]
        [Validation(Required=false, MaxLength=128)]
        public string DistinctCounty { get; set; }

        // 协查类型：
        // 0: 为经纬度精准定位协查 (默认)
        // 1:  为区县定位 (省-市-区/县) 协查
        [NameInMap("inv_type")]
        [Validation(Required=false, MaxLength=2)]
        public string InvType { get; set; }

    }

}
