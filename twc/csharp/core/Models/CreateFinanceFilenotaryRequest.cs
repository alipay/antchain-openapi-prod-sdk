// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateFinanceFilenotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 反欺诈需要的证件号码
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 创建日期，时间戳类型，单位毫秒
        [NameInMap("created_date")]
        [Validation(Required=true)]
        public long? CreatedDate { get; set; }

        // 存证文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件存证类型，支持小于 1M 源文件或者文件哈希
        [NameInMap("file_notary_type")]
        [Validation(Required=true)]
        public string FileNotaryType { get; set; }

        // 文件大小，单位 Bytes
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件地址
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 哈希算法
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

        // 位置信息
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 反欺诈查询需要的手机号
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 文件存证内容
        [NameInMap("notary_content")]
        [Validation(Required=true)]
        public string NotaryContent { get; set; }

        // 存证阶段
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展属性，用户可自行维护
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

        // 反欺诈查询需要的证件上的姓名
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 本次请求的唯一ID
        [NameInMap("third_message_id")]
        [Validation(Required=false)]
        public string ThirdMessageId { get; set; }

    }

}
