<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateClaimMaterialRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 报案单号（蚂蚁内部）
    /**
     * @var string
     */
    public $claimNotificationFormNoInner;

    // 报案号（保司）
    /**
     * @var string
     */
    public $claimNotificationNo;

    // 报案材料列表
    /**
     * @var string
     */
    public $materialList;

    // 不传值，默认（1-已完毕）
    // 0：未完毕
    // 1：已完毕
    /**
     * @var string
     */
    public $isFinished;
    protected $_name = [
        'authToken'                    => 'auth_token',
        'claimNotificationFormNoInner' => 'claim_notification_form_no_inner',
        'claimNotificationNo'          => 'claim_notification_no',
        'materialList'                 => 'material_list',
        'isFinished'                   => 'is_finished',
    ];

    public function validate()
    {
        Model::validateRequired('claimNotificationFormNoInner', $this->claimNotificationFormNoInner, true);
        Model::validateRequired('claimNotificationNo', $this->claimNotificationNo, true);
        Model::validateRequired('materialList', $this->materialList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->claimNotificationFormNoInner) {
            $res['claim_notification_form_no_inner'] = $this->claimNotificationFormNoInner;
        }
        if (null !== $this->claimNotificationNo) {
            $res['claim_notification_no'] = $this->claimNotificationNo;
        }
        if (null !== $this->materialList) {
            $res['material_list'] = $this->materialList;
        }
        if (null !== $this->isFinished) {
            $res['is_finished'] = $this->isFinished;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateClaimMaterialRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['claim_notification_form_no_inner'])) {
            $model->claimNotificationFormNoInner = $map['claim_notification_form_no_inner'];
        }
        if (isset($map['claim_notification_no'])) {
            $model->claimNotificationNo = $map['claim_notification_no'];
        }
        if (isset($map['material_list'])) {
            $model->materialList = $map['material_list'];
        }
        if (isset($map['is_finished'])) {
            $model->isFinished = $map['is_finished'];
        }

        return $model;
    }
}
