<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractBindResp extends Model
{
    // 合约标识
    /**
     * @example cme20230724104931af3a4d
     *
     * @var string
     */
    public $serviceId;

    // 合约名称
    /**
     * @example 资产合约
     *
     * @var string
     */
    public $name;

    // 是否已关联
    /**
     * @example true
     *
     * @var bool
     */
    public $bind;
    protected $_name = [
        'serviceId' => 'service_id',
        'name'      => 'name',
        'bind'      => 'bind',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->bind) {
            $res['bind'] = $this->bind;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractBindResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['bind'])) {
            $model->bind = $map['bind'];
        }

        return $model;
    }
}
