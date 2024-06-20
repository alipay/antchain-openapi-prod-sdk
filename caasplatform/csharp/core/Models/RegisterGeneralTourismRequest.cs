// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class RegisterGeneralTourismRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约实例id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 创建链上账户时指定的accountName
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 通过调用托管资源接口返回的资源id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 要铸造的数据资产数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 扩展参数
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
