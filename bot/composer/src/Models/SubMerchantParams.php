<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SubMerchantParams extends Model
{
    // 子商户的商户id
    /**
     * @example 2088123412341234
     *
     * @var string
     */
    public $subMerchantId;

    // 子商户的商户名称
    /**
     * @example 滴滴出行
     *
     * @var string
     */
    public $subMerchantName;

    // 子商户的服务名称
    /**
     * @example 滴滴出行免密支付
     *
     * @var string
     */
    public $subMerchantServiceName;

    // 子商户的服务描述
    /**
     * @example 免密付车费，单次最高500
     *
     * @var string
     */
    public $subMerchantServiceDescription;
    protected $_name = [
        'subMerchantId'                 => 'sub_merchant_id',
        'subMerchantName'               => 'sub_merchant_name',
        'subMerchantServiceName'        => 'sub_merchant_service_name',
        'subMerchantServiceDescription' => 'sub_merchant_service_description',
    ];

    public function validate()
    {
        Model::validateRequired('subMerchantId', $this->subMerchantId, true);
        Model::validateRequired('subMerchantName', $this->subMerchantName, true);
        Model::validateRequired('subMerchantServiceName', $this->subMerchantServiceName, true);
        Model::validateRequired('subMerchantServiceDescription', $this->subMerchantServiceDescription, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subMerchantId) {
            $res['sub_merchant_id'] = $this->subMerchantId;
        }
        if (null !== $this->subMerchantName) {
            $res['sub_merchant_name'] = $this->subMerchantName;
        }
        if (null !== $this->subMerchantServiceName) {
            $res['sub_merchant_service_name'] = $this->subMerchantServiceName;
        }
        if (null !== $this->subMerchantServiceDescription) {
            $res['sub_merchant_service_description'] = $this->subMerchantServiceDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubMerchantParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_merchant_id'])) {
            $model->subMerchantId = $map['sub_merchant_id'];
        }
        if (isset($map['sub_merchant_name'])) {
            $model->subMerchantName = $map['sub_merchant_name'];
        }
        if (isset($map['sub_merchant_service_name'])) {
            $model->subMerchantServiceName = $map['sub_merchant_service_name'];
        }
        if (isset($map['sub_merchant_service_description'])) {
            $model->subMerchantServiceDescription = $map['sub_merchant_service_description'];
        }

        return $model;
    }
}
