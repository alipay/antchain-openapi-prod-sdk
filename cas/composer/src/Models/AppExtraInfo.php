<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppExtraInfo extends Model
{
    // ID
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 值
    /**
     * @example test
     *
     * @var string
     */
    public $value;

    // 描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // 模板ID
    /**
     * @example 123
     *
     * @var string
     */
    public $templateId;

    // 模板类型
    /**
     * @example TEXT, AppTemplateTypeEnum, USER
     *
     * @var string
     */
    public $type;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 最近修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // 应用扩展信息ID
    /**
     * @example 123
     *
     * @var string
     */
    public $appExtrainfoId;

    // 应用ID
    /**
     * @example 123
     *
     * @var string
     */
    public $appId;

    // 模板数据ID
    /**
     * @example 123
     *
     * @var string
     */
    public $templateDataId;
    protected $_name = [
        'id'             => 'id',
        'name'           => 'name',
        'value'          => 'value',
        'description'    => 'description',
        'templateId'     => 'template_id',
        'type'           => 'type',
        'utcCreate'      => 'utc_create',
        'utcModified'    => 'utc_modified',
        'appExtrainfoId' => 'app_extrainfo_id',
        'appId'          => 'app_id',
        'templateDataId' => 'template_data_id',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
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
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->appExtrainfoId) {
            $res['app_extrainfo_id'] = $this->appExtrainfoId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->templateDataId) {
            $res['template_data_id'] = $this->templateDataId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppExtraInfo
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
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['app_extrainfo_id'])) {
            $model->appExtrainfoId = $map['app_extrainfo_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['template_data_id'])) {
            $model->templateDataId = $map['template_data_id'];
        }

        return $model;
    }
}
