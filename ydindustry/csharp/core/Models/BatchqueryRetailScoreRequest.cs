// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YDINDUSTRY.Models
{
    public class BatchqueryRetailScoreRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型id
        [NameInMap("industry_id")]
        [Validation(Required=true)]
        public string IndustryId { get; set; }

        // 用户列表
        [NameInMap("user_id_list")]
        [Validation(Required=true)]
        public List<string> UserIdList { get; set; }

        // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        [NameInMap("user_id_type")]
        [Validation(Required=true)]
        public string UserIdType { get; set; }

        // user_id 散列类型: "MD5"：MD5（小写）, ...
        [NameInMap("encrypt_type")]
        [Validation(Required=true)]
        public string EncryptType { get; set; }

        // 客户编码
        [NameInMap("customer_code")]
        [Validation(Required=true)]
        public string CustomerCode { get; set; }

        // 流水号，串联链路用，非必填
        [NameInMap("trans_no")]
        [Validation(Required=true)]
        public string TransNo { get; set; }

        // 场景编码
        [NameInMap("instance_code")]
        [Validation(Required=true)]
        public string InstanceCode { get; set; }

        // 1 moble入参，id自动映射
        // 2 id入参，id自动映射
        // 3 id入参，mobile自动映射
        [NameInMap("mapping_type")]
        [Validation(Required=true)]
        public string MappingType { get; set; }

    }

}
