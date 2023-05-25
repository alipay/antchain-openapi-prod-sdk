<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Repository extends Model
{
    // 仓库ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 仓库名称
    /**
     * @example nginx
     *
     * @var string
     */
    public $name;

    // 项目ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $projectId;

    // 仓库Tag数
    /**
     * @example 18
     *
     * @var string
     */
    public $tagsCount;
    protected $_name = [
        'id'        => 'id',
        'name'      => 'name',
        'projectId' => 'project_id',
        'tagsCount' => 'tags_count',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('tagsCount', $this->tagsCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->tagsCount) {
            $res['tags_count'] = $this->tagsCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Repository
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['tags_count'])) {
            $model->tagsCount = $map['tags_count'];
        }

        return $model;
    }
}
