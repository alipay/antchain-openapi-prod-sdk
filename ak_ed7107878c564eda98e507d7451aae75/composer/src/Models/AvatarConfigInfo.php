<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarConfigInfo extends Model
{
    // 交互配置id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 交互配置名
    /**
     * @example 测试交互配置
     *
     * @var string
     */
    public $configName;

    // 交互配置编码
    /**
     * @example 1e077a39c88140f196449e43d3efb
     *
     * @var string
     */
    public $virtualCode;

    // 数字人角色id
    /**
     * @example 100001
     *
     * @var int
     */
    public $humanId;
    protected $_name = [
        'id'          => 'id',
        'configName'  => 'config_name',
        'virtualCode' => 'virtual_code',
        'humanId'     => 'human_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('configName', $this->configName, true);
        Model::validateRequired('virtualCode', $this->virtualCode, true);
        Model::validateRequired('humanId', $this->humanId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->configName) {
            $res['config_name'] = $this->configName;
        }
        if (null !== $this->virtualCode) {
            $res['virtual_code'] = $this->virtualCode;
        }
        if (null !== $this->humanId) {
            $res['human_id'] = $this->humanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarConfigInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['config_name'])) {
            $model->configName = $map['config_name'];
        }
        if (isset($map['virtual_code'])) {
            $model->virtualCode = $map['virtual_code'];
        }
        if (isset($map['human_id'])) {
            $model->humanId = $map['human_id'];
        }

        return $model;
    }
}
