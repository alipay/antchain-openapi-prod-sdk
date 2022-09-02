// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class AddContentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 内容标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 文件类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 内容标签列表
        [NameInMap("keywords")]
        [Validation(Required=false)]
        public List<string> Keywords { get; set; }

        // 内容描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 内容封面文件id
        [NameInMap("cover_file_id")]
        [Validation(Required=false)]
        public string CoverFileId { get; set; }

        // 播放列表实体：包括名称和各种授权维权信息
        [NameInMap("play_list_entity")]
        [Validation(Required=true)]
        public PlayListEntity PlayListEntity { get; set; }

        // 客户端token，幂等号，用来保证并发请求幂等性
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
