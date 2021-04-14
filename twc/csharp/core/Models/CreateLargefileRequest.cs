// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLargefileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 上传至中枢文件扩展服务后得到的文件ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 是否使用可信时间戳，默认为false
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

        // 存证文件名称
        [NameInMap("notary_name")]
        [Validation(Required=true)]
        public string NotaryName { get; set; }

        // 描述本条存证在存证事务中的阶段，用户可自行维护
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
