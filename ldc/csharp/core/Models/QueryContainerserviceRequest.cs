// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryContainerserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 容器服务部署状态。取值可以由多个部署状态组成一个JSON数组，不同状态之间用绊脚逗号(,)隔开，取值范围：
        // . WAITING_FOR_DEPLOY: 待发布
        // . INITIALIZING: 初始化中
        // . INITIALIZED: 初始化完成
        // . INITIALIZE_FAILED: 初始化失败
        // . CONFIRM_WAITING: 待确认
        // . CONFIRMED: 已确认
        // . EXECUTING: 发布中
        // . PAUSED: 暂停
        // . CANCELING: 取消中
        // . CANCELED: 已取消
        // . ROLLBACKING: 回滚中
        // . ROLLBACK_PAUSED: 回滚暂停
        // . ROLLBACKED: 已回滚
        // . SUCCEEDED: 发布完成
        // . FAILED: 发布失败
        // . DELETING: 删除中
        // . DELETE_FAILED: 删除失败
        [NameInMap("deployment_status")]
        [Validation(Required=false)]
        public List<string> DeploymentStatus { get; set; }

        // 容器服务元数据状态。取值可以由多个元数据状态组成一个JSON数组，不同状态之间用半角逗号（,）隔开。状态取值范围：
        // . DRAFTED: 草稿
        // . CREATING: 创建中
        // . CREATED: 已创建
        // . UPDATING: 更新中
        // . UPDATED: 已更新
        // . DELETING: 删除中
        // . DELETED: 已删除
        // . DEPLOYED: 已发布
        // . CREATE_FAILED: 创建失败
        // . UPDATE_FAILED: 更新失败
        // . DELETE_FAILED: 删除失败
        [NameInMap("metadata_status")]
        [Validation(Required=false)]
        public List<string> MetadataStatus { get; set; }

        // 容器应用服务名称，支持使用通配符*进行模糊搜索。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前命名空间名称。
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 实例状态列表的页码。起始值：1。默认值：1 。
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 分页查询时设置的每页行数。最大值：100。默认值：10。
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前工作空间组名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
