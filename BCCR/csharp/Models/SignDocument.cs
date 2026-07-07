// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证出证需要用户签署的文件
    public class SignDocument : TeaModel {
        // 签署文件
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("sign_file")]
        [Validation(Required=true)]
        public string SignFile { get; set; }

        // 到期时间戳
        [NameInMap("expire_time")]
        [Validation(Required=true)]
        public long? ExpireTime { get; set; }

        // 签署文件名
        /// <summary>
        /// <b>Example:</b>
        /// <para>在线公证申办过程记录.pdf</para>
        /// </summary>
        [NameInMap("sign_file_name")]
        [Validation(Required=true)]
        public string SignFileName { get; set; }

        // 签署文件描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>在线公证申办过程记录</para>
        /// </summary>
        [NameInMap("sign_file_desc")]
        [Validation(Required=true)]
        public string SignFileDesc { get; set; }

        // 签署文件哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>用于校验文件完整性，计算文件的SHA-256值</para>
        /// </summary>
        [NameInMap("sign_file_hash")]
        [Validation(Required=true)]
        public string SignFileHash { get; set; }

        // 签署文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>NOTARY_PAPER：公证申请表 ONLINE_NOTIFICATION：在线公证受理平台公证受理告知书 EVIDENCE_NOTIFICATION：保全证据通用告知书 ONLINE_RECORD：在线公证申办询问记录</para>
        /// </summary>
        [NameInMap("sign_file_type")]
        [Validation(Required=true)]
        public string SignFileType { get; set; }

    }

}
