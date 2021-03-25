// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用信息
    public class ApplicationInfo : TeaModel {
        // 应用别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 应用名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 应用额外元数据信息
        [NameInMap("app_extra_infos")]
        [Validation(Required=false)]
        public List<AppExtraInfo> AppExtraInfos { get; set; }

        // 应用所属分组名
        [NameInMap("app_group_name")]
        [Validation(Required=false)]
        public string AppGroupName { get; set; }

        // 应用等级名称
        [NameInMap("app_level")]
        [Validation(Required=false)]
        public string AppLevel { get; set; }

        // 技术栈名称
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 应用创建时间
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 应用描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 用户真实名称
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 应用负责人登录名
        [NameInMap("real_owner_login_name")]
        [Validation(Required=false)]
        public string RealOwnerLoginName { get; set; }

        // 应用状态。取值列表：
        //                     CREATING：应用创建中；
        //                     CREATED：应用成功创建，可正常使用；
        //                     CREATE_FAILED：应用创建失败；
        //                     DELETING：应用删除中；
        //                     DELETE_FAILED：应用删除失败
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 全局唯一名字
        [NameInMap("global_name")]
        [Validation(Required=false)]
        public string GlobalName { get; set; }

        // 发布模式， package，image，mixed
        [NameInMap("deploy_type")]
        [Validation(Required=false)]
        public string DeployType { get; set; }

    }

}
