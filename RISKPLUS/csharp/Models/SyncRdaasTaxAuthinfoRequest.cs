// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SyncRdaasTaxAuthinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 税号
        [NameInMap("nsrsbh")]
        [Validation(Required=true)]
        public string Nsrsbh { get; set; }

        // 应用key
        [NameInMap("app_key")]
        [Validation(Required=false)]
        public string AppKey { get; set; }

        // 授权状态：Y-有效，N-无效
        [NameInMap("auth_status")]
        [Validation(Required=false)]
        public string AuthStatus { get; set; }

        // 省份编码
        [NameInMap("pro_code")]
        [Validation(Required=false)]
        public string ProCode { get; set; }

        // 城市编码
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 授权回调地址
        [NameInMap("auth_callback_url")]
        [Validation(Required=false)]
        public string AuthCallbackUrl { get; set; }

        // 过期时间，格式: yyyy-MM-dd HH:mm:ss
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

        // 最近一次授权成功的订单号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 授权场景
        [NameInMap("auth_scene")]
        [Validation(Required=false)]
        public string AuthScene { get; set; }

        // 授权成功时间,格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("auth_start_time")]
        [Validation(Required=false)]
        public string AuthStartTime { get; set; }

        // 授权创建时间,格式: yyyy-MM-dd HH:mm:ss
        [NameInMap("auth_create_time")]
        [Validation(Required=false)]
        public string AuthCreateTime { get; set; }

        // 企业名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

    }

}
