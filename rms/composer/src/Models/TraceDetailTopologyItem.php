<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraceDetailTopologyItem extends Model
{
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

    // 应用名
    /**
     * @example app
     *
     * @var string
     */
    public $app;

    // 应用ip
    /**
     * @example 192.168.1.2
     *
     * @var string
     */
    public $ip;

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

    // 数据中心
    /**
     * @example idc
     *
     * @var string
     */
    public $idcName;

    // 单元名
    /**
     * @example cell
     *
     * @var string
     */
    public $cellName;

    // 方法名
    /**
     * @example test
     *
     * @var string
     */
    public $name;

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

    // 健康度数值
    /**
     * @example "1.00T"
     *
     * @var string
     */
    public $apdexValue;
    protected $_name = [
        'treeId'          => 'tree_id',
        'treeParentId'    => 'tree_parent_id',
        'app'             => 'app',
        'ip'              => 'ip',
        'hasClientMesh'   => 'has_client_mesh',
        'hasServerMesh'   => 'has_server_mesh',
        'idcName'         => 'idc_name',
        'cellName'        => 'cell_name',
        'name'            => 'name',
        'clientStartTime' => 'client_start_time',
        'serverStartTime' => 'server_start_time',
        'clientDuration'  => 'client_duration',
        'serverDuration'  => 'server_duration',
        'clientStatus'    => 'client_status',
        'serverStatus'    => 'server_status',
        'clientComponent' => 'client_component',
        'serverComponent' => 'server_component',
        'status'          => 'status',
        'apdexThreshold'  => 'apdex_threshold',
        'apdexStatus'     => 'apdex_status',
        'apdexValue'      => 'apdex_value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->treeParentId) {
            $res['tree_parent_id'] = $this->treeParentId;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->hasClientMesh) {
            $res['has_client_mesh'] = $this->hasClientMesh;
        }
        if (null !== $this->hasServerMesh) {
            $res['has_server_mesh'] = $this->hasServerMesh;
        }
        if (null !== $this->idcName) {
            $res['idc_name'] = $this->idcName;
        }
        if (null !== $this->cellName) {
            $res['cell_name'] = $this->cellName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->apdexThreshold) {
            $res['apdex_threshold'] = $this->apdexThreshold;
        }
        if (null !== $this->apdexStatus) {
            $res['apdex_status'] = $this->apdexStatus;
        }
        if (null !== $this->apdexValue) {
            $res['apdex_value'] = $this->apdexValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceDetailTopologyItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tree_id'])) {
            $model->treeId = $map['tree_id'];
        }
        if (isset($map['tree_parent_id'])) {
            $model->treeParentId = $map['tree_parent_id'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['has_client_mesh'])) {
            $model->hasClientMesh = $map['has_client_mesh'];
        }
        if (isset($map['has_server_mesh'])) {
            $model->hasServerMesh = $map['has_server_mesh'];
        }
        if (isset($map['idc_name'])) {
            $model->idcName = $map['idc_name'];
        }
        if (isset($map['cell_name'])) {
            $model->cellName = $map['cell_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['apdex_threshold'])) {
            $model->apdexThreshold = $map['apdex_threshold'];
        }
        if (isset($map['apdex_status'])) {
            $model->apdexStatus = $map['apdex_status'];
        }
        if (isset($map['apdex_value'])) {
            $model->apdexValue = $map['apdex_value'];
        }

        return $model;
    }
}
