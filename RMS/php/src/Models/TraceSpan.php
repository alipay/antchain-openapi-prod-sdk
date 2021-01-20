<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\KeySet;

class TraceSpan extends Model {
    protected $_name = [
        'component' => 'component',
        'duration' => 'duration',
        'info' => 'info',
        'kind' => 'kind',
        'localIp' => 'local_ip',
        'localServiceName' => 'local_service_name',
        'localIdcName' => 'local_idc_name',
        'localCellName' => 'local_cell_name',
        'name' => 'name',
        'parentId' => 'parent_id',
        'remoteIp' => 'remote_ip',
        'remoteServiceName' => 'remote_service_name',
        'remoteIdcName' => 'remote_idc_name',
        'remoteCellName' => 'remote_cell_name',
        'spanId' => 'span_id',
        'startTime' => 'start_time',
        'status' => 'status',
        'tags' => 'tags',
        'traceId' => 'trace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->component) {
            $res['component'] = $this->component;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }
        if (null !== $this->localIp) {
            $res['local_ip'] = $this->localIp;
        }
        if (null !== $this->localServiceName) {
            $res['local_service_name'] = $this->localServiceName;
        }
        if (null !== $this->localIdcName) {
            $res['local_idc_name'] = $this->localIdcName;
        }
        if (null !== $this->localCellName) {
            $res['local_cell_name'] = $this->localCellName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->remoteIp) {
            $res['remote_ip'] = $this->remoteIp;
        }
        if (null !== $this->remoteServiceName) {
            $res['remote_service_name'] = $this->remoteServiceName;
        }
        if (null !== $this->remoteIdcName) {
            $res['remote_idc_name'] = $this->remoteIdcName;
        }
        if (null !== $this->remoteCellName) {
            $res['remote_cell_name'] = $this->remoteCellName;
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
            if(null !== $this->tags && is_array($this->tags)){
                $n = 0;
                foreach($this->tags as $item){
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TraceSpan
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['component'])){
            $model->component = $map['component'];
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['info'])){
            $model->info = $map['info'];
        }
        if(isset($map['kind'])){
            $model->kind = $map['kind'];
        }
        if(isset($map['local_ip'])){
            $model->localIp = $map['local_ip'];
        }
        if(isset($map['local_service_name'])){
            $model->localServiceName = $map['local_service_name'];
        }
        if(isset($map['local_idc_name'])){
            $model->localIdcName = $map['local_idc_name'];
        }
        if(isset($map['local_cell_name'])){
            $model->localCellName = $map['local_cell_name'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['parent_id'])){
            $model->parentId = $map['parent_id'];
        }
        if(isset($map['remote_ip'])){
            $model->remoteIp = $map['remote_ip'];
        }
        if(isset($map['remote_service_name'])){
            $model->remoteServiceName = $map['remote_service_name'];
        }
        if(isset($map['remote_idc_name'])){
            $model->remoteIdcName = $map['remote_idc_name'];
        }
        if(isset($map['remote_cell_name'])){
            $model->remoteCellName = $map['remote_cell_name'];
        }
        if(isset($map['span_id'])){
            $model->spanId = $map['span_id'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tags'])){
            if(!empty($map['tags'])){
                $model->tags = [];
                $n = 0;
                foreach($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        return $model;
    }
    // 组件类型
    /**
     * @example SOFARPC
     * @var string
     */
    public $component;

    // 毫秒耗时
    /**
     * @example 5000
     * @var int
     */
    public $duration;

    // 服务描述信息
    /**
     * @example 服务描述信息
     * @var string
     */
    public $info;

    // span kind, CLIENT SERVER PRODUCER CONSUMER
    /**
     * @example kind
     * @var string
     */
    public $kind;

    // local endpoint ip
    /**
     * @example 192.168.1.2
     * @var string
     */
    public $localIp;

    // local endpoint service name
    /**
     * @example web
     * @var string
     */
    public $localServiceName;

    // local idc name
    /**
     * @example idc
     * @var string
     */
    public $localIdcName;

    // local cell name
    /**
     * @example cell
     * @var string
     */
    public $localCellName;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // parent_id
    /**
     * @example parent_id
     * @var string
     */
    public $parentId;

    // remote endpoint ip
    /**
     * @example 192.168.1.3
     * @var string
     */
    public $remoteIp;

    // remote endpoint service name
    /**
     * @example shop
     * @var string
     */
    public $remoteServiceName;

    // remote idc name
    /**
     * @example idc
     * @var string
     */
    public $remoteIdcName;

    // remote cell name
    /**
     * @example cell
     * @var string
     */
    public $remoteCellName;

    // span_id
    /**
     * @example span_id
     * @var string
     */
    public $spanId;

    // 开始时间, 毫秒时间戳
    /**
     * @example 
     * @var int
     */
    public $startTime;

    // 状态码
    /**
     * @example 00
     * @var string
     */
    public $status;

    // span tags, 是关于span的键值对
    /**
     * @example 
     * @var KeySet[]
     */
    public $tags;

    // trace id
    /**
     * @example trace id
     * @var string
     */
    public $traceId;

}
