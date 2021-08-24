// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class CreateVoiceprintServermodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 商户自定义的用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 音频文件流
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 音频元数据
        [NameInMap("audio_meta")]
        [Validation(Required=true)]
        public AudioMeta AudioMeta { get; set; }

        // 音频文件集合
        [NameInMap("audios")]
        [Validation(Required=true)]
        public List<Audio> Audios { get; set; }

        // 预留扩展参数
        [NameInMap("extern_param")]
        [Validation(Required=false)]
        public string ExternParam { get; set; }

    }

}
