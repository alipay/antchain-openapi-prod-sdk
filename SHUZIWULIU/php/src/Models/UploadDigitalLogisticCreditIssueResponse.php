<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadDigitalLogisticCreditIssueResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'batchId' => 'batch_id',
        'batchIdStatus' => 'batch_id_status',
        'issueUrl' => 'issue_url',
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->batchIdStatus) {
            $res['batch_id_status'] = $this->batchIdStatus;
        }
        if (null !== $this->issueUrl) {
            $res['issue_url'] = $this->issueUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticCreditIssueResponse
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
        if(isset($map['batch_id'])){
            $model->batchId = $map['batch_id'];
        }
        if(isset($map['batch_id_status'])){
            $model->batchIdStatus = $map['batch_id_status'];
        }
        if(isset($map['issue_url'])){
            $model->issueUrl = $map['issue_url'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 批次号
    /**
     * @var string
     */
    public $batchId;

    // 批次状态
    /**
     * @var int
     */
    public $batchIdStatus;

    // 发行url
    /**
     * @var string
     */
    public $issueUrl;

}
