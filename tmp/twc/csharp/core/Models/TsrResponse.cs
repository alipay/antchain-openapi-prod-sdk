// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 可信时间信息结构
    public class TsrResponse : TeaModel {
        // 可信时间请求结果状态吗
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // hash后的信息
        [NameInMap("hashed_message")]
        [Validation(Required=true)]
        public string HashedMessage { get; set; }

        // 哈希算法
        [NameInMap("hash_algorithm")]
        [Validation(Required=true)]
        public string HashAlgorithm { get; set; }

        // 请求失败时候的错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 时间
        [NameInMap("ts")]
        [Validation(Required=true)]
        public string Ts { get; set; }

        // 精简后的时间戳完整编码（在校验时需要提交）
        [NameInMap("ctsr")]
        [Validation(Required=true)]
        public string Ctsr { get; set; }

        // 凭证序列号 （在校验的时需要先填写凭证编号）
        // 
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

    }

}
