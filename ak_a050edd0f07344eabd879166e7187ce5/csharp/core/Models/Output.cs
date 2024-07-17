// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 播报内容数据结构
    public class Output : TeaModel {
        // 交互类型多媒体节点使用
        // 
        [NameInMap("interaction_type")]
        [Validation(Required=true)]
        public string InteractionType { get; set; }

        // 播报内容类型
        [NameInMap("content_key")]
        [Validation(Required=true)]
        public string ContentKey { get; set; }

        // 合成的播报内容或者是录音的文件地址
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 视频文件id
        [NameInMap("video_file_id")]
        [Validation(Required=true)]
        public string VideoFileId { get; set; }

        // 视频文件播放长度毫秒
        [NameInMap("video_file_content_time")]
        [Validation(Required=true)]
        public long? VideoFileContentTime { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // key为上面content中的变量value为名称
        [NameInMap("variable_map")]
        [Validation(Required=true)]
        public string VariableMap { get; set; }

        // 视频文件code
        [NameInMap("video_code")]
        [Validation(Required=true)]
        public string VideoCode { get; set; }

        // 语音文件code
        [NameInMap("voice_code")]
        [Validation(Required=true)]
        public string VoiceCode { get; set; }

        // 输出内容list
        [NameInMap("content_list")]
        [Validation(Required=true)]
        public List<string> ContentList { get; set; }

    }

}
