<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class TemplateParamDef extends Model {
    protected $_name = [
        'dataLevel' => 'data_level',
        'defaultVal' => 'default_val',
        'deleted' => 'deleted',
        'desc' => 'desc',
        'id' => 'id',
        'key' => 'key',
        'paramVersion' => 'param_version',
        'type' => 'type',
        'value' => 'value',
        'createdTime' => 'created_time',
        'modifiedTime' => 'modified_time',
    ];
    public function validate() {
        Model::validateRequired('dataLevel', $this->dataLevel, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->dataLevel) {
            $res['data_level'] = $this->dataLevel;
        }
        if (null !== $this->defaultVal) {
            $res['default_val'] = $this->defaultVal;
        }
        if (null !== $this->deleted) {
            $res['deleted'] = $this->deleted;
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
        if (null !== $this->paramVersion) {
            $res['param_version'] = $this->paramVersion;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TemplateParamDef
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['data_level'])){
            $model->dataLevel = $map['data_level'];
        }
        if(isset($map['default_val'])){
            $model->defaultVal = $map['default_val'];
        }
        if(isset($map['deleted'])){
            $model->deleted = $map['deleted'];
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
        if(isset($map['param_version'])){
            $model->paramVersion = $map['param_version'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['created_time'])){
            $model->createdTime = $map['created_time'];
        }
        if(isset($map['modified_time'])){
            $model->modifiedTime = $map['modified_time'];
        }
        return $model;
    }
    // 数据保密级别，L1,L2,L3
    /**
     * @example L1,L2,L3
     * @var string
     */
    public $dataLevel;

    // 默认值，表达式解析结果为空时使用
    /**
     * @example defaultAppName
     * @var string
     */
    public $defaultVal;

    // 是否已删除
    /**
     * @example true, false
     * @var bool
     */
    public $deleted;

    // 参数描述
    /**
     * @example 应用名称
     * @var string
     */
    public $desc;

    // 参数id
    /**
     * @example 00000000300402
     * @var string
     */
    public $id;

    // 参数名
    /**
     * @example appName
     * @var string
     */
    public $key;

    // 版本
    /**
     * @example 1
     * @var int
     */
    public $paramVersion;

    // 参数值类型，CONST/EXPR
    /**
     * @example CONST,EXPR
     * @var string
     */
    public $type;

    // 参数值，可能是一个常量或者表达式
    /**
     * @example {{app.cell.name}}
     * @var string
     */
    public $value;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createdTime;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modifiedTime;

}
