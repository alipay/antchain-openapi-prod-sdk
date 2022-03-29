<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ApplicationServiceDTO extends Model
{
    // 应用服务id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 应用serviceid
    /**
     * @example ad1kd3
     *
     * @var string
     */
    public $serviceId;

    // 应用服务名
    /**
     * @example servicename
     *
     * @var string
     */
    public $name;

    // 应用id
    /**
     * @example 1
     *
     * @var int
     */
    public $appId;

    // 区分客户端的serviceid和服务端的service_id
    /**
     * @example [{ value:_sub_, text: _客户端_ }, { value: _pub_, text:_服务端_}]
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'id'        => 'id',
        'serviceId' => 'service_id',
        'name'      => 'name',
        'appId'     => 'app_id',
        'type'      => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationServiceDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
