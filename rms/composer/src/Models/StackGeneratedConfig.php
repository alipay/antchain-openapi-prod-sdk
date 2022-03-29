<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class StackGeneratedConfig extends Model
{
    // 配置 ID
    /**
     * @example 11223344
     *
     * @var int
     */
    public $id;

    // 所属技术栈 ID
    /**
     * @example 11223344
     *
     * @var int
     */
    public $stackId;

    // 技术栈名称
    /**
     * @example sofacloud
     *
     * @var string
     */
    public $stackName;

    // 技术栈版本
    /**
     * @example 4.2
     *
     * @var string
     */
    public $stackVersion;

    // 栈的一个实体对象 ID
    /**
     * @example 15
     *
     * @var int
     */
    public $stackEntityId;

    // 栈的一个实体对象名称
    /**
     * @example sofa_app
     *
     * @var string
     */
    public $stackEntityName;

    // 实体的一个监控项 ID
    /**
     * @example 20
     *
     * @var int
     */
    public $stackMonitorItemId;

    // 实体的一个监控项名称
    /**
     * @example dalPressure
     *
     * @var string
     */
    public $stackMonitorItemName;

    // 栈实体
    /**
     * @example sofacloud*sofa_app*1*8*ACVIP-acvip
     *
     * @var string
     */
    public $stackUniversalTableId;

    // xflush应用名称
    /**
     * @example ACVIP-acvip
     *
     * @var string
     */
    public $xflushApp;

    // 是否迁移过来
    /**
     * @example true, false
     *
     * @var bool
     */
    public $xflushMove;

    // xflush_type
    /**
     * @example dalPressure
     *
     * @var string
     */
    public $xflushType;

    // 是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isOpen;

    // 存储规则(JSON String, 使用前需要解析)
    /**
     * @example {"capacity":10,"maxKeySize":1000,"time":10080}
     *
     * @var string
     */
    public $storageConfig;

    // 是否自定义
    /**
     * @example true, false
     *
     * @var bool
     */
    public $useCustom;

    // xflush配置(JSON String, 使用前需要解析)
    /**
     * @example {"alarms":[{"view":"server","id":"1","tagValue":"PROD","frequency":0,"silentMinute":"1","timeZone":"localhost","timeZoneCustom":false}],"saveSchema":{"maxKeySize":1000,"capacity":10}}
     *
     * @var string
     */
    public $xflushConfig;
    protected $_name = [
        'id'                    => 'id',
        'stackId'               => 'stack_id',
        'stackName'             => 'stack_name',
        'stackVersion'          => 'stack_version',
        'stackEntityId'         => 'stack_entity_id',
        'stackEntityName'       => 'stack_entity_name',
        'stackMonitorItemId'    => 'stack_monitor_item_id',
        'stackMonitorItemName'  => 'stack_monitor_item_name',
        'stackUniversalTableId' => 'stack_universal_table_id',
        'xflushApp'             => 'xflush_app',
        'xflushMove'            => 'xflush_move',
        'xflushType'            => 'xflush_type',
        'isOpen'                => 'is_open',
        'storageConfig'         => 'storage_config',
        'useCustom'             => 'use_custom',
        'xflushConfig'          => 'xflush_config',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('stackId', $this->stackId, true);
        Model::validateRequired('stackName', $this->stackName, true);
        Model::validateRequired('stackVersion', $this->stackVersion, true);
        Model::validateRequired('stackEntityId', $this->stackEntityId, true);
        Model::validateRequired('stackEntityName', $this->stackEntityName, true);
        Model::validateRequired('stackMonitorItemId', $this->stackMonitorItemId, true);
        Model::validateRequired('stackMonitorItemName', $this->stackMonitorItemName, true);
        Model::validateRequired('stackUniversalTableId', $this->stackUniversalTableId, true);
        Model::validateRequired('xflushApp', $this->xflushApp, true);
        Model::validateRequired('xflushMove', $this->xflushMove, true);
        Model::validateRequired('xflushType', $this->xflushType, true);
        Model::validateRequired('isOpen', $this->isOpen, true);
        Model::validateRequired('storageConfig', $this->storageConfig, true);
        Model::validateRequired('useCustom', $this->useCustom, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->stackName) {
            $res['stack_name'] = $this->stackName;
        }
        if (null !== $this->stackVersion) {
            $res['stack_version'] = $this->stackVersion;
        }
        if (null !== $this->stackEntityId) {
            $res['stack_entity_id'] = $this->stackEntityId;
        }
        if (null !== $this->stackEntityName) {
            $res['stack_entity_name'] = $this->stackEntityName;
        }
        if (null !== $this->stackMonitorItemId) {
            $res['stack_monitor_item_id'] = $this->stackMonitorItemId;
        }
        if (null !== $this->stackMonitorItemName) {
            $res['stack_monitor_item_name'] = $this->stackMonitorItemName;
        }
        if (null !== $this->stackUniversalTableId) {
            $res['stack_universal_table_id'] = $this->stackUniversalTableId;
        }
        if (null !== $this->xflushApp) {
            $res['xflush_app'] = $this->xflushApp;
        }
        if (null !== $this->xflushMove) {
            $res['xflush_move'] = $this->xflushMove;
        }
        if (null !== $this->xflushType) {
            $res['xflush_type'] = $this->xflushType;
        }
        if (null !== $this->isOpen) {
            $res['is_open'] = $this->isOpen;
        }
        if (null !== $this->storageConfig) {
            $res['storage_config'] = $this->storageConfig;
        }
        if (null !== $this->useCustom) {
            $res['use_custom'] = $this->useCustom;
        }
        if (null !== $this->xflushConfig) {
            $res['xflush_config'] = $this->xflushConfig;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StackGeneratedConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['stack_name'])) {
            $model->stackName = $map['stack_name'];
        }
        if (isset($map['stack_version'])) {
            $model->stackVersion = $map['stack_version'];
        }
        if (isset($map['stack_entity_id'])) {
            $model->stackEntityId = $map['stack_entity_id'];
        }
        if (isset($map['stack_entity_name'])) {
            $model->stackEntityName = $map['stack_entity_name'];
        }
        if (isset($map['stack_monitor_item_id'])) {
            $model->stackMonitorItemId = $map['stack_monitor_item_id'];
        }
        if (isset($map['stack_monitor_item_name'])) {
            $model->stackMonitorItemName = $map['stack_monitor_item_name'];
        }
        if (isset($map['stack_universal_table_id'])) {
            $model->stackUniversalTableId = $map['stack_universal_table_id'];
        }
        if (isset($map['xflush_app'])) {
            $model->xflushApp = $map['xflush_app'];
        }
        if (isset($map['xflush_move'])) {
            $model->xflushMove = $map['xflush_move'];
        }
        if (isset($map['xflush_type'])) {
            $model->xflushType = $map['xflush_type'];
        }
        if (isset($map['is_open'])) {
            $model->isOpen = $map['is_open'];
        }
        if (isset($map['storage_config'])) {
            $model->storageConfig = $map['storage_config'];
        }
        if (isset($map['use_custom'])) {
            $model->useCustom = $map['use_custom'];
        }
        if (isset($map['xflush_config'])) {
            $model->xflushConfig = $map['xflush_config'];
        }

        return $model;
    }
}
