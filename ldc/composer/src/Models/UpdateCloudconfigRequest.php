<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateCloudconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // cloud_config json描述
    /**
     * @var string
     */
    public $cloudConfig;

    // UPDATE或ROLLBACK
    /**
     * @var string
     */
    public $option;
    protected $_name = [
        'authToken'   => 'auth_token',
        'cloudConfig' => 'cloud_config',
        'option'      => 'option',
    ];

    public function validate()
    {
        Model::validateRequired('cloudConfig', $this->cloudConfig, true);
        Model::validateRequired('option', $this->option, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cloudConfig) {
            $res['cloud_config'] = $this->cloudConfig;
        }
        if (null !== $this->option) {
            $res['option'] = $this->option;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCloudconfigRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cloud_config'])) {
            $model->cloudConfig = $map['cloud_config'];
        }
        if (isset($map['option'])) {
            $model->option = $map['option'];
        }

        return $model;
    }
}
