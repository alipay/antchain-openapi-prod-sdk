// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateCyclinginsuranceServiceorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 来源场景
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 请求唯一id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 调用方应用名
        [NameInMap("caller_app_name")]
        [Validation(Required=true)]
        public string CallerAppName { get; set; }

        // 业务id，用于幂等
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 下单账号
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 商品码
        [NameInMap("item_code")]
        [Validation(Required=true)]
        public string ItemCode { get; set; }

        // 商品属性
        // serviceStartTime:服务开始时间
        // serviceEndTime:服务结束时间
        // tenantAddress:上门地址
        // tenantPhone:租赁人电话
        // insurancePolicyId:保险单号
        // batteryType:电池型号
        [NameInMap("item_attributes")]
        [Validation(Required=true)]
        public string ItemAttributes { get; set; }

    }

}
