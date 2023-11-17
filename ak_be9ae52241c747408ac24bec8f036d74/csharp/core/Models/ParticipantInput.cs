// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 该参与方的输入数据配置
    public class ParticipantInput : TeaModel {
        // 授权至项目内的数据集ID
        [NameInMap("auth_dataset_id")]
        [Validation(Required=true)]
        public string AuthDatasetId { get; set; }

        // 上述数据集所需参与计算的列
        [NameInMap("fields")]
        [Validation(Required=false)]
        public List<string> Fields { get; set; }

        // 用户筛选该数据集的过滤条件
        [NameInMap("filter")]
        [Validation(Required=false)]
        public string Filter { get; set; }

    }

}
