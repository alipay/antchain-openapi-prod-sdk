<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractBindAppReq extends Model
{
    // 应用ID
    /**
     * @example app20230725115808679d4f
     *
     * @var string
     */
    public $applicationId;

    // 合约服务标识集合
    /**
     * @example
     *
     * @var string[]
     */
    public $serviceIds;
    protected $_name = [
        'applicationId' => 'application_id',
        'serviceIds'    => 'service_ids',
    ];

    public function validate()
    {
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateMaxLength('applicationId', $this->applicationId, 64);
        Model::validateMinLength('applicationId', $this->applicationId, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->serviceIds) {
            $res['service_ids'] = $this->serviceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractBindAppReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['service_ids'])) {
            if (!empty($map['service_ids'])) {
                $model->serviceIds = $map['service_ids'];
            }
        }

        return $model;
    }
}
