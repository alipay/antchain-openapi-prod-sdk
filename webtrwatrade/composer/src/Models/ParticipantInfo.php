<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class ParticipantInfo extends Model
{
    // 机构id
    /**
     * @example 80aee17181634daa9f1c37d787f0ec02
     *
     * @var string
     */
    public $id;

    // 二级机构类型
    /**
     * @example CHANNEL
     *
     * @var string
     */
    public $type;

    // 机构名称
    /**
     * @example 代销机构
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'id'   => 'id',
        'type' => 'type',
        'name' => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParticipantInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
