<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class GetComboOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐订单ID
    /**
     * @var string
     */
    public $comboOrderId;

    // 是否包含履约信息
    /**
     * @var bool
     */
    public $includeFulfillInfo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'comboOrderId'       => 'combo_order_id',
        'includeFulfillInfo' => 'include_fulfill_info',
    ];

    public function validate()
    {
        Model::validateRequired('comboOrderId', $this->comboOrderId, true);
        Model::validateRequired('includeFulfillInfo', $this->includeFulfillInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->comboOrderId) {
            $res['combo_order_id'] = $this->comboOrderId;
        }
        if (null !== $this->includeFulfillInfo) {
            $res['include_fulfill_info'] = $this->includeFulfillInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetComboOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['combo_order_id'])) {
            $model->comboOrderId = $map['combo_order_id'];
        }
        if (isset($map['include_fulfill_info'])) {
            $model->includeFulfillInfo = $map['include_fulfill_info'];
        }

        return $model;
    }
}
