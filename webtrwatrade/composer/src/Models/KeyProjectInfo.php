<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class KeyProjectInfo extends Model
{
    // 项目名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // key使用类型
    // MINT：发行密钥
    // BURN：赎回密钥
    // TRANSFER：转账密钥
    // MANAGER：管理密钥
    /**
     * @example MINT
     *
     * @var string
     */
    public $keyType;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreated;
    protected $_name = [
        'name'       => 'name',
        'keyType'    => 'key_type',
        'gmtCreated' => 'gmt_created',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('keyType', $this->keyType, true);
        Model::validateRequired('gmtCreated', $this->gmtCreated, true);
        Model::validatePattern('gmtCreated', $this->gmtCreated, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->keyType) {
            $res['key_type'] = $this->keyType;
        }
        if (null !== $this->gmtCreated) {
            $res['gmt_created'] = $this->gmtCreated;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KeyProjectInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['key_type'])) {
            $model->keyType = $map['key_type'];
        }
        if (isset($map['gmt_created'])) {
            $model->gmtCreated = $map['gmt_created'];
        }

        return $model;
    }
}
