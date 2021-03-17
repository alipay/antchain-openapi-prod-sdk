// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateCourtFilenotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 对应的法院编号
        [NameInMap("agency_code")]
        [Validation(Required=false)]
        public string AgencyCode { get; set; }

        // 对应的法院应用ID	
        [NameInMap("application_code")]
        [Validation(Required=false)]
        public string ApplicationCode { get; set; }

        // 业务类型标识
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        // 数据类型标识
        [NameInMap("data_type")]
        [Validation(Required=false)]
        public string DataType { get; set; }

        // 文件哈希
        [NameInMap("file_hash")]
        [Validation(Required=true)]
        public string FileHash { get; set; }

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 哈希算法，目前仅支持SHA256
        [NameInMap("hash_algorithm")]
        [Validation(Required=true)]
        public string HashAlgorithm { get; set; }

        // 地理位置信息
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 存证阶段
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 是否使用可信时间戳
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

    }

}
