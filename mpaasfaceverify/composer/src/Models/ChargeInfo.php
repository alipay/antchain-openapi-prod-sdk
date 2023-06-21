<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class ChargeInfo extends Model
{
    // 认证单据号
    /**
     * @example certify_id
     *
     * @var string
     */
    public $certifyId;

    // 计费类型，当前枚举支持：
    // FAIL_NOT_CHARGE：认证失败，该单据不计费
    // CHARGE：认证成功，该单据计费
    /**
     * @example charge_type
     *
     * @var string
     */
    public $chargeType;

    // 错误码
    /**
     * @example error_code
     *
     * @var string
     */
    public $errorCode;
    protected $_name = [
        'certifyId'  => 'certify_id',
        'chargeType' => 'charge_type',
        'errorCode'  => 'error_code',
    ];

    public function validate()
    {
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('chargeType', $this->chargeType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChargeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['charge_type'])) {
            $model->chargeType = $map['charge_type'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }

        return $model;
    }
}
