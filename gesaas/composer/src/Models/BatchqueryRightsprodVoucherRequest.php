<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryRightsprodVoucherRequest extends Model
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

    // 券编码（券实例）列表
    /**
     * @var string[]
     */
    public $voucherCodeList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'voucherCodeList'   => 'voucher_code_list',
    ];

    public function validate()
    {
        Model::validateRequired('voucherCodeList', $this->voucherCodeList, true);
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
        if (null !== $this->voucherCodeList) {
            $res['voucher_code_list'] = $this->voucherCodeList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryRightsprodVoucherRequest
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
        if (isset($map['voucher_code_list'])) {
            if (!empty($map['voucher_code_list'])) {
                $model->voucherCodeList = $map['voucher_code_list'];
            }
        }

        return $model;
    }
}
