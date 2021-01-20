<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppParam extends Model {
    protected $_name = [
        'appName' => 'app_name',
        'createdTime' => 'created_time',
        'dataLevel' => 'data_level',
        'desc' => 'desc',
        'id' => 'id',
        'key' => 'key',
        'modifiedTime' => 'modified_time',
        'paramVersion' => 'param_version',
        'scope' => 'scope',
        'scopeId' => 'scope_id',
        'tenantId' => 'tenant_id',
        'type' => 'type',
        'value' => 'value',
    ];
    public function validate() {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->dataLevel) {
            $res['data_level'] = $this->dataLevel;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->paramVersion) {
            $res['param_version'] = $this->paramVersion;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeId) {
            $res['scope_id'] = $this->scopeId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppParam
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        if(isset($map['data_level'])){
            $model->dataLevel = $map['data_level'];
        }
        if(isset($map['desc'])){
            $model->desc = $map['desc'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['key'])){
            $model->key = $map['key'];
        }
        if(isset($map['modified_time'])){
            $model->modifiedTime = $map['modified_time'];
        }
        if(isset($map['param_version'])){
            $model->paramVersion = $map['param_version'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_id'])){
            $model->scopeId = $map['scope_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        return $model;
    }
    // 应用名称
    /**
     * @example apaks
     * @var string
     */
    public $appName;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createdTime;

    // 数据保密等级
    /**
     * @example L1,L2,L3
     * @var string
     */
    public $dataLevel;

    // 参数描述
    /**
     * @example 内部域名
     * @var string
     */
    public $desc;

    // 应用参数 id
    /**
     * @example 00000000380302
     * @var string
     */
    public $id;

    // 参数名
    /**
     * @example inner_domain
     * @var string
     */
    public $key;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modifiedTime;

    // 版本
    /**
     * @example 1
     * @var int
     */
    public $paramVersion;

    // 该参数属于哪个 scope
    /**
     * @example SITE,REGION,AZ,TENANT,WORKSPACEGROUP,WORKSPACE,CELL
     * @var string
     */
    public $scope;

    // 该参数在该 scope 中的 id
    /**
     * @example 00000000400301
     * @var string
     */
    public $scopeId;

    // 租户 id
    /**
     * @example 00000000420301
     * @var string
     */
    public $tenantId;

    // 参数类型
    /**
     * @example CONST,EXPR
     * @var string
     */
    public $type;

    // 参数值
    /**
     * @example alipay.net
     * @var string
     */
    public $value;

}
