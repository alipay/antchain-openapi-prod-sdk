<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ExecRtopGenericInvokeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'content' => 'content',
        'permission' => 'permission',
        'title' => 'title',
    ];
    public function validate() {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('permission', $this->permission, true);
        Model::validateRequired('title', $this->title, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->permission) {
            $res['permission'] = $this->permission;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecRtopGenericInvokeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['permission'])){
            $model->permission = $map['permission'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // {"platformId":1234}
    /**
     * @var string
     */
    public $content;

    // 这个账号的所有权限点，逗号分隔
    /**
     * @var string
     */
    public $permission;

    // title
    /**
     * @var string
     */
    public $title;

}
