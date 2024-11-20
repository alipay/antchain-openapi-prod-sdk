// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SyncRdaasTaxAuthorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户号
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 税号
        [NameInMap("identity_id")]
        [Validation(Required=false)]
        public string IdentityId { get; set; }

        // 授权因子
        [NameInMap("factor_value")]
        [Validation(Required=false)]
        public string FactorValue { get; set; }

        // 第二授权因子
        [NameInMap("second_factor_value")]
        [Validation(Required=false)]
        public string SecondFactorValue { get; set; }

        // 授权订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 过期时间
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public string ExpireTime { get; set; }

        // 授权场景
        [NameInMap("auth_scene")]
        [Validation(Required=false)]
        public string AuthScene { get; set; }

        // 授权状态
        [NameInMap("auth_status")]
        [Validation(Required=false)]
        public string AuthStatus { get; set; }

        // 授权成功时间,格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("auth_start_time")]
        [Validation(Required=false)]
        public string AuthStartTime { get; set; }

        // 授权创建时间,格式: yyyy-MM-dd HH:mm:ss
        [NameInMap("auth_create_time")]
        [Validation(Required=false)]
        public string AuthCreateTime { get; set; }

        // 名称
        [NameInMap("identity_name")]
        [Validation(Required=false)]
        public string IdentityName { get; set; }

        // 企业实际所属税局地区编码
        [NameInMap("tax_zone_code")]
        [Validation(Required=false)]
        public string TaxZoneCode { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
