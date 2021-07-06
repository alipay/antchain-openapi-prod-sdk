<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class CancelBmpbrowserPrivilegeRequest extends Model
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

    // 蚂蚁区块链的唯一链id
    //
    /**
     * @var string
     */
    public $bizid;

    // 取消查看权限的支付宝电话号码集合
    //
    /**
     * @var string
     */
    public $phoneNumbers;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'phoneNumbers'      => 'phone_numbers',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('phoneNumbers', $this->phoneNumbers, true);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->phoneNumbers) {
            $res['phone_numbers'] = $this->phoneNumbers;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelBmpbrowserPrivilegeRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['phone_numbers'])) {
            $model->phoneNumbers = $map['phone_numbers'];
        }

        return $model;
    }
}
