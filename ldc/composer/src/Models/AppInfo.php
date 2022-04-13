<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppInfo extends Model
{
    // buildpack版本。
    /**
     * @example version
     *
     * @var string
     */
    public $buildpackVersion;

    // 应用描述。
    /**
     * @example test app
     *
     * @var string
     */
    public $description;

    // 应用id。
    /**
     * @example 0123456789
     *
     * @var string
     */
    public $id;

    // 应用名称。
    /**
     * @example app
     *
     * @var string
     */
    public $name;

    // 应用owner。
    /**
     * @example 张三
     *
     * @var string
     */
    public $owner;

    // 技术栈。
    /**
     * @example Java
     *
     * @var string
     */
    public $techstackIdentity;

    // ownerId
    /**
     * @example 1111
     *
     * @var string
     */
    public $ownerId;
    protected $_name = [
        'buildpackVersion'  => 'buildpack_version',
        'description'       => 'description',
        'id'                => 'id',
        'name'              => 'name',
        'owner'             => 'owner',
        'techstackIdentity' => 'techstack_identity',
        'ownerId'           => 'owner_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('techstackIdentity', $this->techstackIdentity, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->techstackIdentity) {
            $res['techstack_identity'] = $this->techstackIdentity;
        }
        if (null !== $this->ownerId) {
            $res['owner_id'] = $this->ownerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['buildpack_version'])) {
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['techstack_identity'])) {
            $model->techstackIdentity = $map['techstack_identity'];
        }
        if (isset($map['owner_id'])) {
            $model->ownerId = $map['owner_id'];
        }

        return $model;
    }
}
