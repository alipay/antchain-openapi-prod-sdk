// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 项目内授权的数据集信息
    public class AuthDataset : TeaModel {
        // 授权数据集ID
        [NameInMap("auth_dataset_id")]
        [Validation(Required=true)]
        public string AuthDatasetId { get; set; }

        // 创建授权时间(毫秒)
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 更新授权时间(毫秒)
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 数据集名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 数据集配置参数
        [NameInMap("config")]
        [Validation(Required=true)]
        public string Config { get; set; }

        // SAAS：该数据集为云上saas节点登记，数据的元信息存储于fdf中
        // FATE：该数据集为线下fate节点登记，数据参数仅有tablename&namespace
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
        [NameInMap("visible_type")]
        [Validation(Required=true)]
        public string VisibleType { get; set; }

    }

}
