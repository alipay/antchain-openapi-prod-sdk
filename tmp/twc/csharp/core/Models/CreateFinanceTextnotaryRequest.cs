// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateFinanceTextnotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 反欺诈查询对应的身份证号码
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 哈希算法
        [NameInMap("hash_algorithm")]
        [Validation(Required=true)]
        public string HashAlgorithm { get; set; }

        // 位置描述信息
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 反欺诈查询需要的手机号码
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 存证阶段，用户可自行维护
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 文本哈希
        [NameInMap("text_hash")]
        [Validation(Required=true)]
        public string TextHash { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 是否使用可信时间戳
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

        // 反欺诈查询需要的姓名
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 本次请求的唯一id
        [NameInMap("third_message_id")]
        [Validation(Required=false)]
        public string ThirdMessageId { get; set; }

    }

}
