<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class GetRcpHqRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 房产链内部银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 房产查询单号
    /**
     * @var string
     */
    public $hqOrderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bankNo'            => 'bank_no',
        'hqOrderNo'         => 'hq_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('hqOrderNo', $this->hqOrderNo, true);
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
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->hqOrderNo) {
            $res['hq_order_no'] = $this->hqOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRcpHqRequest
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
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['hq_order_no'])) {
            $model->hqOrderNo = $map['hq_order_no'];
        }

        return $model;
    }
}
