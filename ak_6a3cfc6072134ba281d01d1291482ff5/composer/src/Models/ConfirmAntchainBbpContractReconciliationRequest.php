<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6a3cfc6072134ba281d01d1291482ff5\Models;

use AlibabaCloud\Tea\Model;

class ConfirmAntchainBbpContractReconciliationRequest extends Model
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

    // 服务商
    /**
     * @var string
     */
    public $supCode;

    // 确认时间
    /**
     * @var string
     */
    public $socreDate;

    // 确认类型：1、长城  2、服务方
    /**
     * @var string
     */
    public $confirmType;

    // 确认者
    /**
     * @var string
     */
    public $confirmer;

    // 认证状态
    /**
     * @var string
     */
    public $confirmStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'supCode'           => 'sup_code',
        'socreDate'         => 'socre_date',
        'confirmType'       => 'confirm_type',
        'confirmer'         => 'confirmer',
        'confirmStatus'     => 'confirm_status',
    ];

    public function validate()
    {
        Model::validateRequired('supCode', $this->supCode, true);
        Model::validateRequired('socreDate', $this->socreDate, true);
        Model::validateRequired('confirmType', $this->confirmType, true);
        Model::validateRequired('confirmer', $this->confirmer, true);
        Model::validateRequired('confirmStatus', $this->confirmStatus, true);
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
        if (null !== $this->supCode) {
            $res['sup_code'] = $this->supCode;
        }
        if (null !== $this->socreDate) {
            $res['socre_date'] = $this->socreDate;
        }
        if (null !== $this->confirmType) {
            $res['confirm_type'] = $this->confirmType;
        }
        if (null !== $this->confirmer) {
            $res['confirmer'] = $this->confirmer;
        }
        if (null !== $this->confirmStatus) {
            $res['confirm_status'] = $this->confirmStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmAntchainBbpContractReconciliationRequest
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
        if (isset($map['sup_code'])) {
            $model->supCode = $map['sup_code'];
        }
        if (isset($map['socre_date'])) {
            $model->socreDate = $map['socre_date'];
        }
        if (isset($map['confirm_type'])) {
            $model->confirmType = $map['confirm_type'];
        }
        if (isset($map['confirmer'])) {
            $model->confirmer = $map['confirmer'];
        }
        if (isset($map['confirm_status'])) {
            $model->confirmStatus = $map['confirm_status'];
        }

        return $model;
    }
}
