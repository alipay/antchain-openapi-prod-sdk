<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SceneModel extends Model
{
    // 主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 场景名
    /**
     * @example testScene
     *
     * @var string
     */
    public $sceneName;

    // 是否托管
    /**
     * @example ESCROWED
     *
     * @var string
     */
    public $escrowed;

    // 私钥密码
    /**
     * @example MEUCI..
     *
     * @var string
     */
    public $privateKeyPassword;

    // 租户
    /**
     * @example testTenant
     *
     * @var string
     */
    public $tenantName;

    // 场景类型
    /**
     * @example 共享单车
     *
     * @var string
     */
    public $sceneType;
    protected $_name = [
        'id'                 => 'id',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'sceneName'          => 'scene_name',
        'escrowed'           => 'escrowed',
        'privateKeyPassword' => 'private_key_password',
        'tenantName'         => 'tenant_name',
        'sceneType'          => 'scene_type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('sceneName', $this->sceneName, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->escrowed) {
            $res['escrowed'] = $this->escrowed;
        }
        if (null !== $this->privateKeyPassword) {
            $res['private_key_password'] = $this->privateKeyPassword;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->sceneType) {
            $res['scene_type'] = $this->sceneType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SceneModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['escrowed'])) {
            $model->escrowed = $map['escrowed'];
        }
        if (isset($map['private_key_password'])) {
            $model->privateKeyPassword = $map['private_key_password'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['scene_type'])) {
            $model->sceneType = $map['scene_type'];
        }

        return $model;
    }
}
