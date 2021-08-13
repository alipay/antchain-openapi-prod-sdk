<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class AccountSettlementInfo extends Model
{
    // 账户id
    /**
     * @example 761055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $accountId;

    // 版权方名字
    /**
     * @example 小黄鸭
     *
     * @var string
     */
    public $accountName;

    // WAIT_CHECK:渠道已申请开通但未审核，SUCCESS，审核成功
    /**
     * @example WAIT_CHECK
     *
     * @var string
     */
    public $settledStatus;

    // 版权方联系人名字
    /**
     * @example 张三
     *
     * @var string
     */
    public $contactName;

    // 版权方联系人手机
    /**
     * @example 18818818888
     *
     * @var string
     */
    public $contactMobile;

    // 版权方联系人手机号
    /**
     * @example (0513)88888888
     *
     * @var string
     */
    public $contactPhone;

    // 申请入驻时间
    /**
     * @example
     *
     * @var int
     */
    public $applyTime;
    protected $_name = [
        'accountId'     => 'account_id',
        'accountName'   => 'account_name',
        'settledStatus' => 'settled_status',
        'contactName'   => 'contact_name',
        'contactMobile' => 'contact_mobile',
        'contactPhone'  => 'contact_phone',
        'applyTime'     => 'apply_time',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('settledStatus', $this->settledStatus, true);
        Model::validateRequired('contactPhone', $this->contactPhone, true);
        Model::validateRequired('applyTime', $this->applyTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->settledStatus) {
            $res['settled_status'] = $this->settledStatus;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactMobile) {
            $res['contact_mobile'] = $this->contactMobile;
        }
        if (null !== $this->contactPhone) {
            $res['contact_phone'] = $this->contactPhone;
        }
        if (null !== $this->applyTime) {
            $res['apply_time'] = $this->applyTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountSettlementInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['settled_status'])) {
            $model->settledStatus = $map['settled_status'];
        }
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_mobile'])) {
            $model->contactMobile = $map['contact_mobile'];
        }
        if (isset($map['contact_phone'])) {
            $model->contactPhone = $map['contact_phone'];
        }
        if (isset($map['apply_time'])) {
            $model->applyTime = $map['apply_time'];
        }

        return $model;
    }
}
