<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class GetRcpMgrRequest extends Model
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

    // 房产链解抵押单号
    /**
     * @var string
     */
    public $mgReleaseOrderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bankNo'            => 'bank_no',
        'mgReleaseOrderNo'  => 'mg_release_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('mgReleaseOrderNo', $this->mgReleaseOrderNo, true);
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
        if (null !== $this->mgReleaseOrderNo) {
            $res['mg_release_order_no'] = $this->mgReleaseOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRcpMgrRequest
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
        if (isset($map['mg_release_order_no'])) {
            $model->mgReleaseOrderNo = $map['mg_release_order_no'];
        }

        return $model;
    }
}
