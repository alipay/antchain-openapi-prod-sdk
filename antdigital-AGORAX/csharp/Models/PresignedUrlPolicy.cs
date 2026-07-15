// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 服务端签名oss的url然后client直传文件到oss，此结构包含了服务端签名后的数据。
    public class PresignedUrlPolicy : TeaModel {
        // oss访问的临时access id
        /// <summary>
        /// <b>Example:</b>
        /// <para>LTAIR4HVnajwxdUK</para>
        /// </summary>
        [NameInMap("access_id")]
        [Validation(Required=true)]
        public string AccessId { get; set; }

        // 一个需要回调通知服务端的方法名，非必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>callBackFunction</para>
        /// </summary>
        [NameInMap("callback")]
        [Validation(Required=false)]
        public string Callback { get; set; }

        // oss上的文件存放路径
        /// <summary>
        /// <b>Example:</b>
        /// <para>contract/abi/lP9v5bJsvY1566977941329</para>
        /// </summary>
        [NameInMap("dir")]
        [Validation(Required=true)]
        public string Dir { get; set; }

        // url超期的时间戳说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>1566977971</para>
        /// </summary>
        [NameInMap("expire")]
        [Validation(Required=true)]
        public string Expire { get; set; }

        // oss的地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://baas-XXX.oss-cn-shanghai.aliyuncs.com">https://baas-XXX.oss-cn-shanghai.aliyuncs.com</a></para>
        /// </summary>
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        // 被base64编码的policy内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>eyJleHBpcmF0aW9uIjoiMjAxOS0wOC0yOFQwNzozOTozMS4zMjlaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiY29udHJhY3QvYWJpL2xQOXY1YkpzdlkxNTY2OTc3OTQxMzI5Il1dfQ==</para>
        /// </summary>
        [NameInMap("policy")]
        [Validation(Required=true)]
        public string Policy { get; set; }

        // 签名结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>sQEa/Q8F/e5jqDWPvTVYtZ5Ysbw=</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
