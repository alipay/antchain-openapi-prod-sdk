<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CallbackArbitrationStatusRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 案件文书号
    /**
     * @var string
     */
    public $acceptanceNumber;

    // 案件编号
    /**
     * @var string
     */
    public $caseNo;

    // 确认时间时间戳
    /**
     * @var int
     */
    public $confirmTime;

    // 预处理案号
    /**
     * @var string
     */
    public $preacceptanceNumber;

    // 发送时间时间戳
    /**
     * @var int
     */
    public $sendTime;

    // 案件状态
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'acceptanceNumber'    => 'acceptance_number',
        'caseNo'              => 'case_no',
        'confirmTime'         => 'confirm_time',
        'preacceptanceNumber' => 'preacceptance_number',
        'sendTime'            => 'send_time',
        'status'              => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('caseNo', $this->caseNo, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->acceptanceNumber) {
            $res['acceptance_number'] = $this->acceptanceNumber;
        }
        if (null !== $this->caseNo) {
            $res['case_no'] = $this->caseNo;
        }
        if (null !== $this->confirmTime) {
            $res['confirm_time'] = $this->confirmTime;
        }
        if (null !== $this->preacceptanceNumber) {
            $res['preacceptance_number'] = $this->preacceptanceNumber;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackArbitrationStatusRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['acceptance_number'])) {
            $model->acceptanceNumber = $map['acceptance_number'];
        }
        if (isset($map['case_no'])) {
            $model->caseNo = $map['case_no'];
        }
        if (isset($map['confirm_time'])) {
            $model->confirmTime = $map['confirm_time'];
        }
        if (isset($map['preacceptance_number'])) {
            $model->preacceptanceNumber = $map['preacceptance_number'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
