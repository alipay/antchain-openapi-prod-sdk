// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryJointconstraintBreachrecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询对象实体类型
        // 
        // 0：企业
        // 
        // 1：个人
        [NameInMap("entity_type")]
        [Validation(Required=true)]
        public long? EntityType { get; set; }

        // 对象实体证件类型
        // 
        // 0：统一社会信用代码
        // 
        // 1：身份证号码
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public long? CertType { get; set; }

        // 对象实体证件号码
        // 
        // 
        [NameInMap("cert_number")]
        [Validation(Required=true)]
        public string CertNumber { get; set; }

    }

}
