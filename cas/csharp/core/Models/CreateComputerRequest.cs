// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateComputerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app service id
        [NameInMap("app_service_id")]
        [Validation(Required=false)]
        public string AppServiceId { get; set; }

        // 是否自动续费
        [NameInMap("auto_renew")]
        [Validation(Required=false)]
        public bool? AutoRenew { get; set; }

        // 每次自动续费的时长，当参数AutoRenew取值True时为必填取值范围：
        //    1
        //      2
        //      3
        //       6
        //      12
        //     
        [NameInMap("auto_renew_period")]
        [Validation(Required=false)]
        public long? AutoRenewPeriod { get; set; }

        // cell id
        [NameInMap("cell_id")]
        [Validation(Required=false)]
        public string CellId { get; set; }

        // 通用镜像文件ID，启动实例时选择的镜像资源。
        // 
        [NameInMap("common_image_sequence")]
        [Validation(Required=false)]
        public string CommonImageSequence { get; set; }

        // AKE模式下可以指定此值
        [NameInMap("cpu_shared")]
        [Validation(Required=false)]
        public bool? CpuShared { get; set; }

        // 数据盘信息
        [NameInMap("data_disks")]
        [Validation(Required=false)]
        public List<DataDisk> DataDisks { get; set; }

        // sigma模式取值，公有云模式下无意义
        [NameInMap("deploy_mode")]
        [Validation(Required=false)]
        public string DeployMode { get; set; }

        // 实例描述
        // 
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否使用全局唯一名称
        [NameInMap("distinct_name")]
        [Validation(Required=false)]
        public bool? DistinctName { get; set; }

        // 自定义镜像文件ID，启动实例时选择的镜像资源。
        // 
        [NameInMap("image_sequence")]
        [Validation(Required=false)]
        public string ImageSequence { get; set; }

        // 计费方式，默认按量计费
        [NameInMap("instance_charge_type")]
        [Validation(Required=false)]
        public string InstanceChargeType { get; set; }

        // 创建的实例数量。默认为 1 台
        [NameInMap("instance_count")]
        [Validation(Required=false)]
        public long? InstanceCount { get; set; }

        // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
        [NameInMap("name")]
        [Validation(Required=false, MaxLength=40)]
        public string Name { get; set; }

        // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是： ()`~!@#^&*-_+=|{}[]:;_<>,.?/ 其中，Windows实例不能以斜线号（/）为密码首字符。
        [NameInMap("password")]
        [Validation(Required=false, MaxLength=30)]
        public string Password { get; set; }

        // 购买资源的时长，单位为：月。当参数 InstanceChargeType 取值为 PrePaid 时才生效且为必选值。取值范围：1 - 9
        //      12
        //      24
        //      36
        //      48
        //      60
        // 
        [NameInMap("period")]
        [Validation(Required=false)]
        public long? Period { get; set; }

        //  购买资源的时长。可选值Week | Month。
        //  PeriodUnit 为 Week 时：
        //  Period 取值 {“1”, “2”, “3”, “4”}
        // AutoRenewPeriod 取值 {“1”, “2”, “3”}
        //  Period 取值 { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}
        //    AutoRenewPeriod 取值 {“1”, “2”, “3”, “6”, “12”}
        //     默认值：Month
        [NameInMap("period_unit")]
        [Validation(Required=false)]
        public string PeriodUnit { get; set; }

        // 新创建实例所属于的安全组/域序列号，同一个安全组内的实例之间可以互相访问。
        [NameInMap("security_group_sequence")]
        [Validation(Required=true)]
        public string SecurityGroupSequence { get; set; }

        // 实例的资源规格。
        // 
        [NameInMap("spec_id")]
        [Validation(Required=true)]
        public string SpecId { get; set; }

        // 单位 G。系统盘大小，需根据选择的 image 类型决定。
        [NameInMap("system_disk_size")]
        [Validation(Required=true)]
        public long? SystemDiskSize { get; set; }

        // 系统盘类型
        // 
        [NameInMap("system_disk_type")]
        [Validation(Required=true)]
        public string SystemDiskType { get; set; }

        // VPC类型的实例，需要指定虚拟交换机ID。
        [NameInMap("v_switch_id")]
        [Validation(Required=false)]
        public string VSwitchId { get; set; }

        // 实例所在工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 实例所在可用区的 zone identity
        [NameInMap("zone")]
        [Validation(Required=true)]
        public string Zone { get; set; }

        // zone_id如果为空，则zone必填，建议使用zone_id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // 公有云上标签
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<MapStringToStringEntity> Tags { get; set; }

        // cmp模式下使用的vpc，一般场景勿用
        [NameInMap("vpc_iaas_id")]
        [Validation(Required=false)]
        public string VpcIaasId { get; set; }

        // cmp模式下传的token，一般场景勿用
        [NameInMap("cloud_manage_token")]
        [Validation(Required=false)]
        public string CloudManageToken { get; set; }

    }

}
