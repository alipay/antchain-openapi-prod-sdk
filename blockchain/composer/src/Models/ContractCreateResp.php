<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractCreateResp extends Model
{
    // 合约标识
    /**
     * @example cme20230724104931af3a4d
     *
     * @var string
     */
    public $serviceId;
    protected $_name = [
        'serviceId' => 'service_id',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractCreateResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }

        return $model;
    }
}
