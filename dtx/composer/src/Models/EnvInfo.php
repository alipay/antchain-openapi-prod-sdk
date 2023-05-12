<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class EnvInfo extends Model
{
    // 环境
    /**
     * @example stable/sit/prod
     *
     * @var string
     */
    public $env;

    // 是否公有云环境
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isPublicCloud;

    // 租户
    /**
     * @example alipay
     *
     * @var string
     */
    public $tenant;

    // server / client
    /**
     * @example client
     *
     * @var string
     */
    public $recoveryMode;
    protected $_name = [
        'env'           => 'env',
        'isPublicCloud' => 'is_public_cloud',
        'tenant'        => 'tenant',
        'recoveryMode'  => 'recovery_mode',
    ];

    public function validate()
    {
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('isPublicCloud', $this->isPublicCloud, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('recoveryMode', $this->recoveryMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->isPublicCloud) {
            $res['is_public_cloud'] = $this->isPublicCloud;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->recoveryMode) {
            $res['recovery_mode'] = $this->recoveryMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnvInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['is_public_cloud'])) {
            $model->isPublicCloud = $map['is_public_cloud'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['recovery_mode'])) {
            $model->recoveryMode = $map['recovery_mode'];
        }

        return $model;
    }
}
