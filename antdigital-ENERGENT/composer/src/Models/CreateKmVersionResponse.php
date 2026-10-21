<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class CreateKmVersionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'versionId' => 'version_id',
        'treeId' => 'tree_id',
        'version' => 'version',
        'status' => 'status',
        'totalTaskCount' => 'total_task_count',
        'completedCount' => 'completed_count',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->versionId) {
            $res['version_id'] = $this->versionId;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->totalTaskCount) {
            $res['total_task_count'] = $this->totalTaskCount;
        }
        if (null !== $this->completedCount) {
            $res['completed_count'] = $this->completedCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateKmVersionResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['version_id'])){
            $model->versionId = $map['version_id'];
        }
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['total_task_count'])){
            $model->totalTaskCount = $map['total_task_count'];
        }
        if(isset($map['completed_count'])){
            $model->completedCount = $map['completed_count'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 版本ID
    /**
     * @var string
     */
    public $versionId;

    // 知识库ID
    /**
     * @var string
     */
    public $treeId;

    // 版本号
    /**
     * @var string
     */
    public $version;

    // 版本状态
    /**
     * @var string
     */
    public $status;

    // 发布任务总数
    /**
     * @var int
     */
    public $totalTaskCount;

    // 已完成任务数
    /**
     * @var int
     */
    public $completedCount;

}
