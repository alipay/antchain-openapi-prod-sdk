// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyChoicetappRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入驻时候生成的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 服务ID
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 选择tapp的名称
        [NameInMap("tapp_name")]
        [Validation(Required=true)]
        public string TappName { get; set; }

        // tapp版本
        [NameInMap("tapp_version")]
        [Validation(Required=true)]
        public long? TappVersion { get; set; }

        // 业务码，需要接入时联系数据隐私服务分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
