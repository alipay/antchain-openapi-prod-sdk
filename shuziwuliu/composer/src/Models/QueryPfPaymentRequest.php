<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfPaymentRequest extends Model
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

    // 业务参考号
    /**
     * @var string
     */
    public $bussRefrNo;

    // 支用id
    /**
     * @var string
     */
    public $financingId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bussRefrNo'        => 'buss_refr_no',
        'financingId'       => 'financing_id',
    ];

    public function validate()
    {
        Model::validateRequired('bussRefrNo', $this->bussRefrNo, true);
        Model::validateRequired('financingId', $this->financingId, true);
        Model::validateMaxLength('bussRefrNo', $this->bussRefrNo, 100);
        Model::validateMaxLength('financingId', $this->financingId, 32);
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
        if (null !== $this->bussRefrNo) {
            $res['buss_refr_no'] = $this->bussRefrNo;
        }
        if (null !== $this->financingId) {
            $res['financing_id'] = $this->financingId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfPaymentRequest
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
        if (isset($map['buss_refr_no'])) {
            $model->bussRefrNo = $map['buss_refr_no'];
        }
        if (isset($map['financing_id'])) {
            $model->financingId = $map['financing_id'];
        }

        return $model;
    }
}
