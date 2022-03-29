<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraceCompactTreeItem extends Model
{
    // 方法名
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
    /**
     * @example "1"
     *
     * @var string
     */
    public $treeId;

    // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
    /**
     * @example "0"
     *
     * @var string
     */
    public $treeParentId;

    // 客户端span是否缺失
    /**
     * @example true, false
     *
     * @var bool
     */
    public $clientMissing;

    // 服务端span是否缺失
    /**
     * @example true, false
     *
     * @var bool
     */
    public $serverMissing;

    // 客户端是否经过mesh
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasClientMesh;

    // 服务端是否经过mesh
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasServerMesh;

    // 是否包含子节点
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasChildren;

    // 客户端应用名
    /**
     * @example app
     *
     * @var string
     */
    public $clientApp;

    // 服务端应用名
    /**
     * @example app
     *
     * @var string
     */
    public $serverApp;

    // 客户端 ip
    /**
     * @example 192.168.1.2
     *
     * @var string
     */
    public $clientIp;

    // 服务端 ip
    /**
     * @example 192.168.1.3
     *
     * @var string
     */
    public $serverIp;

    // 客户端 idc
    /**
     * @example idc
     *
     * @var string
     */
    public $clientIdcName;

    // 服务端 idc
    /**
     * @example idc
     *
     * @var string
     */
    public $serverIdcName;

    // 客户端 cell
    /**
     * @example cell
     *
     * @var string
     */
    public $clientCellName;

    // 服务端 cell
    /**
     * @example cell
     *
     * @var string
     */
    public $serverCellName;

    // 客户端开始时间, 毫秒时间戳
    /**
     * @example
     *
     * @var int
     */
    public $clientStartTime;

    // 服务端开始时间, 毫秒时间戳
    /**
     * @example
     *
     * @var int
     */
    public $serverStartTime;

    // 客户端毫秒耗时
    /**
     * @example
     *
     * @var int
     */
    public $clientDuration;

    // 服务端毫秒耗时
    /**
     * @example
     *
     * @var int
     */
    public $serverDuration;

    // 客户端状态码
    /**
     * @example 00
     *
     * @var string
     */
    public $clientStatus;

    // 服务端状态码
    /**
     * @example 00
     *
     * @var string
     */
    public $serverStatus;

    // 客户端组件类型
    /**
     * @example SOFARPC
     *
     * @var string
     */
    public $clientComponent;

    // 服务端组件类型
    /**
     * @example SOFARPC
     *
     * @var string
     */
    public $serverComponent;

    // 客户端span
    /**
     * @example
     *
     * @var TraceSpan
     */
    public $clientSpan;

    // 服务端span
    /**
     * @example
     *
     * @var TraceSpan
     */
    public $serverSpan;

    // 整体状态码
    /**
     * @example 00
     *
     * @var string
     */
    public $status;

    // 健康度耗时配置
    /**
     * @example 500.0
     *
     * @var string
     */
    public $apdexThreshold;

    // 健康度
    /**
     * @example RED
     *
     * @var string
     */
    public $apdexStatus;
    protected $_name = [
        'name'            => 'name',
        'treeId'          => 'tree_id',
        'treeParentId'    => 'tree_parent_id',
        'clientMissing'   => 'client_missing',
        'serverMissing'   => 'server_missing',
        'hasClientMesh'   => 'has_client_mesh',
        'hasServerMesh'   => 'has_server_mesh',
        'hasChildren'     => 'has_children',
        'clientApp'       => 'client_app',
        'serverApp'       => 'server_app',
        'clientIp'        => 'client_ip',
        'serverIp'        => 'server_ip',
        'clientIdcName'   => 'client_idc_name',
        'serverIdcName'   => 'server_idc_name',
        'clientCellName'  => 'client_cell_name',
        'serverCellName'  => 'server_cell_name',
        'clientStartTime' => 'client_start_time',
        'serverStartTime' => 'server_start_time',
        'clientDuration'  => 'client_duration',
        'serverDuration'  => 'server_duration',
        'clientStatus'    => 'client_status',
        'serverStatus'    => 'server_status',
        'clientComponent' => 'client_component',
        'serverComponent' => 'server_component',
        'clientSpan'      => 'client_span',
        'serverSpan'      => 'server_span',
        'status'          => 'status',
        'apdexThreshold'  => 'apdex_threshold',
        'apdexStatus'     => 'apdex_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->treeParentId) {
            $res['tree_parent_id'] = $this->treeParentId;
        }
        if (null !== $this->clientMissing) {
            $res['client_missing'] = $this->clientMissing;
        }
        if (null !== $this->serverMissing) {
            $res['server_missing'] = $this->serverMissing;
        }
        if (null !== $this->hasClientMesh) {
            $res['has_client_mesh'] = $this->hasClientMesh;
        }
        if (null !== $this->hasServerMesh) {
            $res['has_server_mesh'] = $this->hasServerMesh;
        }
        if (null !== $this->hasChildren) {
            $res['has_children'] = $this->hasChildren;
        }
        if (null !== $this->clientApp) {
            $res['client_app'] = $this->clientApp;
        }
        if (null !== $this->serverApp) {
            $res['server_app'] = $this->serverApp;
        }
        if (null !== $this->clientIp) {
            $res['client_ip'] = $this->clientIp;
        }
        if (null !== $this->serverIp) {
            $res['server_ip'] = $this->serverIp;
        }
        if (null !== $this->clientIdcName) {
            $res['client_idc_name'] = $this->clientIdcName;
        }
        if (null !== $this->serverIdcName) {
            $res['server_idc_name'] = $this->serverIdcName;
        }
        if (null !== $this->clientCellName) {
            $res['client_cell_name'] = $this->clientCellName;
        }
        if (null !== $this->serverCellName) {
            $res['server_cell_name'] = $this->serverCellName;
        }
        if (null !== $this->clientStartTime) {
            $res['client_start_time'] = $this->clientStartTime;
        }
        if (null !== $this->serverStartTime) {
            $res['server_start_time'] = $this->serverStartTime;
        }
        if (null !== $this->clientDuration) {
            $res['client_duration'] = $this->clientDuration;
        }
        if (null !== $this->serverDuration) {
            $res['server_duration'] = $this->serverDuration;
        }
        if (null !== $this->clientStatus) {
            $res['client_status'] = $this->clientStatus;
        }
        if (null !== $this->serverStatus) {
            $res['server_status'] = $this->serverStatus;
        }
        if (null !== $this->clientComponent) {
            $res['client_component'] = $this->clientComponent;
        }
        if (null !== $this->serverComponent) {
            $res['server_component'] = $this->serverComponent;
        }
        if (null !== $this->clientSpan) {
            $res['client_span'] = null !== $this->clientSpan ? $this->clientSpan->toMap() : null;
        }
        if (null !== $this->serverSpan) {
            $res['server_span'] = null !== $this->serverSpan ? $this->serverSpan->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->apdexThreshold) {
            $res['apdex_threshold'] = $this->apdexThreshold;
        }
        if (null !== $this->apdexStatus) {
            $res['apdex_status'] = $this->apdexStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceCompactTreeItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tree_id'])) {
            $model->treeId = $map['tree_id'];
        }
        if (isset($map['tree_parent_id'])) {
            $model->treeParentId = $map['tree_parent_id'];
        }
        if (isset($map['client_missing'])) {
            $model->clientMissing = $map['client_missing'];
        }
        if (isset($map['server_missing'])) {
            $model->serverMissing = $map['server_missing'];
        }
        if (isset($map['has_client_mesh'])) {
            $model->hasClientMesh = $map['has_client_mesh'];
        }
        if (isset($map['has_server_mesh'])) {
            $model->hasServerMesh = $map['has_server_mesh'];
        }
        if (isset($map['has_children'])) {
            $model->hasChildren = $map['has_children'];
        }
        if (isset($map['client_app'])) {
            $model->clientApp = $map['client_app'];
        }
        if (isset($map['server_app'])) {
            $model->serverApp = $map['server_app'];
        }
        if (isset($map['client_ip'])) {
            $model->clientIp = $map['client_ip'];
        }
        if (isset($map['server_ip'])) {
            $model->serverIp = $map['server_ip'];
        }
        if (isset($map['client_idc_name'])) {
            $model->clientIdcName = $map['client_idc_name'];
        }
        if (isset($map['server_idc_name'])) {
            $model->serverIdcName = $map['server_idc_name'];
        }
        if (isset($map['client_cell_name'])) {
            $model->clientCellName = $map['client_cell_name'];
        }
        if (isset($map['server_cell_name'])) {
            $model->serverCellName = $map['server_cell_name'];
        }
        if (isset($map['client_start_time'])) {
            $model->clientStartTime = $map['client_start_time'];
        }
        if (isset($map['server_start_time'])) {
            $model->serverStartTime = $map['server_start_time'];
        }
        if (isset($map['client_duration'])) {
            $model->clientDuration = $map['client_duration'];
        }
        if (isset($map['server_duration'])) {
            $model->serverDuration = $map['server_duration'];
        }
        if (isset($map['client_status'])) {
            $model->clientStatus = $map['client_status'];
        }
        if (isset($map['server_status'])) {
            $model->serverStatus = $map['server_status'];
        }
        if (isset($map['client_component'])) {
            $model->clientComponent = $map['client_component'];
        }
        if (isset($map['server_component'])) {
            $model->serverComponent = $map['server_component'];
        }
        if (isset($map['client_span'])) {
            $model->clientSpan = TraceSpan::fromMap($map['client_span']);
        }
        if (isset($map['server_span'])) {
            $model->serverSpan = TraceSpan::fromMap($map['server_span']);
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['apdex_threshold'])) {
            $model->apdexThreshold = $map['apdex_threshold'];
        }
        if (isset($map['apdex_status'])) {
            $model->apdexStatus = $map['apdex_status'];
        }

        return $model;
    }
}
