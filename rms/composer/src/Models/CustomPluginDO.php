<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CustomPluginDO extends Model
{
    // ID
    /**
     * @example 11223344
     *
     * @var int
     */
    public $id;

    // 自定义监控名称
    /**
     * @example the monitor name
     *
     * @var string
     */
    public $name;

    // 监控类型id
    /**
     * @example 15
     *
     * @var int
     */
    public $pluginId;

    // 监控类型
    /**
     * @example singleMinute
     *
     * @var string
     */
    public $pluginType;

    // 父级文件夹 ID
    /**
     * @example 15
     *
     * @var int
     */
    public $parentFolderId;

    // 创建者
    /**
     * @example rmstest01
     *
     * @var string
     */
    public $creater;

    // 最后修改者
    /**
     * @example rmstest01
     *
     * @var string
     */
    public $modifier;

    // 创建时间 - 时间戳
    /**
     * @example 1609213282986
     *
     * @var int
     */
    public $gmtCreate;

    // 最后修改时间 - 时间戳
    /**
     * @example 1609322431811
     *
     * @var int
     */
    public $gmtModified;

    // 是否有报警
    /**
     * @example true, false
     *
     * @var bool
     */
    public $alarmed;

    // 日志
    /**
     * @example
     *
     * @var Log
     */
    public $log;

    // 存储信息
    /**
     * @example
     *
     * @var SaveSchema
     */
    public $saveSchema;

    // 采集元数据过滤项
    /**
     * @example
     *
     * @var OpsmetaSchema
     */
    public $opsmetaSchema;

    // 属性扩展包
    /**
     * @example
     *
     * @var Spm
     */
    public $spm;

    // 告警套餐列表
    /**
     * @example
     *
     * @var AlarmPkgDO[]
     */
    public $alarmPkgs;

    // 日志筛选黑名单
    /**
     * @example
     *
     * @var Filter[]
     */
    public $blackFilters;

    // 日志筛选白名单
    /**
     * @example
     *
     * @var Filter[]
     */
    public $whiteFilters;

    // OPS分组方式
    /**
     * @example
     *
     * @var OpsGroupBy
     */
    public $opsGroupBy;

    // 统计方式
    /**
     * @example
     *
     * @var Cal
     */
    public $cal;

    // 配置状态
    /**
     * @example
     *
     * @var StatusDO
     */
    public $status;

    // top预警
    /**
     * @example
     *
     * @var TopAlarmDO
     */
    public $topAlarm;

    // 分组规则
    /**
     * @example
     *
     * @var Filter[]
     */
    public $groupBy;

    // 状态描述信息
    /**
     * @example 该自定义监控指标的状态描述
     *
     * @var string
     */
    public $statusDesc;

    // 是否需要动态key
    /**
     * @example true, false
     *
     * @var bool
     */
    public $dkNeed;

    // 推荐的动态key列表, 分号间隔
    /**
     * @example console;mq
     *
     * @var string
     */
    public $dks;

    // 是否需要大盘显示基线
    /**
     * @example true, false
     *
     * @var bool
     */
    public $baselineNeed;

    // 是否需要快速刷入实时缓存
    /**
     * @example true, false
     *
     * @var bool
     */
    public $flushBasin;

    // 所属应用
    /**
     * @example wyp-rms
     *
     * @var string
     */
    public $xflushApps;

    // script (JSON String格式)
    /**
     * @example {"reports":[{"colspan":"50","chartConfig":{"cols":[]},"dsMetas":{"freshTerm":30.0,"dss":[]},"name":"the_reporter_name","chartType":"lineChart","outLink":"","chartHeight":"12"}],"tags":[]}
     *
     * @var string
     */
    public $scriptNew;

    // 是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isOpen;

    // 插件类型别名
    /**
     * @example SM
     *
     * @var string
     */
    public $pluginTypeAlias;
    protected $_name = [
        'id'              => 'id',
        'name'            => 'name',
        'pluginId'        => 'plugin_id',
        'pluginType'      => 'plugin_type',
        'parentFolderId'  => 'parent_folder_id',
        'creater'         => 'creater',
        'modifier'        => 'modifier',
        'gmtCreate'       => 'gmt_create',
        'gmtModified'     => 'gmt_modified',
        'alarmed'         => 'alarmed',
        'log'             => 'log',
        'saveSchema'      => 'save_schema',
        'opsmetaSchema'   => 'opsmeta_schema',
        'spm'             => 'spm',
        'alarmPkgs'       => 'alarm_pkgs',
        'blackFilters'    => 'black_filters',
        'whiteFilters'    => 'white_filters',
        'opsGroupBy'      => 'ops_group_by',
        'cal'             => 'cal',
        'status'          => 'status',
        'topAlarm'        => 'top_alarm',
        'groupBy'         => 'group_by',
        'statusDesc'      => 'status_desc',
        'dkNeed'          => 'dk_need',
        'dks'             => 'dks',
        'baselineNeed'    => 'baseline_need',
        'flushBasin'      => 'flush_basin',
        'xflushApps'      => 'xflush_apps',
        'scriptNew'       => 'script_new',
        'isOpen'          => 'is_open',
        'pluginTypeAlias' => 'plugin_type_alias',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('pluginType', $this->pluginType, true);
        Model::validateRequired('parentFolderId', $this->parentFolderId, true);
        Model::validateRequired('pluginTypeAlias', $this->pluginTypeAlias, true);
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
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->pluginType) {
            $res['plugin_type'] = $this->pluginType;
        }
        if (null !== $this->parentFolderId) {
            $res['parent_folder_id'] = $this->parentFolderId;
        }
        if (null !== $this->creater) {
            $res['creater'] = $this->creater;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->alarmed) {
            $res['alarmed'] = $this->alarmed;
        }
        if (null !== $this->log) {
            $res['log'] = null !== $this->log ? $this->log->toMap() : null;
        }
        if (null !== $this->saveSchema) {
            $res['save_schema'] = null !== $this->saveSchema ? $this->saveSchema->toMap() : null;
        }
        if (null !== $this->opsmetaSchema) {
            $res['opsmeta_schema'] = null !== $this->opsmetaSchema ? $this->opsmetaSchema->toMap() : null;
        }
        if (null !== $this->spm) {
            $res['spm'] = null !== $this->spm ? $this->spm->toMap() : null;
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
        if (null !== $this->blackFilters) {
            $res['black_filters'] = [];
            if (null !== $this->blackFilters && \is_array($this->blackFilters)) {
                $n = 0;
                foreach ($this->blackFilters as $item) {
                    $res['black_filters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->whiteFilters) {
            $res['white_filters'] = [];
            if (null !== $this->whiteFilters && \is_array($this->whiteFilters)) {
                $n = 0;
                foreach ($this->whiteFilters as $item) {
                    $res['white_filters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->opsGroupBy) {
            $res['ops_group_by'] = null !== $this->opsGroupBy ? $this->opsGroupBy->toMap() : null;
        }
        if (null !== $this->cal) {
            $res['cal'] = null !== $this->cal ? $this->cal->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }
        if (null !== $this->topAlarm) {
            $res['top_alarm'] = null !== $this->topAlarm ? $this->topAlarm->toMap() : null;
        }
        if (null !== $this->groupBy) {
            $res['group_by'] = [];
            if (null !== $this->groupBy && \is_array($this->groupBy)) {
                $n = 0;
                foreach ($this->groupBy as $item) {
                    $res['group_by'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->statusDesc) {
            $res['status_desc'] = $this->statusDesc;
        }
        if (null !== $this->dkNeed) {
            $res['dk_need'] = $this->dkNeed;
        }
        if (null !== $this->dks) {
            $res['dks'] = $this->dks;
        }
        if (null !== $this->baselineNeed) {
            $res['baseline_need'] = $this->baselineNeed;
        }
        if (null !== $this->flushBasin) {
            $res['flush_basin'] = $this->flushBasin;
        }
        if (null !== $this->xflushApps) {
            $res['xflush_apps'] = $this->xflushApps;
        }
        if (null !== $this->scriptNew) {
            $res['script_new'] = $this->scriptNew;
        }
        if (null !== $this->isOpen) {
            $res['is_open'] = $this->isOpen;
        }
        if (null !== $this->pluginTypeAlias) {
            $res['plugin_type_alias'] = $this->pluginTypeAlias;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomPluginDO
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
        if (isset($map['plugin_id'])) {
            $model->pluginId = $map['plugin_id'];
        }
        if (isset($map['plugin_type'])) {
            $model->pluginType = $map['plugin_type'];
        }
        if (isset($map['parent_folder_id'])) {
            $model->parentFolderId = $map['parent_folder_id'];
        }
        if (isset($map['creater'])) {
            $model->creater = $map['creater'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['alarmed'])) {
            $model->alarmed = $map['alarmed'];
        }
        if (isset($map['log'])) {
            $model->log = Log::fromMap($map['log']);
        }
        if (isset($map['save_schema'])) {
            $model->saveSchema = SaveSchema::fromMap($map['save_schema']);
        }
        if (isset($map['opsmeta_schema'])) {
            $model->opsmetaSchema = OpsmetaSchema::fromMap($map['opsmeta_schema']);
        }
        if (isset($map['spm'])) {
            $model->spm = Spm::fromMap($map['spm']);
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
        if (isset($map['black_filters'])) {
            if (!empty($map['black_filters'])) {
                $model->blackFilters = [];
                $n                   = 0;
                foreach ($map['black_filters'] as $item) {
                    $model->blackFilters[$n++] = null !== $item ? Filter::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['white_filters'])) {
            if (!empty($map['white_filters'])) {
                $model->whiteFilters = [];
                $n                   = 0;
                foreach ($map['white_filters'] as $item) {
                    $model->whiteFilters[$n++] = null !== $item ? Filter::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ops_group_by'])) {
            $model->opsGroupBy = OpsGroupBy::fromMap($map['ops_group_by']);
        }
        if (isset($map['cal'])) {
            $model->cal = Cal::fromMap($map['cal']);
        }
        if (isset($map['status'])) {
            $model->status = StatusDO::fromMap($map['status']);
        }
        if (isset($map['top_alarm'])) {
            $model->topAlarm = TopAlarmDO::fromMap($map['top_alarm']);
        }
        if (isset($map['group_by'])) {
            if (!empty($map['group_by'])) {
                $model->groupBy = [];
                $n              = 0;
                foreach ($map['group_by'] as $item) {
                    $model->groupBy[$n++] = null !== $item ? Filter::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['status_desc'])) {
            $model->statusDesc = $map['status_desc'];
        }
        if (isset($map['dk_need'])) {
            $model->dkNeed = $map['dk_need'];
        }
        if (isset($map['dks'])) {
            $model->dks = $map['dks'];
        }
        if (isset($map['baseline_need'])) {
            $model->baselineNeed = $map['baseline_need'];
        }
        if (isset($map['flush_basin'])) {
            $model->flushBasin = $map['flush_basin'];
        }
        if (isset($map['xflush_apps'])) {
            $model->xflushApps = $map['xflush_apps'];
        }
        if (isset($map['script_new'])) {
            $model->scriptNew = $map['script_new'];
        }
        if (isset($map['is_open'])) {
            $model->isOpen = $map['is_open'];
        }
        if (isset($map['plugin_type_alias'])) {
            $model->pluginTypeAlias = $map['plugin_type_alias'];
        }

        return $model;
    }
}
