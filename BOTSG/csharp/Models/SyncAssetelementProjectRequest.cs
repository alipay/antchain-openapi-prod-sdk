// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    public class SyncAssetelementProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 若要素项目已存在，是否进行全量覆盖
        [NameInMap("cover_exist_project")]
        [Validation(Required=true)]
        public bool? CoverExistProject { get; set; }

        // 同步目标
        [NameInMap("destination")]
        [Validation(Required=true)]
        public string Destination { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目名称
        // 
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 根元素ID列表
        [NameInMap("root_elements")]
        [Validation(Required=false)]
        public string RootElements { get; set; }

        // 是否只读
        // 
        [NameInMap("read_only")]
        [Validation(Required=true)]
        public bool? ReadOnly { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 附件列表
        [NameInMap("attachment_list")]
        [Validation(Required=false)]
        public string AttachmentList { get; set; }

        // 产品Owner
        [NameInMap("pd_owner")]
        [Validation(Required=false)]
        public string PdOwner { get; set; }

        // 要素列表
        [NameInMap("asset_element_info_list")]
        [Validation(Required=false)]
        public List<AssetElementInfo> AssetElementInfoList { get; set; }

        // 要素关系列表
        [NameInMap("asset_element_relation_info_list")]
        [Validation(Required=false)]
        public List<AssetElementRelationInfo> AssetElementRelationInfoList { get; set; }

    }

}
