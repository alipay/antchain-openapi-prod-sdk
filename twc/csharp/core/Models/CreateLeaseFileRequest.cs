// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
        [NameInMap("file_notary_type")]
        [Validation(Required=false)]
        public string FileNotaryType { get; set; }

        // 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

        // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
        [NameInMap("notary_file")]
        [Validation(Required=true)]
        public string NotaryFile { get; set; }

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

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

    }

}
