<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DisServiceInfo extends Model
{
    // 提供服务的did
    /**
     * @example did:mychain:xxxxxxxxx
     *
     * @var string
     */
    public $controller;

    // 服务地址
    /**
     * @example www.xxxx.com/xxxx
     *
     * @var string
     */
    public $endPoint;

    // 服务id
    /**
     * @example did:service:xxxxxx
     *
     * @var string
     */
    public $serviceId;

    // 服务类型
    /**
     * @example xxxx
     *
     * @var string
     */
    public $serviceType;
    protected $_name = [
        'controller'  => 'controller',
        'endPoint'    => 'end_point',
        'serviceId'   => 'service_id',
        'serviceType' => 'service_type',
    ];

    public function validate()
    {
        Model::validateRequired('controller', $this->controller, true);
        Model::validateRequired('endPoint', $this->endPoint, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->controller) {
            $res['controller'] = $this->controller;
        }
        if (null !== $this->endPoint) {
            $res['end_point'] = $this->endPoint;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['controller'])) {
            $model->controller = $map['controller'];
        }
        if (isset($map['end_point'])) {
            $model->endPoint = $map['end_point'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }

        return $model;
    }
}
