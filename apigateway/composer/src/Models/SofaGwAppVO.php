<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwAppVO extends Model
{
    // 应用认证信息
    /**
     * @example
     *
     * @var SofaGwAuthenticationVO[]
     */
    public $authentications;

    // 应用描述信息
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 实例标识
    /**
     * @example abcdEFGH1234
     *
     * @var int
     */
    public $id;

    // 实例标识
    /**
     * @example abcdEFGH1234
     *
     * @var string
     */
    public $instanceId;

    // 名称
    /**
     * @example dsrconsole
     *
     * @var string
     */
    public $name;

    // services
    /**
     * @example 1
     *
     * @var string[]
     */
    public $services;

    // api分组(服务提供方)用 PUBLISHER，应用(服务使用方)用 SUBSCRIBER
    /**
     * @example PUBLISHER/SUBSCRIBER
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'authentications' => 'authentications',
        'description'     => 'description',
        'id'              => 'id',
        'instanceId'      => 'instance_id',
        'name'            => 'name',
        'services'        => 'services',
        'type'            => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authentications) {
            $res['authentications'] = [];
            if (null !== $this->authentications && \is_array($this->authentications)) {
                $n = 0;
                foreach ($this->authentications as $item) {
                    $res['authentications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->services) {
            $res['services'] = $this->services;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SofaGwAppVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authentications'])) {
            if (!empty($map['authentications'])) {
                $model->authentications = [];
                $n                      = 0;
                foreach ($map['authentications'] as $item) {
                    $model->authentications[$n++] = null !== $item ? SofaGwAuthenticationVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['services'])) {
            if (!empty($map['services'])) {
                $model->services = $map['services'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
