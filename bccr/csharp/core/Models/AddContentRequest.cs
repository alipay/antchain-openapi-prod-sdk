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

        // 播放列表名称
        [NameInMap("play_list_name")]
        [Validation(Required=true)]
        public string PlayListName { get; set; }

        // 授权类型
        [NameInMap("authorize_type")]
        [Validation(Required=false)]
        public string AuthorizeType { get; set; }

        // 授权范围类型
        [NameInMap("authorize_scope_type")]
        [Validation(Required=false)]
        public string AuthorizeScopeType { get; set; }

        // 维权类型
        [NameInMap("protect_rights_type")]
        [Validation(Required=false)]
        public string ProtectRightsType { get; set; }

        // 维权范围类型
        [NameInMap("protect_rights_scope_type")]
        [Validation(Required=false)]
        public string ProtectRightsScopeType { get; set; }

        // 内容授权开始日期
        [NameInMap("authorization_start_date")]
        [Validation(Required=true)]
        public string AuthorizationStartDate { get; set; }

        // 内容授权时长
        [NameInMap("authorization_time_length")]
        [Validation(Required=true)]
        public long? AuthorizationTimeLength { get; set; }

        // 内容授权平台列表
        [NameInMap("auth_platform")]
        [Validation(Required=false)]
        public List<string> AuthPlatform { get; set; }

        // 客户端token，幂等号，用来保证并发请求幂等性
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
