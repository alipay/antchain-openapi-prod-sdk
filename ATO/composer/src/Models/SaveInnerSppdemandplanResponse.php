<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SaveInnerSppdemandplanResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'planId' => 'plan_id',
        'auditStatus' => 'audit_status',
        'runStatus' => 'run_status',
    ];
    public function validate() {
        Model::validateRequired('planId', $this->planId, true);
        Model::validateRequired('auditStatus', $this->auditStatus, true);
        Model::validateRequired('runStatus', $this->runStatus, true);
    }
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
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->auditStatus) {
            $res['audit_status'] = $this->auditStatus;
        }
        if (null !== $this->runStatus) {
            $res['run_status'] = $this->runStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveInnerSppdemandplanResponse
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
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['audit_status'])){
            $model->auditStatus = $map['audit_status'];
        }
        if(isset($map['run_status'])){
            $model->runStatus = $map['run_status'];
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

    // 新增或编辑的计划编号
    /**
     * @var string
     */
    public $planId;

    // DRAFT 或 PENDING
    /**
     * @var string
     */
    public $auditStatus;

    // PENDING
    /**
     * @var string
     */
    public $runStatus;

}
