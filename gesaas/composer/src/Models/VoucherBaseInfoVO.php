<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class VoucherBaseInfoVO extends Model
{
    // 2088xxxxxx0001
    /**
     * @example 用户ID
     *
     * @var string
     */
    public $userId;

    // 手机号
    /**
     * @example 15700001111
     *
     * @var string
     */
    public $phoneNumber;

    // 权益编号
    /**
     * @example RC188955110502576765
     *
     * @var string
     */
    public $rightsCode;

    // 权益名称
    /**
     * @example 满10元减2元
     *
     * @var string
     */
    public $rightsName;

    // 券码
    /**
     * @example 202601160007300227760ZT3CMQY
     *
     * @var string
     */
    public $voucherCode;

    // 券状态
    // WAIT_EFFECT：待生效
    // WAIT_VERIFY：待核销
    // EXPIRED：已过期
    // VERIFY_SUCCESS：核销成功（已核销）
    // 公域场景下只会包含以上四种状态，私域场景会包含下方状态基
    // FREEZE：已冻结
    // VERIFYING：核销处理中
    // VERIFY_FAIL：核销失败
    // VERIFY_CANCELING：核销撤销中
    // INVALID：已失效
    // NO_NEED_VERIFY：无需核销
    /**
     * @example WAIT_VERIFY
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'userId'      => 'user_id',
        'phoneNumber' => 'phone_number',
        'rightsCode'  => 'rights_code',
        'rightsName'  => 'rights_name',
        'voucherCode' => 'voucher_code',
        'status'      => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('rightsCode', $this->rightsCode, true);
        Model::validateRequired('rightsName', $this->rightsName, true);
        Model::validateRequired('voucherCode', $this->voucherCode, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->rightsCode) {
            $res['rights_code'] = $this->rightsCode;
        }
        if (null !== $this->rightsName) {
            $res['rights_name'] = $this->rightsName;
        }
        if (null !== $this->voucherCode) {
            $res['voucher_code'] = $this->voucherCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VoucherBaseInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['rights_code'])) {
            $model->rightsCode = $map['rights_code'];
        }
        if (isset($map['rights_name'])) {
            $model->rightsName = $map['rights_name'];
        }
        if (isset($map['voucher_code'])) {
            $model->voucherCode = $map['voucher_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
