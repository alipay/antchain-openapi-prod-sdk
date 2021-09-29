// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署区详情
    public class ContractSignFieldDetail : TeaModel {
        // 签约主体类别，0-个人，1-机构，默认0,2 是不限
        [NameInMap("actor_indentity_type")]
        [Validation(Required=false)]
        public long? ActorIndentityType { get; set; }

        // 添加时间
        [NameInMap("add_time")]
        [Validation(Required=false)]
        public long? AddTime { get; set; }

        // 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
        [NameInMap("assigned_posbean")]
        [Validation(Required=false)]
        public bool? AssignedPosbean { get; set; }

        // 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
        [NameInMap("assigned_seal")]
        [Validation(Required=false)]
        public bool? AssignedSeal { get; set; }

        // 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
        [NameInMap("authorized_account_id")]
        [Validation(Required=false)]
        public string AuthorizedAccountId { get; set; }

        // 是否自动执行，TRUE需要静默授权，配置项，无默认值
        [NameInMap("auto_execute")]
        [Validation(Required=false)]
        public bool? AutoExecute { get; set; }

        // 执行失败原因
        [NameInMap("execute_failed_reason")]
        [Validation(Required=false)]
        public string ExecuteFailedReason { get; set; }

        // 文件file id
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 签署区顺序，默认1,且不小于1，顺序越小越先处理
        [NameInMap("order")]
        [Validation(Required=false)]
        public long? Order { get; set; }

        // 页码信息，可以_,_或_-_分割
        [NameInMap("pos_page")]
        [Validation(Required=false)]
        public string PosPage { get; set; }

        // x坐标
        [NameInMap("pos_x")]
        [Validation(Required=false)]
        public string PosX { get; set; }

        // y坐标
        [NameInMap("pos_y")]
        [Validation(Required=false)]
        public string PosY { get; set; }

        // 印章文件file key
        [NameInMap("seal_file_key")]
        [Validation(Required=false)]
        public string SealFileKey { get; set; }

        // 印章id
        [NameInMap("seal_id")]
        [Validation(Required=false)]
        public string SealId { get; set; }

        // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
        [NameInMap("seal_type")]
        [Validation(Required=false)]
        public string SealType { get; set; }

        // 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
        [NameInMap("signer_account_id")]
        [Validation(Required=false)]
        public string SignerAccountId { get; set; }

        // 签署区Id
        [NameInMap("signfield_id")]
        [Validation(Required=false)]
        public string SignfieldId { get; set; }

        // 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
        [NameInMap("sign_type")]
        [Validation(Required=false)]
        public long? SignType { get; set; }

        // 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成"）
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 状态描述
        [NameInMap("status_description")]
        [Validation(Required=false)]
        public string StatusDescription { get; set; }

        // 签署区宽
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

    }

}
