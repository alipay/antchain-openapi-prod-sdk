<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\KeySet;

class QueryRmsTracespanRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'app' => 'app',
        'endTime' => 'end_time',
        'extensions' => 'extensions',
        'maxDuration' => 'max_duration',
        'minDuration' => 'min_duration',
        'pageNumber' => 'page_number',
        'pageSize' => 'page_size',
        'startTime' => 'start_time',
        'status' => 'status',
        'tags' => 'tags',
        'traceId' => 'trace_id',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->extensions) {
            $res['extensions'] = [];
            if(null !== $this->extensions && is_array($this->extensions)){
                $n = 0;
                foreach($this->extensions as $item){
                    $res['extensions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->maxDuration) {
            $res['max_duration'] = $this->maxDuration;
        }
        if (null !== $this->minDuration) {
            $res['min_duration'] = $this->minDuration;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRmsTracespanRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app'])){
            $model->app = $map['app'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['extensions'])){
            if(!empty($map['extensions'])){
                $model->extensions = [];
                $n = 0;
                foreach($map['extensions'] as $item) {
                    $model->extensions[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['max_duration'])){
            $model->maxDuration = $map['max_duration'];
        }
        if(isset($map['min_duration'])){
            $model->minDuration = $map['min_duration'];
        }
        if(isset($map['page_number'])){
            $model->pageNumber = $map['page_number'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
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
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
    /**
     * @var string
     */
    public $app;

    // 最大的毫秒开始时间戳
    /**
     * @var int
     */
    public $endTime;

    // 万能扩展字段
    /**
     * @var KeySet[]
     */
    public $extensions;

    // 最大毫秒耗时
    /**
     * @var int
     */
    public $maxDuration;

    // 最小毫秒耗时
    /**
     * @var int
     */
    public $minDuration;

    // 分页号
    /**
     * @var int
     */
    public $pageNumber;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // 搜索的毫秒开始时间戳
    /**
     * @var int
     */
    public $startTime;

    // 结果码
    /**
     * @var string
     */
    public $status;

    // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
    /**
     * @var KeySet[]
     */
    public $tags;

    // 按traceId搜索时会用到 此时其他条件自动失效
    /**
     * @var string
     */
    public $traceId;

    // workspace_id
    /**
     * @var int
     */
    public $workspaceId;

}
