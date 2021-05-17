// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateInternalTransRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证关联实体（个人/企业）的身份识别信息
        [NameInMap("customer")]
        [Validation(Required=true)]
        public Identity Customer { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 业务子类型标识
        [NameInMap("sub_biz_id")]
        [Validation(Required=false)]
        public string SubBizId { get; set; }

        // 是否使用可信时间戳，默认为false
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

        // 代理客户存证时，实际用户的租户ID
        [NameInMap("real_tenant")]
        [Validation(Required=false)]
        public string RealTenant { get; set; }

        // 授权码
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

        // 授权码对应的产品码
        [NameInMap("product")]
        [Validation(Required=false)]
        public string Product { get; set; }

    }

}
