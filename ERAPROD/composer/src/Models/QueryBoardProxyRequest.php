<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ERAPROD\Models;

use AlibabaCloud\Tea\Model;

class QueryBoardProxyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'keyword' => 'keyword',
        'boardId' => 'board_id',
        'topN' => 'top_n',
    ];
    public function validate() {
        Model::validateRequired('keyword', $this->keyword, true);
        Model::validateRequired('boardId', $this->boardId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->boardId) {
            $res['board_id'] = $this->boardId;
        }
        if (null !== $this->topN) {
            $res['top_n'] = $this->topN;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBoardProxyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['keyword'])){
            $model->keyword = $map['keyword'];
        }
        if(isset($map['board_id'])){
            $model->boardId = $map['board_id'];
        }
        if(isset($map['top_n'])){
            $model->topN = $map['top_n'];
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

    // 关键字
    /**
     * @var string
     */
    public $keyword;

    // boardId
    /**
     * @var string
     */
    public $boardId;

    // 返回条数
    /**
     * @var int
     */
    public $topN;

}
