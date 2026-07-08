<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailEcarOffsetdatumRequest extends Model
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

    // 业务发生时的调用方的业务单号
    /**
     * @var string
     */
    public $acquisitionItemNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'acquisitionItemNo' => 'acquisition_item_no',
    ];

    public function validate()
    {
        Model::validateRequired('acquisitionItemNo', $this->acquisitionItemNo, true);
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
        if (null !== $this->acquisitionItemNo) {
            $res['acquisition_item_no'] = $this->acquisitionItemNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailEcarOffsetdatumRequest
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
        if (isset($map['acquisition_item_no'])) {
            $model->acquisitionItemNo = $map['acquisition_item_no'];
        }

        return $model;
    }
}
