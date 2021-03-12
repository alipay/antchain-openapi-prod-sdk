<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DidDeleteService extends Model
{
    // 修改前did doc版本
    /**
     * @example 2
     *
     * @var int
     */
    public $previousVersion;

    // 指定服务的id
    /**
     * @example service#2
     *
     * @var string
     */
    public $serviceId;
    protected $_name = [
        'previousVersion' => 'previous_version',
        'serviceId'       => 'service_id',
    ];

    public function validate()
    {
        Model::validateRequired('previousVersion', $this->previousVersion, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->previousVersion) {
            $res['previous_version'] = $this->previousVersion;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidDeleteService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['previous_version'])) {
            $model->previousVersion = $map['previous_version'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }

        return $model;
    }
}
