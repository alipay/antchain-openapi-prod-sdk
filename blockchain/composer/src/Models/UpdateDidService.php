<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDidService extends Model
{
    // 待更新did之前的版本号
    /**
     * @example 2
     *
     * @var int
     */
    public $previousVersion;

    // did doc中的service id
    /**
     * @example service#1
     *
     * @var string
     */
    public $serviceId;

    // 服务信息
    /**
     * @example
     *
     * @var DidServiceInfo
     */
    public $serviceInfo;

    // 服务类型
    /**
     * @example auth
     *
     * @var string
     */
    public $serviceType;
    protected $_name = [
        'previousVersion' => 'previous_version',
        'serviceId'       => 'service_id',
        'serviceInfo'     => 'service_info',
        'serviceType'     => 'service_type',
    ];

    public function validate()
    {
        Model::validateRequired('previousVersion', $this->previousVersion, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('serviceInfo', $this->serviceInfo, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
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
        if (null !== $this->serviceInfo) {
            $res['service_info'] = null !== $this->serviceInfo ? $this->serviceInfo->toMap() : null;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDidService
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
        if (isset($map['service_info'])) {
            $model->serviceInfo = DidServiceInfo::fromMap($map['service_info']);
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }

        return $model;
    }
}
