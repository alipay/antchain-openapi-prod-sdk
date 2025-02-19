<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AddMerchantexpandDividerelationRequest extends Model
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

    // 被分账方社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 分账方信息，最多支持10组
    /**
     * @var DivideBindingTransInInfo[]
     */
    public $divideBindingTransInInfoList;

    // 分账比例上限
    /**
     * @var string
     */
    public $divideRadio;
    protected $_name = [
        'authToken'                    => 'auth_token',
        'productInstanceId'            => 'product_instance_id',
        'merchantId'                   => 'merchant_id',
        'divideBindingTransInInfoList' => 'divide_binding_trans_in_info_list',
        'divideRadio'                  => 'divide_radio',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('divideBindingTransInInfoList', $this->divideBindingTransInInfoList, true);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->divideBindingTransInInfoList) {
            $res['divide_binding_trans_in_info_list'] = [];
            if (null !== $this->divideBindingTransInInfoList && \is_array($this->divideBindingTransInInfoList)) {
                $n = 0;
                foreach ($this->divideBindingTransInInfoList as $item) {
                    $res['divide_binding_trans_in_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->divideRadio) {
            $res['divide_radio'] = $this->divideRadio;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddMerchantexpandDividerelationRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['divide_binding_trans_in_info_list'])) {
            if (!empty($map['divide_binding_trans_in_info_list'])) {
                $model->divideBindingTransInInfoList = [];
                $n                                   = 0;
                foreach ($map['divide_binding_trans_in_info_list'] as $item) {
                    $model->divideBindingTransInInfoList[$n++] = null !== $item ? DivideBindingTransInInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['divide_radio'])) {
            $model->divideRadio = $map['divide_radio'];
        }

        return $model;
    }
}
