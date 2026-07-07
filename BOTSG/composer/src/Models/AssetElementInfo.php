<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTSG\Models;

use AlibabaCloud\Tea\Model;

class AssetElementInfo extends Model
{
    // 项目ID
    /**
     * @example 112233
     *
     * @var string
     */
    public $projectId;

    // 要素ID
    /**
     * @example 112233
     *
     * @var string
     */
    public $elementId;

    //
    // 要素名称
    /**
     * @example 注册要素
     *
     * @var string
     */
    public $elementName;

    // 要素类型
    /**
     * @example 资产要素
     *
     * @var string
     */
    public $elementType;

    // 数据来源渠道， 物理要素非必填；数据要素必填；
    /**
     * @example MAAS
     *
     * @var string
     */
    public $fromType;

    // 平台领域类型， 物理要素非必填；数据要素必填；
    /**
     * @example COLLECT_BIZ_DATA
     *
     * @var string
     */
    public $dataElementType;

    // 属性列表， 物理要素非必填；数据要素必填；
    /**
     * @example [{...},{...}]
     *
     * @var string
     */
    public $propertyList;

    // 数据上报频率
    /**
     * @example {...}
     *
     * @var string
     */
    public $frequency;

    // 物理要素类型码，包含iot和资管的
    /**
     * @example {"iot":[23001], "tap":[1201]}
     *
     * @var string
     */
    public $physicsElementTypeCode;

    // 业务类型
    /**
     * @example ORDER
     *
     * @var string
     */
    public $bizType;

    // 该要素的存储位置， index代表数据流转顺序，location为库表/logstore名称，remark备注
    /**
     * @example {...}
     *
     * @var string
     */
    public $persistentLocation;

    // 要素实例信息，用于捞取最小闭环数据
    /**
     * @example {"scene": "XXX", "entityId": ["XXX"], "featureId": "XXX", "startTime": "XXX", "endTime": "XXX"}
     *
     * @var string
     */
    public $elementInstanceConfig;

    // 要素实例
    /**
     * @example {...}
     *
     * @var string
     */
    public $elementInstanceInfo;

    // 属性列表来源平台 1.IOT 2.DM
    /**
     * @example 1
     *
     * @var int
     */
    public $propertySourceType;

    // 拉取数据字段code请求值
    /**
     * @example xxx
     *
     * @var string
     */
    public $propertySourceId;

    // 要素主键字段信息
    /**
     * @example identifier
     *
     * @var string
     */
    public $primaryKeyInfo;

    // 备注
    /**
     * @example xxx
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'projectId'              => 'project_id',
        'elementId'              => 'element_id',
        'elementName'            => 'element_name',
        'elementType'            => 'element_type',
        'fromType'               => 'from_type',
        'dataElementType'        => 'data_element_type',
        'propertyList'           => 'property_list',
        'frequency'              => 'frequency',
        'physicsElementTypeCode' => 'physics_element_type_code',
        'bizType'                => 'biz_type',
        'persistentLocation'     => 'persistent_location',
        'elementInstanceConfig'  => 'element_instance_config',
        'elementInstanceInfo'    => 'element_instance_info',
        'propertySourceType'     => 'property_source_type',
        'propertySourceId'       => 'property_source_id',
        'primaryKeyInfo'         => 'primary_key_info',
        'remark'                 => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('elementId', $this->elementId, true);
        Model::validateRequired('elementType', $this->elementType, true);
        Model::validateRequired('physicsElementTypeCode', $this->physicsElementTypeCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->elementId) {
            $res['element_id'] = $this->elementId;
        }
        if (null !== $this->elementName) {
            $res['element_name'] = $this->elementName;
        }
        if (null !== $this->elementType) {
            $res['element_type'] = $this->elementType;
        }
        if (null !== $this->fromType) {
            $res['from_type'] = $this->fromType;
        }
        if (null !== $this->dataElementType) {
            $res['data_element_type'] = $this->dataElementType;
        }
        if (null !== $this->propertyList) {
            $res['property_list'] = $this->propertyList;
        }
        if (null !== $this->frequency) {
            $res['frequency'] = $this->frequency;
        }
        if (null !== $this->physicsElementTypeCode) {
            $res['physics_element_type_code'] = $this->physicsElementTypeCode;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->persistentLocation) {
            $res['persistent_location'] = $this->persistentLocation;
        }
        if (null !== $this->elementInstanceConfig) {
            $res['element_instance_config'] = $this->elementInstanceConfig;
        }
        if (null !== $this->elementInstanceInfo) {
            $res['element_instance_info'] = $this->elementInstanceInfo;
        }
        if (null !== $this->propertySourceType) {
            $res['property_source_type'] = $this->propertySourceType;
        }
        if (null !== $this->propertySourceId) {
            $res['property_source_id'] = $this->propertySourceId;
        }
        if (null !== $this->primaryKeyInfo) {
            $res['primary_key_info'] = $this->primaryKeyInfo;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetElementInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['element_id'])) {
            $model->elementId = $map['element_id'];
        }
        if (isset($map['element_name'])) {
            $model->elementName = $map['element_name'];
        }
        if (isset($map['element_type'])) {
            $model->elementType = $map['element_type'];
        }
        if (isset($map['from_type'])) {
            $model->fromType = $map['from_type'];
        }
        if (isset($map['data_element_type'])) {
            $model->dataElementType = $map['data_element_type'];
        }
        if (isset($map['property_list'])) {
            $model->propertyList = $map['property_list'];
        }
        if (isset($map['frequency'])) {
            $model->frequency = $map['frequency'];
        }
        if (isset($map['physics_element_type_code'])) {
            $model->physicsElementTypeCode = $map['physics_element_type_code'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['persistent_location'])) {
            $model->persistentLocation = $map['persistent_location'];
        }
        if (isset($map['element_instance_config'])) {
            $model->elementInstanceConfig = $map['element_instance_config'];
        }
        if (isset($map['element_instance_info'])) {
            $model->elementInstanceInfo = $map['element_instance_info'];
        }
        if (isset($map['property_source_type'])) {
            $model->propertySourceType = $map['property_source_type'];
        }
        if (isset($map['property_source_id'])) {
            $model->propertySourceId = $map['property_source_id'];
        }
        if (isset($map['primary_key_info'])) {
            $model->primaryKeyInfo = $map['primary_key_info'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
