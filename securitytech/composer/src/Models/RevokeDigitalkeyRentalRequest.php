<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RevokeDigitalkeyRentalRequest extends Model
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

    // 租赁钥匙收回接口
    /**
     * @var string
     */
    public $tuid;

    // 租车人手机号
    /**
     * @var string
     */
    public $renterMobile;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tuid'              => 'tuid',
        'renterMobile'      => 'renter_mobile',
    ];

    public function validate()
    {
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('renterMobile', $this->renterMobile, true);
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
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->renterMobile) {
            $res['renter_mobile'] = $this->renterMobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RevokeDigitalkeyRentalRequest
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
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['renter_mobile'])) {
            $model->renterMobile = $map['renter_mobile'];
        }

        return $model;
    }
}
