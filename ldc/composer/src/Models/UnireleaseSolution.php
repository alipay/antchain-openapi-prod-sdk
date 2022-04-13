<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnireleaseSolution extends Model
{
    // 发布单ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 发布单标题
    /**
     * @example my first release
     *
     * @var string
     */
    public $title;

    // 解决方案平台源
    /**
     * @example LinkE
     *
     * @var string
     */
    public $sourceSystem;

    // 发布类型，容器/经典
    /**
     * @example Container
     *
     * @var string
     */
    public $type;

    // 需求人/操作者
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $submitter;

    // 解决方案状态
    /**
     * @example SUCCEDED
     *
     * @var string
     */
    public $state;

    // 解决方案提出时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTimeStamp;

    // 是否自动执行
    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoExecute;

    // 环境信息
    /**
     * @example pre/prod
     *
     * @var string
     */
    public $env;

    // 变更人员
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $operator;

    // 解决方案拓展信息
    /**
     * @example 拓展信息
     *
     * @var UnireleaseSolutionExtInfo
     */
    public $extInfo;

    // 解决方案包含的应用配置信息
    /**
     * @example
     *
     * @var UnireleaseSolutionApp[]
     */
    public $apps;

    // 租户列表
    /**
     * @example
     *
     * @var string[]
     */
    public $tenants;
    protected $_name = [
        'id'              => 'id',
        'title'           => 'title',
        'sourceSystem'    => 'source_system',
        'type'            => 'type',
        'submitter'       => 'submitter',
        'state'           => 'state',
        'createTimeStamp' => 'create_time_stamp',
        'autoExecute'     => 'auto_execute',
        'env'             => 'env',
        'operator'        => 'operator',
        'extInfo'         => 'ext_info',
        'apps'            => 'apps',
        'tenants'         => 'tenants',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('sourceSystem', $this->sourceSystem, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('submitter', $this->submitter, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('createTimeStamp', $this->createTimeStamp, true);
        Model::validateRequired('autoExecute', $this->autoExecute, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('apps', $this->apps, true);
        Model::validateRequired('tenants', $this->tenants, true);
        Model::validatePattern('createTimeStamp', $this->createTimeStamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->submitter) {
            $res['submitter'] = $this->submitter;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->createTimeStamp) {
            $res['create_time_stamp'] = $this->createTimeStamp;
        }
        if (null !== $this->autoExecute) {
            $res['auto_execute'] = $this->autoExecute;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = null !== $this->extInfo ? $this->extInfo->toMap() : null;
        }
        if (null !== $this->apps) {
            $res['apps'] = [];
            if (null !== $this->apps && \is_array($this->apps)) {
                $n = 0;
                foreach ($this->apps as $item) {
                    $res['apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenants) {
            $res['tenants'] = $this->tenants;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnireleaseSolution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['submitter'])) {
            $model->submitter = $map['submitter'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['create_time_stamp'])) {
            $model->createTimeStamp = $map['create_time_stamp'];
        }
        if (isset($map['auto_execute'])) {
            $model->autoExecute = $map['auto_execute'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = UnireleaseSolutionExtInfo::fromMap($map['ext_info']);
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = [];
                $n           = 0;
                foreach ($map['apps'] as $item) {
                    $model->apps[$n++] = null !== $item ? UnireleaseSolutionApp::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenants'])) {
            if (!empty($map['tenants'])) {
                $model->tenants = $map['tenants'];
            }
        }

        return $model;
    }
}
