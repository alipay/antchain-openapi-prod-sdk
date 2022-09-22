// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用分组概要信息
    public class AppGroupSimpleView : TeaModel {
        // 应用id列表
        [NameInMap("app_id_list")]
        [Validation(Required=true)]
        public List<string> AppIdList { get; set; }

        // 服务分组id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 蓝绿发布专用
        [NameInMap("bg_cell_name")]
        [Validation(Required=false)]
        public string BgCellName { get; set; }

        // 蓝绿发布专用，traffic或release
        [NameInMap("bg_group_type")]
        [Validation(Required=false)]
        public string BgGroupType { get; set; }

    }

}
