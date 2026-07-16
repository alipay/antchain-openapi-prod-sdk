<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerNoticeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'noticeId' => 'notice_id',
        'unread' => 'unread',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('noticeId', $this->noticeId, true);
        Model::validateRequired('unread', $this->unread, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->noticeId) {
            $res['notice_id'] = $this->noticeId;
        }
        if (null !== $this->unread) {
            $res['unread'] = $this->unread;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DetailInnerNoticeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['notice_id'])){
            $model->noticeId = $map['notice_id'];
        }
        if(isset($map['unread'])){
            $model->unread = $map['unread'];
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

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 通知id
    /**
     * @var int
     */
    public $noticeId;

    // 是否未读
    /**
     * @var bool
     */
    public $unread;

}
