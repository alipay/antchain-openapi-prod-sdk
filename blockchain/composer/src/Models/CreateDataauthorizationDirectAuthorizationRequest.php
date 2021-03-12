<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDataauthorizationDirectAuthorizationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 业务UUID,业务系统唯一标示
    /**
     * @var string
     */
    public $bizUid;

    // 直接授权原因
    /**
     * @var string
     */
    public $comment;

    // 数据ID
    /**
     * @var string
     */
    public $dataId;

    // 过期时间
    /**
     * @var int
     */
    public $expire;

    // 扩展参数
    /**
     * @var string
     */
    public $extensionInfo;

    // 授权者ID
    /**
     * @var string
     */
    public $issuerId;

    // 被授予者ID
    /**
     * @var string
     */
    public $subjectId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizUid'            => 'biz_uid',
        'comment'           => 'comment',
        'dataId'            => 'data_id',
        'expire'            => 'expire',
        'extensionInfo'     => 'extension_info',
        'issuerId'          => 'issuer_id',
        'subjectId'         => 'subject_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizUid', $this->bizUid, true);
        Model::validateRequired('comment', $this->comment, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('expire', $this->expire, true);
        Model::validateRequired('issuerId', $this->issuerId, true);
        Model::validateRequired('subjectId', $this->subjectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizUid) {
            $res['biz_uid'] = $this->bizUid;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->issuerId) {
            $res['issuer_id'] = $this->issuerId;
        }
        if (null !== $this->subjectId) {
            $res['subject_id'] = $this->subjectId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataauthorizationDirectAuthorizationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_uid'])) {
            $model->bizUid = $map['biz_uid'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['issuer_id'])) {
            $model->issuerId = $map['issuer_id'];
        }
        if (isset($map['subject_id'])) {
            $model->subjectId = $map['subject_id'];
        }

        return $model;
    }
}
