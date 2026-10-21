<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class ListKgCompileRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'kbId' => 'kb_id',
        'keyword' => 'keyword',
        'taskTag' => 'task_tag',
        'page' => 'page',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->taskTag) {
            $res['task_tag'] = $this->taskTag;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListKgCompileRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['keyword'])){
            $model->keyword = $map['keyword'];
        }
        if(isset($map['task_tag'])){
            $model->taskTag = $map['task_tag'];
        }
        if(isset($map['page'])){
            $model->page = $map['page'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 知识库ID
    /**
     * @var string
     */
    public $kbId;

    // 文档名称关键词
    /**
     * @var string
     */
    public $keyword;

    // 任务标签
    /**
     * @var string
     */
    public $taskTag;

    // 页码(1起)
    /**
     * @var int
     */
    public $page;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;

}
