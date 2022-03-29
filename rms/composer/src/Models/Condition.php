<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Condition extends Model
{
    // plugin
    /**
     * @example plugin
     *
     * @var string
     */
    public $plugin;

    // content_type
    /**
     * @example content_type
     *
     * @var string
     */
    public $contentType;

    // tag
    /**
     * @example tag
     *
     * @var string
     */
    public $tag;

    // ds_id
    /**
     * @example ds_id
     *
     * @var string
     */
    public $dsId;

    // new_cp_id
    /**
     * @example new_cp_id
     *
     * @var string
     */
    public $newCpId;

    // start
    /**
     * @example start
     *
     * @var int
     */
    public $start;

    // end
    /**
     * @example end
     *
     * @var int
     */
    public $end;

    // tick_interval
    /**
     * @example tick_interval
     *
     * @var int
     */
    public $tickInterval;

    // use_new
    /**
     * @example true,false
     *
     * @var bool
     */
    public $useNew;

    // groupby
    /**
     * @example groupby
     *
     * @var string[]
     */
    public $groupby;

    // values
    /**
     * @example values
     *
     * @var KeySet[]
     */
    public $values;

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

    // am_old_data_struct
    /**
     * @example true, false
     *
     * @var bool
     */
    public $amOldDataStruct;

    // am_is_spm
    /**
     * @example true,false
     *
     * @var bool
     */
    public $amIsSpm;

    // old_ds_id
    /**
     * @example old_ds_id
     *
     * @var string
     */
    public $oldDsId;
    protected $_name = [
        'plugin'          => 'plugin',
        'contentType'     => 'content_type',
        'tag'             => 'tag',
        'dsId'            => 'ds_id',
        'newCpId'         => 'new_cp_id',
        'start'           => 'start',
        'end'             => 'end',
        'tickInterval'    => 'tick_interval',
        'useNew'          => 'use_new',
        'groupby'         => 'groupby',
        'values'          => 'values',
        'tenantId'        => 'tenant_id',
        'workspaceId'     => 'workspace_id',
        'amOldDataStruct' => 'am_old_data_struct',
        'amIsSpm'         => 'am_is_spm',
        'oldDsId'         => 'old_ds_id',
    ];

    public function validate()
    {
        Model::validateRequired('plugin', $this->plugin, true);
        Model::validateRequired('contentType', $this->contentType, true);
        Model::validateRequired('tag', $this->tag, true);
        Model::validateRequired('dsId', $this->dsId, true);
        Model::validateRequired('newCpId', $this->newCpId, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
        Model::validateRequired('tickInterval', $this->tickInterval, true);
        Model::validateRequired('useNew', $this->useNew, true);
        Model::validateRequired('groupby', $this->groupby, true);
        Model::validateRequired('values', $this->values, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('amOldDataStruct', $this->amOldDataStruct, true);
        Model::validateRequired('amIsSpm', $this->amIsSpm, true);
        Model::validateRequired('oldDsId', $this->oldDsId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->plugin) {
            $res['plugin'] = $this->plugin;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->dsId) {
            $res['ds_id'] = $this->dsId;
        }
        if (null !== $this->newCpId) {
            $res['new_cp_id'] = $this->newCpId;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->tickInterval) {
            $res['tick_interval'] = $this->tickInterval;
        }
        if (null !== $this->useNew) {
            $res['use_new'] = $this->useNew;
        }
        if (null !== $this->groupby) {
            $res['groupby'] = $this->groupby;
        }
        if (null !== $this->values) {
            $res['values'] = [];
            if (null !== $this->values && \is_array($this->values)) {
                $n = 0;
                foreach ($this->values as $item) {
                    $res['values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->amOldDataStruct) {
            $res['am_old_data_struct'] = $this->amOldDataStruct;
        }
        if (null !== $this->amIsSpm) {
            $res['am_is_spm'] = $this->amIsSpm;
        }
        if (null !== $this->oldDsId) {
            $res['old_ds_id'] = $this->oldDsId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Condition
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['plugin'])) {
            $model->plugin = $map['plugin'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['ds_id'])) {
            $model->dsId = $map['ds_id'];
        }
        if (isset($map['new_cp_id'])) {
            $model->newCpId = $map['new_cp_id'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['tick_interval'])) {
            $model->tickInterval = $map['tick_interval'];
        }
        if (isset($map['use_new'])) {
            $model->useNew = $map['use_new'];
        }
        if (isset($map['groupby'])) {
            if (!empty($map['groupby'])) {
                $model->groupby = $map['groupby'];
            }
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = [];
                $n             = 0;
                foreach ($map['values'] as $item) {
                    $model->values[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['am_old_data_struct'])) {
            $model->amOldDataStruct = $map['am_old_data_struct'];
        }
        if (isset($map['am_is_spm'])) {
            $model->amIsSpm = $map['am_is_spm'];
        }
        if (isset($map['old_ds_id'])) {
            $model->oldDsId = $map['old_ds_id'];
        }

        return $model;
    }
}
