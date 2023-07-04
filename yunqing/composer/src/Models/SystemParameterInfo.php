<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class SystemParameterInfo extends Model
{
    // 参数名
    /**
     * @example sso_login_url
     *
     * @var string
     */
    public $type;

    // 参数值
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $value;

    // 环境Id
    /**
     * @example 730420210726104445272690000
     *
     * @var string
     */
    public $envId;

    // 参数描述
    /**
     * @example sso跳转登录地址
     *
     * @var string
     */
    public $description;

    // 记录id
    /**
     * @example 1072610444527
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'type'        => 'type',
        'value'       => 'value',
        'envId'       => 'env_id',
        'description' => 'description',
        'id'          => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('envId', $this->envId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SystemParameterInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
