// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_743ccb6d20f546bcb851af6ce09cd478.Models
{
    public class QueryIdentityTagScoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求流水id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 模型列表字符串
        [NameInMap("model_id_list")]
        [Validation(Required=true)]
        public string ModelIdList { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户id类型：
        // "ID_NO"： 身份证号,
        // "MOBILE_NO"：手机号
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

        // 加密类型:
        // "MD5"：MD5（32位小写）
        // "SHA256" ： SHA256（密文小写）
        // "SM3"： SM3（密文大写
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // 用户授权模版编号
        [NameInMap("auth_template_no")]
        [Validation(Required=true)]
        public string AuthTemplateNo { get; set; }

        // 用户授权编码
        [NameInMap("auth_no")]
        [Validation(Required=true)]
        public string AuthNo { get; set; }

        // 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
        [NameInMap("request_time")]
        [Validation(Required=false)]
        public string RequestTime { get; set; }

    }

}
