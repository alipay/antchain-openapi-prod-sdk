// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateComputerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 实例描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 镜像文件ID，启动实例时选择的镜像资源。
        [NameInMap("image_id")]
        [Validation(Required=false)]
        public string ImageId { get; set; }

        // 创建的实例数量。默认为 1 台
        [NameInMap("instance_count")]
        [Validation(Required=false)]
        public long? InstanceCount { get; set; }

        // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是：
        // ()`~!@#^&*-_+=|{}[]:;'<>,.?/
        // 其中，Windows实例不能以斜线号（/）为密码首字符。
        [NameInMap("paasword")]
        [Validation(Required=false, MaxLength=30)]
        public string Paasword { get; set; }

        // 实例所在地域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // image 或者 package
        [NameInMap("deploy_type")]
        [Validation(Required=false)]
        public string DeployType { get; set; }

        // 新创建实例所属于的安全组ID，同一个安全组内的实例之间可以互相访问。
        [NameInMap("security_group_id")]
        [Validation(Required=false)]
        public string SecurityGroupId { get; set; }

        // 实例的资源规格。
        [NameInMap("spec_id")]
        [Validation(Required=false)]
        public string SpecId { get; set; }

        // 单位 G。系统盘大小，需根据选择的 image 类型决定。
        [NameInMap("system_disk_size")]
        [Validation(Required=false)]
        public string SystemDiskSize { get; set; }

        // 系统盘类型
        [NameInMap("system_disk_type")]
        [Validation(Required=false)]
        public string SystemDiskType { get; set; }

        // VPC类型的实例，需要指定虚拟交换机ID。
        [NameInMap("v_switch_id")]
        [Validation(Required=false)]
        public string VSwitchId { get; set; }

        // 实例所在工作空间
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // 实例所在可用区
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

    }

}
