<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\SnapshotDocumentItem;

class SyncKmVersionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'treeId' => 'tree_id',
        'version' => 'version',
        'snapshot' => 'snapshot',
        'documents' => 'documents',
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
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->snapshot) {
            $res['snapshot'] = $this->snapshot;
        }
        if (null !== $this->documents) {
            $res['documents'] = [];
            if(null !== $this->documents && is_array($this->documents)){
                $n = 0;
                foreach($this->documents as $item){
                    $res['documents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncKmVersionResponse
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
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        if(isset($map['snapshot'])){
            $model->snapshot = $map['snapshot'];
        }
        if(isset($map['documents'])){
            if(!empty($map['documents'])){
                $model->documents = [];
                $n = 0;
                foreach($map['documents'] as $item) {
                    $model->documents[$n++] = null !== $item ? SnapshotDocumentItem::fromMap($item) : $item;
                }
            }
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

    // 树ID
    /**
     * @var string
     */
    public $treeId;

    // 版本
    /**
     * @var string
     */
    public $version;

    // 快照原文
    /**
     * @var string
     */
    public $snapshot;

    // 版本关联的文档详情列表
    /**
     * @var SnapshotDocumentItem[]
     */
    public $documents;

}
