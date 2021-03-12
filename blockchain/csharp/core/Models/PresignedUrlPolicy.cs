// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 服务端签名oss的url然后client直传文件到oss，此结构包含了服务端签名后的数据。
    public class PresignedUrlPolicy : TeaModel {
        // oss访问的临时access id
        [NameInMap("access_id")]
        [Validation(Required=true)]
        public string AccessId { get; set; }

        // 一个需要回调通知服务端的方法名，非必填
        [NameInMap("callback")]
        [Validation(Required=false)]
        public string Callback { get; set; }

        // oss上的文件存放路径
        [NameInMap("dir")]
        [Validation(Required=true)]
        public string Dir { get; set; }

        // url超期的时间戳说明
        [NameInMap("expire")]
        [Validation(Required=true)]
        public string Expire { get; set; }

        // oss的地址
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        // 被base64编码的policy内容
        [NameInMap("policy")]
        [Validation(Required=true)]
        public string Policy { get; set; }

        // 签名结果
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
