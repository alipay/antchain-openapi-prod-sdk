<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiMetaRequest extends Model
{
    // 产品码
    /**
     * @example ABC
     *
     * @var string
     */
    public $providerName;

    // 套件版本号
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $suiteVersion;

    // api分组名称
    /**
     * @example demo-api
     *
     * @var string
     */
    public $groupName;

    // api名称
    /**
     * @example api名称
     *
     * @var string
     */
    public $name;

    // 新名字
    /**
     * @example antchain.abc.qqq.qqq.query
     *
     * @var string
     */
    public $newName;

    // api拥有者
    /**
     * @example linyao.lin
     *
     * @var string
     */
    public $owner;

    // api简介
    /**
     * @example test1
     *
     * @var string
     */
    public $summary;

    // 是否是内部api
    /**
     * @example true, false
     *
     * @var bool
     */
    public $internal;

    // api版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $apiVersion;

    // api描述
    /**
     * @example only for test
     *
     * @var string
     */
    public $description;

    // 是否是第三方代理
    /**
     * @example true, false
     *
     * @var bool
     */
    public $thirdPartAuth;

    // api状态
    /**
     * @example
     *
     * @var StatusEnum
     */
    public $statusEnum;

    // 扩展参数
    /**
     * @example test
     *
     * @var string
     */
    public $extAttribute;
    protected $_name = [
        'providerName'  => 'provider_name',
        'suiteVersion'  => 'suite_version',
        'groupName'     => 'group_name',
        'name'          => 'name',
        'newName'       => 'new_name',
        'owner'         => 'owner',
        'summary'       => 'summary',
        'internal'      => 'internal',
        'apiVersion'    => 'api_version',
        'description'   => 'description',
        'thirdPartAuth' => 'third_part_auth',
        'statusEnum'    => 'status_enum',
        'extAttribute'  => 'ext_attribute',
    ];

    public function validate()
    {
        Model::validateRequired('providerName', $this->providerName, true);
        Model::validateRequired('suiteVersion', $this->suiteVersion, true);
        Model::validateRequired('groupName', $this->groupName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('summary', $this->summary, true);
        Model::validateRequired('internal', $this->internal, true);
        Model::validateRequired('apiVersion', $this->apiVersion, true);
        Model::validateRequired('statusEnum', $this->statusEnum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->suiteVersion) {
            $res['suite_version'] = $this->suiteVersion;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->newName) {
            $res['new_name'] = $this->newName;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
        }
        if (null !== $this->internal) {
            $res['internal'] = $this->internal;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->thirdPartAuth) {
            $res['third_part_auth'] = $this->thirdPartAuth;
        }
        if (null !== $this->statusEnum) {
            $res['status_enum'] = null !== $this->statusEnum ? $this->statusEnum->toMap() : null;
        }
        if (null !== $this->extAttribute) {
            $res['ext_attribute'] = $this->extAttribute;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiMetaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['suite_version'])) {
            $model->suiteVersion = $map['suite_version'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['new_name'])) {
            $model->newName = $map['new_name'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['summary'])) {
            $model->summary = $map['summary'];
        }
        if (isset($map['internal'])) {
            $model->internal = $map['internal'];
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['third_part_auth'])) {
            $model->thirdPartAuth = $map['third_part_auth'];
        }
        if (isset($map['status_enum'])) {
            $model->statusEnum = StatusEnum::fromMap($map['status_enum']);
        }
        if (isset($map['ext_attribute'])) {
            $model->extAttribute = $map['ext_attribute'];
        }

        return $model;
    }
}
