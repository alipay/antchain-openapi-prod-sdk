<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateLoadbalanceSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 公网类型实例的付费方式。取值： PAY_BY_BANDWIDTH：按带宽计费。 PAY_BY_TRAFFIC：按流量计费（默认值）。
    /**
     * @var string
     */
    public $internetChargeType;

    // 若为按带宽计费类型需填写此字段
    /**
     * @var int
     */
    public $bandwidth;

    // lb paas id
    /**
     * @var string
     */
    public $loadbalanceSequence;
    protected $_name = [
        'authToken'           => 'auth_token',
        'internetChargeType'  => 'internet_charge_type',
        'bandwidth'           => 'bandwidth',
        'loadbalanceSequence' => 'loadbalance_sequence',
    ];

    public function validate()
    {
        Model::validateRequired('internetChargeType', $this->internetChargeType, true);
        Model::validateRequired('loadbalanceSequence', $this->loadbalanceSequence, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->internetChargeType) {
            $res['internet_charge_type'] = $this->internetChargeType;
        }
        if (null !== $this->bandwidth) {
            $res['bandwidth'] = $this->bandwidth;
        }
        if (null !== $this->loadbalanceSequence) {
            $res['loadbalance_sequence'] = $this->loadbalanceSequence;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateLoadbalanceSpecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['internet_charge_type'])) {
            $model->internetChargeType = $map['internet_charge_type'];
        }
        if (isset($map['bandwidth'])) {
            $model->bandwidth = $map['bandwidth'];
        }
        if (isset($map['loadbalance_sequence'])) {
            $model->loadbalanceSequence = $map['loadbalance_sequence'];
        }

        return $model;
    }
}
