<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class CreateMultistepDepositRequest extends Model
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

    // 操作主体信息
    /**
     * @var OperateSubject
     */
    public $subject;

    // 业务类型，如：CONTRACT、ORDER...
    /**
     * @var string
     */
    public $bizType;

    // 业务流水ID（如：合同编号）
    /**
     * @var string
     */
    public $bizId;

    // 环节编号，需要按照字母表/数字顺序，能够进行排序处理
    /**
     * @var string
     */
    public $stepNo;

    // 环节名称
    /**
     * @var string
     */
    public $stepName;

    // 交易时间，yyyyMMddh24miss格式
    /**
     * @var string
     */
    public $txTime;

    // 业务详细信息，json格式，具体内容由调用方自行确定
    /**
     * @var string
     */
    public $bizInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'subject'           => 'subject',
        'bizType'           => 'biz_type',
        'bizId'             => 'biz_id',
        'stepNo'            => 'step_no',
        'stepName'          => 'step_name',
        'txTime'            => 'tx_time',
        'bizInfo'           => 'biz_info',
    ];

    public function validate()
    {
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('stepNo', $this->stepNo, true);
        Model::validateRequired('stepName', $this->stepName, true);
        Model::validateRequired('txTime', $this->txTime, true);
        Model::validateRequired('bizInfo', $this->bizInfo, true);
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
        if (null !== $this->subject) {
            $res['subject'] = null !== $this->subject ? $this->subject->toMap() : null;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->stepNo) {
            $res['step_no'] = $this->stepNo;
        }
        if (null !== $this->stepName) {
            $res['step_name'] = $this->stepName;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }
        if (null !== $this->bizInfo) {
            $res['biz_info'] = $this->bizInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateMultistepDepositRequest
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
        if (isset($map['subject'])) {
            $model->subject = OperateSubject::fromMap($map['subject']);
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['step_no'])) {
            $model->stepNo = $map['step_no'];
        }
        if (isset($map['step_name'])) {
            $model->stepName = $map['step_name'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }
        if (isset($map['biz_info'])) {
            $model->bizInfo = $map['biz_info'];
        }

        return $model;
    }
}
