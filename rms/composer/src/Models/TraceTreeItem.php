<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraceTreeItem extends Model
{
    // 应用名
    /**
     * @example web
     *
     * @var string
     */
    public $app;

    // 组件类型
    /**
     * @example SOFAPRC
     *
     * @var string
     */
    public $component;

    // 耗时, 毫秒
    /**
     * @example 5000
     *
     * @var int
     */
    public $duration;

    // 本地应用机房信息
    /**
     * @example idc
     *
     * @var string
     */
    public $idcName;

    // 描述信息
    /**
     * @example info
     *
     * @var string
     */
    public $info;

    // ip
    /**
     * @example 192.168.1.2
     *
     * @var string
     */
    public $ip;

    // 对应的span的类型 枚举类型 CLIENT SERVER CONSUMER PRODUCER
    /**
     * @example CLIENT
     *
     * @var string
     */
    public $kind;

    // parent span id
    /**
     * @example 0
     *
     * @var string
     */
    public $parentId;

    // 请求体字节大小, 如果取不到就为-1
    /**
     * @example 100
     *
     * @var int
     */
    public $requestSize;

    // 响应体大小, 如果取不到就为-1
    /**
     * @example 1024
     *
     * @var int
     */
    public $responseSize;

    // span id
    /**
     * @example 0.1
     *
     * @var string
     */
    public $spanId;

    // 开始时间, 毫秒时间戳
    /**
     * @example
     *
     * @var int
     */
    public $startTime;

    // 状态码，0或者00代表成功
    /**
     * @example 00
     *
     * @var string
     */
    public $status;

    // 键值对
    /**
     * @example
     *
     * @var KeySet[]
     */
    public $tags;

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

    // 方法名
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 本地应用所属单元
    /**
     * @example cell
     *
     * @var string
     */
    public $cellName;

    // 远端应用名
    /**
     * @example remote_app
     *
     * @var string
     */
    public $remoteApp;

    // 远端应用ip
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $remoteIp;

    // 远端应用机房信息
    /**
     * @example idc
     *
     * @var string
     */
    public $remoteIdcName;

    // 远端应用所属单元
    /**
     * @example cell
     *
     * @var string
     */
    public $remoteCellName;

    // 代表是否本节点数据缺失
    /**
     * @example true, false
     *
     * @var bool
     */
    public $missing;

    // 代表是否有子节点
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasChildren;
    protected $_name = [
        'app'            => 'app',
        'component'      => 'component',
        'duration'       => 'duration',
        'idcName'        => 'idc_name',
        'info'           => 'info',
        'ip'             => 'ip',
        'kind'           => 'kind',
        'parentId'       => 'parent_id',
        'requestSize'    => 'request_size',
        'responseSize'   => 'response_size',
        'spanId'         => 'span_id',
        'startTime'      => 'start_time',
        'status'         => 'status',
        'tags'           => 'tags',
        'treeId'         => 'tree_id',
        'treeParentId'   => 'tree_parent_id',
        'name'           => 'name',
        'cellName'       => 'cell_name',
        'remoteApp'      => 'remote_app',
        'remoteIp'       => 'remote_ip',
        'remoteIdcName'  => 'remote_idc_name',
        'remoteCellName' => 'remote_cell_name',
        'missing'        => 'missing',
        'hasChildren'    => 'has_children',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->component) {
            $res['component'] = $this->component;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->idcName) {
            $res['idc_name'] = $this->idcName;
        }
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->requestSize) {
            $res['request_size'] = $this->requestSize;
        }
        if (null !== $this->responseSize) {
            $res['response_size'] = $this->responseSize;
        }
        if (null !== $this->spanId) {
            $res['span_id'] = $this->spanId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->treeParentId) {
            $res['tree_parent_id'] = $this->treeParentId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cellName) {
            $res['cell_name'] = $this->cellName;
        }
        if (null !== $this->remoteApp) {
            $res['remote_app'] = $this->remoteApp;
        }
        if (null !== $this->remoteIp) {
            $res['remote_ip'] = $this->remoteIp;
        }
        if (null !== $this->remoteIdcName) {
            $res['remote_idc_name'] = $this->remoteIdcName;
        }
        if (null !== $this->remoteCellName) {
            $res['remote_cell_name'] = $this->remoteCellName;
        }
        if (null !== $this->missing) {
            $res['missing'] = $this->missing;
        }
        if (null !== $this->hasChildren) {
            $res['has_children'] = $this->hasChildren;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraceTreeItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['component'])) {
            $model->component = $map['component'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }
        if (isset($map['idc_name'])) {
            $model->idcName = $map['idc_name'];
        }
        if (isset($map['info'])) {
            $model->info = $map['info'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['kind'])) {
            $model->kind = $map['kind'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['request_size'])) {
            $model->requestSize = $map['request_size'];
        }
        if (isset($map['response_size'])) {
            $model->responseSize = $map['response_size'];
        }
        if (isset($map['span_id'])) {
            $model->spanId = $map['span_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tree_id'])) {
            $model->treeId = $map['tree_id'];
        }
        if (isset($map['tree_parent_id'])) {
            $model->treeParentId = $map['tree_parent_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cell_name'])) {
            $model->cellName = $map['cell_name'];
        }
        if (isset($map['remote_app'])) {
            $model->remoteApp = $map['remote_app'];
        }
        if (isset($map['remote_ip'])) {
            $model->remoteIp = $map['remote_ip'];
        }
        if (isset($map['remote_idc_name'])) {
            $model->remoteIdcName = $map['remote_idc_name'];
        }
        if (isset($map['remote_cell_name'])) {
            $model->remoteCellName = $map['remote_cell_name'];
        }
        if (isset($map['missing'])) {
            $model->missing = $map['missing'];
        }
        if (isset($map['has_children'])) {
            $model->hasChildren = $map['has_children'];
        }

        return $model;
    }
}
