<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ATO\Models\FileInfo;

class SumbitInnerMermngcontractauditResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'status' => 'status',
        'auditId' => 'audit_id',
        'contractAuditFinalFile' => 'contract_audit_final_file',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->contractAuditFinalFile) {
            $res['contract_audit_final_file'] = null !== $this->contractAuditFinalFile ? $this->contractAuditFinalFile->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SumbitInnerMermngcontractauditResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['audit_id'])){
            $model->auditId = $map['audit_id'];
        }
        if(isset($map['contract_audit_final_file'])){
            $model->contractAuditFinalFile = FileInfo::fromMap($map['contract_audit_final_file']);
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 审核id
    /**
     * @var string
     */
    public $auditId;

    // 审核后合同文件
    /**
     * @var FileInfo
     */
    public $contractAuditFinalFile;

}
