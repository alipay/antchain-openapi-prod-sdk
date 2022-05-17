<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class AksEndpoint extends Model
{
    // access_key
    /**
     * @example AK
     *
     * @var string
     */
    public $accessKey;

    // access_secret
    /**
     * @example SK
     *
     * @var string
     */
    public $accessSecret;

    // acvip的地址
    /**
     * @example 1.2.4.8
     *
     * @var string
     */
    public $endpoint;

    // 产品id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 租户名
    /**
     * @example CPJVTBCN
     *
     * @var string
     */
    public $tenant;

    // 工作区
    /**
     * @example dev
     *
     * @var string
     */
    public $workspace;

    // 表示mesh的配置信息, 用key/value的形式给出.
    /**
     * @example
     *
     * @var KeyValuePair[]
     */
    public $mesh;
    protected $_name = [
        'accessKey'    => 'access_key',
        'accessSecret' => 'access_secret',
        'endpoint'     => 'endpoint',
        'instanceId'   => 'instance_id',
        'tenant'       => 'tenant',
        'workspace'    => 'workspace',
        'mesh'         => 'mesh',
    ];

    public function validate()
    {
        Model::validateRequired('accessKey', $this->accessKey, true);
        Model::validateRequired('accessSecret', $this->accessSecret, true);
        Model::validateRequired('endpoint', $this->endpoint, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('mesh', $this->mesh, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->accessSecret) {
            $res['access_secret'] = $this->accessSecret;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->mesh) {
            $res['mesh'] = [];
            if (null !== $this->mesh && \is_array($this->mesh)) {
                $n = 0;
                foreach ($this->mesh as $item) {
                    $res['mesh'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AksEndpoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['access_secret'])) {
            $model->accessSecret = $map['access_secret'];
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['mesh'])) {
            if (!empty($map['mesh'])) {
                $model->mesh = [];
                $n           = 0;
                foreach ($map['mesh'] as $item) {
                    $model->mesh[$n++] = null !== $item ? KeyValuePair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
