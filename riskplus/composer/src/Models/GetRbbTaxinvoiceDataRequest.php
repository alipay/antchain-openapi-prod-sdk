<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class GetRbbTaxinvoiceDataRequest extends Model
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

    // 流水号
    /**
     * @var string
     */
    public $serialNumber;

    // 社会新信用代码
    /**
     * @var string
     */
    public $taxpayerId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serialNumber'      => 'serial_number',
        'taxpayerId'        => 'taxpayer_id',
    ];

    public function validate()
    {
        Model::validateRequired('serialNumber', $this->serialNumber, true);
        Model::validateRequired('taxpayerId', $this->taxpayerId, true);
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
        if (null !== $this->serialNumber) {
            $res['serial_number'] = $this->serialNumber;
        }
        if (null !== $this->taxpayerId) {
            $res['taxpayer_id'] = $this->taxpayerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRbbTaxinvoiceDataRequest
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
        if (isset($map['serial_number'])) {
            $model->serialNumber = $map['serial_number'];
        }
        if (isset($map['taxpayer_id'])) {
            $model->taxpayerId = $map['taxpayer_id'];
        }

        return $model;
    }
}
