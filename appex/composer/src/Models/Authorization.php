<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class Authorization extends Model
{
    // 授权内容的类型
    /**
     * @example profile
     *
     * @var string
     */
    public $authType;

    // 要获取的授权字段
    /**
     * @example phone
     *
     * @var string[]
     */
    public $fields;

    // 签名时间戳
    /**
     * @example 10000000
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'authType'  => 'auth_type',
        'fields'    => 'fields',
        'timestamp' => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('fields', $this->fields, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->fields) {
            $res['fields'] = $this->fields;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Authorization
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['fields'])) {
            if (!empty($map['fields'])) {
                $model->fields = $map['fields'];
            }
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
