<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryStandardVoucherRequest extends Model
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

    // 数据标识
    /**
     * @var string
     */
    public $businessCode;

    // 所属账户
    /**
     * @var string
     */
    public $voucherOwner;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessCode'      => 'business_code',
        'voucherOwner'      => 'voucher_owner',
    ];

    public function validate()
    {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('voucherOwner', $this->voucherOwner, true);
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
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->voucherOwner) {
            $res['voucher_owner'] = $this->voucherOwner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStandardVoucherRequest
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
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['voucher_owner'])) {
            $model->voucherOwner = $map['voucher_owner'];
        }

        return $model;
    }
}
