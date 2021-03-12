<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DisServicesInfo extends Model
{
    // did doc service扩展字段
    /**
     * @example {}
     *
     * @var string
     */
    public $extesion;

    // did doc service id
    /**
     * @example didauth-1
     *
     * @var string
     */
    public $id;

    // 服务endpoint
    /**
     * @example http://auth.mydid.agent.com
     *
     * @var string
     */
    public $serviceEndpoint;

    // service type
    /**
     * @example DidAuthService
     *
     * @var string
     */
    public $type;

    // EXIST
    // CONFLICT
    // VALID
    // INVALID
    /**
     * @example 描述
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'extesion'        => 'extesion',
        'id'              => 'id',
        'serviceEndpoint' => 'service_endpoint',
        'type'            => 'type',
        'desc'            => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('serviceEndpoint', $this->serviceEndpoint, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->extesion) {
            $res['extesion'] = $this->extesion;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->serviceEndpoint) {
            $res['service_endpoint'] = $this->serviceEndpoint;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisServicesInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['extesion'])) {
            $model->extesion = $map['extesion'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['service_endpoint'])) {
            $model->serviceEndpoint = $map['service_endpoint'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
