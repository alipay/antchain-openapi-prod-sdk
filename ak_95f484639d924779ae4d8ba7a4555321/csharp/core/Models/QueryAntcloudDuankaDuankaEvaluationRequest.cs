// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_95f484639d924779ae4d8ba7a4555321.Models
{
    public class QueryAntcloudDuankaDuankaEvaluationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求流水ID
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 用户关联订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 请求模型ID列表（目前仅支持每次请求一个模型），逗号分割
        [NameInMap("model_list")]
        [Validation(Required=true)]
        public string ModelList { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户id类型：
        // "ID_NO"： 身份证号,
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

        // 加密类型(目前只支持SHA256):
        // "MD5"：MD5（32位小写）,
        // "SHA256" ： SHA256（密文小写），              "SM3"： SM3（密文小写）
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
        [Validation(Required=true)]
        public string RequestTime { get; set; }

    }

}
