<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class SCRealEstateQueryRequestBody extends Model
{
    // cmd
    /**
     * @example "cmd": {       "cmdCode": "SC-RealEstate-Query",       "version": "test_d19bd9d59915"     }
     *
     * @var Cmd
     */
    public $cmd;

    // 路由信息
    /**
     * @example "routeCondition": {       "channelId": "HZZKZTKJ"     }
     *
     * @var RouteCondition
     */
    public $routeCondition;

    // requestId
    /**
     * @example test_8c964bb7781a
     *
     * @var string
     */
    public $requestId;

    // payload
    /**
     * @example { "xm": "张三",   "sfz": "51382219970820817X"}
     *
     * @var SCRealEstateQueryRequestPayload
     */
    public $payload;
    protected $_name = [
        'cmd'            => 'cmd',
        'routeCondition' => 'route_condition',
        'requestId'      => 'request_id',
        'payload'        => 'payload',
    ];

    public function validate()
    {
        Model::validateRequired('cmd', $this->cmd, true);
        Model::validateRequired('routeCondition', $this->routeCondition, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('payload', $this->payload, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cmd) {
            $res['cmd'] = null !== $this->cmd ? $this->cmd->toMap() : null;
        }
        if (null !== $this->routeCondition) {
            $res['route_condition'] = null !== $this->routeCondition ? $this->routeCondition->toMap() : null;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->payload) {
            $res['payload'] = null !== $this->payload ? $this->payload->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SCRealEstateQueryRequestBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cmd'])) {
            $model->cmd = Cmd::fromMap($map['cmd']);
        }
        if (isset($map['route_condition'])) {
            $model->routeCondition = RouteCondition::fromMap($map['route_condition']);
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['payload'])) {
            $model->payload = SCRealEstateQueryRequestPayload::fromMap($map['payload']);
        }

        return $model;
    }
}
