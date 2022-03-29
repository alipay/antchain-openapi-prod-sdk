<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class PluginModelDO extends Model
{
    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // parent_folder_id
    /**
     * @example parent_folder_id
     *
     * @var int
     */
    public $parentFolderId;

    // plugin_id
    /**
     * @example plugin_id
     *
     * @var int
     */
    public $pluginId;

    // plugin_type
    /**
     * @example plugin_type
     *
     * @var string
     */
    public $pluginType;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // xflush_apps
    /**
     * @example xflush_apps
     *
     * @var string
     */
    public $xflushApps;

    // stack_expression
    /**
     * @example stack_expression
     *
     * @var StackExpression
     */
    public $stackExpression;

    // cal_conf
    /**
     * @example cal_conf
     *
     * @var string
     */
    public $calConf;

    // opsmeta_schema
    /**
     * @example opsmeta_schema
     *
     * @var OpsmetaSchema
     */
    public $opsmetaSchema;

    // save_schema
    /**
     * @example save_schema
     *
     * @var SaveSchema
     */
    public $saveSchema;

    // status
    /**
     * @example status
     *
     * @var StatusDO
     */
    public $status;

    // outside_domain_id
    /**
     * @example outside_domain_id
     *
     * @var int
     */
    public $outsideDomainId;

    // old_folder_id
    /**
     * @example old_folder_id
     *
     * @var int
     */
    public $oldFolderId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var int
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var int
     */
    public $workspaceId;

    // biz_domain_id
    /**
     * @example biz_domain_id
     *
     * @var int
     */
    public $bizDomainId;

    // creater
    /**
     * @example creater
     *
     * @var string
     */
    public $creater;

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var int
     */
    public $gmtCreate;

    // modifier
    /**
     * @example modifier
     *
     * @var string
     */
    public $modifier;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var int
     */
    public $gmtModified;

    // alarm_pkgs
    /**
     * @example alarm_pkgs
     *
     * @var AlarmPkgDO[]
     */
    public $alarmPkgs;

    // noc
    /**
     * @example noc
     *
     * @var string
     */
    public $noc;

    // position
    /**
     * @example position
     *
     * @var string
     */
    public $position;

    // alarmed
    /**
     * @example true, false
     *
     * @var bool
     */
    public $alarmed;

    // recent_alarm_history_id
    /**
     * @example recent_alarm_history_id
     *
     * @var string
     */
    public $recentAlarmHistoryId;

    // recent_alarm
    /**
     * @example recent_alarm
     *
     * @var int
     */
    public $recentAlarm;

    // key_cms
    /**
     * @example true, false
     *
     * @var bool
     */
    public $keyCms;

    // key_cms_sort
    /**
     * @example key_cms_sort
     *
     * @var int
     */
    public $keyCmsSort;

    // status_desc
    /**
     * @example status_desc
     *
     * @var string
     */
    public $statusDesc;

    // data_from
    /**
     * @example data_from
     *
     * @var int
     */
    public $dataFrom;

    // data_to
    /**
     * @example data_to
     *
     * @var int
     */
    public $dataTo;

    // from_source
    /**
     * @example from_source
     *
     * @var string
     */
    public $fromSource;
    protected $_name = [
        'id'                   => 'id',
        'parentFolderId'       => 'parent_folder_id',
        'pluginId'             => 'plugin_id',
        'pluginType'           => 'plugin_type',
        'name'                 => 'name',
        'xflushApps'           => 'xflush_apps',
        'stackExpression'      => 'stack_expression',
        'calConf'              => 'cal_conf',
        'opsmetaSchema'        => 'opsmeta_schema',
        'saveSchema'           => 'save_schema',
        'status'               => 'status',
        'outsideDomainId'      => 'outside_domain_id',
        'oldFolderId'          => 'old_folder_id',
        'tenantId'             => 'tenant_id',
        'workspaceId'          => 'workspace_id',
        'bizDomainId'          => 'biz_domain_id',
        'creater'              => 'creater',
        'gmtCreate'            => 'gmt_create',
        'modifier'             => 'modifier',
        'gmtModified'          => 'gmt_modified',
        'alarmPkgs'            => 'alarm_pkgs',
        'noc'                  => 'noc',
        'position'             => 'position',
        'alarmed'              => 'alarmed',
        'recentAlarmHistoryId' => 'recent_alarm_history_id',
        'recentAlarm'          => 'recent_alarm',
        'keyCms'               => 'key_cms',
        'keyCmsSort'           => 'key_cms_sort',
        'statusDesc'           => 'status_desc',
        'dataFrom'             => 'data_from',
        'dataTo'               => 'data_to',
        'fromSource'           => 'from_source',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('parentFolderId', $this->parentFolderId, true);
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('pluginType', $this->pluginType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('xflushApps', $this->xflushApps, true);
        Model::validateRequired('stackExpression', $this->stackExpression, true);
        Model::validateRequired('calConf', $this->calConf, true);
        Model::validateRequired('opsmetaSchema', $this->opsmetaSchema, true);
        Model::validateRequired('saveSchema', $this->saveSchema, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('outsideDomainId', $this->outsideDomainId, true);
        Model::validateRequired('oldFolderId', $this->oldFolderId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('bizDomainId', $this->bizDomainId, true);
        Model::validateRequired('creater', $this->creater, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('modifier', $this->modifier, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('alarmPkgs', $this->alarmPkgs, true);
        Model::validateRequired('noc', $this->noc, true);
        Model::validateRequired('position', $this->position, true);
        Model::validateRequired('alarmed', $this->alarmed, true);
        Model::validateRequired('recentAlarmHistoryId', $this->recentAlarmHistoryId, true);
        Model::validateRequired('recentAlarm', $this->recentAlarm, true);
        Model::validateRequired('keyCms', $this->keyCms, true);
        Model::validateRequired('keyCmsSort', $this->keyCmsSort, true);
        Model::validateRequired('statusDesc', $this->statusDesc, true);
        Model::validateRequired('dataFrom', $this->dataFrom, true);
        Model::validateRequired('dataTo', $this->dataTo, true);
        Model::validateRequired('fromSource', $this->fromSource, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->parentFolderId) {
            $res['parent_folder_id'] = $this->parentFolderId;
        }
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->xflushApps) {
            $res['xflush_apps'] = $this->xflushApps;
        }
        if (null !== $this->stackExpression) {
            $res['stack_expression'] = null !== $this->stackExpression ? $this->stackExpression->toMap() : null;
        }
        if (null !== $this->calConf) {
            $res['cal_conf'] = $this->calConf;
        }
        if (null !== $this->opsmetaSchema) {
            $res['opsmeta_schema'] = null !== $this->opsmetaSchema ? $this->opsmetaSchema->toMap() : null;
        }
        if (null !== $this->saveSchema) {
            $res['save_schema'] = null !== $this->saveSchema ? $this->saveSchema->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }
        if (null !== $this->outsideDomainId) {
            $res['outside_domain_id'] = $this->outsideDomainId;
        }
        if (null !== $this->oldFolderId) {
            $res['old_folder_id'] = $this->oldFolderId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->bizDomainId) {
            $res['biz_domain_id'] = $this->bizDomainId;
        }
        if (null !== $this->creater) {
            $res['creater'] = $this->creater;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->alarmPkgs) {
            $res['alarm_pkgs'] = [];
            if (null !== $this->alarmPkgs && \is_array($this->alarmPkgs)) {
                $n = 0;
                foreach ($this->alarmPkgs as $item) {
                    $res['alarm_pkgs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->noc) {
            $res['noc'] = $this->noc;
        }
        if (null !== $this->position) {
            $res['position'] = $this->position;
        }
        if (null !== $this->alarmed) {
            $res['alarmed'] = $this->alarmed;
        }
        if (null !== $this->recentAlarmHistoryId) {
            $res['recent_alarm_history_id'] = $this->recentAlarmHistoryId;
        }
        if (null !== $this->recentAlarm) {
            $res['recent_alarm'] = $this->recentAlarm;
        }
        if (null !== $this->keyCms) {
            $res['key_cms'] = $this->keyCms;
        }
        if (null !== $this->keyCmsSort) {
            $res['key_cms_sort'] = $this->keyCmsSort;
        }
        if (null !== $this->statusDesc) {
            $res['status_desc'] = $this->statusDesc;
        }
        if (null !== $this->dataFrom) {
            $res['data_from'] = $this->dataFrom;
        }
        if (null !== $this->dataTo) {
            $res['data_to'] = $this->dataTo;
        }
        if (null !== $this->fromSource) {
            $res['from_source'] = $this->fromSource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PluginModelDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['parent_folder_id'])) {
            $model->parentFolderId = $map['parent_folder_id'];
        }
        if (isset($map['plugin_id'])) {
            $model->pluginId = $map['plugin_id'];
        }
        if (isset($map['plugin_type'])) {
            $model->pluginType = $map['plugin_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['xflush_apps'])) {
            $model->xflushApps = $map['xflush_apps'];
        }
        if (isset($map['stack_expression'])) {
            $model->stackExpression = StackExpression::fromMap($map['stack_expression']);
        }
        if (isset($map['cal_conf'])) {
            $model->calConf = $map['cal_conf'];
        }
        if (isset($map['opsmeta_schema'])) {
            $model->opsmetaSchema = OpsmetaSchema::fromMap($map['opsmeta_schema']);
        }
        if (isset($map['save_schema'])) {
            $model->saveSchema = SaveSchema::fromMap($map['save_schema']);
        }
        if (isset($map['status'])) {
            $model->status = StatusDO::fromMap($map['status']);
        }
        if (isset($map['outside_domain_id'])) {
            $model->outsideDomainId = $map['outside_domain_id'];
        }
        if (isset($map['old_folder_id'])) {
            $model->oldFolderId = $map['old_folder_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['biz_domain_id'])) {
            $model->bizDomainId = $map['biz_domain_id'];
        }
        if (isset($map['creater'])) {
            $model->creater = $map['creater'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['alarm_pkgs'])) {
            if (!empty($map['alarm_pkgs'])) {
                $model->alarmPkgs = [];
                $n                = 0;
                foreach ($map['alarm_pkgs'] as $item) {
                    $model->alarmPkgs[$n++] = null !== $item ? AlarmPkgDO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['noc'])) {
            $model->noc = $map['noc'];
        }
        if (isset($map['position'])) {
            $model->position = $map['position'];
        }
        if (isset($map['alarmed'])) {
            $model->alarmed = $map['alarmed'];
        }
        if (isset($map['recent_alarm_history_id'])) {
            $model->recentAlarmHistoryId = $map['recent_alarm_history_id'];
        }
        if (isset($map['recent_alarm'])) {
            $model->recentAlarm = $map['recent_alarm'];
        }
        if (isset($map['key_cms'])) {
            $model->keyCms = $map['key_cms'];
        }
        if (isset($map['key_cms_sort'])) {
            $model->keyCmsSort = $map['key_cms_sort'];
        }
        if (isset($map['status_desc'])) {
            $model->statusDesc = $map['status_desc'];
        }
        if (isset($map['data_from'])) {
            $model->dataFrom = $map['data_from'];
        }
        if (isset($map['data_to'])) {
            $model->dataTo = $map['data_to'];
        }
        if (isset($map['from_source'])) {
            $model->fromSource = $map['from_source'];
        }

        return $model;
    }
}
