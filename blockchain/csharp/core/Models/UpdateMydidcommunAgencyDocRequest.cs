// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateMydidcommunAgencyDocRequest : TeaModel {
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

        // 对参数进行构造签名
        [NameInMap("operation_sign")]
        [Validation(Required=true)]
        public string OperationSign { get; set; }

        // doc当前版本
        [NameInMap("pre_version")]
        [Validation(Required=true)]
        public long? PreVersion { get; set; }

        // doc中服务信息列表
        [NameInMap("service_list")]
        [Validation(Required=true)]
        public List<DisServicesInfo> ServiceList { get; set; }

    }

}
