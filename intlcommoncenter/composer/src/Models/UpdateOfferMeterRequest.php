<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTLCOMMONCENTER\Models;

use AlibabaCloud\Tea\Model;

class UpdateOfferMeterRequest extends Model
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

    // 国际商品内部编码
    /**
     * @var string
     */
    public $offerCode;

    // 计量对接状态，FINISH标识以完成计量对接
    /**
     * @var string
     */
    public $meterAccessStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'offerCode'         => 'offer_code',
        'meterAccessStatus' => 'meter_access_status',
    ];

    public function validate()
    {
        Model::validateRequired('offerCode', $this->offerCode, true);
        Model::validateRequired('meterAccessStatus', $this->meterAccessStatus, true);
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
        if (null !== $this->offerCode) {
            $res['offer_code'] = $this->offerCode;
        }
        if (null !== $this->meterAccessStatus) {
            $res['meter_access_status'] = $this->meterAccessStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateOfferMeterRequest
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
        if (isset($map['offer_code'])) {
            $model->offerCode = $map['offer_code'];
        }
        if (isset($map['meter_access_status'])) {
            $model->meterAccessStatus = $map['meter_access_status'];
        }

        return $model;
    }
}
