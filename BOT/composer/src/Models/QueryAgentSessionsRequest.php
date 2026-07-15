<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryAgentSessionsRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientId' => 'client_id',
        'userId' => 'user_id',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAgentSessionsRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
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

    // 客户端ID
    /**
     * @var string
     */
    public $clientId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 页码
    /**
     * @var int
     */
    public $pageIndex;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

}
